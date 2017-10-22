package eu.hohenegger.e4.appmodel.extensions.wizard.service.internal;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import eu.hohenegger.e4.appmodel.extensions.wizard.service.EWizardService;
import wizard.Wizard;
import wizard.WizardPage;

public class WizardServiceImpl implements EWizardService {

	@Override
	public void flipToNextPage(Wizard wizard) {
		WizardPage currentPage = wizard.getCurrentPage();
		Iterator<WizardPage> pageIterator = getPageIterator(wizard);
		while (pageIterator.hasNext()) {
			WizardPage wizardPage = (WizardPage) pageIterator.next();
			if (wizardPage.equals(currentPage) && pageIterator.hasNext()) {
				wizard.setCurrentPage(pageIterator.next());
				return;
			}
		}
	}

	@Override
	public void switchPage(Wizard wizard, String pageId) {
		if (pageId == null) {
			throw new IllegalArgumentException("page ID may not be null");
		}
		Iterator<WizardPage> pageIterator = getPageIterator(wizard);
		while (pageIterator.hasNext()) {
			WizardPage wizardPage = (WizardPage) pageIterator.next();
			if (pageId.equals(wizardPage.getElementId())) {
				wizard.setCurrentPage(wizardPage);
				return;
			}
		}	
	}

	private Iterator<WizardPage> getPageIterator(Wizard wizard) {
		List<WizardPage> pages = wizard.getPages();
		return pages.iterator();
	}
}
