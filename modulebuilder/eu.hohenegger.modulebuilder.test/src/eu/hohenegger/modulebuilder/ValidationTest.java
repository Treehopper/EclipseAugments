package eu.hohenegger.modulebuilder;

import static org.eclipse.emf.common.util.Diagnostic.OK;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;

public class ValidationTest extends AbstractTest {

	private Module module;

	@Before
	public void setup() {
		module = createModel("TODO");
	}

	@Test
	public void testValidation() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		assertEquals(OK, diagnostic.getSeverity());
	}

	@Test
	@Ignore // validation is not yet working properly
	public void testValidationFail() {
		Module failingMmodule = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId("!@#$%^&*()");
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(failingMmodule);
		assertNotEquals(OK, diagnostic.getSeverity());
	}
}
