package eu.hohenegger.scratchpad.ui.handler.e3wrapper;

import eu.hohenegger.common.ui.e3compat.EnabledDIHandler;
import eu.hohenegger.scratchpad.ui.handler.ToggleChangeNotificationHandler;

public class ToggleNotificationHandlerWrapper extends EnabledDIHandler<ToggleChangeNotificationHandler> {

	public ToggleNotificationHandlerWrapper() {
		super(ToggleChangeNotificationHandler.class);
	}
}
