/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * 
 *         
 *         The <code>&lt;dependency&gt;</code> element contains information about a dependency
 *         of the project.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getType <em>Type</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getScope <em>Scope</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getSystemPath <em>System Path</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getExclusions <em>Exclusions</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Dependency#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency()
 * @model extendedMetaData="name='Dependency' kind='elementOnly'"
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The project group that produced the dependency, e.g.
	 *             <code>org.apache.maven</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getGroupId <em>Group Id</em>}' attribute.
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
	 * 3.0.0+
	 * 
	 *             
	 *             The unique id for an artifact produced by the project group, e.g.
	 *             <code>maven-artifact</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * 3.0.0+
	 * 
	 *             
	 *             The version of the dependency, e.g. <code>3.2.1</code>. In Maven 2, this can also be
	 *             specified as a range of versions.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"jar"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The type of dependency. While it
	 *             usually represents the extension on the filename of the dependency,
	 *             that is not always the case. A type can be mapped to a different
	 *             extension and a classifier.
	 *             The type often corresponds to the packaging used, though this is also
	 *             not always the case.
	 *             Some examples are <code>jar</code>, <code>war</code>, <code>ejb-client</code>
	 *             and <code>test-jar</code>: see <a href="../maven-core/artifact-handlers.html">default
	 *             artifact handlers</a> for a list.
	 *             New types can be defined by plugins that set
	 *             <code>extensions</code> to <code>true</code>, so this is not a complete list.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Type()
	 * @model default="jar" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The classifier of the dependency. It is appended to
	 *             the filename after the version. This allows:
	 *             <ul>
	 *             <li>referring to attached artifact, for example <code>sources</code> and <code>javadoc</code>:
	 *             see <a href="../maven-core/artifact-handlers.html">default artifact handlers</a> for a list,</li>
	 *             <li>distinguishing two artifacts
	 *             that belong to the same POM but were built differently.
	 *             For example, <code>jdk14</code> and <code>jdk15</code>.</li>
	 *             </ul>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' attribute.
	 * @see #setClassifier(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Classifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClassifier();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getClassifier <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' attribute.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The scope of the dependency - <code>compile</code>, <code>runtime</code>,
	 *             <code>test</code>, <code>system</code>, and <code>provided</code>. Used to
	 *             calculate the various classpaths used for compilation, testing, and so on.
	 *             It also assists in determining which artifacts to include in a distribution of
	 *             this project. For more information, see
	 *             <a href="https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html">the
	 *             dependency mechanism</a>. The default scope is <code>compile</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>System Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             FOR SYSTEM SCOPE ONLY. Note that use of this property is <b>discouraged</b>
	 *             and may be replaced in later versions. This specifies the path on the filesystem
	 *             for this dependency.
	 *             Requires an absolute path for the value, not relative.
	 *             Use a property that gives the machine specific absolute path,
	 *             e.g. <code>${java.home}</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Path</em>' attribute.
	 * @see #setSystemPath(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_SystemPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='systemPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemPath();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getSystemPath <em>System Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Path</em>' attribute.
	 * @see #getSystemPath()
	 * @generated
	 */
	void setSystemPath(String value);

	/**
	 * Returns the value of the '<em><b>Exclusions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Lists a set of artifacts that should be excluded from this dependency's
	 *             artifact list when it comes to calculating transitive dependencies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusions</em>' containment reference.
	 * @see #setExclusions(ExclusionsType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Exclusions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclusions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExclusionsType getExclusions();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getExclusions <em>Exclusions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusions</em>' containment reference.
	 * @see #getExclusions()
	 * @generated
	 */
	void setExclusions(ExclusionsType value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Indicates the dependency is optional for use of this library. While the
	 *             version of the dependency will be taken into account for dependency calculation if the
	 *             library is used elsewhere, it will not be passed on transitively. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>false</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependency_Optional()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='optional' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOptional();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Dependency#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(String value);

} // Dependency
