package eu.hohenegger.e4.appmodel.wizard.renderer.builder;

import java.util.function.Function;

import org.eclipse.core.databinding.conversion.IConverter;

public class ConverterFactory<X,Y> {

	public Function<X,Y> function;
	public Class<X> from;
	public Class<Y> to;

	private ConverterFactory() {
	}

	public static <X,Y> Builder<X,Y> converter(Class<X> from, Class<Y> to, Function<X,Y> function) {
		return new ConverterFactory.Builder<X,Y>(from, to, function);
	}

	public static Builder<String,String> formatter(Function<String,String> function) {
		return new ConverterFactory.Builder<String,String>(String.class, String.class, function);
	}

	public static class Builder<X extends Object,Y extends Object> implements IConverter {
		
		private ConverterFactory<X,Y> instance = new ConverterFactory<>();

		private Builder(Class<X> from, Class<Y> to, Function<X,Y> function) {
			instance.function = function;
			instance.from = from;
			instance.to = to;
		}

		@Override
		public Object getFromType() {
			return instance.from;
		}

		@Override
		public Object getToType() {
			return instance.to;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Y convert(Object fromObject) {
			return instance.function.apply((X) fromObject);
		}
	}
}
