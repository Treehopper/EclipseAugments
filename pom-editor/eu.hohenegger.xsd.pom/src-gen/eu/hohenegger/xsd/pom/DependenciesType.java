/**
 */
package eu.hohenegger.xsd.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.DependenciesType#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see eu.hohenegger.xsd.pom.PomPackage#getDependenciesType()
 * @model extendedMetaData="name='dependencies_._type' kind='elementOnly'"
 * @generated
 */
public interface DependenciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.xsd.pom.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see eu.hohenegger.xsd.pom.PomPackage#getDependenciesType_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // DependenciesType
