package eu.hohenegger.e4.appmodel.wizard.renderer.builder;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;

public class BindingFactory<T> {

	public IObservableValue<T> observable;
	public IValidator beforeSetValidator;
	
	/* optional parameters */
	private int updatePolicy = UpdateValueStrategy.POLICY_UPDATE;
	public IConverter converter;

	private BindingFactory() {
	}

	public static <T> Builder<T> observable(IObservableValue<T> observableValue) {
		return new BindingFactory.Builder<T>(observableValue);
	}

	public static class Builder<T> {

		private BindingFactory<T> instance = new BindingFactory<>();

		private Builder(IObservableValue<T> observableValue) {
			instance.observable = observableValue;
		}

		public Builder<T> policy(int policy) {
			instance.updatePolicy = policy;
			return this;
		}

		public Builder<T> validate(IValidator beforeSetValidator) {
			instance.beforeSetValidator = beforeSetValidator;
			return this;
		}
		
		public Builder<T> convert(IConverter converter) {
			instance.converter = converter;
			return this;
		}
		
		public IObservableValue<T> getObservableValue() {
			return instance.observable;
		}
		
		public UpdateValueStrategy buildUpdateValueStrategy() {
			UpdateValueStrategy result = new UpdateValueStrategy(instance.updatePolicy);
			if (instance.beforeSetValidator != null) {
				result.setBeforeSetValidator(instance.beforeSetValidator);
			}
			if (instance.converter != null) {
				result.setConverter(instance.converter);
			}
			return result;
		}
	}
}
