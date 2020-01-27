package eu.hohenegger.liquibase;

import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.xml.sax.SAXParseException;

import liquibase.Liquibase;
import liquibase.change.Change;
import liquibase.changelog.ChangeLogParameters;
import liquibase.changelog.ChangeSet;
import liquibase.changelog.DatabaseChangeLog;
import liquibase.changelog.ChangeSet.RunStatus;
import liquibase.changelog.visitor.AbstractChangeExecListener;
import liquibase.changelog.visitor.ChangeExecListener;
import liquibase.changelog.visitor.UpdateVisitor;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.exception.LiquibaseParseException;
import liquibase.exception.MigrationFailedException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationFailedException;
import liquibase.parser.ChangeLogParser;
import liquibase.parser.ChangeLogParserFactory;
import liquibase.resource.FileSystemResourceAccessor;
import liquibase.resource.ResourceAccessor;

public class RunLiquibaseJobFunction implements IJobFunction {
	private static final String CONTEXTS = "";
	private final List<IFile> files;
	private final ChangeLogParserFactory parserFactory;
	
	private List<Problem> problems;
	private String jdbcUrl;
	private String user;
	private Optional<Writer> writer;

	public RunLiquibaseJobFunction(List<IFile> files, String jdbcUrl, String user, Optional<Writer> writer) {
		this.files = files;
		this.jdbcUrl = jdbcUrl;
		this.user = user;
		this.writer = writer;

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
				monitor.beginTask("Parsing...", 200);

				ChangeLogParser liquibaseParser = parserFactory.getParser(file.getName(), resourceAccessor);
				ChangeLogParameters parameters = new ChangeLogParameters();
				changeLog = liquibaseParser.parse(file.getName(), parameters, resourceAccessor);
				monitor.worked(100);

				Connection connection = DBManager.createConnection(jdbcUrl, user);
				Database database = DatabaseFactory.getInstance()
						.findCorrectDatabaseImplementation(new JdbcConnection(connection));
//				changeLog.validate(database, CONTEXTS);
				
				monitor.setTaskName("Running changesets...");
				int changeSetCount = changeLog.getChangeSets().size();
				
				Liquibase liquibase = new Liquibase(changeLog, resourceAccessor, database);
				liquibase.setChangeExecListener(new AbstractChangeExecListener() {
					@Override
					public void willRun(ChangeSet changeSet, DatabaseChangeLog databaseChangeLog, Database database,
							RunStatus runStatus) {
						monitor.subTask(changeSet.getId());
						monitor.worked(1); //TODO: compute;
					}
					
					@Override
					public void runFailed(ChangeSet changeSet, DatabaseChangeLog databaseChangeLog, Database database,
							Exception exception) {
						super.runFailed(changeSet, databaseChangeLog, database, exception);
					}
				});

				if (writer.isPresent()) {
					liquibase.update(CONTEXTS, writer.get());
				} else {
					liquibase.update(CONTEXTS);
				}
			} catch (LiquibaseParseException e) {
				Optional<SAXParseException> optThrowable = findThrowable(e, SAXParseException.class);
				if (optThrowable.isPresent()) {
					SAXParseException exc = optThrowable.get();
					problems.add(new Problem(file, exc.getLocalizedMessage(), exc.getLineNumber()));
				}
			} catch (ValidationFailedException e) {
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled parse exception", e);
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
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled parse exception", e);
			} catch (LiquibaseException e) {
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled parse exception", e);
			} catch (SQLException e) {
				return new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Unhandled SQL exception", e);
			}
		}
		
		return Status.OK_STATUS;
	}
	
	<T extends Throwable> Optional<T> findThrowable(Throwable throwable, Class<T> throwableClass) {
		if (throwable == null) {
			return Optional.empty();
		}
		if (!throwable.getClass().isAssignableFrom(throwableClass)) {
			return findThrowable(throwable.getCause(), throwableClass);
		}
		return (Optional<T>) Optional.ofNullable(throwable);
	}

	public List<Problem> getProblems() {
		return problems;
	}
}
