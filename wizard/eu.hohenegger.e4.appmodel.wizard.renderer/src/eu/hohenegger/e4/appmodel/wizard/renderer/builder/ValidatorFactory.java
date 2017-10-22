package eu.hohenegger.e4.appmodel.wizard.renderer.builder;

import java.util.function.Function;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ValidatorFactory {

	public Function<Object, Boolean> model;
	public String message = "";

	private ValidatorFactory() {
	}

	public static Builder errorIf(Function<Object, Boolean> errorIfFunction) {
		return new ValidatorFactory.Builder(errorIfFunction);
	}

	public static class Builder implements IValidator {
		
		private ValidatorFactory instance = new ValidatorFactory();

		private Builder(Function<Object, Boolean> errorIfFunction) {
			instance.model = errorIfFunction;
		}

		public Builder message(String message) {
			instance.message  = message;
			return this;
		}

		@Override
		public IStatus validate(Object value) {
			Boolean error = instance.model.apply(value);
			if(error) {
				return error(instance.message);
			}
			return ok();
		}
		
		private IStatus ok() {
			return Status.OK_STATUS;
		}

		private Status error(String message) {
			return new Status(Status.ERROR, "TODO plug-in id", message);
		}
	}

}
