package eu.hohenegger.liquibase.ui.handler;

import static eu.hohenegger.liquibase.ui.handler.Constants.DB_USER_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_CONSOLE_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_TCP_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.JDBC_URL_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.START_H2_CONSOLE_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.USE_EMBEDDED_H2_PREF_KEY;
import static org.eclipse.core.runtime.Adapters.adapt;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection;

import java.io.Writer;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.console.MessageConsole;
import org.osgi.service.prefs.Preferences;

import eu.hohenegger.liquibase.Problem;
import eu.hohenegger.liquibase.RunLiquibaseJobFunction;

public class RunLiquibaseHandler extends AbstractH2Handler {
	
	private Preferences preferences;

	public RunLiquibaseHandler() {
		preferences = INSTANCE.getNode(H2_PAGE_ID);
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = getCurrentSelection(event);
		List<IFile> files = new ArrayList<>();
		if (selection instanceof IStructuredSelection) {
			files.addAll(getFiles((IStructuredSelection) selection));
		} else {
			return null;
		}

//		if (is(USE_EMBEDDED_H2_PREF_KEY)) {
//			String dbPort = preferences.get(H2_TCP_PORT_PREF_KEY, "");
//			String consolePort = preferences.get(H2_CONSOLE_PORT_PREF_KEY, "");
//			try {
//				URL h2ConsoleUrl = dbManager.startDB(dbPort, consolePort);
//				if (is(START_H2_CONSOLE_PREF_KEY)) {
//					browserUtil.open(h2ConsoleUrl);
//				}
//			} catch (Exception e) {
//				try {
//					dbManager.stopDB(dbPort);
//				} catch (SQLException ignored) {
//				}
//				ErrorDialog.openError(null, "Error", e.getLocalizedMessage(),
//						new Status(IStatus.ERROR, Constants.PLUGIN_ID,
//								e.getCause() != null? e.getCause().getLocalizedMessage() : ""));
//				throw new ExecutionException("failed to start DB", e);
//			}
//		}

		MarkerUtil markerUtil = new MarkerUtil();
		for (IFile file : files) {
			markerUtil.removeAll(file);
		}

		String jdbcUrl = preferences.get(JDBC_URL_PREF_KEY, "");
		String dbUser = preferences.get(DB_USER_PREF_KEY, "");
		
		MessageConsole console = ConsoleUtil.findConsole(Constants.PLUGIN_ID);
		ConsoleUtil.show(console);
		Writer writer = ConsoleUtil.createConsoleWriter(console);
		
		RunLiquibaseJobFunction function = 
				new RunLiquibaseJobFunction(files, jdbcUrl, dbUser, Optional.of(writer));
//				new RunLiquibaseJobFunction(files, jdbcUrl, dbUser, Optional.empty());
		Job job = Job.create("Running Liquibase...", function);
		job.setUser(true);
		job.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				List<Problem> problems = function.getProblems();
				for (Problem problem : problems) {
					if (problem.getLineNumber().isPresent()) {
						markerUtil.addProblemMarker(problem.getResource(), problem.getMessage(), problem.getLineNumber().get());
					} else {
						markerUtil.addProblemMarker(problem.getResource(), problem.getMessage());
					}
				}
			}
			
		});
		job.schedule();
		
		
		return null;
	}

	public List<IFile> getFiles(IStructuredSelection currentSelection) throws ExecutionException {
		List<IFile> result = new ArrayList<>();
		Iterator<?> iterator = currentSelection.iterator();
		while (iterator.hasNext()) {
			IResource resource = adapt(iterator.next(), IResource.class);
			
			if (!(resource instanceof IFile)) {
				continue;
			}
			
			IFile file = (IFile) resource;
			result.add(file);
		}
		
		return result;
	}

}
