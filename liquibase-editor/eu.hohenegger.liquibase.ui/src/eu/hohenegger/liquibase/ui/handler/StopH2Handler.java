package eu.hohenegger.liquibase.ui.handler;

import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_TCP_PORT_PREF_KEY;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class StopH2Handler extends AbstractH2Handler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IEclipsePreferences preferences = INSTANCE.getNode(H2_PAGE_ID);
		String dbPort = preferences.get(H2_TCP_PORT_PREF_KEY, "");
		try {
			dbManager.stopDB(dbPort);
			browserUtil.close();
		} catch (Exception e) {
			throw new ExecutionException("failed to start DB", e);
		}
		
		return null;
	}

}
