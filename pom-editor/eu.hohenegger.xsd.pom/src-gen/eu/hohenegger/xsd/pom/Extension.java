/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Describes a build extension to utilise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Extension#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Extension#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Extension#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getExtension()
 * @model extendedMetaData="name='Extension' kind='elementOnly'"
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The group ID of the extension's artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getExtension_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Extension#getGroupId <em>Group Id</em>}' attribute.
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
	 * The artifact ID of the extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getExtension_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Extension#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * The version of the extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getExtension_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Extension#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Extension
