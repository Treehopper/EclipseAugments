package eu.hohenegger.xsdemftools;

import java.net.URI;

public class UriConverterUtil {

	public static org.eclipse.emf.common.util.URI convert(URI targetResourceUri) {
		return org.eclipse.emf.common.util.URI.createFileURI(targetResourceUri.getRawPath());
	}
	
}
