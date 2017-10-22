package eu.hohenegger.wizard;

import static eu.hohenegger.wizard.DatabindingTestUtil.mockTextControl;
import static eu.hohenegger.wizard.DatabindingTestUtil.runInRealm;
import static org.eclipse.core.databinding.beans.BeanProperties.value;
import static org.junit.Assert.assertEquals;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.hohenegger.wizard.model.MyBean;

public class ContributedWizardPage2Test {

	private ContributedWizardPage2 contributedWizardPage;
	private WritableValue<String> labelControlMock;
	private DataBindingContext bindingContext;
	private MyBean bean;

	@Before
	public void setUp() throws Exception {
		contributedWizardPage = new ContributedWizardPage2();
		
		runInRealm(realm -> {
			bindingContext = new DataBindingContext(realm);
			labelControlMock = mockTextControl();
			bean = new MyBean();
			contributedWizardPage.bind(value(MyBean.class, MyBean.TEXT_PROPERTY_NAME).observe(bean), bindingContext, labelControlMock);
		});
	}

	@Test
	public void test() {
		assertEquals("\"\"", labelControlMock.getValue());
		bean.setText("foobar");
		assertEquals("\"foobar\"", labelControlMock.getValue());
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
