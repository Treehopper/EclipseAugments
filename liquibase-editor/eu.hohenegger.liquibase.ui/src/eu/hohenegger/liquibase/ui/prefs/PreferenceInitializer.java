package eu.hohenegger.liquibase.ui.prefs;

import static eu.hohenegger.liquibase.ui.handler.Constants.DB_USER_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.DEFAULT_JDBC_URL;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_CONSOLE_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_TCP_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.JDBC_URL_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.START_H2_CONSOLE_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.USE_EMBEDDED_H2_PREF_KEY;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
//		new DefaultScope().getNode(Constants.PLUGIN_ID);

		Preferences preferences = InstanceScope.INSTANCE.getNode(H2_PAGE_ID);
		preferences.put(JDBC_URL_PREF_KEY, DEFAULT_JDBC_URL);
		preferences.put(DB_USER_PREF_KEY, "SA");
		preferences.putBoolean(USE_EMBEDDED_H2_PREF_KEY, true);
		preferences.put(H2_TCP_PORT_PREF_KEY, "9092");
		preferences.putBoolean(START_H2_CONSOLE_PREF_KEY, true);
		preferences.put(H2_CONSOLE_PORT_PREF_KEY, "8082");
		
	}
}
