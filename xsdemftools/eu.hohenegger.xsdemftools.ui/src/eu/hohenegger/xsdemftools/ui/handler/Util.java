package eu.hohenegger.xsdemftools.ui.handler;

import static org.eclipse.core.runtime.Adapters.adapt;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;

public class Util {

	public static List<IFile> getFileSelectionContent(IStructuredSelection currentSelection) throws ExecutionException {
		List<IFile> result = new ArrayList<>();
		Iterator<?> iterator = currentSelection.iterator();
		while (iterator.hasNext()) {
			IResource resource = adapt(iterator.next(), IResource.class);

			if (!(resource instanceof IFile)) {
				continue;
			}

			result.add((IFile) resource);
		}

		return result;
	}

}
