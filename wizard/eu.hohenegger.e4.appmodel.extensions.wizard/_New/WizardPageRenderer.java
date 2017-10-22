package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;
import javax.inject.Named;

public class WizardPageRenderer extends DatabindingWizardPageRenderer {

	@Inject
	public WizardPageRenderer(@Named(PAGE_NAME) String pageName) {
		super(pageName);
	}

}