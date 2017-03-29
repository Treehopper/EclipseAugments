package eu.hohenegger.modulebuilder;

import static eu.hohenegger.modulebuilder.impl.Activator.logError;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import modulespecification.ModulespecificationPackage;

public class XMIPersistenceUtil {
	public static <T extends EObject> void save(T eObject, String extension, URI location) {
		initModel();

		registerExtension(extension);

		ResourceSet resSet = createResourceSet();

		// create a resource
		Resource resource = resSet.createResource(location);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(eObject);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			logError(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T load(String extension, URI location) {
		initModel();

		registerExtension(extension);

		// Obtain a new resource set
		ResourceSet resSet = createResourceSet();

		// Get the resource
		Resource resource = resSet.getResource(location, true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		return (T) resource.getContents().get(0);
	}

	private static ResourceSet createResourceSet() {
		return new ResourceSetImpl();
	}

	private static void initModel() {
		ModulespecificationPackage.eINSTANCE.eClass();
	}

	private static void registerExtension(String extension) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());
	}
}
