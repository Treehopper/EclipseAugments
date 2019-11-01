/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Contains the information needed for deploying websites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.Site#getId <em>Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Site#getName <em>Name</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Site#getUrl <em>Url</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.Site#getChildSiteUrlInheritAppendPath <em>Child Site Url Inherit Append Path</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getSite()
 * @model extendedMetaData="name='Site' kind='elementOnly'"
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             A unique identifier for a deployment location. This is used to match the
	 *             site to configuration in the <code>settings.xml</code> file, for example.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getSite_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Site#getId <em>Id</em>}' attribute.
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
	 * Human readable name of the deployment location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getSite_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Site#getName <em>Name</em>}' attribute.
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
	 *             The url of the location where website is deployed, in the form <code>protocol://hostname/path</code>.
	 *             <br><b>Default value is</b>: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
	 *             site's <code>child.site.url.inherit.append.path="false"</code>
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getSite_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Site#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Child Site Url Inherit Append Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * 
	 *             
	 *             When childs inherit from distribution management site url, append path or not? Note: While the type
	 *             of this field is <code>String</code> for technical reasons, the semantic type is actually
	 *             <code>Boolean</code>
	 *             <br><b>Default value is</b>: <code>true</code>
	 *             <br><b>Since</b>: Maven 3.6.1
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Site Url Inherit Append Path</em>' attribute.
	 * @see #setChildSiteUrlInheritAppendPath(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getSite_ChildSiteUrlInheritAppendPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='child.site.url.inherit.append.path'"
	 * @generated
	 */
	String getChildSiteUrlInheritAppendPath();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.Site#getChildSiteUrlInheritAppendPath <em>Child Site Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Site Url Inherit Append Path</em>' attribute.
	 * @see #getChildSiteUrlInheritAppendPath()
	 * @generated
	 */
	void setChildSiteUrlInheritAppendPath(String value);

} // Site
