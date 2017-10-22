package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WBWRenderer;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import eu.hohenegger.e4.appmodel.extensions.wizard.ProcessingWizard;
import wizard.ExtensionsPackage;
import wizard.WizardPage;

public class WizardRenderer extends WBWRenderer {
	
	@Inject
	private IEclipseContext context;

	@Inject
	private Display display;
	
	boolean ignoreSizeChanges = false;
	
	private IEclipseContext localContext;
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		//TODO: re-use org.eclipse.e4.ui.workbench.renderers.swt.WBWRenderer.createWidget(MUIElement, Object)
		
		Shell shell = (Shell) super.createWidget(element, parent);
		
		wizard.Wizard wizardElement = (wizard.Wizard) element;
		
		localContext = context.createChild();
		localContext.set(wizard.Wizard.class, wizardElement);

		Wizard newWizard = (Wizard) ContextInjectionFactory.make(ProcessingWizard.class, localContext);
		
		newWizard.setNeedsProgressMonitor(wizardElement.getFinisher() != null && wizardElement.getFinisher().isNeedsProgress());
		WizardDialog wizardDialog = new WizardDialog(shell, newWizard);
		wizardDialog.setBlockOnOpen(wizardElement.isBlockOnOpen());
		wizardElement.setObject(wizardDialog);
		
		@SuppressWarnings("unchecked")
		IObservableValue<wizard.WizardPage> currentWizardPageObserveValue = EMFObservables.observeValue(wizardElement, ExtensionsPackage.eINSTANCE.getWizard_CurrentPage());
		IChangeListener currentWizardPageChangeListener = setupProgrammaticPageFlip(wizardElement, wizardDialog);
		currentWizardPageObserveValue.addChangeListener(currentWizardPageChangeListener);

		return shell;
	}
	
	@Override
	public void postProcess(MUIElement shellME) {
		wizard.Wizard wizardElement = (wizard.Wizard) shellME;
		WizardDialog wizardDialog = (WizardDialog) wizardElement.getObject();

		if (!shellME.isVisible()) {
			return;
		}

		wizardDialog.open();
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
	

}
