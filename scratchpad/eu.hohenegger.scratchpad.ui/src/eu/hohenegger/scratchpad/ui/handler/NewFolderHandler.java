package eu.hohenegger.scratchpad.ui.handler;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public class NewFolderHandler extends AbstractHandler {

	protected void create(IContainer container, String name) throws CoreException {
		IFolder folder = container.getFolder(Path.fromOSString(name));
		folder.create(IResource.NONE, true, null);
	}

	protected int getType() {
		return IResource.FOLDER;
	}

	@Override
	protected String getJobName() {
		return "New folder...";
	}

	@Override
	protected String getSuggestedName() {
		return "Notes";
	}
}
