package eu.hohenegger.gister.ui;

import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PAGE_ID;
import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PREF_KEY;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class TokenPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
        setPreferenceStore(new ScopedPreferenceStore(INSTANCE, TOKEN_PAGE_ID));
        setDescription("GitHub -> Settings -> Developer settings -> Personal access tokens -> Generate new token");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(TOKEN_PREF_KEY, "Personal API Token:", getFieldEditorParent()));
	}
}
