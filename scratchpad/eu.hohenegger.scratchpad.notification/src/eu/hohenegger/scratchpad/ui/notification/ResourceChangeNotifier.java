package eu.hohenegger.scratchpad.ui.notification;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.navigator.CommonViewer;

import eu.hohenegger.scratchpad.notifier.IResourceChangeHandler;
import eu.hohenegger.scratchpad.notifier.MarkerUtil;
import eu.hohenegger.scratchpad.ui.handler.AbstractChangeResourceHandler;

public class ResourceChangeNotifier implements IResourceChangeHandler {

	private CommonViewer viewer;
	
	private NotificationUtil notificationUtil = new NotificationUtil();
	
	private MarkerUtil markerUtil = new MarkerUtil();

	public ResourceChangeNotifier(CommonViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void handle(IResourceDelta delta) {
		if (AbstractChangeResourceHandler.isBusy()) {
			return;
		}
		IResource resource = delta.getResource();

		switch (delta.getKind()) {
		case IResourceDelta.ADDED:
			markerUtil.addMarker(resource, "Resource added");
			Display.getDefault().asyncExec(() -> {
				notificationUtil.showToolTip(delta.getResource(), viewer, "Resource added");
			});
			break;
		case IResourceDelta.REMOVED:
			Display.getDefault().asyncExec(() -> {
				notificationUtil.showToolTip(delta.getResource(), viewer, "Resource removed");
			});
			break;
		case IResourceDelta.CHANGED:
			markerUtil.addMarker(resource, "Resource changed");
			Display.getDefault().asyncExec(() -> {
				notificationUtil.showToolTip(delta.getResource(), viewer, "Resource changed");
			});
			break;
		}
	}
	
}