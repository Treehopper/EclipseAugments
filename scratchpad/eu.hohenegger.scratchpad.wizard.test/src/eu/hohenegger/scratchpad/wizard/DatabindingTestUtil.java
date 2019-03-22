package eu.hohenegger.scratchpad.wizard;

import java.util.function.Consumer;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ValidationStatusProvider;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IStatus;

public class DatabindingTestUtil {

	public static void checkValidation(DataBindingContext bindingContext, Consumer<IStatus> consumer) {
		IObservableList<ValidationStatusProvider> statusProviders = bindingContext.getValidationStatusProviders();
		for (ValidationStatusProvider statusProvider : statusProviders) {
			IObservableValue<IStatus> validationStatus = statusProvider.getValidationStatus();
			IStatus status = (IStatus) validationStatus.getValue();
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
