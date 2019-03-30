package eu.hohenegger.scratchpad.ui.whiteboard;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(service = IContextFunction.class, property = "service.context.key=eu.hohenegger.scratchpad.ui.whiteboard.ScratchPadExtensionService")
public class ScratchPadExtensionService implements IContextFunction {

	private final Set<ScratchPadExtension> extensions = new HashSet<>();
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IEclipseContext applicationContext = getApplicationContext(context);
		applicationContext.set(ScratchPadExtensionService.class, this);
		return this;
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	public synchronized void addExtension(ScratchPadExtension extension) {
		extensions.add(extension);
	}
	
	public synchronized void removeExtension(ScratchPadExtension extension) {
		extensions.remove(extension);
	}

	public synchronized Set<ScratchPadExtension> getExtensions() {
		return extensions;
	}
	
	private IEclipseContext getApplicationContext(IEclipseContext eclipseContext) {
		MApplication mApplication = eclipseContext.get(MApplication.class);
		IEclipseContext applicationContext = mApplication.getContext();
		return applicationContext;
	}
}
