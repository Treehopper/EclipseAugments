package eu.hohenegger.liquibase.ui.handler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.eclipse.core.runtime.jobs.Job;

public class MarkerUtil {

	public void addProblemMarker(IResource resource, String message) {
		addProblemMarker(resource, message, 0);
	}
	
	public void addProblemMarker(IResource resource, String message, Integer line) {
		Job job = Job.create("Adding errors", (IJobFunction) monitor -> {
			try {
				removeExisting(resource, message, line);
				IMarker m = resource.createMarker(IMarker.PROBLEM);
				m.setAttribute(IMarker.LINE_NUMBER, line);
				m.setAttribute(IMarker.MESSAGE, message);
				m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			} catch (CoreException e) {
				throw new IllegalStateException(e);
			}
			return Status.OK_STATUS;
		});
		job.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().markerRule(resource));
		job.schedule();
	}

	private void removeExisting(IResource resource, String message, Integer line) throws CoreException {
		IMarker[] markers = resource.findMarkers(IMarker.PROBLEM, true, 1);
		for (IMarker marker : markers) {
			if (line.equals(marker.getAttribute(IMarker.LINE_NUMBER)) &&
					message.equals(marker.getAttribute(IMarker.MESSAGE))) {
				marker.delete();
			}
		}
	}

	public void removeAll(IResource resource) {
		Job job = Job.create("Removing errors", (IJobFunction) monitor -> {
			try {
				resource.deleteMarkers(IMarker.PROBLEM, true, 1);
			} catch (CoreException e) {
				throw new IllegalStateException(e);
			}
			return Status.OK_STATUS;
		});
		job.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().markerRule(resource));
		job.schedule();
	}

}
