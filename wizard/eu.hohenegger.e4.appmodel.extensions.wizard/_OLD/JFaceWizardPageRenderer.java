package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class JFaceWizardPageRenderer extends AbstractWizardPageRenderer {

	@Inject
	public JFaceWizardPageRenderer(@Named(PAGE_NAME) String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);
		control.setLayout(new FillLayout());
		setControl(control);
		context.set(Composite.class, control);
		createPage();
		if (wizardPage == null) {
			throw new IllegalStateException("Unable to instantiate " + wizardPageModel.getContributionURI());
		}
		wizardPageModel.setObject(this);
		setTitle(wizardPageModel.getTitle());
		setDescription(wizardPageModel.getDescription());
	}
	
	
}