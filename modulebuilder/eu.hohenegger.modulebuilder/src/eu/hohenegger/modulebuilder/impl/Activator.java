package eu.hohenegger.modulebuilder.impl;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
	// The shared instance
	private static Activator plugin;
	private static String pluginId;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		pluginId = context.getBundle().getSymbolicName();
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * @return the name of this plugin
	 */
	public static String getPluginId() {
		return pluginId;
	}

	public static IStatus error(final String message, final Throwable thr) {
		return new Status(IStatus.ERROR, getPluginId(), 0, message, thr);
	}

	public static void logError(final String message, final Throwable thr) {
		getDefault().getLog().log(error(message, thr));
	}

	public static void logError(final Throwable thr) {
		getDefault().getLog().log(error(thr.getMessage(), thr));
	}
}
