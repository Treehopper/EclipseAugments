package eu.hohenegger.scratchpad.wizard;

import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.BindingFactory.observable;
import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.ContextFactory.contextBuilder;
import static eu.hohenegger.e4.appmodel.wizard.renderer.builder.ValidatorFactory.errorIf;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.eclipse.core.databinding.beans.BeanProperties.value;
import static org.eclipse.jface.databinding.swt.WidgetProperties.text;
import static org.eclipse.swt.SWT.Modify;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import eu.hohenegger.e4.appmodel.extensions.wizard.service.EWizardService;
import eu.hohenegger.scratchpad.wizard.model.MyBean;
import wizard.Wizard;
import wizard.WizardPage;

public class ContributedWizardPage {
	
	public static final String PAGE_ID = "eu.hohenegger.wizardpage.0";

	@Inject
	private WizardPage pageModel;

	@Inject
	private Wizard wizardModel;
	
	@Inject
	private DataBindingContext dataBindingContext;
	
	@Inject
	private MyBean bean;
	
	@Inject
	private EWizardService wizardService;

	private Text text;

	@PostConstruct
	public void createUi(Composite parent) {
		text = new Text(parent, SWT.BORDER);
		
		//FIXME: remove
		Button button = new Button(parent, SWT.NONE);
		button.addListener(SWT.Selection, event -> {
//			wizardService.flipToNextPage(wizardModel);
			wizardService.switchPage(wizardModel, ContributedWizardPage2.PAGE_ID);
		});

		ControlDecorationSupport.create(bind(bean, dataBindingContext, text(Modify).observe(text)), SWT.TOP | SWT.LEFT);	
	}

	@SuppressWarnings("unchecked")
	public Binding bind(MyBean bean, DataBindingContext bindingContext, IObservableValue observableValue) {
		return contextBuilder(bindingContext)
				.model(observable(value(MyBean.class, MyBean.TEXT_PROPERTY_NAME).observe(bean)))
				.target(observable(observableValue)
						.validate(errorIf((value) -> isEmpty((String) value)).message("no empty value")))
				.bind();
	}
	
	@Focus
	public void focus() {
		System.err.println("page 1 focus");
	}

	@PreDestroy
	private void dispose() {
		System.out.println("dispose");
	}
}
