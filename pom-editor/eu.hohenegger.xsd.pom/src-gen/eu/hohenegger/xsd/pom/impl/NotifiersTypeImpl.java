/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.Notifier;
import eu.hohenegger.xsd.pom.NotifiersType;
import eu.hohenegger.xsd.pom.PomPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notifiers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.NotifiersTypeImpl#getNotifier <em>Notifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotifiersTypeImpl extends MinimalEObjectImpl.Container implements NotifiersType {
	/**
	 * The cached value of the '{@link #getNotifier() <em>Notifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Notifier> notifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotifiersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.NOTIFIERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notifier> getNotifier() {
		if (notifier == null) {
			notifier = new EObjectContainmentEList<Notifier>(Notifier.class, this, PomPackage.NOTIFIERS_TYPE__NOTIFIER);
		}
		return notifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PomPackage.NOTIFIERS_TYPE__NOTIFIER:
				return ((InternalEList<?>)getNotifier()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.NOTIFIERS_TYPE__NOTIFIER:
				return getNotifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PomPackage.NOTIFIERS_TYPE__NOTIFIER:
				getNotifier().clear();
				getNotifier().addAll((Collection<? extends Notifier>)newValue);
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
			case PomPackage.NOTIFIERS_TYPE__NOTIFIER:
				getNotifier().clear();
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
			case PomPackage.NOTIFIERS_TYPE__NOTIFIER:
				return notifier != null && !notifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotifiersTypeImpl
