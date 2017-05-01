package eu.hohenegger.stacks.ui.editors.folding.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.internal.ui.actions.FoldingMessages;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.IFoldingCommandIds;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.TextOperationAction;


public class ExpandAllHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if (activeEditor instanceof ITextEditor) {
			ITextEditor textEditor = (ITextEditor) activeEditor;
			execute(textEditor);
		}
		
		return null;
	}

	private void execute(ITextEditor editor) {
		TextOperationAction action= new TextOperationAction(FoldingMessages.getResourceBundle(), "Projection.ExpandAll.", editor, ProjectionViewer.EXPAND_ALL, true); //$NON-NLS-1$
		action.setActionDefinitionId(IFoldingCommandIds.FOLDING_EXPAND_ALL);
		action.run();
	}

}
