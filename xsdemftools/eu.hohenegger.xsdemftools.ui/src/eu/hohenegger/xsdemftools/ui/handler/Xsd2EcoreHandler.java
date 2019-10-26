package eu.hohenegger.xsdemftools.ui.handler;

import static eu.hohenegger.xsdemftools.UriConverterUtil.convert;
import static eu.hohenegger.xsdemftools.ui.handler.Util.getFileSelectionContent;
import static org.eclipse.jface.viewers.StructuredSelection.EMPTY;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;

import eu.hohenegger.xsdemftools.UriConverterUtil;
import eu.hohenegger.xsdemftools.Xsd2EcoreConverterException;
import eu.hohenegger.xsdemftools.Xsd2EcoreUtil;

/**
 * See:
 * https://stackoverflow.com/questions/671555/how-to-convert-xsd-to-ecore-emf/4614035#4614035
 * https://github.com/eclipse/emf/blob/master/tests/org.eclipse.emf.test.xml/src/org/eclipse/emf/test/xml/xsdecore/XSDEcoreBuilderTests.java
 *
 */
public class Xsd2EcoreHandler extends AbstractHandler {
	
	private Xsd2EcoreUtil xsd2EcoreUtil;

	public Xsd2EcoreHandler() {
		xsd2EcoreUtil = new Xsd2EcoreUtil();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection currentSelection = getCurrentStructuredSelection(event);
		if (currentSelection == EMPTY) {
			return null;
		}
		List<IFile> selectionContent = getFileSelectionContent(currentSelection);
		if (selectionContent.isEmpty()) {
			return null;
		}

		for (IFile iFile : selectionContent) {
			try {
				xsd2EcoreUtil.convert(UriConverterUtil.convert(iFile.getRawLocationURI()), convert(iFile.getRawLocationURI().resolve(iFile.getName() + ".ecore")));
			} catch (Xsd2EcoreConverterException e) {
				throw new ExecutionException("Failed while registering " + iFile, e);
			}
			
			try {
				iFile.getParent().refreshLocal(1, new NullProgressMonitor());
			} catch (CoreException e) {
				throw new ExecutionException("Failed to refresh parent of " + iFile, e);
			}
		}

		return null;
	}
	

}
