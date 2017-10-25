package eu.hohenegger.scratchpad.ui.notification;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.tasklist.TaskPropertiesDialog;

import eu.hohenegger.scratchpad.notifier.IResourceChangeHandler;
import eu.hohenegger.scratchpad.ui.handler.AbstractHandler;
import eu.hohenegger.scratchpad.ui.widgets.EditorUtil;

public class ResourceChangeNotifier implements IResourceChangeHandler {

	private CommonViewer viewer;

	public ResourceChangeNotifier(CommonViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void handle(IResourceDelta delta) {
		if (AbstractHandler.isBusy()) {
			return;
		}

		switch (delta.getKind()) {
		case IResourceDelta.ADDED:
			Display.getDefault().asyncExec(() -> {
				showToolTip(delta.getResource(), viewer, "Resource added");
			});
			break;
		case IResourceDelta.REMOVED:
			Display.getDefault().asyncExec(() -> {
				showToolTip(delta.getResource(), viewer, "Resource removed");
			});
			break;
		case IResourceDelta.CHANGED:
			Display.getDefault().asyncExec(() -> {
				showToolTip(delta.getResource(), viewer, "Resource changed");
			});
			break;
		}
	}
	
	private void showToolTip(IResource resource, CommonViewer viewer, String message) {
		ViewerNotification viewerNotification = new ViewerNotification(viewer) {
			
			@Override
			protected Composite createContentArea(Composite parent) {
				Composite container = new Composite(parent, SWT.NONE);
				RowLayoutFactory.fillDefaults().applyTo(container);
				Display display = parent.getDisplay();
				container.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));

				createLabel(message, container);
				if (resource instanceof IFile) {
					createLink(container, "Open", event -> {
						dispose();
						try {
							EditorUtil.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), (IFile) resource);
						} catch (PartInitException e) {
							throw new IllegalStateException(e);
						}
					});
				}
				createLink(container, "Reveal", event -> {
					getViewer().setSelection(new StructuredSelection(resource), true);
					dispose();
				});
				createLink(container, "Add Task", event -> {
					dispose();
			        TaskPropertiesDialog dialog = new TaskPropertiesDialog(viewer.getControl().getShell());
			        dialog.setResource(resource);
			        dialog.open();
				});
				createLink(container, "Dismiss", event -> {
					dispose();
				});


				return container;
			}

			private Label createLabel(String message, Composite container) {
				Label label = new Label(container, SWT.NONE);
				label.setText(message);
				label.setBackground(container.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
				return label;
			}

			private Link createLink(Composite container, String text, Listener listener) {
				Link link = new Link(container, SWT.NONE);
				link.setText(String.format("<a>%s</a>", text));
				link.setBackground(container.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
				link.addListener(SWT.Selection, listener);
				return link;
			}
		};
		viewerNotification.show();
	}
}