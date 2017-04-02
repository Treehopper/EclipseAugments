package eu.hohenegger.scratchpad.ui.viewer;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.Viewer;

@SuppressWarnings("deprecation") // we cannot fix this before not CommonSorterDescriptor.java:97 switches to ViewerComparator
public class Sorter extends org.eclipse.jface.viewers.ViewerSorter {

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if ((e1 instanceof IFolder) && !(e2 instanceof IFolder)) {
			return -1;
		}
		if ((e2 instanceof IFolder) && !(e1 instanceof IFolder)) {
			return 1;
		}
		return super.compare(viewer, e1, e2);
	}
}
