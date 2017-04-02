package eu.hohenegger.common.ui.control;

import static org.eclipse.e4.core.contexts.ContextInjectionFactory.make;
import static org.eclipse.e4.core.contexts.ContextInjectionFactory.uninject;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

@Creatable
@Singleton
public class DIControlFactory {

	@Inject
	private MApplication app;

	public <T> T createControl(Class<T> clazz, Composite parent) {
		app.getContext().set(Composite.class, parent);
		T control = make(clazz, app.getContext());
		parent.addListener(SWT.Dispose, event -> uninject(control, app.getContext()));
		return control;
	}
}
