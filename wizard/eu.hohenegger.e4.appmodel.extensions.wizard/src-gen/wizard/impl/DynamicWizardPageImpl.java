/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizard.DynamicWizardPage;
import wizard.ExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Wizard Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.DynamicWizardPageImpl#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link wizard.impl.DynamicWizardPageImpl#getPreviousPage <em>Previous Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicWizardPageImpl extends WizardPageImpl implements DynamicWizardPage {
	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected DynamicWizardPage nextPage;

	/**
	 * The cached value of the '{@link #getPreviousPage() <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPage()
	 * @generated
	 * @ordered
	 */
	protected DynamicWizardPage previousPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicWizardPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.DYNAMIC_WIZARD_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWizardPage getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (DynamicWizardPage)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWizardPage basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(DynamicWizardPage newNextPage) {
		DynamicWizardPage oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE, oldNextPage, nextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWizardPage getPreviousPage() {
		if (previousPage != null && previousPage.eIsProxy()) {
			InternalEObject oldPreviousPage = (InternalEObject)previousPage;
			previousPage = (DynamicWizardPage)eResolveProxy(oldPreviousPage);
			if (previousPage != oldPreviousPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE, oldPreviousPage, previousPage));
			}
		}
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWizardPage basicGetPreviousPage() {
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPage(DynamicWizardPage newPreviousPage) {
		DynamicWizardPage oldPreviousPage = previousPage;
		previousPage = newPreviousPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE, oldPreviousPage, previousPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE:
				if (resolve) return getPreviousPage();
				return basicGetPreviousPage();
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
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE:
				setNextPage((DynamicWizardPage)newValue);
				return;
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE:
				setPreviousPage((DynamicWizardPage)newValue);
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
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE:
				setNextPage((DynamicWizardPage)null);
				return;
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE:
				setPreviousPage((DynamicWizardPage)null);
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
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__NEXT_PAGE:
				return nextPage != null;
			case ExtensionsPackage.DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE:
				return previousPage != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicWizardPageImpl
