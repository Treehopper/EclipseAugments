package eu.hohenegger.scratchpad.notifier;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.eclipse.core.runtime.jobs.Job;

public class MarkerUtil {

	public void addMarker(IResource resource, String message) {
		Job job = Job.create("Adding task", (IJobFunction) monitor -> {
			try {
				IMarker marker = resource.createMarker("org.eclipse.core.resources.taskmarker");
				marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				marker.setAttribute(IMarker.DONE, Boolean.FALSE);
				marker.setAttribute(IMarker.MESSAGE, message);
			} catch (CoreException e) {
				throw new IllegalStateException(e);
			}
			return Status.OK_STATUS;
		});
		job.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().markerRule(resource));
		job.schedule();
	}
}
