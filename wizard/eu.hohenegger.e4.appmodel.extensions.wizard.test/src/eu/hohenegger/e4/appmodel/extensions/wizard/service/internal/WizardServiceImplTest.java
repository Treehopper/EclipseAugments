package eu.hohenegger.e4.appmodel.extensions.wizard.service.internal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import wizard.ExtensionsFactory;
import wizard.ExtensionsPackage;
import wizard.Wizard;
import wizard.WizardPage;

public class WizardServiceImplTest {

	private static final String PAGE2_ID = "page2";
	private WizardServiceImpl wizardService;
	private Wizard wizard;
	private WizardPage wizardPage1;
	private WizardPage wizardPage2;

	@Before
	public void setUp() throws Exception {
		wizardService = new WizardServiceImpl();
		wizard = ExtensionsFactory.eINSTANCE.createWizard();
		wizardPage1 = ExtensionsFactory.eINSTANCE.createWizardPage();
		wizardPage2 = ExtensionsFactory.eINSTANCE.createWizardPage();
		wizardPage2.setElementId(PAGE2_ID);
		wizard.getPages().add(wizardPage1);
		wizard.getPages().add(wizardPage2);
		wizard.setCurrentPage(wizardPage1);
	}

	@Test
	public void testFlipToNextPage() {
		assertEquals(wizardPage1, wizard.getCurrentPage());
		wizardService.flipToNextPage(wizard);
		assertEquals(wizardPage2, wizard.getCurrentPage());
	}

	@Test
	public void testSwitchPage() {
		assertEquals(wizardPage1, wizard.getCurrentPage());
		wizardService.switchPage(wizard, PAGE2_ID);
		assertEquals(wizardPage2, wizard.getCurrentPage());
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
