package eu.hohenegger.scratchpad.ui.widgets;

import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.CommonViewerSorter;
import org.eclipse.ui.navigator.INavigatorContentService;
import org.eclipse.ui.navigator.INavigatorFilterService;

import eu.hohenegger.common.ui.CommonUiUtil;

@Creatable
public class ScratchpadViewer {

	public static final String VIEWER_ID = "eu.hohenegger.scratchpad";

	@Inject
	private ESelectionService selectionService;

	@Inject
	private IWorkbench workbench;

	private CommonViewer commonViewer;

	private INavigatorContentService contentService;

	private Optional<IProject> currentProject = Optional.empty();

	@PostConstruct
	private void createWidget(Composite parent) {
		commonViewer = createCommonViewer(parent);
		updateProjectInput();
	}

	private CommonViewer createCommonViewer(Composite parent) {
		CommonViewer viewer = createViewer(parent);

		viewer.addOpenListener(this::handleItemOpened);

		contentService = viewer.getNavigatorContentService();

		addFilters(viewer);

		viewer.setSorter(new CommonViewerSorter());

		viewer.addSelectionChangedListener(event -> selectionService.setSelection(event.getSelection()));

		setupClickToDeselect(viewer);

		return viewer;
	}

	private void setupClickToDeselect(CommonViewer viewer) {
		viewer.getTree().addListener(SWT.MouseDown, e -> {
			TreeItem node = viewer.getTree().getItem(new Point(e.x, e.y));
			if (node == null) {
				viewer.getTree().deselectAll();
				setProjectSelectionFromInput();
			}
		});
	}

	private void setProjectSelectionFromInput() {
		Object currentInput = commonViewer.getInput();
		if (currentInput != null) {
			selectionService.setSelection(new StructuredSelection(currentInput));
		}
	}

	public void initContextMenu(EMenuService menuService, IMenuService e3menuService) {
		String popupMenuId = contentService.getViewerDescriptor().getPopupMenuId();
		CommonUiUtil.registerE4ContextMenu(menuService, popupMenuId, commonViewer.getTree());
		CommonUiUtil.registerE3ContextMenu(e3menuService, popupMenuId, commonViewer.getTree());
	}


	private void addFilters(CommonViewer viewer) {
		INavigatorFilterService filterService = viewer.getNavigatorContentService().getFilterService();
		ViewerFilter[] visibleFilters = filterService.getVisibleFilters(true);
		for (int i = 0; i < visibleFilters.length; i++) {
			viewer.addFilter(visibleFilters[i]);
		}
	}

	private CommonViewer createViewer(Composite aParent) {
		return new CommonViewer(VIEWER_ID, aParent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	}

	private void handleItemOpened(OpenEvent event) {
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		IResource firstElement = (IResource) selection.getFirstElement();
		if (firstElement instanceof IFile) {
			try {
				EditorUtil.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), (IFile) firstElement);
			} catch (PartInitException e) {
//				logger.log(error(e)); //FIXME
			}
			return;
		}

		Object element = selection.getFirstElement();
		if (commonViewer.isExpandable(element)) {
			commonViewer.setExpandedState(element, !commonViewer.getExpandedState(element));
		}
	}

	public void setProject(IProject project) {
		if (currentProject.isPresent() && currentProject.get().equals(project)) {
			return;
		}

		currentProject = Optional.ofNullable(project);

		Display.getDefault().asyncExec(this::updateProjectInput);
	}

	private void updateProjectInput() {
		if (commonViewer == null || commonViewer.getControl().isDisposed()) {
			return;
		}

		commonViewer.setInput(currentProject.orElse(null));
	}

	public CommonViewer getViewer() {
		return commonViewer;
	}

	private boolean isDisposed() {
		return commonViewer.getTree().isDisposed();
	}

	public void setFocus() {
		if (!isDisposed()) {
			commonViewer.getTree().setFocus();
		}
	}

	@PreDestroy
	public void dispose() {
		currentProject = Optional.empty();
	}
}
