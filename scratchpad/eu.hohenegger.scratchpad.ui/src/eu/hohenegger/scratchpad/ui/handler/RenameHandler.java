package eu.hohenegger.scratchpad.ui.handler;

import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SELECTION;
import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SHELL;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import eu.hohenegger.scratchpad.ui.ResourceUiUtil;

public class RenameHandler {

	@Inject
	private ResourceUiUtil resourceUtil;

	@Execute
	private void execute(@Named(ACTIVE_SELECTION) IStructuredSelection selection, @Named(ACTIVE_SHELL) Shell shell) {
		IResource resource = (IResource) selection.getFirstElement();

		resourceUtil.createRenameResourceJob(shell, resource).schedule();
	}

	@CanExecute
	private boolean isEnabled(@Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		if (selection.size() != 1) {
			return false;
		}
		Object firstElement = selection.getFirstElement();
		return (firstElement instanceof IResource) && !(firstElement instanceof IProject);
	}
}
