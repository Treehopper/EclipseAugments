package eu.hohenegger.stacks.ui.editors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.editors.text.TextEditor;

public class LogEditor extends TextEditor {

	private ColorManager colorManager;
	private ProjectionSupport projectionSupport;
	private ProjectionAnnotationModel annotationModel;

	private Annotation[] oldAnnotations;

	public void updateFoldingStructure(List<Position> positions) {
		Annotation[] annotations = new Annotation[positions.size()];

		Map<ProjectionAnnotation, Position> newAnnotations = new HashMap<>();

		for (int i = 0; i < positions.size(); i++) {
			ProjectionAnnotation annotation = new ProjectionAnnotation();

			newAnnotations.put(annotation, positions.get(i));

			annotations[i] = annotation;
		}

		annotationModel.modifyAnnotations(oldAnnotations, newAnnotations, null);

		oldAnnotations = annotations;
	}

	public LogEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new LogConfiguration(colorManager,
				positions -> {
					Display.getDefault().asyncExec(() -> {
						updateFoldingStructure(positions);
					});
				}));
		setDocumentProvider(new LogDocumentProvider());
	}
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

		projectionSupport = new ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
		projectionSupport.install();

		viewer.doOperation(ProjectionViewer.TOGGLE);

		annotationModel = viewer.getProjectionAnnotationModel();
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(),
				styles);

		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);

		return viewer;
	}
}
