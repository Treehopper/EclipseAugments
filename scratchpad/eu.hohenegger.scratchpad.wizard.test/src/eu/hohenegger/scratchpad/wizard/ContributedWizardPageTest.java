package eu.hohenegger.scratchpad.wizard;

import static eu.hohenegger.scratchpad.wizard.DatabindingTestUtil.checkValidation;
import static eu.hohenegger.scratchpad.wizard.DatabindingTestUtil.mockTextControl;
import static eu.hohenegger.scratchpad.wizard.DatabindingTestUtil.runInRealm;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.hohenegger.scratchpad.wizard.ContributedWizardPage;
import eu.hohenegger.scratchpad.wizard.model.MyBean;

public class ContributedWizardPageTest {

	private ContributedWizardPage contributedWizardPage;
	private WritableValue<String> textControlMock;
	private DataBindingContext bindingContext;

	@Before
	public void setUp() throws Exception {
		contributedWizardPage = new ContributedWizardPage();
		
		runInRealm(realm -> {
			bindingContext = new DataBindingContext(realm);
			textControlMock = mockTextControl();
			contributedWizardPage.bind(new MyBean(), bindingContext, textControlMock);
		});
	}

	@Test
	public void test() {
		checkValidation(bindingContext, status -> {
			assertFalse(status.isOK());
			assertEquals("no empty value", status.getMessage());
		});
		textControlMock.setValue("foobar");
		checkValidation(bindingContext, status -> assertTrue(status.isOK()));
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
