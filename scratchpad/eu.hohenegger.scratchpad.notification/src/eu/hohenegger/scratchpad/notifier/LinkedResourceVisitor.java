package eu.hohenegger.scratchpad.notifier;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;

import eu.hohenegger.scratchpad.IConstants;

public class LinkedResourceVisitor implements IResourceDeltaVisitor {
	
	private IProject scratchPadProject;
	private IResourceChangeHandler changeHandler;

	public LinkedResourceVisitor(IProject scratchPadProject, IResourceChangeHandler changeHandler) {
		this.scratchPadProject = scratchPadProject;
		this.changeHandler = changeHandler;
	}

	@Override
	public boolean visit(IResourceDelta delta) {
		IResource res = delta.getResource();
		
		if (isRoot(res)) {
			return true; // visit the children
		}
		
		if (!isScratchpadProjectChild(res)) {
			return false;
		}
		
		if (isChangeNotificationEnabled(res)) {
			return true; // visit the children
		}
		
		if (delta.getMarkerDeltas().length > 0) {
			return false; //ignore marker changes
		}

		//TODO: support also recursive scan
		if (!isToplevelResource(res)) {
			changeHandler.handle(delta);
		}
		
		return false; 
	}

	private boolean isToplevelResource(IResource res) {
		return res.getParent().equals(scratchPadProject);
	}

	public static boolean isChangeNotificationEnabled(IResource res) {
		try {
			String property = res.getPersistentProperty(IConstants.CHANGE_NOTIFICATION);
			if (Boolean.parseBoolean(property)) {
				return true;
			}
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
		return false;
	}

	private boolean isRoot(IResource res) {
		return scratchPadProject.equals(res) || res instanceof IWorkspaceRoot;
	}

	private boolean isScratchpadProjectChild(IResource res) {
		return scratchPadProject.equals(res.getProject());
	}
}