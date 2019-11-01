/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.ExclusionsType#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getExclusionsType()
 * @model extendedMetaData="name='exclusions_._type' kind='elementOnly'"
 * @generated
 */
public interface ExclusionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclusion</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.xsd.pom.Exclusion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion</em>' containment reference list.
	 * @see eu.hohenegger.xsd.pom.PomPackage#getExclusionsType_Exclusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclusion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Exclusion> getExclusion();

} // ExclusionsType
