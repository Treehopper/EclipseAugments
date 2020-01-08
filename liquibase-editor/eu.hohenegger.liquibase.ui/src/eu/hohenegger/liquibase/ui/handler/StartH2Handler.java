package eu.hohenegger.liquibase.ui.handler;

import static eu.hohenegger.liquibase.ui.handler.Constants.H2_CONSOLE_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_TCP_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.START_H2_CONSOLE_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.PreferenceUtil.is;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;

import java.net.URL;
import java.sql.SQLException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.dialogs.ErrorDialog;

public class StartH2Handler extends AbstractH2Handler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEclipsePreferences preferences = INSTANCE.getNode(H2_PAGE_ID);
		String dbPort = preferences.get(H2_TCP_PORT_PREF_KEY, "");
		String consolePort = preferences.get(H2_CONSOLE_PORT_PREF_KEY, "");
		try {
			URL h2ConsoleUrl = dbManager.startDB(dbPort, consolePort);
			if (is(START_H2_CONSOLE_PREF_KEY)) {
				browserUtil.open(h2ConsoleUrl);
			}
		} catch (Exception e) {
			try {
				dbManager.stopDB(dbPort);
			} catch (SQLException ignored) {
			}
			ErrorDialog.openError(null, "Error", e.getLocalizedMessage(),
					new Status(IStatus.ERROR, Constants.PLUGIN_ID,
							e.getCause() != null? e.getCause().getLocalizedMessage() : ""));
			throw new ExecutionException("failed to start DB", e);
		}
		
		return null;
	}

}
