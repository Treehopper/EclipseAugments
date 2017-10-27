package eu.hohenegger.scratchpad.ui.handler;

import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SHELL;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;

import eu.hohenegger.common.ui.JobUiUtil;
import eu.hohenegger.scratchpad.Constants;
import eu.hohenegger.scratchpad.ResourceUtil;
import eu.hohenegger.scratchpad.ui.widgets.EditorUtil;

public class NewNoteHandler extends AbstractChangeResourceHandler {

	@Inject
	private IWorkbench workbench;

	protected void create(IContainer container, String name, IProgressMonitor monitor) throws CoreException {
		InputStream source = new ByteArrayInputStream(new byte[] {});
		IFile file = container.getFile(Path.fromOSString(name));
		file.create(source, IResource.NONE, null);

		EditorUtil.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
	}

	protected int getType() {
		return IResource.FILE;
	}

	@Override
	protected String getJobName() {
		return "New Note...";
	}

	@Override
	protected String getSuggestedName() {
		return "Note.md";
	}
	
	@CanExecute
	protected boolean isEnabled() {
		return projectExists();
	}

	@Execute
	private void execute(@Named(ACTIVE_SHELL) Shell shell) {
		IResource resource = getScratchPadProject();
		IContainer container;
		if (resource instanceof IContainer) {
			container = (IContainer) resource;
		} else {
			container = (IContainer) resource.getParent();
		}

		Optional<String> oName = queryNewResourceName(container);
		if (!oName.isPresent()) {
			return;
		}

		Job newJob = JobUiUtil.create(shell.getDisplay(), getJobName(), monitor -> {
			try {
				create(container, oName.get(), monitor);
			} catch (CoreException e) {
				throw new RuntimeException(e);
//				return Activator.error(e); //FIXME
			}
			return Status.OK_STATUS;
		});
		JobUiUtil.handleJobErrors(newJob);
		newJob.schedule();
	}
	
	private boolean projectExists() {
		return getScratchPadProject().exists();
	}

	private IProject getScratchPadProject() {
		return ResourceUtil.getRoot().getProject(Constants.SCRATCHPAD_PROJECT_NAME);
	}
}
