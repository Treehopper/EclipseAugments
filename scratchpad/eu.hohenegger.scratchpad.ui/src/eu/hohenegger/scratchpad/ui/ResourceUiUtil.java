package eu.hohenegger.scratchpad.ui;

import static java.lang.String.format;
import static org.eclipse.jface.dialogs.MessageDialog.openConfirm;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import eu.hohenegger.common.ui.JobUiUtil;
import eu.hohenegger.scratchpad.ResourceUtil;
import eu.hohenegger.scratchpad.ui.validator.ResourceNameValidator;


@Creatable
@Singleton
public class ResourceUiUtil {

	@Inject
	private IWorkspace workspace;

	@Inject
	private ResourceUtil resourceUtil;

	public Job createRenameResourceJob(Shell shell, IResource resource) {
		return JobUiUtil.create(shell.getDisplay(), "Renaming resource...", monitor -> {
			return resourceUtil.renameResource(resource, monitor, existingResource -> {
				IPath base = existingResource.getFullPath().removeLastSegments(1);
				ResourceNameValidator validator = new ResourceNameValidator(workspace, base,
						existingResource.getType());
				String suggestedName = existingResource.getName();
				InputDialog inputDialog = new InputDialog(null, "New Name", "Enter a new name:", suggestedName,
						validator);
				if (inputDialog.open() != Window.OK) {
					return Optional.empty();
				}
				return Optional.of(inputDialog.getValue());
			});
		});
	}

	public Job createResourceDeleteJob(IResource... resources) {
		Job result = new Job("Deleting resource...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					for (IResource resource : resources) {
						resource.delete(true, monitor);
					}
					return Status.OK_STATUS;
				} catch (CoreException e) {
					throw new RuntimeException(e);
//					return error(e); //FIXME
				}
			}
		};
		result.setUser(true);
		return result;
	}

	public boolean confirmDelete(IResource... resources) {
		String fileNames = Arrays.stream(resources).map(IResource::getName).collect(Collectors.joining(", "));
		return openConfirm(null, "Confirm delete",
				format("Are you sure you want to remove '%s' permanently?" + "\n" + "This can't be undone.",
						fileNames));
	}
}
