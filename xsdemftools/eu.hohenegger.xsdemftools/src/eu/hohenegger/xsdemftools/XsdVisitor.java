package eu.hohenegger.xsdemftools;

import static eu.hohenegger.xsdemftools.UriConverterUtil.convert;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;

public class XsdVisitor implements IResourceVisitor {
	
	private Xsd2EcoreUtil xsd2EcoreUtil;
	private RegisterEcoreUtil registerEcoreUtil;

	public XsdVisitor() {
		xsd2EcoreUtil = new Xsd2EcoreUtil();
		registerEcoreUtil = new RegisterEcoreUtil();
	}
	
	@Override
	public boolean visit(IResource resource) throws CoreException {
		if (resource.getName().endsWith(".xsd")) {
			try {
				String ecoreName = resource.getName() + ".ecore";
				URI ecoreUri = convert(resource.getLocationURI().resolve(ecoreName));
				if (resource.getParent().findMember(ecoreName).exists()) {
					xsd2EcoreUtil.convert(convert(resource.getLocationURI()), ecoreUri);
				}
				registerEcoreUtil.register(ecoreUri, "xml");
			} catch (Xsd2EcoreConverterException e) {
				throw new CoreException(new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Error when registering " + resource, e));
			}
		}
		return true;
	}
}