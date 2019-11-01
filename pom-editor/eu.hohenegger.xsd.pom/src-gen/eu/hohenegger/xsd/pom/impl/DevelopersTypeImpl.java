/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.Developer;
import eu.hohenegger.xsd.pom.DevelopersType;
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
 * An implementation of the model object '<em><b>Developers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.DevelopersTypeImpl#getDeveloper <em>Developer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevelopersTypeImpl extends MinimalEObjectImpl.Container implements DevelopersType {
	/**
	 * The cached value of the '{@link #getDeveloper() <em>Developer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloper()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> developer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.DEVELOPERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Developer> getDeveloper() {
		if (developer == null) {
			developer = new EObjectContainmentEList<Developer>(Developer.class, this, PomPackage.DEVELOPERS_TYPE__DEVELOPER);
		}
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PomPackage.DEVELOPERS_TYPE__DEVELOPER:
				return ((InternalEList<?>)getDeveloper()).basicRemove(otherEnd, msgs);
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
			case PomPackage.DEVELOPERS_TYPE__DEVELOPER:
				return getDeveloper();
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
			case PomPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
				getDeveloper().addAll((Collection<? extends Developer>)newValue);
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
			case PomPackage.DEVELOPERS_TYPE__DEVELOPER:
				getDeveloper().clear();
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
			case PomPackage.DEVELOPERS_TYPE__DEVELOPER:
				return developer != null && !developer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevelopersTypeImpl
