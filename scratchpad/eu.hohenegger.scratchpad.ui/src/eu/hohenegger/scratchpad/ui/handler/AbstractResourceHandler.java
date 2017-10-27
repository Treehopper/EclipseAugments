package eu.hohenegger.scratchpad.ui.handler;

import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SELECTION;

import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.jface.viewers.IStructuredSelection;


public abstract class AbstractResourceHandler {
	
	@CanExecute
	protected boolean isEnabled(@Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		if (selection.size() != 1) {
			return false;
		}
		Object firstElement = selection.getFirstElement();
		return (firstElement instanceof IResource);
	}

	protected IContainer getContainer(IStructuredSelection selection) {
		IResource resource = (IResource) selection.getFirstElement();
		IContainer container;
		if (resource instanceof IContainer) {
			container = (IContainer) resource;
		} else {
			container = (IContainer) resource.getParent();
		}
		return container;
	}
}
