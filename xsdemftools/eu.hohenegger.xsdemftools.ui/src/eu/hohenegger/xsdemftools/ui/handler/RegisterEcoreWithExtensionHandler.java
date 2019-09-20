package eu.hohenegger.xsdemftools.ui.handler;

import static org.eclipse.jface.viewers.StructuredSelection.EMPTY;
import static org.eclipse.ui.handlers.HandlerUtil.getActiveShell;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * See:
 * https://stackoverflow.com/questions/671555/how-to-convert-xsd-to-ecore-emf/4614035#4614035
 * https://github.com/eclipse/emf/blob/master/tests/org.eclipse.emf.test.xml/src/org/eclipse/emf/test/xml/xsdecore/XSDEcoreBuilderTests.java
 *
 */
public class RegisterEcoreWithExtensionHandler extends AbstractHandler {

	private final static class CustomizedOptionsXmlResourceImpl extends XMLResourceImpl {
		
		  private static final XMLParserPool XML_PARSER_POOL = new XMLParserPoolImpl(1, true);
		  private static final Map<Object, Object> DEFAULT_SAVE_OPTIONS;
		  private static final Map<Object, Object> DEFAULT_LOAD_OPTIONS;
		  static
		  {
		    Map<Object, Object> defaultLoadOptions = new HashMap<Object, Object>();
		    Map<Object, Object> defaultSaveOptions = new HashMap<Object, Object>();

		    defaultLoadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		    defaultSaveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		    ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(new EPackageRegistryImpl());
		    defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		    defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		    XMLOptions xmlOptions = new XMLOptionsImpl();
		    xmlOptions.setProcessAnyXML(true);
		    defaultLoadOptions.put(XMLResource.OPTION_XML_OPTIONS, xmlOptions);

		    defaultLoadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, XML_PARSER_POOL);

		    DEFAULT_LOAD_OPTIONS = defaultLoadOptions;
		    DEFAULT_SAVE_OPTIONS = defaultSaveOptions;
		  }
		  
		private CustomizedOptionsXmlResourceImpl(URI uri) {
			super(uri);
	        defaultLoadOptions = DEFAULT_LOAD_OPTIONS;
	        defaultSaveOptions = DEFAULT_SAVE_OPTIONS;
		}

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
		
		EList<EObject> packages;
		try {
			packages = loadEcore(Util.convert(ecoreFile.getRawLocationURI()));
			for (EObject eObject : packages) {
				EPackage ePackage = (EPackage) eObject;
				EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
			}
		} catch (IOException e) {
			throw new ExecutionException("Unable to load " + ecoreFile, e);
		}
		
		XMLResourceFactoryImpl xmlResourceFactory = new XMLResourceFactoryImpl() {
			
			@Override
			public Resource createResource(URI uri) {
				return new CustomizedOptionsXmlResourceImpl(uri);
			}
		};
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, xmlResourceFactory);

		return null;
	}

	public EList<EObject> loadEcore(URI fileURI) throws IOException {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
//		EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);


		
		// Print the contents of the resource to System.out.
		resource.load(Collections.EMPTY_MAP);
		
		return resource.getContents();
	}
	
}
