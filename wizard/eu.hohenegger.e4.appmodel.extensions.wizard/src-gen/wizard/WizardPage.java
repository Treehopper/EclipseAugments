/**
 */
package wizard;

import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.WizardPage#getWizard <em>Wizard</em>}</li>
 *   <li>{@link wizard.WizardPage#getName <em>Name</em>}</li>
 *   <li>{@link wizard.WizardPage#getTitle <em>Title</em>}</li>
 *   <li>{@link wizard.WizardPage#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see wizard.ExtensionsPackage#getWizardPage()
 * @model
 * @generated
 */
public interface WizardPage extends EObject, MUIElement, MContribution {
	/**
	 * Returns the value of the '<em><b>Wizard</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wizard</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wizard</em>' container reference.
	 * @see #setWizard(Wizard)
	 * @see wizard.ExtensionsPackage#getWizardPage_Wizard()
	 * @see wizard.Wizard#getPages
	 * @model opposite="pages" transient="false"
	 * @generated
	 */
	Wizard getWizard();

	/**
	 * Sets the value of the '{@link wizard.WizardPage#getWizard <em>Wizard</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wizard</em>' container reference.
	 * @see #getWizard()
	 * @generated
	 */
	void setWizard(Wizard value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizard.ExtensionsPackage#getWizardPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizard.WizardPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wizard.ExtensionsPackage#getWizardPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wizard.WizardPage#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wizard.ExtensionsPackage#getWizardPage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wizard.WizardPage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // WizardPage
