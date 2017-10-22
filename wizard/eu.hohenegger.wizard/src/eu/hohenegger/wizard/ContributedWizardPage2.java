package eu.hohenegger.wizard;

import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.BindingFactory.observable;
import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.ContextFactory.contextBuilder;
import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.ConverterFactory.formatter;
import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.ValidatorFactory.errorIf;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.eclipse.core.databinding.UpdateValueStrategy.POLICY_NEVER;
import static org.eclipse.core.databinding.beans.BeanProperties.value;
import static org.eclipse.jface.databinding.swt.WidgetProperties.text;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import eu.hohenegger.wizard.model.MyBean;
import wizard.Wizard;
import wizard.WizardPage;

public class ContributedWizardPage2 {
	
	public static final String PAGE_ID = "eu.hohenegger.wizardpage.1";
	
	@Inject
	private WizardPage pageModel;

	@Inject
	private Wizard wizardModel;
	
	@Inject
	private DataBindingContext dataBindingContext;
	
	@Inject
	private MyBean bean;

	@PostConstruct
	public void createUi(Composite parent) {
		Label label = new Label(parent, SWT.BORDER);

		bind(value(MyBean.class, MyBean.TEXT_PROPERTY_NAME).observe(bean), dataBindingContext, text().observe(label));
	}
	
	@SuppressWarnings("unchecked")
	public Binding bind(IObservableValue modelObservable, DataBindingContext bindingContext, IObservableValue observableValue) {
		return contextBuilder(bindingContext)
				.model(observable(modelObservable)
						.convert(formatter((o1) -> String.format("\"%s\"", o1))))
				.target(observable(observableValue).policy(POLICY_NEVER))
			.bind();
	}

	@Focus
	public void focus() {
		System.err.println("page 2 focus");
	}
}
