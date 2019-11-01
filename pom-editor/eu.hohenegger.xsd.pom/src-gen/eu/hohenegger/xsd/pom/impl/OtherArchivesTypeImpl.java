/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.OtherArchivesType;
import eu.hohenegger.xsd.pom.PomPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Archives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.OtherArchivesTypeImpl#getOtherArchive <em>Other Archive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherArchivesTypeImpl extends MinimalEObjectImpl.Container implements OtherArchivesType {
	/**
	 * The cached value of the '{@link #getOtherArchive() <em>Other Archive</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherArchive()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherArchive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherArchivesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.OTHER_ARCHIVES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherArchive() {
		if (otherArchive == null) {
			otherArchive = new EDataTypeEList<String>(String.class, this, PomPackage.OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE);
		}
		return otherArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE:
				return getOtherArchive();
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
			case PomPackage.OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE:
				getOtherArchive().clear();
				getOtherArchive().addAll((Collection<? extends String>)newValue);
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
			case PomPackage.OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE:
				getOtherArchive().clear();
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
			case PomPackage.OTHER_ARCHIVES_TYPE__OTHER_ARCHIVE:
				return otherArchive != null && !otherArchive.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (otherArchive: ");
		result.append(otherArchive);
		result.append(')');
		return result.toString();
	}

} //OtherArchivesTypeImpl
