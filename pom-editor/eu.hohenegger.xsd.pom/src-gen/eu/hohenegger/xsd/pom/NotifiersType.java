/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.NotifiersType#getNotifier <em>Notifier</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getNotifiersType()
 * @model extendedMetaData="name='notifiers_._type' kind='elementOnly'"
 * @generated
 */
public interface NotifiersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Notifier</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.xsd.pom.Notifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifier</em>' containment reference list.
	 * @see eu.hohenegger.xsd.pom.PomPackage#getNotifiersType_Notifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Notifier> getNotifier();

} // NotifiersType
