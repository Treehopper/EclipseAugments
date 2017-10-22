package eu.hohenegger.e4.appmodel.extensions.wizard;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.wizard.IWizardPage;

import eu.hohenegger.e4.appmodel.extensions.wizard.renderer.AbstractWizardPageRenderer;
import eu.hohenegger.e4.appmodel.extensions.wizard.renderer.WizardPageRenderer;
import wizard.Wizard;
import wizard.WizardPage;

public abstract class AbstractWizard extends org.eclipse.jface.wizard.Wizard {

	@Inject
	private Wizard wizard;
	
	@Inject
	private IEclipseContext context;

	@Override
	public void addPages() {
		List<WizardPage> pages = wizard.getPages();
		for (WizardPage wizardPage : pages) {
			
			context.set(WizardPage.class, wizardPage);
			context.set(AbstractWizardPageRenderer.PAGE_NAME, wizardPage.getName());
			WizardPageRenderer pageRenderer = ContextInjectionFactory.make(WizardPageRenderer.class, context);
			pageRenderer.setApplicationModel(wizardPage);
			
			addPage(pageRenderer);
		}
	}

	@Override
	public void dispose() {
		IWizardPage[] pages = getPages();
		for (IWizardPage pageRenderer : pages) {
			ContextInjectionFactory.uninject(pageRenderer, context);
		}
		super.dispose();
	}
}
