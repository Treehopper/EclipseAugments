package eu.hohenegger.scratchpad.ui;

import static eu.hohenegger.scratchpad.Constants.SCRATCHPAD_PROJECT_NAME;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.menus.IMenuService;

import eu.hohenegger.common.ui.control.DIControlFactory;
import eu.hohenegger.scratchpad.ResourceUtil;
import eu.hohenegger.scratchpad.notifier.LinkedFoldersUpdateScanner;
import eu.hohenegger.scratchpad.ui.notification.ResourceChangeNotifier;
import eu.hohenegger.scratchpad.ui.widgets.ScratchpadViewer;

public class ScratchPadPart {

	public static final String PART_ID = "eu.hohenegger.scratchpad";

	@Inject
	private DIControlFactory controlFactory;

	@Inject
	private EMenuService menuService;

	@Inject
	private IMenuService e3menuService;

	@Inject
	private ResourceUtil resourceUtil;

	@Inject
	private IWorkspace workspace;

	private ScratchpadViewer projetViewerWidget;

	@PostConstruct
	public void createPartControl(Composite parent) {
		GridLayoutFactory.swtDefaults().applyTo(parent);
		
		projetViewerWidget = controlFactory.createControl(ScratchpadViewer.class, parent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(projetViewerWidget.getViewer().getControl());
		projetViewerWidget.initContextMenu(menuService, e3menuService);
		
		IProject scratchPadProject = initProject();
		
		IResourceChangeListener changeListener = new LinkedFoldersUpdateScanner(scratchPadProject, new ResourceChangeNotifier(projetViewerWidget.getViewer()));
		workspace.addResourceChangeListener(changeListener);
	}

	private IProject initProject() {
		IProject project = null;
		try {
			if (!resourceUtil.projectExists(SCRATCHPAD_PROJECT_NAME)) {
				project = resourceUtil.createNewProject(SCRATCHPAD_PROJECT_NAME, new NullProgressMonitor());
			} else {
				project = resourceUtil.getProject(SCRATCHPAD_PROJECT_NAME);
			}
			projetViewerWidget.setProject(project);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
		return project;
	}

	@Focus
	private void setFocus() {
		projetViewerWidget.setFocus();
	}

	@PreDestroy
	private void dispose() {
		projetViewerWidget.dispose();
	}
}
