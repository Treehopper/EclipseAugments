package eu.hohenegger.scratchpad.ui.handler;

import static eu.hohenegger.scratchpad.Constants.SCRATCHPAD_PROJECT_NAME;
import static eu.hohenegger.scratchpad.notifier.LinkedResourceVisitor.isChangeNotificationEnabled;
import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SELECTION;
import static org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SHELL;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import eu.hohenegger.scratchpad.IConstants;
import eu.hohenegger.scratchpad.ResourceUtil;


public class ToggleChangeNotificationHandler extends AbstractResourceHandler {
	
	@Inject
	private ResourceUtil resourceUtil;
	
	@Execute
	private void execute(@Named(ACTIVE_SHELL) Shell shell, @Named(ACTIVE_SELECTION) IStructuredSelection selection) {
		IResource resource = (IResource) selection.getFirstElement();
		
		setNotificationEnabled(resource, !isChangeNotificationEnabled(resource));

	}

	private void setNotificationEnabled(IResource resource, boolean enabled) {
		try {
			resource.setPersistentProperty(IConstants.CHANGE_NOTIFICATION, Boolean.toString(enabled));
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	@Override
	protected boolean isEnabled(IStructuredSelection selection) {
		return super.isEnabled(selection) && isToplevelResource((IResource) selection.getFirstElement());
	}

	private boolean isToplevelResource(IResource resource) {
		IProject project = resourceUtil.getProject(SCRATCHPAD_PROJECT_NAME);
		return project.equals(resource.getParent());
	}
}
