package eu.hohenegger.partdetacher.ui;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler {

	private static MElementContainer<MUIElement> parent;
	private static MPart part;

	@Inject
	private EModelService modelService;

	@Execute
	public void execute(MPart activePart) {
		if (parent != null && part != null) {
			modelService.move(part, parent);
			modelService.bringToTop(part);
			
			parent = null;
			part = null;
			return;
		}
		part = activePart;
		parent = activePart.getParent();

		Rectangle allMonitors = getMultiMonitorClientArea();
		modelService.detach(part, allMonitors.x, allMonitors.y, allMonitors.width, allMonitors.height);

		if (isMultiMonitor()) {
			return;
		}
		Display current = Display.getCurrent();
		if (current != null) {
			current.getActiveShell().setFullScreen(true);
		}
	}

	private boolean isMultiMonitor() {
		return Display.getDefault().getMonitors().length != 1;
	}

	private Rectangle getMultiMonitorClientArea() {
		Monitor[] monitors = Display.getDefault().getMonitors();
		Rectangle allMonitors = new Rectangle(0, 0, 0, 0);
		for (Monitor monitor : monitors) {
			Rectangle bounds = monitor.getClientArea();
			allMonitors = allMonitors.union(bounds);
		}
		return allMonitors;
	}
}
