package eu.hohenegger.scratchpad.ui.notification;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.tasklist.TaskPropertiesDialog;

import eu.hohenegger.common.ui.notification.ViewerNotification;
import eu.hohenegger.scratchpad.ui.widgets.EditorUtil;


public class NotificationUtil {

	public void showToolTip(IResource resource, CommonViewer viewer, String message) {
		ViewerNotification viewerNotification = new ViewerNotification(viewer) {
			
			@Override
			protected Composite createContentArea(Composite parent) {
				Composite container = new Composite(parent, SWT.NONE);
				RowLayoutFactory.fillDefaults().applyTo(container);
				Display display = parent.getDisplay();
				container.setBackground(getBackgroundColor(display));

				createLabel(message, container);
				if (resource instanceof IFile) {
					createLink(container, "Open", event -> {
						dispose();
						openInEditor(resource);
					});
				}
				createLink(container, "Reveal", event -> {
					reveal(resource);
					dispose();
				});
				createLink(container, "Add Task", event -> {
					dispose();
			        openAddTaskDialog(resource, viewer);
				});
				createLink(container, "Dismiss", event -> {
					dispose();
				});


				return container;
			}

			private void reveal(IResource resource) {
				getViewer().setSelection(new StructuredSelection(resource), true);
			}

			private void openAddTaskDialog(IResource resource, CommonViewer viewer) {
				TaskPropertiesDialog dialog = new TaskPropertiesDialog(viewer.getControl().getShell());
				dialog.setResource(resource);
				dialog.open();
			}

			private void openInEditor(IResource resource) {
				try {
					EditorUtil.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), (IFile) resource);
				} catch (PartInitException e) {
					throw new IllegalStateException(e);
				}
			}

		};
		viewerNotification.show();
	}
}
