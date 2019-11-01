/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Describes where an artifact has moved to. If any of the values are omitted, it is
 *         assumed to be the same as it was before.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Relocation#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Relocation#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Relocation#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Relocation#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getRelocation()
 * @model extendedMetaData="name='Relocation' kind='elementOnly'"
 * @generated
 */
public interface Relocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The group ID the artifact has moved to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRelocation_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Relocation#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The new artifact ID of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRelocation_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Relocation#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The new version of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRelocation_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Relocation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * An additional message to show the user about the move, such as the reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getRelocation_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Relocation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Relocation
