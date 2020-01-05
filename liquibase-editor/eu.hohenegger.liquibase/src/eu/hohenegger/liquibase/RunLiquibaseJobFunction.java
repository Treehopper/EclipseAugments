package eu.hohenegger.liquibase;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.xml.sax.SAXParseException;

import liquibase.Liquibase;
import liquibase.changelog.ChangeLogParameters;
import liquibase.changelog.ChangeSet;
import liquibase.changelog.DatabaseChangeLog;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.exception.LiquibaseParseException;
import liquibase.exception.MigrationFailedException;
import liquibase.parser.ChangeLogParser;
import liquibase.parser.ChangeLogParserFactory;
import liquibase.resource.FileSystemResourceAccessor;
import liquibase.resource.ResourceAccessor;

public class RunLiquibaseJobFunction implements IJobFunction {
	private final List<IFile> files;
	private final ChangeLogParserFactory parserFactory;
	
	private List<Problem> problems;
	private String jdbcUrl;
	private String user;

	public RunLiquibaseJobFunction(List<IFile> files, String jdbcUrl, String user) {
		this.files = files;
		this.jdbcUrl = jdbcUrl;
		this.user = user;

		this.parserFactory  = ChangeLogParserFactory.getInstance();
		
		problems = new ArrayList<>();
	}

	@Override
	public IStatus run(IProgressMonitor monitor) {
		DatabaseChangeLog changeLog;
		for (IFile file : files) {
			ResourceAccessor resourceAccessor = new FileSystemResourceAccessor(file.getParent().getLocation().toString());
			List<ChangeSet> changeSets = Collections.emptyList();
			try {
				ChangeLogParser liquibaseParser = parserFactory.getParser(file.getName(), resourceAccessor);
				ChangeLogParameters parameters = new ChangeLogParameters();
				changeLog = liquibaseParser.parse(file.getName(), parameters, resourceAccessor);
				changeSets = changeLog.getChangeSets();

				Connection connection = DBManager.createConnection(jdbcUrl, user);
				Database database = DatabaseFactory.getInstance()
						.findCorrectDatabaseImplementation(new JdbcConnection(connection));
				Liquibase liquibase = new Liquibase(changeLog, resourceAccessor, database);
				
//				Writer writer = ConsoleUtil.createConsoleWriter(console);
//				liquibase.update("", writer);
				liquibase.update("");
			} catch (LiquibaseParseException e) {
				if (e.getCause() instanceof SAXParseException) {
					SAXParseException exc = (SAXParseException) e.getCause();
					problems.add(new Problem(file, exc.getLocalizedMessage(), exc.getLineNumber()));
				}
			} catch (MigrationFailedException e) {
				if (e.getCause() instanceof DatabaseException) {
					DatabaseException exc = (DatabaseException) e.getCause();
					if (exc.getCause() instanceof SQLException) {
						
						for (ChangeSet changeSet : changeSets) {
							String location = changeSet.toString();
							if (e.getMessage().contains(location)) {
								problems.add(new Problem(file, location + ": " + exc.getLocalizedMessage(), null));
								return new Status(IStatus.ERROR, Constants.PLUGIN_ID, location + ": " + exc.getLocalizedMessage());
							}
						}
					}
					//find sequence in changelogs and mark line
					problems.add(new Problem(file, exc.getLocalizedMessage(), null));
				}
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled parse exception");
			} catch (LiquibaseException e) {
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled parse exception");
			} catch (SQLException e) {
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled SQL exception");
			}
		}
		
		return Status.OK_STATUS;
	}

	public List<Problem> getProblems() {
		return problems;
	}
}
