/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * 
 *         
 *         The <code>&lt;execution&gt;</code> element contains informations required for the
 *         execution of a plugin.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.PluginExecution#getId <em>Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.PluginExecution#getPhase <em>Phase</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.PluginExecution#getGoals <em>Goals</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.PluginExecution#getInherited <em>Inherited</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.PluginExecution#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution()
 * @model extendedMetaData="name='PluginExecution' kind='elementOnly'"
 * @generated
 */
public interface PluginExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The identifier of this execution for labelling the goals during the build,
	 *             and for matching executions to merge during inheritance and profile injection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution_Id()
	 * @model default="default" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The build lifecycle phase to bind the goals in this execution to. If omitted,
	 *             the goals will be bound to the default phase specified by the plugin. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution_Phase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The goals to execute with the given configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference.
	 * @see #setGoals(GoalsType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution_Goals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goals' namespace='##targetNamespace'"
	 * @generated
	 */
	GoalsType1 getGoals();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getGoals <em>Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' containment reference.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(GoalsType1 value);

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
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution_Inherited()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='inherited' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInherited();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getInherited <em>Inherited</em>}' attribute.
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
	 * @see #setConfiguration(ConfigurationType3)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getPluginExecution_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType3 getConfiguration();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.PluginExecution#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType3 value);

} // PluginExecution
