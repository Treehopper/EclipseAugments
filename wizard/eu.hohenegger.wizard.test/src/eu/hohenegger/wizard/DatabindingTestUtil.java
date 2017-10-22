package eu.hohenegger.wizard;

import java.util.Iterator;
import java.util.function.Consumer;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IStatus;

public class DatabindingTestUtil {

	public static void checkValidation(DataBindingContext bindingContext, Consumer<IStatus> consumer) {
		@SuppressWarnings("unchecked")
		IObservableList<Binding> statusProviders = bindingContext.getValidationStatusProviders();
		Iterator<Binding> iterator = statusProviders.iterator();
		while (iterator.hasNext()) {
			Binding binding = (Binding) iterator.next();
			IStatus status = (IStatus) binding.getValidationStatus().getValue();
			consumer.accept(status);
		}
	}

	public static void runInRealm(Consumer<Realm> consumer) {
		Realm realm = new Realm() {
			@Override
			public boolean isCurrent() {
				return true;
			}
		};
		Runnable runnable = () -> {
			consumer.accept(realm);
		};
		Realm.runWithDefault(realm, runnable);
	}

	public static WritableValue<String> mockTextControl() {
		return new WritableValue<>("", String.class);
	}
}
