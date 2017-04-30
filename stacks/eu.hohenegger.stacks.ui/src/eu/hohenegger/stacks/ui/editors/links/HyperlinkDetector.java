package eu.hohenegger.stacks.ui.editors.links;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;

public class HyperlinkDetector extends AbstractHyperlinkDetector {

	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
		IDocument document = textViewer.getDocument();
		if (document == null || document.getLength() == 0) {
			return null;
		}

		FileLinkParser parser = new FileLinkParser();
		parser.parse(document.get());
		List<IRegion> links = parser.getLinks();

		if (!links.isEmpty()) {
			List<IHyperlink> hyperlinks = new ArrayList<IHyperlink>(links.size());
			for (IRegion hyperlinkRegion : links) {
					if (region.getLength() > 0) {
						if (!isInRegion(region, hyperlinkRegion)) {
							continue;
						}
					} else {
						if (!(hyperlinkRegion.getOffset() <= region.getOffset()
								&& (hyperlinkRegion.getOffset() + hyperlinkRegion.getLength()) >= region.getOffset())) {
							continue;
						}
					}
					hyperlinks.add(new JavaStackTraceHyperlink(document, hyperlinkRegion));
			}
			if (!hyperlinks.isEmpty()) {
				return hyperlinks.toArray(new IHyperlink[hyperlinks.size()]);
			}
		}
		return null;
	}

	private boolean isInRegion(IRegion detectInRegion, IRegion hyperlinkRegion) {
		return detectInRegion.getOffset() >= hyperlinkRegion.getOffset()
				&& detectInRegion.getOffset() <= hyperlinkRegion.getOffset() + hyperlinkRegion.getLength();
	}

}