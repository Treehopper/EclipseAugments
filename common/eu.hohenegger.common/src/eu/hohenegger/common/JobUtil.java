package eu.hohenegger.common;

import java.util.function.Consumer;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

public class JobUtil {

	public static void scheduleInSequence(final Job firstJob, final Job secondJob) {
		firstJob.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				secondJob.schedule();
				super.done(event);
			}

		});
		firstJob.schedule();
	}

	public static void handleJobDone(Job job, Consumer<IJobChangeEvent> doneRunner) {
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				doneRunner.accept(event);
				super.done(event);
			}
		});
	}

	public static void handleJobError(Job job, Consumer<IJobChangeEvent> errorRunner) {
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					return;
				}
				errorRunner.accept(event);
			}
		});
	}
}
