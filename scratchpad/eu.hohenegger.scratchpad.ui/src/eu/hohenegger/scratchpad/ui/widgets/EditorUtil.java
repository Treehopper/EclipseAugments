package eu.hohenegger.scratchpad.ui.widgets;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public class EditorUtil {
	public static IEditorPart openEditor(IWorkbenchPage page, IFile file) throws PartInitException {
		if (page == null) {
			throw new IllegalArgumentException();
		}

		IEditorDescriptor editorDesc = IDE.getEditorDescriptor(file, true, true);
		return page.openEditor(new FileEditorInput(file), editorDesc.getId());
	}
}
