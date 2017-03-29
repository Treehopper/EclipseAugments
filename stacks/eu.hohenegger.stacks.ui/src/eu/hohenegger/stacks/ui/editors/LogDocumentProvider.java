package eu.hohenegger.stacks.ui.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class LogDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		return super.createDocument(element);
	}

}
