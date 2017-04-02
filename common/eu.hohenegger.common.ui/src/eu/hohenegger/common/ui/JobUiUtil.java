package eu.hohenegger.common.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;

import eu.hohenegger.common.JobUtil;

public class JobUiUtil {

	public static UIJob create(Display display, String name, IJobFunction jobFunction) {
		return new UIJob(display, name) {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				return jobFunction.run(monitor);
			}
		};
	}

	public static void handleJobErrors(Job job) {
		JobUtil.handleJobDone(job, event -> {
			IStatus result = event.getResult();
			if (!result.isOK()) {
				Display.getDefault().asyncExec(() -> MessageDialog.openError(null,
						"Error, " + job.getName() + " failed: ", result.getMessage()));
			}
		});
	}

	public static void handleJobErrors(Job job, String errorDialogTitle, String errorMessage) {
		JobUtil.handleJobDone(job, event -> {
			IStatus result = event.getResult();
			if (!result.isOK()) {
				Display.getDefault().asyncExec(() -> MessageDialog.openError(null, errorDialogTitle, errorMessage));
			}
		});
	}
}
