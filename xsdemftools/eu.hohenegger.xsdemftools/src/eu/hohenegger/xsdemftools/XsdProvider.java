package eu.hohenegger.xsdemftools;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class XsdProvider {

	private static final String XSD_PROJECT = "XSDProject";

	public void registerAvailableXsds() throws CoreException {
		IProject project = createProject(XSD_PROJECT, null);		
		
		project.accept(new XsdVisitor());
	}

	public static IProject createProject(String projectName, IProgressMonitor monitor) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProjectDescription projectDescription = workspace.newProjectDescription(projectName);

		IProject project = root.getProject(projectName);
		if (!project.exists()) {
			project.create(projectDescription, monitor);
			project.open(monitor);
		}
		return project;
	}

}
