package eu.hohenegger.gister.ui;

import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PAGE_ID;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import eu.hohenegger.gister.ui.handler.Constants;

public class TokenPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
        setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, TOKEN_PAGE_ID));
        setDescription("Unprotected!");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(Constants.TOKEN_PREF_KEY, "Personal API Token:", getFieldEditorParent()));
	}
}
