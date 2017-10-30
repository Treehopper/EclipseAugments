package eu.hohenegger.scratchpad.ui.whiteboard;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.navigator.CommonViewer;

//@ProviderType
public interface ScratchPadExtension {

	void extend(CommonViewer viewer, IProject scratchPadProject);

}
