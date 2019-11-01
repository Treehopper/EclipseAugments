/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Download policy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getRepositoryPolicy()
 * @model extendedMetaData="name='RepositoryPolicy' kind='elementOnly'"
 * @generated
 */
public interface RepositoryPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Whether to use this repository for downloading this type of artifact. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>true</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRepositoryPolicy_Enabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnabled();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Update Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The frequency for downloading updates - can be
	 *             <code>always,</code>
	 *             <code>daily</code>
	 *             (default),
	 *             <code>interval:XXX</code>
	 *             (in minutes) or
	 *             <code>never</code>
	 *             (only if it doesn't exist locally).
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Policy</em>' attribute.
	 * @see #setUpdatePolicy(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRepositoryPolicy_UpdatePolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='updatePolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUpdatePolicy();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Policy</em>' attribute.
	 * @see #getUpdatePolicy()
	 * @generated
	 */
	void setUpdatePolicy(String value);

	/**
	 * Returns the value of the '<em><b>Checksum Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             What to do when verification of an artifact checksum fails. Valid values are
	 *             <code>ignore</code>
	 *             ,
	 *             <code>fail</code>
	 *             or
	 *             <code>warn</code>
	 *             (the default).
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checksum Policy</em>' attribute.
	 * @see #setChecksumPolicy(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRepositoryPolicy_ChecksumPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='checksumPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChecksumPolicy();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum Policy</em>' attribute.
	 * @see #getChecksumPolicy()
	 * @generated
	 */
	void setChecksumPolicy(String value);

} // RepositoryPolicy
