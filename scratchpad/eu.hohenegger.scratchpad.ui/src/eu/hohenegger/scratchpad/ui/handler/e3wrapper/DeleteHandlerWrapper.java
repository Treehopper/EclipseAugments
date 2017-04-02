package eu.hohenegger.scratchpad.ui.handler.e3wrapper;

import eu.hohenegger.common.ui.e3compat.EnabledDIHandler;
import eu.hohenegger.scratchpad.ui.handler.DeleteHandler;

public class DeleteHandlerWrapper extends EnabledDIHandler<DeleteHandler> {

	public DeleteHandlerWrapper() {
		super(DeleteHandler.class);
	}
}
