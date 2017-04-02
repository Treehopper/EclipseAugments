package eu.hohenegger.common.ui.e3compat;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.ui.PlatformUI;

public class EnabledDIHandler<C> extends AbstractHandler {

	private final C component;

	public EnabledDIHandler(Class<C> clazz) {
		IEclipseContext context = getActiveContext();
		component = ContextInjectionFactory.make(clazz, context);
	}

	private static IEclipseContext getActiveContext() {
		IEclipseContext parentContext = getParentContext();
		return parentContext.getActiveLeaf();
	}

	private static IEclipseContext getParentContext() {
		return PlatformUI.getWorkbench().getService(
				IEclipseContext.class);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return ContextInjectionFactory.invoke(component, Execute.class,
				getActiveContext());
	}

	@Override
	public boolean isEnabled() {
		// this makes implementation of a @CanExecute-method mandatory
		Object invoke = ContextInjectionFactory.invoke(component,
				CanExecute.class, getActiveContext());

		return (boolean) invoke;
	}
}