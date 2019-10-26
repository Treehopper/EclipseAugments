package eu.hohenegger.xsdemftools;

import static eu.hohenegger.xsdemftools.UriConverterUtil.convert;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

public class Xsd2EcoreUtil {
	
	public void convert(URI locationURI, URI targetUri) throws Xsd2EcoreConverterException {
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		ResourceSet resourceSet = new ResourceSetImpl();
		Collection<EObject> eCorePackages = xsdEcoreBuilder.generate(locationURI);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
				new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(targetUri);
		
		for (Iterator<EObject> iter = eCorePackages.iterator(); iter.hasNext();) {
			EObject eObject = iter.next();
			if (!(eObject instanceof EPackage)) {
				throw new Xsd2EcoreConverterException("Unexpected type " + eObject + ". Expected EPackage.");
			}
			EPackage element = (EPackage) eObject;
			resource.getContents().add(element);
		}
		
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new Xsd2EcoreConverterException("Error saving resource " + resource, e);
		}
	}
	
}