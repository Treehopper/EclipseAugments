package eu.hohenegger.scratchpad.notifier;

import org.eclipse.core.resources.IResourceDelta;

public interface IResourceChangeHandler {

	void handle(IResourceDelta delta);

}
