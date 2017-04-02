package eu.hohenegger.scratchpad.ui.validator;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IInputValidator;

public class ResourceNameValidator implements IInputValidator {
	private final IPath prefix;
	private IWorkspace workspace;
	private int type;

	public ResourceNameValidator(IWorkspace workspace, IPath prefix, int type) {
		this.workspace = workspace;
		this.prefix = prefix;
		this.type = type;
	}

	@Override
	public String isValid(String string) {
		IStatus status = workspace.validateName(string, type);
		if (!status.isOK()) {
			return status.getMessage();
		}
		if (workspace.getRoot().exists(prefix.append(string))) {
			return "A resource with this name already exists";
		}
		return null;
	}
}