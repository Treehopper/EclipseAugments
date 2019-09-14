package eu.hohenegger.xsdemftools.ui.handler;

import static org.eclipse.core.runtime.Adapters.adapt;
import static org.eclipse.jface.viewers.StructuredSelection.EMPTY;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

/**
 * See:
 * https://stackoverflow.com/questions/671555/how-to-convert-xsd-to-ecore-emf/4614035#4614035
 * https://github.com/eclipse/emf/blob/master/tests/org.eclipse.emf.test.xml/src/org/eclipse/emf/test/xml/xsdecore/XSDEcoreBuilderTests.java
 *
 */
public class Xsd2EcoreHandler extends AbstractHandler {

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
			URI locationURI = iFile.getRawLocationURI();

			XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
			ResourceSet resourceSet = new ResourceSetImpl();
			Collection<EObject> eCorePackages = xsdEcoreBuilder.generate(convert(locationURI));

			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
					new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(convert(locationURI.resolve(iFile.getName() + ".ecore")));

			for (Iterator<EObject> iter = eCorePackages.iterator(); iter.hasNext();) {
				EObject eObject = iter.next();
				if (!(eObject instanceof EPackage)) {
					throw new ExecutionException("Unexpected type " + eObject + ". Expected EPackage.");
				}
				EPackage element = (EPackage) eObject;
				resource.getContents().add(element);
			}

			try {
				resource.save(null);
			} catch (IOException e) {
				throw new ExecutionException("Error saving resource " + resource, e);
			}

			try {
				iFile.getParent().refreshLocal(1, new NullProgressMonitor());
			} catch (CoreException e) {
				throw new ExecutionException("Failed to refresh parent of " + iFile, e);
			}
		}

		return null;
	}

	private org.eclipse.emf.common.util.URI convert(URI targetResourceUri) {
		return org.eclipse.emf.common.util.URI.createFileURI(targetResourceUri.getRawPath());
	}

	public List<IFile> getFileSelectionContent(IStructuredSelection currentSelection) throws ExecutionException {
		List<IFile> result = new ArrayList<>();
		Iterator<?> iterator = currentSelection.iterator();
		while (iterator.hasNext()) {
			IResource resource = adapt(iterator.next(), IResource.class);

			if (!(resource instanceof IFile)) {
				continue;
			}

			result.add((IFile) resource);
		}

		return result;
	}
}
