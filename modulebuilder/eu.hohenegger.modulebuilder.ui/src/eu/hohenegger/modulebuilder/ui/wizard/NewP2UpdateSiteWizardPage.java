package eu.hohenegger.modulebuilder.ui.wizard;

import static org.eclipse.core.databinding.UpdateValueStrategy.POLICY_NEVER;
import static org.eclipse.emf.common.util.Diagnostic.OK;
import static org.eclipse.emf.databinding.EMFProperties.value;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import modulespecification.Module;
import modulespecification.ModulespecificationPackage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewP2UpdateSiteWizardPage extends WizardPage {
	private static final int MIN_WIZARD_HEIGHT = 500;

	private final class ValidationStatusUpdater extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getEventType() != Notification.SET) {
				return;
			}
			dialogChanged();
			super.notifyChanged(msg);
		}
	}

	private Module module;
	private ValidationStatusUpdater validationStatusUpdater;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param module
	 * @param pageName
	 */
	public NewP2UpdateSiteWizardPage(Module module) {
		super("wizardPage");
		this.module = module;
		setTitle("Eclipse/Tycho Module Builder");
		setDescription(
				"This wizard generates all projects and files that are necessary to to build an Eclipse update site with Maven Tycho.");
		validationStatusUpdater = new ValidationStatusUpdater();
		EList<Adapter> adapters = module.eAdapters();
		if (adapters == null) {
			throw new RuntimeException("adapters were null");
		}
		adapters.add(validationStatusUpdater);

		bindFirstBaseIdSet(module);
	}

	private void bindFirstBaseIdSet(Module module) {
		DataBindingContext dataBindingContext = new DataBindingContext();
		IObservableValue observeSource = value(ModulespecificationPackage.eINSTANCE.getModule_BaseId()).observe(module);
		IObservableValue observeTarget = value(ModulespecificationPackage.eINSTANCE.getModule_MavenGroupId()).observe(module);
		UpdateValueStrategy sourceToTarget = new UpdateValueStrategy();
		sourceToTarget.setBeforeSetValidator(value -> {
			Object currentValue = observeTarget.getValue();
			if (currentValue != null) {
				return Status.CANCEL_STATUS;
			}
			return Status.OK_STATUS;
		});
		dataBindingContext.bindValue(observeSource, observeTarget, sourceToTarget, new UpdateValueStrategy(POLICY_NEVER));
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite rootComposite = new Composite(parent, SWT.NULL);
		rootComposite.setLayout(GridLayoutFactory.fillDefaults().create());

		scrolled(rootComposite);

		setControl(rootComposite);
	}

	private void scrolled(Composite rootComposite) {
		ScrolledComposite sc = new ScrolledComposite(rootComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(SWT.DEFAULT, MIN_WIZARD_HEIGHT).create());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);

		Composite containerMain = new Composite(sc, SWT.NONE);
		containerMain.setLayout(GridLayoutFactory.swtDefaults().numColumns(1).create());

		render(containerMain);

		sc.setContent(containerMain);
		sc.setMinSize(containerMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	private void dialogChanged() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		if (OK != diagnostic.getSeverity()) {
			updateStatus("There are validation errors");
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private Control render(Composite parent) {
		try {
			ECPSWTView render = ECPSWTViewRenderer.INSTANCE.render(parent, module);
			return render.getSWTControl();
		} catch (ECPRendererException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void dispose() {
		module.eAdapters().remove(validationStatusUpdater);
		super.dispose();
	}
}