/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Repository contains the information needed for deploying to the remote
 *         repository.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#isUniqueVersion <em>Unique Version</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getReleases <em>Releases</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getSnapshots <em>Snapshots</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getId <em>Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getName <em>Name</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.DeploymentRepository#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository()
 * @model extendedMetaData="name='DeploymentRepository' kind='elementOnly'"
 * @generated
 */
public interface DeploymentRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Version</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Whether to assign snapshots a unique version comprised of the timestamp and
	 *             build number, or to use the same version each time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Version</em>' attribute.
	 * @see #isSetUniqueVersion()
	 * @see #unsetUniqueVersion()
	 * @see #setUniqueVersion(boolean)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_UniqueVersion()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='uniqueVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUniqueVersion();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#isUniqueVersion <em>Unique Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Version</em>' attribute.
	 * @see #isSetUniqueVersion()
	 * @see #unsetUniqueVersion()
	 * @see #isUniqueVersion()
	 * @generated
	 */
	void setUniqueVersion(boolean value);

	/**
	 * Unsets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#isUniqueVersion <em>Unique Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniqueVersion()
	 * @see #isUniqueVersion()
	 * @see #setUniqueVersion(boolean)
	 * @generated
	 */
	void unsetUniqueVersion();

	/**
	 * Returns whether the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#isUniqueVersion <em>Unique Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique Version</em>' attribute is set.
	 * @see #unsetUniqueVersion()
	 * @see #isUniqueVersion()
	 * @see #setUniqueVersion(boolean)
	 * @generated
	 */
	boolean isSetUniqueVersion();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * How to handle downloading of releases from this repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference.
	 * @see #setReleases(RepositoryPolicy)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Releases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releases' namespace='##targetNamespace'"
	 * @generated
	 */
	RepositoryPolicy getReleases();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getReleases <em>Releases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releases</em>' containment reference.
	 * @see #getReleases()
	 * @generated
	 */
	void setReleases(RepositoryPolicy value);

	/**
	 * Returns the value of the '<em><b>Snapshots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * How to handle downloading of snapshots from this repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshots</em>' containment reference.
	 * @see #setSnapshots(RepositoryPolicy)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Snapshots()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='snapshots' namespace='##targetNamespace'"
	 * @generated
	 */
	RepositoryPolicy getSnapshots();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getSnapshots <em>Snapshots</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshots</em>' containment reference.
	 * @see #getSnapshots()
	 * @generated
	 */
	void setSnapshots(RepositoryPolicy value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             A unique identifier for a repository. This is used to match the repository
	 *             to configuration in the <code>settings.xml</code> file, for example. Furthermore, the identifier is
	 *             used during POM inheritance and profile injection to detect repositories that should be merged.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Human readable name of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The url of the repository, in the form <code>protocol://hostname/path</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The type of layout this repository uses for locating and storing artifacts -
	 *             can be <code>legacy</code> or <code>default</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see #isSetLayout()
	 * @see #unsetLayout()
	 * @see #setLayout(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDeploymentRepository_Layout()
	 * @model default="default" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='layout' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayout();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see #isSetLayout()
	 * @see #unsetLayout()
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(String value);

	/**
	 * Unsets the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayout()
	 * @see #getLayout()
	 * @see #setLayout(String)
	 * @generated
	 */
	void unsetLayout();

	/**
	 * Returns whether the value of the '{@link eu.hohenegger.xsd.pom.DeploymentRepository#getLayout <em>Layout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout</em>' attribute is set.
	 * @see #unsetLayout()
	 * @see #getLayout()
	 * @see #setLayout(String)
	 * @generated
	 */
	boolean isSetLayout();

} // DeploymentRepository
