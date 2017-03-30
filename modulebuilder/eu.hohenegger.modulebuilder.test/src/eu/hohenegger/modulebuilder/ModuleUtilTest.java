package eu.hohenegger.modulebuilder;

import static eu.hohenegger.modulebuilder.ModuleUtil.generateModule;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulespecification.Module;

public class ModuleUtilTest extends AbstractTest {

	private Module module;
	private NullProgressMonitor monitor;

	@Before
	public void setup() {
		if (getProjects().length != 0) {
			fail();
		}

		module = createModel("TODO");
		monitor = new NullProgressMonitor();
	}

	@Test
	public void testGenerateModule() {
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());
		assertTrue(getProject(module.getTychoParentName()).exists());
		assertTrue(getProject(module.getTestsId()).exists());
	}

	@Test
	public void testGenerateNoParent() {
		module.setGenerateParent(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());
		assertTrue(getProject(module.getTestsId()).exists());

		assertFalse(getProject(module.getTychoParentName()).exists());
	}

	@Test
	public void testGenerateNoFeature() {
		module.setGenerateFeature(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());
		assertTrue(getProject(module.getTychoParentName()).exists());
		assertTrue(getProject(module.getTestsId()).exists());

		assertFalse(getProject(module.getFeatureId()).exists());
	}

	@Test
	public void testGenerateNoTarget() {
		module.setGenerateTarget(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());
		assertTrue(getProject(module.getTychoParentName()).exists());
		assertTrue(getProject(module.getTestsId()).exists());

		assertFalse(getProject(module.getTargetId()).exists());
	}

	@Test
	public void testGenerateNoUpdateSite() {
		module.setGenerateUpdatesite(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());
		assertTrue(getProject(module.getTychoParentName()).exists());
		assertTrue(getProject(module.getTestsId()).exists());

		assertFalse(getProject(module.getUpdateSiteId()).exists());
	}

	@Test
	public void testGenerateNoUiFragment() {
		module.setGenerateUiFragment(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getTestsId()).exists());

		assertFalse(getProject(module.getUie3Id()).exists());
	}

	@Test
	public void testGenerateNoTests() {
		module.setGenerateTests(false);
		generateModule(module, monitor);

		assertTrue(getProject(module.getCoreId()).exists());
		assertTrue(getProject(module.getFeatureId()).exists());
		assertTrue(getProject(module.getUpdateSiteId()).exists());
		assertTrue(getProject(module.getTargetId()).exists());
		assertTrue(getProject(module.getUiId()).exists());
		assertTrue(getProject(module.getUie3Id()).exists());

		assertFalse(getProject(module.getTestsId()).exists());
	}

	@After
	public void tearDown() throws Exception {
		IProject[] projects = getProjects();
		for (IProject iProject : projects) {
			iProject.delete(true, null);
		}
	}

	private IProject[] getProjects() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getProjects();
	}

	private IProject getProject(String id) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getProject(id);
	}
}
