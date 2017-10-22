/**
 */
package wizard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wizard.ExtensionsPackage
 * @generated
 */
public interface ExtensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsFactory eINSTANCE = wizard.impl.ExtensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns a new object of class '<em>Wizard Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard Page</em>'.
	 * @generated
	 */
	WizardPage createWizardPage();

	/**
	 * Returns a new object of class '<em>Dynamic Wizard Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Wizard Page</em>'.
	 * @generated
	 */
	DynamicWizardPage createDynamicWizardPage();

	/**
	 * Returns a new object of class '<em>Wizard Finisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard Finisher</em>'.
	 * @generated
	 */
	WizardFinisher createWizardFinisher();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionsPackage getExtensionsPackage();

} //ExtensionsFactory
