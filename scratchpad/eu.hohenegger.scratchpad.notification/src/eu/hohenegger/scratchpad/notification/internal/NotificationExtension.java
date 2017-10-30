package eu.hohenegger.scratchpad.notification.internal;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.ui.navigator.CommonViewer;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;

import eu.hohenegger.scratchpad.notifier.LinkedFoldersUpdateScanner;
import eu.hohenegger.scratchpad.ui.notification.ResourceChangeNotifier;
import eu.hohenegger.scratchpad.ui.whiteboard.ScratchPadExtension;

@Component
public class NotificationExtension implements ScratchPadExtension {

	private LogService log;

	@Activate
	public void activate(ComponentContext cc, BundleContext bc, Map<String, Object> config) {
		log.log(LogService.LOG_DEBUG, "NotificationExtension activated");
	}

	@Deactivate
	public void deactivate(ComponentContext cc, BundleContext bc, Map<String, Object> config) {
		log.log(LogService.LOG_DEBUG, "NotificationExtension deactivated");
	}

	@Modified
	void modified(Map<String, Object> config) {
		log.log(LogService.LOG_DEBUG, "NotificationExtension modified");
	}

	@Reference
	void setLogService(LogService log) {
		this.log = log;
	}
	
	void unsetLogService(LogService log) {
		this.log = null;
	}

	@Override
	public void extend(CommonViewer viewer, IProject scratchPadProject) {
		IResourceChangeListener changeListener = new LinkedFoldersUpdateScanner(scratchPadProject, new ResourceChangeNotifier(viewer));
		scratchPadProject.getWorkspace().addResourceChangeListener(changeListener);
	}
}
