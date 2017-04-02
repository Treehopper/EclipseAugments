package eu.hohenegger.scratchpad;

import java.util.Optional;
import java.util.function.Function;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceDescriptor;

@Creatable
@Singleton
public class ResourceUtil {

	@Inject
	private IWorkspace workspace;

	public boolean projectExists(String projectName) {
		return workspace.getRoot().getProject(projectName).exists();
	}

	public IProject createNewProject(String projectName, IProgressMonitor monitor) throws CoreException {
		IProjectDescription projectDescription = workspace.newProjectDescription(projectName);
		IProject result = workspace.getRoot().getProject(projectName);
		result.create(projectDescription, monitor);
		result.open(monitor);
		return result;
	}
	
	public IProject getProject(String projectName) {
		IWorkspaceRoot root = getRoot();
		return root.getProject(projectName);
	}
	
	public static IWorkspaceRoot getRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	public IStatus renameResource(IResource resource, IProgressMonitor monitor,
			Function<IResource, Optional<String>> nameProvider) {
		try {
			RenameResourceDescriptor renameResourceDescriptor = new RenameResourceDescriptor();
			renameResourceDescriptor.setResourcePath(getPath(resource));
			renameResourceDescriptor.setProject(getProjectName(resource));
			Optional<String> oNewName = nameProvider.apply(resource);
			if (!oNewName.isPresent()) {
				return Status.CANCEL_STATUS;
			}
			renameResourceDescriptor.setNewName(oNewName.get());

			Refactoring refactoring = renameResourceDescriptor
					.createRefactoring(RefactoringStatus.createInfoStatus("Resource renamed"));

			refactoring.checkInitialConditions(monitor);
			refactoring.checkFinalConditions(monitor);
			Change change = refactoring.createChange(monitor);
			change.perform(monitor);

		} catch (CoreException e) {
//			logger.log(error(e)); //FIXME
		}
		return Status.OK_STATUS;
	}
	
	private IPath getPath(IResource resource) {
		return resource.getFullPath();
	}
	
	private String getProjectName(IResource resource) {
		if (resource instanceof IProject) {
			return null;
		}
		return resource.getProject().getName();
	}
}
