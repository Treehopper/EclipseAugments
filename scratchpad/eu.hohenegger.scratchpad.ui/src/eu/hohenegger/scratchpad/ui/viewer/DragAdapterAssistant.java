package eu.hohenegger.scratchpad.ui.viewer;

import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.navigator.resources.ResourceDragAdapterAssistant;
import org.eclipse.ui.part.ResourceTransfer;

public class DragAdapterAssistant extends ResourceDragAdapterAssistant {
	private static final Transfer[] SUPPORTED_TRANSFERS = new Transfer[] { ResourceTransfer.getInstance()};

	@Override
	public Transfer[] getSupportedTransferTypes() {
		return SUPPORTED_TRANSFERS;
	}
}
