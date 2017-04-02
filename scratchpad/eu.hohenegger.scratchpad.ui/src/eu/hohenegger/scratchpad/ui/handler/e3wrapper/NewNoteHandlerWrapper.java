package eu.hohenegger.scratchpad.ui.handler.e3wrapper;

import eu.hohenegger.common.ui.e3compat.EnabledDIHandler;
import eu.hohenegger.scratchpad.ui.handler.NewNoteHandler;

public class NewNoteHandlerWrapper extends EnabledDIHandler<NewNoteHandler> {

	public NewNoteHandlerWrapper() {
		super(NewNoteHandler.class);
	}
}
