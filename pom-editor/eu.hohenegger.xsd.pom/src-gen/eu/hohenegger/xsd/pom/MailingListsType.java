/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mailing Lists Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.MailingListsType#getMailingList <em>Mailing List</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingListsType()
 * @model extendedMetaData="name='mailingLists_._type' kind='elementOnly'"
 * @generated
 */
public interface MailingListsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mailing List</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.xsd.pom.MailingList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailing List</em>' containment reference list.
	 * @see eu.hohenegger.xsd.pom.PomPackage#getMailingListsType_MailingList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mailingList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MailingList> getMailingList();

} // MailingListsType
