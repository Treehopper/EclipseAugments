package eu.hohenegger.c0ffee_tips.ui.impl;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ProvisioningAction extends org.eclipse.equinox.p2.engine.spi.ProvisioningAction {
	private final String snippet = "\"0x\" + new String(toHexString(value)).toUpperCase()";

	@Override
	public IStatus execute(Map<String, Object> parameters) {
		ForceDetailFormatter forceDetailFormatter = new ForceDetailFormatter();
		
		forceDetailFormatter.forceFormatter(Byte.class, snippet);
		forceDetailFormatter.forceFormatter(Short.class, snippet);
		forceDetailFormatter.forceFormatter(Integer.class, snippet);
		forceDetailFormatter.forceFormatter(Long.class, snippet);
		forceDetailFormatter.forceFormatter(Double.class, snippet);
		
		return Status.OK_STATUS;
	}

	@Override
	public IStatus undo(Map<String, Object> parameters) {
		ForceDetailFormatter forceDetailFormatter = new ForceDetailFormatter();

		forceDetailFormatter.forceRemoveFormatter(Byte.class, snippet);
		forceDetailFormatter.forceRemoveFormatter(Short.class, snippet);
		forceDetailFormatter.forceRemoveFormatter(Integer.class, snippet);
		forceDetailFormatter.forceRemoveFormatter(Long.class, snippet);
		forceDetailFormatter.forceRemoveFormatter(Double.class, snippet);
		
		return Status.OK_STATUS;
	}
}
