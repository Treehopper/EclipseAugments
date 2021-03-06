package eu.hohenegger.modulebuilder.ui.wizard;


import static eu.hohenegger.modulebuilder.Constants.EXTENSION;
import static eu.hohenegger.modulebuilder.Constants.PDE_PLUGIN_NATURE;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateModule;
import static eu.hohenegger.modulebuilder.ui.Activator.logError;
import static java.lang.String.format;
import static org.eclipse.emf.common.util.Diagnostic.OK;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Version;

import eu.hohenegger.modulebuilder.Constants;
import eu.hohenegger.modulebuilder.XMIPersistenceUtil;
import eu.hohenegger.modulebuilder.ui.Activator;
import modulespecification.Module;
import modulespecification.ModulespecificationFactory;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class NewP2UpdateSiteWizard extends Wizard implements INewWizard {
	private NewP2UpdateSiteWizardPage page;
	private Module module;
	private IStructuredSelection selection;

	/**
	 * Constructor for NewP2UpdateSiteWizard.
	 */
	public NewP2UpdateSiteWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		String intialBaseId = "";
		if (!selection.isEmpty()) {
			Optional<IProject> oProject = getProject();
			if (oProject.isPresent()) {
				IProject project = oProject.get();
				intialBaseId = project.getName();
				module = createModel(intialBaseId);
				module.setBaseLocation(getLocation(project));
				
				Optional<IBundleProjectDescription> oBundleDescription = loadBundleProjectDescription(project);
				if (oBundleDescription.isPresent()) {
					module.setBaseId(oBundleDescription.get().getSymbolicName());
					module.setModuleName(oBundleDescription.get().getBundleName());
					Version version = oBundleDescription.get().getBundleVersion();
					module.setVersion(format("%d.%d.%d", version.getMajor(), version.getMinor(), version.getMicro()));
					module.setOsgiVersionQualifier("."+version.getQualifier());
					module.setProviderName(oBundleDescription.get().getBundleVendor());
					module.setJavaVersion(oBundleDescription.get().getHeader("Bundle-RequiredExecutionEnvironment"));
				}
			} else if (selection.getFirstElement() instanceof IResource) {
				IResource resource = (IResource) selection.getFirstElement();
				if (resource.getName().endsWith(EXTENSION)) {
					module = loadModel(resource);
				}
			}
		}

		if (module == null) {
			module = createModel(intialBaseId);
			module.setBaseLocation(getOSWorkspaceLocation());
		}
		
		page = new NewP2UpdateSiteWizardPage(module);
		addPage(page);
	}

	private String getLocation(IProject project) {
		return project.getLocation().makeAbsolute().removeLastSegments(1).toOSString();
	}

	private Optional<IBundleProjectDescription> loadBundleProjectDescription(IProject project) {
		try {
			if (Arrays.stream(project.getDescription().getNatureIds()).filter(PDE_PLUGIN_NATURE::equals).findFirst().isPresent()) {
				IBundleProjectService bundleService = Activator.getBundleService();
				IBundleProjectDescription bundleProjectDescription = bundleService.getDescription(project);
				return Optional.ofNullable(bundleProjectDescription);
			}
		} catch (CoreException e) {
			return Optional.empty();
		}
		return Optional.empty();
	}

	private Optional<IProject> getProject() {
		IProject project = null;
		if (selection.getFirstElement() instanceof IProject) {
			project = (IProject) selection.getFirstElement();
		} else if (selection.getFirstElement() instanceof IProjectNature) {
			IProjectNature nature = (IProjectNature) selection.getFirstElement();
			project = nature.getProject();
		}
		return Optional.ofNullable(project);
	}

	private static Module loadModel(IResource resource) {
		return XMIPersistenceUtil.load(EXTENSION, URI.createFileURI(resource.getLocation().toPortableString()));
	}

	private String getOSWorkspaceLocation() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		return root.getLocation().addTrailingSeparator().toOSString();
	}

	@Override
	public boolean performFinish() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		if (diagnostic.getSeverity() != OK) {
			return false;
		}

		try {
			getContainer().run(true, false, monitor -> {
				generateModule(module, monitor);
				monitor.done();
			});
		} catch (InvocationTargetException | InterruptedException e) {
			logError(e);
		}


		return true;
	}

	private Module createModel(String pluginId) {
		Module module = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId(pluginId);

		return module;
	}



	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}