package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;

import eu.hohenegger.e4.appmodel.extensions.wizard.ProcessingWizard;
import eu.hohenegger.e4.appmodel.extensions.wizard.factory.ReflectionContributionFactory;
import wizard.ExtensionsPackage;
import wizard.WizardPage;

public class WizardRenderer extends AbstractPartRenderer {

	@Inject
	private IEclipseContext context;
	
	@Inject
	private ReflectionContributionFactory contributionFactory;

	private IEclipseContext localContext;

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		wizard.Wizard wizardElement = (wizard.Wizard) element;
		
		localContext = context.createChild();
		localContext.set(wizard.Wizard.class, wizardElement);
		

		Wizard newWizard = (Wizard) ContextInjectionFactory.make(ProcessingWizard.class, localContext);
		
		newWizard.setNeedsProgressMonitor(wizardElement.getFinisher() != null && wizardElement.getFinisher().isNeedsProgress());
		WizardDialog result = new WizardDialog(null, newWizard);
		
		@SuppressWarnings("unchecked")
		IObservableValue<wizard.WizardPage> currentWizardPageObserveValue = EMFObservables.observeValue(wizardElement, ExtensionsPackage.eINSTANCE.getWizard_CurrentPage());
		IChangeListener currentWizardPageChangeListener = setupProgrammaticPageFlip(wizardElement, result);
		currentWizardPageObserveValue.addChangeListener(currentWizardPageChangeListener);
		result.open();
		currentWizardPageObserveValue.removeChangeListener(currentWizardPageChangeListener);

		return result;
	}

	private IChangeListener setupProgrammaticPageFlip(wizard.Wizard wizardElement, WizardDialog wizardDialog) {
		wizardDialog.addPageChangedListener(event -> {
			Object selectedPage = event.getSelectedPage();
			List<WizardPage> pages = wizardElement.getPages();
			for (WizardPage wizardPage : pages) {
				Object pageObject = wizardPage.getObject();
				if (selectedPage.equals(pageObject)) {
					wizardElement.setCurrentPage(wizardPage);
				}
			}
		});
		
		IChangeListener result = event -> {
			EObjectObservableValue source = (EObjectObservableValue) event.getSource();
			wizard.WizardPage newWizardPage = (WizardPage) source.getValue();
			IWizardPage newPageObject = (IWizardPage) newWizardPage.getObject();
			boolean isInternallyTriggered = newPageObject.equals(wizardDialog.getCurrentPage());
			if (!isInternallyTriggered) {
				wizardDialog.showPage(newPageObject);
			}
		};
		return result;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		// TODO Auto-generated method stub
		System.err.println("processContents");
	}

	@Override
	public void bindWidget(MUIElement me, Object widget) {
		// TODO inherit from ContributedPartRenderer
		me.setWidget(widget);
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		System.err.println("processContents");
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		localContext.dispose();
		// TODO Auto-generated method stub
		System.err.println("processContents");
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		// TODO Auto-generated method stub
		System.err.println("hookControllerLogic");
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
		// TODO Auto-generated method stub
		System.err.println("processContents");	
	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		System.err.println("processContents");
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		System.err.println("processContents");
		return false;
	}

}
