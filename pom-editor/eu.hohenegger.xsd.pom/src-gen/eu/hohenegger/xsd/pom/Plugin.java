/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * 
 *         
 *         The <code>&lt;plugin&gt;</code> element contains informations required for a plugin.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getExecutions <em>Executions</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getGoals <em>Goals</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getInherited <em>Inherited</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Plugin#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin()
 * @model extendedMetaData="name='Plugin' kind='elementOnly'"
 * @generated
 */
public interface Plugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * The default value is <code>"org.apache.maven.plugins"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The group ID of the plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #setGroupId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_GroupId()
	 * @model default="org.apache.maven.plugins" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #isSetGroupId()
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Unsets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	void unsetGroupId();

	/**
	 * Returns whether the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getGroupId <em>Group Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Id</em>' attribute is set.
	 * @see #unsetGroupId()
	 * @see #getGroupId()
	 * @see #setGroupId(String)
	 * @generated
	 */
	boolean isSetGroupId();

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The artifact ID of the plugin in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_ArtifactId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='artifactId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * The version (or valid range of versions) of the plugin to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Whether to load Maven extensions (such as packaging and type handlers) from
	 *             this plugin. For performance reasons, this should only be enabled when necessary. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>false</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' attribute.
	 * @see #setExtensions(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Extensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtensions();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getExtensions <em>Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' attribute.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(String value);

	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Multiple specifications of a set of goals to execute during the build
	 *             lifecycle, each having (possibly) a different configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference.
	 * @see #setExecutions(ExecutionsType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Executions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='executions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecutionsType getExecutions();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getExecutions <em>Executions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executions</em>' containment reference.
	 * @see #getExecutions()
	 * @generated
	 */
	void setExecutions(ExecutionsType value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Additional dependencies that this project needs to introduce to the plugin's
	 *             classloader.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType1 getDependencies();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType1 value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             <b>Deprecated</b>. Unused by Maven.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference.
	 * @see #setGoals(GoalsType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Goals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goals' namespace='##targetNamespace'"
	 * @generated
	 */
	GoalsType getGoals();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getGoals <em>Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' containment reference.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(GoalsType value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             Whether any configuration should be propagated to child POMs. Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>. Default value is <code>true</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Inherited()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='inherited' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInherited();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #getInherited()
	 * @generated
	 */
	void setInherited(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0.0.0+
	 * 
	 *             
	 *             <p>The configuration as DOM object.</p>
	 *             <p>By default, every element content is trimmed, but starting with Maven 3.1.0, you can add
	 *             <code>xml:space="preserve"</code> to elements you want to preserve whitespace.</p>
	 *             <p>You can control how child POMs inherit configuration from parent POMs by adding <code>combine.children</code>
	 *             or <code>combine.self</code> attributes to the children of the configuration element:</p>
	 *             <ul>
	 *             <li><code>combine.children</code>: available values are <code>merge</code> (default) and <code>append</code>,</li>
	 *             <li><code>combine.self</code>: available values are <code>merge</code> (default) and <code>override</code>.</li>
	 *             </ul>
	 *             <p>See <a href="https://maven.apache.org/pom.html#Plugins">POM Reference documentation</a> and
	 *             <a href="https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html">Xpp3DomUtils</a>
	 *             for more information.</p>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPlugin_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Plugin#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

} // Plugin
