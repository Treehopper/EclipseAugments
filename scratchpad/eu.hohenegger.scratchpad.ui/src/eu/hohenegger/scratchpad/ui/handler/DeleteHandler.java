package eu.hohenegger.scratchpad.ui.handler;

import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SELECTION;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.IStructuredSelection;

import eu.hohenegger.scratchpad.ui.ResourceUiUtil;

public class DeleteHandler {

	@Inject
	private ResourceUiUtil resourceUtil;

	@Execute
	private void execute(@Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		IResource[] resources = Arrays.copyOf(selection.toArray(), selection.toArray().length, IResource[].class);
		if (!resourceUtil.confirmDelete(resources)) {
			return;
		}
		resourceUtil.createResourceDeleteJob(resources).schedule();
	}

	@CanExecute
	private boolean isEnabled(@Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		if (selection.size() < 1) {
			return false;
		}
		Object firstElement = selection.getFirstElement();
		return (firstElement instanceof IResource) && !(firstElement instanceof IProject);
	}

}
