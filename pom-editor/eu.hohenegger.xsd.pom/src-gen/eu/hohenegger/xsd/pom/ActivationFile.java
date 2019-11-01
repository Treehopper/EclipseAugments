/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * This is the file specification used to activate the profile. The <code>missing</code> value
 *         is the location of a file that needs to exist, and if it doesn't, the profile will be
 *         activated. On the other hand, <code>exists</code> will test for the existence of the file and if it is
 *         there, the profile will be activated.<br>
 *         Variable interpolation for these file specifications is limited to <code>${basedir}</code>,
 *         System properties and request properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.ActivationFile#getMissing <em>Missing</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.ActivationFile#getExists <em>Exists</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getActivationFile()
 * @model extendedMetaData="name='ActivationFile' kind='elementOnly'"
 * @generated
 */
public interface ActivationFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The name of the file that must be missing to activate the
	 *           profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see #setMissing(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getActivationFile_Missing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='missing' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMissing();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.ActivationFile#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(String value);

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The name of the file that must exist to activate the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getActivationFile_Exists()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='exists' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExists();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.ActivationFile#getExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #getExists()
	 * @generated
	 */
	void setExists(String value);

} // ActivationFile
