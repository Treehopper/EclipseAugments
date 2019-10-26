package eu.hohenegger.xsdemftools;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class RegisterEcoreUtil {
		private static final String EMFCOMPARE_CONTENTTYPE_ID = "org.eclipse.emf.compare.content.type";

		private void registerComparsionContentType(String extension) throws CoreException {
			IContentTypeManager contentTypeManager = Platform.getContentTypeManager();
			contentTypeManager.getContentType(EMFCOMPARE_CONTENTTYPE_ID).addFileSpec(extension, IContentType.FILE_EXTENSION_SPEC);
		}

		private EList<EObject> loadEcore(URI fileURI) throws IOException {
			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();

			// Register the default resource factory -- only needed for stand-alone!
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
					new EcoreResourceFactoryImpl());

			// Register the package -- only needed for stand-alone!
//			EcorePackage ecorePackage = EcorePackage.eINSTANCE;

			// Demand load the resource for this file.
			Resource resource = resourceSet.getResource(fileURI, true);


			
			// Print the contents of the resource to System.out.
			resource.load(Collections.EMPTY_MAP);
			
			return resource.getContents();
		}

		public void register(URI ecoreFile, String extension) throws Xsd2EcoreConverterException {
			EList<EObject> packages;
			try {
				packages = loadEcore(ecoreFile);
				for (EObject eObject : packages) {
					EPackage ePackage = (EPackage) eObject;
					EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
				}
			} catch (IOException e) {
				throw new Xsd2EcoreConverterException("Unable to load " + ecoreFile, e);
			}
			
			XMLResourceFactoryImpl xmlResourceFactory = new XMLResourceFactoryImpl() {
				
				@Override
				public Resource createResource(URI uri) {
					return new CustomizedOptionsXmlResourceImpl(uri);
				}
			};
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, xmlResourceFactory);

			try {
				registerComparsionContentType(extension);
			} catch (CoreException e) {
				throw new Xsd2EcoreConverterException("Unable to register extension with EMFCompare: " + extension, e);
			}
		}
	}