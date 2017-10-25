package eu.hohenegger.scratchpad.ui.handler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.inject.Inject;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbench;

import eu.hohenegger.scratchpad.ui.widgets.EditorUtil;

public class NewFileHandler extends AbstractHandler {

	@Inject
	private IWorkbench workbench;

	protected void create(IContainer container, String name, IProgressMonitor monitor) throws CoreException {
		InputStream source = new ByteArrayInputStream(new byte[] {});
		IFile file = container.getFile(Path.fromOSString(name));
		file.create(source, IResource.NONE, monitor);

		EditorUtil.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
	}

	protected int getType() {
		return IResource.FILE;
	}

	@Override
	protected String getJobName() {
		return "New File...";
	}

	@Override
	protected String getSuggestedName() {
		return "Note.md";
	}
}
