package eu.hohenegger.xsdemftools.ui.handler;

import static org.eclipse.jface.viewers.StructuredSelection.EMPTY;
import static org.eclipse.ui.handlers.HandlerUtil.getActiveShell;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

import eu.hohenegger.xsdemftools.RegisterEcoreUtil;
import eu.hohenegger.xsdemftools.UriConverterUtil;
import eu.hohenegger.xsdemftools.Xsd2EcoreConverterException;

/**
 * See:
 * https://stackoverflow.com/questions/671555/how-to-convert-xsd-to-ecore-emf/4614035#4614035
 * https://github.com/eclipse/emf/blob/master/tests/org.eclipse.emf.test.xml/src/org/eclipse/emf/test/xml/xsdecore/XSDEcoreBuilderTests.java
 *
 */
public class RegisterEcoreWithExtensionHandler extends AbstractHandler {

	private RegisterEcoreUtil registerEcoreUtil;

	public RegisterEcoreWithExtensionHandler() {
		registerEcoreUtil = new RegisterEcoreUtil();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection currentSelection = getCurrentStructuredSelection(event);
		if (currentSelection == EMPTY) {
			return null;
		}
		List<IFile> selectionContent = Util.getFileSelectionContent(currentSelection);
		if (selectionContent.size() != 1) {
			return null;
		}

		IFile ecoreFile = selectionContent.get(0);
		if (!ecoreFile.getName().endsWith("ecore")) {
			return null;
		}
		
		String extension = "xml";

		InputDialog dialog = new InputDialog(getActiveShell(event), "File extension", "Enter file extension to associate",
				extension, newText -> newText.equals("") ? "Please insert a valid extension" : null);
		if (dialog.open() != InputDialog.OK) {
			return null;
		}
		
		extension = dialog.getValue();
		
		try {
			registerEcoreUtil.register(UriConverterUtil.convert(ecoreFile.getRawLocationURI()), extension);
		} catch (Xsd2EcoreConverterException e) {
			throw new ExecutionException("Error registering " + ecoreFile, e);
		}
		
		return null;
	}

}
