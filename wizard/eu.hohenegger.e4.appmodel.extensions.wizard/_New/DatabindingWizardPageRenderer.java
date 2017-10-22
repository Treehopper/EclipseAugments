package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.swt.widgets.Composite;

public abstract class DatabindingWizardPageRenderer extends JFaceWizardPageRenderer {

	@Inject
	public DatabindingWizardPageRenderer(@Named(PAGE_NAME) String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		DataBindingContext dbc = new DataBindingContext();
		context.set(DataBindingContext.class, dbc);
		super.createControl(parent);
		
		WizardPageSupport.create(jfaceWizardPage, dbc);
	}

}