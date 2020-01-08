package eu.hohenegger.liquibase.ui.handler;

import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class PreferenceUtil {
	private static IEclipsePreferences preferences = INSTANCE.getNode(H2_PAGE_ID);
	
	public static boolean is(String prefKey) {
		return Boolean.parseBoolean(preferences.get(prefKey, "false"));
	}
}
