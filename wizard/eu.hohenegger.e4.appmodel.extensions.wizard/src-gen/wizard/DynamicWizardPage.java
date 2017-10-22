/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Wizard Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.DynamicWizardPage#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link wizard.DynamicWizardPage#getPreviousPage <em>Previous Page</em>}</li>
 * </ul>
 *
 * @see wizard.ExtensionsPackage#getDynamicWizardPage()
 * @model
 * @generated
 */
public interface DynamicWizardPage extends WizardPage {
	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(DynamicWizardPage)
	 * @see wizard.ExtensionsPackage#getDynamicWizardPage_NextPage()
	 * @model
	 * @generated
	 */
	DynamicWizardPage getNextPage();

	/**
	 * Sets the value of the '{@link wizard.DynamicWizardPage#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(DynamicWizardPage value);

	/**
	 * Returns the value of the '<em><b>Previous Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page</em>' reference.
	 * @see #setPreviousPage(DynamicWizardPage)
	 * @see wizard.ExtensionsPackage#getDynamicWizardPage_PreviousPage()
	 * @model
	 * @generated
	 */
	DynamicWizardPage getPreviousPage();

	/**
	 * Sets the value of the '{@link wizard.DynamicWizardPage#getPreviousPage <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page</em>' reference.
	 * @see #getPreviousPage()
	 * @generated
	 */
	void setPreviousPage(DynamicWizardPage value);

} // DynamicWizardPage
