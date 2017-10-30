package eu.hohenegger.common.ui.notification;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public abstract class ViewerNotification {

	private static final String DATA_EXTENSION = ".notification";
	private static final int LOCATION_X_OFFSET = 0;
	private static final int LOCATION_Y_OFFSET = -5;
	private static final int TOOLTIP_MARGIN = 5;
	private static final int TOOLTIP_HEIGHT = 30;

	private Viewer viewer;
	private int hideDelay = 5_000;
	private boolean autoHide = true;
	private Shell shell;

	public ViewerNotification(Viewer viewer) {
		shell = new Shell(viewer.getControl().getShell(), SWT.ON_TOP | SWT.TOOL | SWT.NO_FOCUS);
		
		this.viewer = viewer;
		Control control = viewer.getControl();
		
		shell.setLayout(new FillLayout());
		shell.setSize(control.getSize().x - TOOLTIP_MARGIN, TOOLTIP_HEIGHT);
		
	}

	private void setActiveNotificationsCount(int activeNotifications) {
		getViewer().setData(getClass().getName() + DATA_EXTENSION, activeNotifications);
	}

	private Integer getActiveNotificationsCount() {
		Integer result = (Integer) getViewer().getData(getClass().getName() + DATA_EXTENSION);
		if (result == null) {
			setActiveNotificationsCount(0);
			return 0;
		}
		return result;
	}
	
	public Viewer getViewer() {
		return viewer;
	}
	
	public void setHideDelay(int hideDelay) {
		this.hideDelay = hideDelay;
	}
	
	public void setAutoHide (boolean autoHide) {
		this.autoHide = autoHide;
	}
	
	public void show() {
		createContentArea(shell);
		shell.layout();
		Integer activeNotificationsCounter = getActiveNotificationsCount();
		activeNotificationsCounter++;
		setActiveNotificationsCount(activeNotificationsCounter);
		Point location = viewer.getControl().toDisplay(LOCATION_X_OFFSET, viewer.getControl().getSize().y + LOCATION_Y_OFFSET - (TOOLTIP_HEIGHT * activeNotificationsCounter));
		shell.setLocation(location);

		shell.setVisible(true);
		if (autoHide) {
			shell.getDisplay().timerExec(hideDelay, () -> {
				if (!shell.isDisposed()) {
					dispose();
				}
			});
		}
	}
	
	public void dispose() {
		setActiveNotificationsCount(getActiveNotificationsCount() - 1);;
		if (!shell.isDisposed()) {
			shell.close();
		}
	}

	abstract protected Composite createContentArea(Composite parent);
	
	protected Label createLabel(String message, Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(message);
		label.setBackground(getBackgroundColor(container.getDisplay()));
		return label;
	}

	protected Link createLink(Composite container, String text, Listener listener) {
		Link link = new Link(container, SWT.NONE);
		link.setText(String.format("<a>%s</a>", text));
		link.setBackground(getBackgroundColor(container.getDisplay()));
		link.addListener(SWT.Selection, listener);
		return link;
	}

	protected Color getBackgroundColor(Display display) {
		return display.getSystemColor(SWT.COLOR_INFO_BACKGROUND);
	}
}
