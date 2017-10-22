/**
 */
package wizard.impl;

import org.eclipse.e4.ui.model.application.impl.ContributionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizard.ExtensionsPackage;
import wizard.WizardFinisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Finisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.WizardFinisherImpl#isNeedsProgress <em>Needs Progress</em>}</li>
 *   <li>{@link wizard.impl.WizardFinisherImpl#isFork <em>Fork</em>}</li>
 *   <li>{@link wizard.impl.WizardFinisherImpl#isCancellable <em>Cancellable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WizardFinisherImpl extends ContributionImpl implements WizardFinisher {
	/**
	 * The default value of the '{@link #isNeedsProgress() <em>Needs Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsProgress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_PROGRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsProgress() <em>Needs Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsProgress()
	 * @generated
	 * @ordered
	 */
	protected boolean needsProgress = NEEDS_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected boolean fork = FORK_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancellable() <em>Cancellable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancellable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancellable() <em>Cancellable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancellable()
	 * @generated
	 * @ordered
	 */
	protected boolean cancellable = CANCELLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardFinisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.WIZARD_FINISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsProgress() {
		return needsProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsProgress(boolean newNeedsProgress) {
		boolean oldNeedsProgress = needsProgress;
		needsProgress = newNeedsProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD_FINISHER__NEEDS_PROGRESS, oldNeedsProgress, needsProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFork() {
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(boolean newFork) {
		boolean oldFork = fork;
		fork = newFork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD_FINISHER__FORK, oldFork, fork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancellable() {
		return cancellable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancellable(boolean newCancellable) {
		boolean oldCancellable = cancellable;
		cancellable = newCancellable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD_FINISHER__CANCELLABLE, oldCancellable, cancellable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD_FINISHER__NEEDS_PROGRESS:
				return isNeedsProgress();
			case ExtensionsPackage.WIZARD_FINISHER__FORK:
				return isFork();
			case ExtensionsPackage.WIZARD_FINISHER__CANCELLABLE:
				return isCancellable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD_FINISHER__NEEDS_PROGRESS:
				setNeedsProgress((Boolean)newValue);
				return;
			case ExtensionsPackage.WIZARD_FINISHER__FORK:
				setFork((Boolean)newValue);
				return;
			case ExtensionsPackage.WIZARD_FINISHER__CANCELLABLE:
				setCancellable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD_FINISHER__NEEDS_PROGRESS:
				setNeedsProgress(NEEDS_PROGRESS_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD_FINISHER__FORK:
				setFork(FORK_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD_FINISHER__CANCELLABLE:
				setCancellable(CANCELLABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD_FINISHER__NEEDS_PROGRESS:
				return needsProgress != NEEDS_PROGRESS_EDEFAULT;
			case ExtensionsPackage.WIZARD_FINISHER__FORK:
				return fork != FORK_EDEFAULT;
			case ExtensionsPackage.WIZARD_FINISHER__CANCELLABLE:
				return cancellable != CANCELLABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (needsProgress: ");
		result.append(needsProgress);
		result.append(", fork: ");
		result.append(fork);
		result.append(", cancellable: ");
		result.append(cancellable);
		result.append(')');
		return result.toString();
	}

} //WizardFinisherImpl
