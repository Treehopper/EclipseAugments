package eu.hohenegger.scratchpad.ui.viewer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.resources.ResourceDropAdapterAssistant;

public class DropAdapterAssistant extends ResourceDropAdapterAssistant {

	@Override
	public IStatus handleDrop(CommonDropAdapter aDropAdapter, DropTargetEvent aDropTargetEvent, Object aTarget) {
		if (aDropAdapter.getCurrentTarget() == null) {
			handleDropIntoWhiteArea(aDropAdapter, aDropTargetEvent);
		}
		return super.handleDrop(aDropAdapter, aDropTargetEvent, aTarget);
	}

	private void handleDropIntoWhiteArea(CommonDropAdapter dropAdapter, DropTargetEvent dropTargetEvent) {
		DropTarget dropTarget = (DropTarget) dropTargetEvent.widget;
		dropTargetEvent.item = dropTarget.getControl();
		dropAdapter.dragOperationChanged(dropTargetEvent);
	}
}
