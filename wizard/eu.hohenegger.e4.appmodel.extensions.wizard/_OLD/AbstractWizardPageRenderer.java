package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;

import eu.hohenegger.e4.appmodel.extensions.wizard.factory.ReflectionContributionFactory;
import wizard.WizardPage;

public abstract class AbstractWizardPageRenderer extends org.eclipse.jface.wizard.WizardPage {

	public static final String PAGE_NAME = "eu.hohenegger.e4.appmodel.wizard.renderer.WizardPageRenderer.pageName";

	protected Object wizardPage;

	@Inject
	private ReflectionContributionFactory contributionFactory;

	@Inject
	protected IEclipseContext context;

	protected WizardPage wizardPageModel;

	@Inject
	public AbstractWizardPageRenderer(@Named(PAGE_NAME) String pageName) {
		super(pageName);
	}

	protected void createPage() {
		wizardPage = contributionFactory.create(wizardPageModel.getContributionURI(), context);
	}
	
	@Override
	public void dispose() {
		ContextInjectionFactory.uninject(wizardPage, context);
		super.dispose();
	}

	public void setApplicationModel(WizardPage wizardPageModel) {
		this.wizardPageModel = wizardPageModel;
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible && wizardPage != null) {
			ContextInjectionFactory.invoke(wizardPage, Focus.class, context);
		}
		super.setVisible(visible);
	}
}