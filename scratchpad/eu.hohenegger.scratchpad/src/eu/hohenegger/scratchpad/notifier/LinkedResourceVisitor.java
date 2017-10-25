package eu.hohenegger.scratchpad.notifier;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;

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
		
		if (isTopLevelLink(res)) {
			return true; // visit the children
		}
		
		//TODO: support also recursive scan
		changeHandler.handle(delta);
		
		return false; 
	}

	private boolean isRoot(IResource res) {
		return scratchPadProject.equals(res) || res instanceof IWorkspaceRoot;
	}

	private boolean isScratchpadProjectChild(IResource res) {
		return scratchPadProject.equals(res.getProject());
	}

	private boolean isTopLevelLink(IResource res) {
		return res.isLinked() && (res.getParent() != null && !res.getParent().isLinked());
	}
}