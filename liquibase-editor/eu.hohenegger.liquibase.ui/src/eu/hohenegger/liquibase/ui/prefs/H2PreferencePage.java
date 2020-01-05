package eu.hohenegger.liquibase.ui.prefs;

import static eu.hohenegger.liquibase.ui.handler.Constants.DB_USER_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_CONSOLE_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_PAGE_ID;
import static eu.hohenegger.liquibase.ui.handler.Constants.H2_TCP_PORT_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.JDBC_URL_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.START_H2_CONSOLE_PREF_KEY;
import static eu.hohenegger.liquibase.ui.handler.Constants.USE_EMBEDDED_H2_PREF_KEY;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class H2PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(INSTANCE, H2_PAGE_ID));
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(JDBC_URL_PREF_KEY, "JDBC URL:", getFieldEditorParent()));
		addField(new StringFieldEditor(DB_USER_PREF_KEY, "DB User:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(USE_EMBEDDED_H2_PREF_KEY, "Use embedded H2", getFieldEditorParent()));
		addField(new IntegerFieldEditor(H2_TCP_PORT_PREF_KEY, "H2 port:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(START_H2_CONSOLE_PREF_KEY, "Start H2 Console", getFieldEditorParent()));
		addField(new IntegerFieldEditor(H2_CONSOLE_PORT_PREF_KEY, "H2 Console port:", getFieldEditorParent()));
	}
}
