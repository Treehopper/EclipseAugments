/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.ReportsType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reports Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ReportsTypeImpl#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportsTypeImpl extends MinimalEObjectImpl.Container implements ReportsType {
	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<String> report;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.REPORTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getReport() {
		if (report == null) {
			report = new EDataTypeEList<String>(String.class, this, PomPackage.REPORTS_TYPE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.REPORTS_TYPE__REPORT:
				return getReport();
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
			case PomPackage.REPORTS_TYPE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends String>)newValue);
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
			case PomPackage.REPORTS_TYPE__REPORT:
				getReport().clear();
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
			case PomPackage.REPORTS_TYPE__REPORT:
				return report != null && !report.isEmpty();
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
		result.append(" (report: ");
		result.append(report);
		result.append(')');
		return result.toString();
	}

} //ReportsTypeImpl
