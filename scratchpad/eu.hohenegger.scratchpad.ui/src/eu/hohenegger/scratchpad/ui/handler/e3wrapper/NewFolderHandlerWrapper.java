package eu.hohenegger.scratchpad.ui.handler.e3wrapper;

import eu.hohenegger.common.ui.e3compat.EnabledDIHandler;
import eu.hohenegger.scratchpad.ui.handler.NewFolderHandler;

public class NewFolderHandlerWrapper extends EnabledDIHandler<NewFolderHandler> {

	public NewFolderHandlerWrapper() {
		super(NewFolderHandler.class);
	}
}
