package eu.hohenegger.modulebuilder;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;

public abstract class AbstractTest {

	protected Module createModel(String pluginId) {
		Module module = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId(pluginId);

		return module;
	}
}
