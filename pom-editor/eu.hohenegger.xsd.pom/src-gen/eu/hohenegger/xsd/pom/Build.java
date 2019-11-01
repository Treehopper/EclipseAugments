/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * 
 *         
 *         The <code>&lt;build&gt;</code> element contains informations required to build the project.
 *         Default values are defined in Super POM.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getSourceDirectory <em>Source Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getScriptSourceDirectory <em>Script Source Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getTestSourceDirectory <em>Test Source Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getTestOutputDirectory <em>Test Output Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getDefaultGoal <em>Default Goal</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getResources <em>Resources</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getTestResources <em>Test Resources</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getDirectory <em>Directory</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getFinalName <em>Final Name</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getFilters <em>Filters</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getPluginManagement <em>Plugin Management</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Build#getPlugins <em>Plugins</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild()
 * @model extendedMetaData="name='Build' kind='elementOnly'"
 * @generated
 */
public interface Build extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             This element specifies a directory containing the source of the project. The
	 *             generated build system will compile the sources from this directory when the project is
	 *             built. The path given is relative to the project descriptor.
	 *             The default value is <code>src/main/java</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Directory</em>' attribute.
	 * @see #setSourceDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_SourceDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sourceDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getSourceDirectory <em>Source Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Directory</em>' attribute.
	 * @see #getSourceDirectory()
	 * @generated
	 */
	void setSourceDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Script Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             This element specifies a directory containing the script sources of the
	 *             project. This directory is meant to be different from the sourceDirectory, in that its
	 *             contents will be copied to the output directory in most cases (since scripts are
	 *             interpreted rather than compiled).
	 *             The default value is <code>src/main/scripts</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script Source Directory</em>' attribute.
	 * @see #setScriptSourceDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_ScriptSourceDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scriptSourceDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScriptSourceDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getScriptSourceDirectory <em>Script Source Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Source Directory</em>' attribute.
	 * @see #getScriptSourceDirectory()
	 * @generated
	 */
	void setScriptSourceDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Test Source Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             This element specifies a directory containing the unit test source of the
	 *             project. The generated build system will compile these directories when the project is
	 *             being tested. The path given is relative to the project descriptor.
	 *             The default value is <code>src/test/java</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Source Directory</em>' attribute.
	 * @see #setTestSourceDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_TestSourceDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='testSourceDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestSourceDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getTestSourceDirectory <em>Test Source Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Source Directory</em>' attribute.
	 * @see #getTestSourceDirectory()
	 * @generated
	 */
	void setTestSourceDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             The directory where compiled application classes are placed.
	 *             The default value is <code>target/classes</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Directory</em>' attribute.
	 * @see #setOutputDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_OutputDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='outputDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getOutputDirectory <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Directory</em>' attribute.
	 * @see #getOutputDirectory()
	 * @generated
	 */
	void setOutputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Test Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             The directory where compiled test classes are placed.
	 *             The default value is <code>target/test-classes</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Output Directory</em>' attribute.
	 * @see #setTestOutputDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_TestOutputDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='testOutputDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestOutputDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getTestOutputDirectory <em>Test Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Output Directory</em>' attribute.
	 * @see #getTestOutputDirectory()
	 * @generated
	 */
	void setTestOutputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * A set of build extensions to use from this project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Default Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The default goal (or phase in Maven 2) to execute when none is specified for
	 *             the project. Note that in case of a multi-module build, only the default goal of the top-level
	 *             project is relevant, i.e. the default goals of child modules are ignored. Since Maven 3,
	 *             multiple goals/phases can be separated by whitespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Goal</em>' attribute.
	 * @see #setDefaultGoal(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_DefaultGoal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='defaultGoal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultGoal();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getDefaultGoal <em>Default Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Goal</em>' attribute.
	 * @see #getDefaultGoal()
	 * @generated
	 */
	void setDefaultGoal(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             This element describes all of the classpath resources such as properties
	 *             files associated with a project. These resources are often included in the final
	 *             package.
	 *             The default value is <code>src/main/resources</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourcesType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_Resources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourcesType1 getResources();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourcesType1 value);

	/**
	 * Returns the value of the '<em><b>Test Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             This element describes all of the classpath resources such as properties
	 *             files associated with a project's unit tests.
	 *             The default value is <code>src/test/resources</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Resources</em>' containment reference.
	 * @see #setTestResources(TestResourcesType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_TestResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testResources' namespace='##targetNamespace'"
	 * @generated
	 */
	TestResourcesType1 getTestResources();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getTestResources <em>Test Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Resources</em>' containment reference.
	 * @see #getTestResources()
	 * @generated
	 */
	void setTestResources(TestResourcesType1 value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             The directory where all files generated by the build are placed.
	 *             The default value is <code>target</code>.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_Directory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Final Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             The filename (excluding the extension, and with no path information) that
	 *             the produced artifact will be called.
	 *             The default value is <code>${artifactId}-${version}</code>.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Name</em>' attribute.
	 * @see #setFinalName(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_FinalName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='finalName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFinalName();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getFinalName <em>Final Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Name</em>' attribute.
	 * @see #getFinalName()
	 * @generated
	 */
	void setFinalName(String value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The list of filter properties files that are used when filtering is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference.
	 * @see #setFilters(FiltersType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_Filters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filters' namespace='##targetNamespace'"
	 * @generated
	 */
	FiltersType1 getFilters();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getFilters <em>Filters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters</em>' containment reference.
	 * @see #getFilters()
	 * @generated
	 */
	void setFilters(FiltersType1 value);

	/**
	 * Returns the value of the '<em><b>Plugin Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * Default plugin information to be made available for reference by projects
	 *             derived from this one. This plugin configuration will not be resolved or bound to the
	 *             lifecycle unless referenced. Any local configuration for a given plugin will override
	 *             the plugin's entire definition here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugin Management</em>' containment reference.
	 * @see #setPluginManagement(PluginManagement)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_PluginManagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pluginManagement' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginManagement getPluginManagement();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getPluginManagement <em>Plugin Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Management</em>' containment reference.
	 * @see #getPluginManagement()
	 * @generated
	 */
	void setPluginManagement(PluginManagement value);

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The list of plugins to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference.
	 * @see #setPlugins(PluginsType1)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getBuild_Plugins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plugins' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginsType1 getPlugins();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Build#getPlugins <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugins</em>' containment reference.
	 * @see #getPlugins()
	 * @generated
	 */
	void setPlugins(PluginsType1 value);

} // Build
