/**
 */
package wizard;

import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Wizard#getPages <em>Pages</em>}</li>
 *   <li>{@link wizard.Wizard#getFinisher <em>Finisher</em>}</li>
 *   <li>{@link wizard.Wizard#getCurrentPage <em>Current Page</em>}</li>
 *   <li>{@link wizard.Wizard#isBlockOnOpen <em>Block On Open</em>}</li>
 * </ul>
 *
 * @see wizard.ExtensionsPackage#getWizard()
 * @model
 * @generated
 */
public interface Wizard extends EObject, MUIElement, MContribution, MWindow {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.WizardPage}.
	 * It is bidirectional and its opposite is '{@link wizard.WizardPage#getWizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see wizard.ExtensionsPackage#getWizard_Pages()
	 * @see wizard.WizardPage#getWizard
	 * @model opposite="wizard" containment="true"
	 * @generated
	 */
	EList<WizardPage> getPages();

	/**
	 * Returns the value of the '<em><b>Finisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finisher</em>' containment reference.
	 * @see #setFinisher(WizardFinisher)
	 * @see wizard.ExtensionsPackage#getWizard_Finisher()
	 * @model containment="true"
	 * @generated
	 */
	WizardFinisher getFinisher();

	/**
	 * Sets the value of the '{@link wizard.Wizard#getFinisher <em>Finisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finisher</em>' containment reference.
	 * @see #getFinisher()
	 * @generated
	 */
	void setFinisher(WizardFinisher value);

	/**
	 * Returns the value of the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Page</em>' reference.
	 * @see #setCurrentPage(WizardPage)
	 * @see wizard.ExtensionsPackage#getWizard_CurrentPage()
	 * @model
	 * @generated
	 */
	WizardPage getCurrentPage();

	/**
	 * Sets the value of the '{@link wizard.Wizard#getCurrentPage <em>Current Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Page</em>' reference.
	 * @see #getCurrentPage()
	 * @generated
	 */
	void setCurrentPage(WizardPage value);

	/**
	 * Returns the value of the '<em><b>Block On Open</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block On Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block On Open</em>' attribute.
	 * @see #setBlockOnOpen(boolean)
	 * @see wizard.ExtensionsPackage#getWizard_BlockOnOpen()
	 * @model default="true"
	 * @generated
	 */
	boolean isBlockOnOpen();

	/**
	 * Sets the value of the '{@link wizard.Wizard#isBlockOnOpen <em>Block On Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block On Open</em>' attribute.
	 * @see #isBlockOnOpen()
	 * @generated
	 */
	void setBlockOnOpen(boolean value);

} // Wizard
