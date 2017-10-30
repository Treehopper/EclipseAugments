package eu.hohenegger.scratchpad.notifier;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.CoreException;

public class LinkedFoldersUpdateScanner implements IResourceChangeListener {
	
	private LinkedResourceVisitor visitor;

	public LinkedFoldersUpdateScanner(IProject scratchPadProject, IResourceChangeHandler changeHandler) {
		visitor = new LinkedResourceVisitor(scratchPadProject, changeHandler);
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResource res = event.getResource();
		try {
			handleEvent(event, res);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	private void handleEvent(IResourceChangeEvent event, IResource res) throws CoreException {
		switch (event.getType()) {
		case IResourceChangeEvent.PRE_CLOSE:
			break;
		case IResourceChangeEvent.PRE_DELETE:
			break;
		case IResourceChangeEvent.POST_CHANGE:
			event.getDelta().accept(visitor);
			break;
		case IResourceChangeEvent.PRE_BUILD:
			break;
		case IResourceChangeEvent.POST_BUILD:
			break;
		}
	}
}