/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mailing List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * This element describes all of the mailing lists associated with a project. The
 *         auto-generated site references this information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getName <em>Name</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getUnsubscribe <em>Unsubscribe</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getPost <em>Post</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getArchive <em>Archive</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingList#getOtherArchives <em>Other Archives</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList()
 * @model extendedMetaData="name='MailingList' kind='elementOnly'"
 * @generated
 */
public interface MailingList extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The name of the mailing list.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The email address or link that can be used to subscribe to
	 *             the mailing list.  If this is an email address, a
	 *             <code>mailto:</code> link will automatically be created
	 *             when the documentation is created.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscribe</em>' attribute.
	 * @see #setSubscribe(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_Subscribe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='subscribe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubscribe();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getSubscribe <em>Subscribe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' attribute.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(String value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The email address or link that can be used to unsubscribe to
	 *             the mailing list.  If this is an email address, a
	 *             <code>mailto:</code> link will automatically be created
	 *             when the documentation is created.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsubscribe</em>' attribute.
	 * @see #setUnsubscribe(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_Unsubscribe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='unsubscribe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnsubscribe();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getUnsubscribe <em>Unsubscribe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe</em>' attribute.
	 * @see #getUnsubscribe()
	 * @generated
	 */
	void setUnsubscribe(String value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The email address or link that can be used to post to
	 *             the mailing list.  If this is an email address, a
	 *             <code>mailto:</code> link will automatically be created
	 *             when the documentation is created.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_Post()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='post' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPost();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(String value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The link to a URL where you can browse the mailing list archive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive</em>' attribute.
	 * @see #setArchive(String)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_Archive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchive();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getArchive <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' attribute.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(String value);

	/**
	 * Returns the value of the '<em><b>Other Archives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The link to alternate URLs where you can browse the list archive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Archives</em>' containment reference.
	 * @see #setOtherArchives(OtherArchivesType)
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingList_OtherArchives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherArchives' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherArchivesType getOtherArchives();

	/**
	 * Sets the value of the '{@link eu.hohenegger.xsd.pom.MailingList#getOtherArchives <em>Other Archives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Archives</em>' containment reference.
	 * @see #getOtherArchives()
	 * @generated
	 */
	void setOtherArchives(OtherArchivesType value);

} // MailingList
