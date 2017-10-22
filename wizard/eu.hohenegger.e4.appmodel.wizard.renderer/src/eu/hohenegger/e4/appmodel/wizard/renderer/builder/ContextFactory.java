package eu.hohenegger.e4.appmodel.wizard.renderer.builder;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.swt.SWT;

public class ContextFactory<T> {
	public BindingFactory.Builder<T> model;
	public BindingFactory.Builder<T> target;
	
	private DataBindingContext dbc;

	private ContextFactory() {
	}

	public static <T> Builder<T> contextBuilder(DataBindingContext dbc) {
		return new ContextFactory.Builder<T>(dbc);
	}

	public static class Builder<T> {
		
		private ContextFactory<T> instance = new ContextFactory<>();

		private Builder(DataBindingContext dbc) {
			instance.dbc = dbc;
		}

		public Builder<T> model(BindingFactory.Builder<T> model) {
			instance.model = model;
			return this;
		}

		public Builder<T> target(BindingFactory.Builder<T> target) {
			instance.target = target;
			return this;
		}

		public Binding bind() {
			return instance.dbc.bindValue(instance.target.getObservableValue(), instance.model.getObservableValue(), instance.target.buildUpdateValueStrategy(), instance.model.buildUpdateValueStrategy());
		}

		public void bindAndDecorate() {
			decorate(SWT.TOP | SWT.LEFT);
		}

		public void decorate(int position) {
			ControlDecorationSupport.create(bind(), position);			
		}
	}
}
