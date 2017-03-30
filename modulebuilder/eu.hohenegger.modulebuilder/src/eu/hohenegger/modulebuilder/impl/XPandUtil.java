package eu.hohenegger.modulebuilder.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import modulespecification.Module;
import modulespecification.ModulespecificationPackage;

public class XPandUtil {
	public static void expandTemplate(Module module, IResource container, String templateName, String templateMask,
			IProgressMonitor monitor) {
		SubMonitor sub = SubMonitor.convert(monitor, 3);
		sub.beginTask("Expanding template " + templateName, 2);

		String fullTemplatePath = String.format(templateMask, templateName);

		String containerName = container.getLocation().toPortableString();
		// configure outlets
		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet(containerName);
		outlet.setOverwrite(true);
		output.addOutlet(outlet);

		// create execution context
		Map<String, Variable> globalVarsMap = new HashMap<>();
		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null, globalVarsMap, null, null);
		EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return new EPackage[] { ModulespecificationPackage.eINSTANCE, EcorePackage.eINSTANCE };
			}
		};
		execCtx.registerMetaModel(metamodel);
		sub.worked(1);

		// generate
		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate(fullTemplatePath, module);
		sub.worked(1);
	}
}
