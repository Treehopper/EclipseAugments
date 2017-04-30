package eu.hohenegger.stacks.ui.editors.links;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;


public class FileLinkParser {

	private final List<IRegion> links = new ArrayList<>();
	private Pattern p = Pattern.compile("\\([^.]+\\.[^:]+:\\d+\\)");


	public void parse(String markupContent) {
		Matcher m = p.matcher(markupContent);
		while(m.find()) {
			links.add(new Region(m.start(), m.end() - m.start()));
		}
	}

	public List<IRegion> getLinks() {
		return links;
	}
}
