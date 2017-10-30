package eu.hohenegger.scratchpad.ui.whiteboard;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(/* immediate = true */)
public class ScratchPadExtensionService {
	private final Set<ScratchPadExtension> extensions = new HashSet<>();

	@Activate
	public void activate(ComponentContext cc, BundleContext bc, Map<String, Object> config) {
		IEclipseContext applicationContext = getApplicationContext();
		applicationContext.set(ScratchPadExtensionService.class, this);
	}

	@Deactivate
	public void deactivate(ComponentContext cc, BundleContext bc, Map<String, Object> config) {
		IEclipseContext applicationContext = getApplicationContext();
		applicationContext.remove(ScratchPadExtensionService.class);
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
	
	private IEclipseContext getApplicationContext() {
		IEclipseContext eclipseContext = PlatformUI.getWorkbench().getService(IEclipseContext.class);
		MApplication mApplication = eclipseContext.get(MApplication.class);
		IEclipseContext applicationContext = mApplication.getContext();
		return applicationContext;
	}
}
