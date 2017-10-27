package eu.hohenegger.scratchpad.ui.handler;

import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SELECTION;
import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SHELL;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import eu.hohenegger.common.ui.JobUiUtil;
import eu.hohenegger.scratchpad.ui.validator.ResourceNameValidator;


public abstract class AbstractChangeResourceHandler extends AbstractResourceHandler {
	private static final AtomicBoolean busy = new AtomicBoolean(false);
	
	@Inject
	private IWorkspace workspace;

	@Execute
	private void execute(@Named(ACTIVE_SHELL) Shell shell, @Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		IContainer container = getContainer(selection);

		Optional<String> oName = queryNewResourceName(container);
		if (!oName.isPresent()) {
			return;
		}

		Job newJob = JobUiUtil.create(shell.getDisplay(), getJobName(), monitor -> {
			try {
				synchronized (busy) {
					busy.set(true);
					AbstractChangeResourceHandler.this.create(container, oName.get(), monitor);
					busy.set(false);
				}
			} catch (CoreException e) {
				throw new RuntimeException(e);
//				return Activator.error(e); //FIXME
			}
			return Status.OK_STATUS;
		});
		JobUiUtil.handleJobErrors(newJob);
		newJob.schedule();
	}

	abstract protected String getJobName();

	abstract protected void create(IContainer container, String name, IProgressMonitor monitor) throws CoreException;

	protected String getDescription() {
		return "Name:";
	}

	protected Optional<String> queryNewResourceName(final IResource container) {
		final IPath prefix = container.getFullPath();
		IInputValidator validator = new ResourceNameValidator(workspace, prefix, getType());

		InputDialog dialog = new InputDialog(null, "New...", getDescription(), getSuggestedName(), validator);
		dialog.setBlockOnOpen(true);
		int result = dialog.open();
		if (result == Window.OK) {
			return Optional.of(dialog.getValue());
		}
		return Optional.empty();
	}

	abstract protected String getSuggestedName();

	abstract protected int getType();

	public static boolean isBusy() {
		return busy.get();
	}
}
