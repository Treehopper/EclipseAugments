package eu.hohenegger.modulebuilder.ui; 

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.hohenegger.modulebuilder.ui"; //$NON-NLS-1$

	private static String pluginId;

	// The shared instance
	private static Activator plugin;

	private static ServiceReference<IBundleProjectService> bundleProjectServiceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		pluginId = context.getBundle().getSymbolicName();
		plugin = this;
		
		initBundleServiceReference(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		
		context.ungetService(bundleProjectServiceReference); 
		
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
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 *
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
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
	
	@SuppressWarnings("unchecked")
	public static void initBundleServiceReference(BundleContext context) {
		bundleProjectServiceReference = (ServiceReference<IBundleProjectService>) context.getServiceReference(IBundleProjectService.class.getName());
	}
	
	public static IBundleProjectService getBundleService() {
		BundleContext bundleContext = plugin.getBundle().getBundleContext();
		return (IBundleProjectService) bundleContext.getService(bundleProjectServiceReference);
	}
}
