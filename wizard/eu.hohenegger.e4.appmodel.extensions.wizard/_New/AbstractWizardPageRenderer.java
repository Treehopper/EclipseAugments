package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import eu.hohenegger.e4.appmodel.extensions.wizard.factory.ReflectionContributionFactory;
import wizard.WizardPage;

public abstract class AbstractWizardPageRenderer {

	public static final String PAGE_NAME = "eu.hohenegger.e4.appmodel.wizard.renderer.WizardPageRenderer.pageName";

	protected Object wizardPage;

	@Inject
	private ReflectionContributionFactory contributionFactory;

	@Inject
	protected IEclipseContext context;

	protected WizardPage wizardPageModel;

	protected final void createPage() {
		wizardPage = contributionFactory.create(wizardPageModel.getContributionURI(), context);
	}

	public final void setApplicationModel(WizardPage wizardPageModel) {
		this.wizardPageModel = wizardPageModel;
	}

}