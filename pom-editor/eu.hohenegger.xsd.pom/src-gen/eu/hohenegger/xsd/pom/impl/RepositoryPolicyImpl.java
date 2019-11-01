/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.RepositoryPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.RepositoryPolicyImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.RepositoryPolicyImpl#getUpdatePolicy <em>Update Policy</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.RepositoryPolicyImpl#getChecksumPolicy <em>Checksum Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryPolicyImpl extends MinimalEObjectImpl.Container implements RepositoryPolicy {
	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected String enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatePolicy() <em>Update Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatePolicy() <em>Update Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePolicy()
	 * @generated
	 * @ordered
	 */
	protected String updatePolicy = UPDATE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecksumPolicy() <em>Checksum Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSUM_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksumPolicy() <em>Checksum Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumPolicy()
	 * @generated
	 * @ordered
	 */
	protected String checksumPolicy = CHECKSUM_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.REPOSITORY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(String newEnabled) {
		String oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdatePolicy() {
		return updatePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatePolicy(String newUpdatePolicy) {
		String oldUpdatePolicy = updatePolicy;
		updatePolicy = newUpdatePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__UPDATE_POLICY, oldUpdatePolicy, updatePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChecksumPolicy() {
		return checksumPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChecksumPolicy(String newChecksumPolicy) {
		String oldChecksumPolicy = checksumPolicy;
		checksumPolicy = newChecksumPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY, oldChecksumPolicy, checksumPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.REPOSITORY_POLICY__ENABLED:
				return getEnabled();
			case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
				return getUpdatePolicy();
			case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
				return getChecksumPolicy();
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
			case PomPackage.REPOSITORY_POLICY__ENABLED:
				setEnabled((String)newValue);
				return;
			case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
				setUpdatePolicy((String)newValue);
				return;
			case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
				setChecksumPolicy((String)newValue);
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
			case PomPackage.REPOSITORY_POLICY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
				setUpdatePolicy(UPDATE_POLICY_EDEFAULT);
				return;
			case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
				setChecksumPolicy(CHECKSUM_POLICY_EDEFAULT);
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
			case PomPackage.REPOSITORY_POLICY__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
				return UPDATE_POLICY_EDEFAULT == null ? updatePolicy != null : !UPDATE_POLICY_EDEFAULT.equals(updatePolicy);
			case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
				return CHECKSUM_POLICY_EDEFAULT == null ? checksumPolicy != null : !CHECKSUM_POLICY_EDEFAULT.equals(checksumPolicy);
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", updatePolicy: ");
		result.append(updatePolicy);
		result.append(", checksumPolicy: ");
		result.append(checksumPolicy);
		result.append(')');
		return result.toString();
	}

} //RepositoryPolicyImpl
