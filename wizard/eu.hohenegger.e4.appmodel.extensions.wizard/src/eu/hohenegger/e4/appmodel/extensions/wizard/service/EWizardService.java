package eu.hohenegger.e4.appmodel.extensions.wizard.service;

public interface EWizardService {

	void flipToNextPage(wizard.Wizard wizard);
	void switchPage(wizard.Wizard wizard, String pageId);
}
