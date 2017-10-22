package eu.hohenegger.e4.appmodel.extensions.wizard.service.internal;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class ContextFunction implements IContextFunction {

        @Override
        public Object compute(IEclipseContext context, String contextKey) {
                return ContextInjectionFactory.make(WizardServiceImpl.class, context);
        }
}