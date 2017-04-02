package eu.hohenegger.scratchpad.ui.handler.e3wrapper;

import eu.hohenegger.common.ui.e3compat.EnabledDIHandler;
import eu.hohenegger.scratchpad.ui.handler.NewFileHandler;

public class NewFileHandlerWrapper extends EnabledDIHandler<NewFileHandler> {

	public NewFileHandlerWrapper() {
		super(NewFileHandler.class);
	}
}
