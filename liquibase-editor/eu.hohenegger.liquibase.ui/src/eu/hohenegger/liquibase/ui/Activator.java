package eu.hohenegger.liquibase.ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import eu.hohenegger.liquibase.ui.prefs.PreferenceInitializer;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		new PreferenceInitializer().initializeDefaultPreferences();
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
