/**
 */
package wizard;

import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Finisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.WizardFinisher#isNeedsProgress <em>Needs Progress</em>}</li>
 *   <li>{@link wizard.WizardFinisher#isFork <em>Fork</em>}</li>
 *   <li>{@link wizard.WizardFinisher#isCancellable <em>Cancellable</em>}</li>
 * </ul>
 *
 * @see wizard.ExtensionsPackage#getWizardFinisher()
 * @model
 * @generated
 */
public interface WizardFinisher extends EObject, MContribution {
	/**
	 * Returns the value of the '<em><b>Needs Progress</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Progress</em>' attribute.
	 * @see #setNeedsProgress(boolean)
	 * @see wizard.ExtensionsPackage#getWizardFinisher_NeedsProgress()
	 * @model default="false"
	 * @generated
	 */
	boolean isNeedsProgress();

	/**
	 * Sets the value of the '{@link wizard.WizardFinisher#isNeedsProgress <em>Needs Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Progress</em>' attribute.
	 * @see #isNeedsProgress()
	 * @generated
	 */
	void setNeedsProgress(boolean value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' attribute.
	 * @see #setFork(boolean)
	 * @see wizard.ExtensionsPackage#getWizardFinisher_Fork()
	 * @model default="true"
	 * @generated
	 */
	boolean isFork();

	/**
	 * Sets the value of the '{@link wizard.WizardFinisher#isFork <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' attribute.
	 * @see #isFork()
	 * @generated
	 */
	void setFork(boolean value);

	/**
	 * Returns the value of the '<em><b>Cancellable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancellable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancellable</em>' attribute.
	 * @see #setCancellable(boolean)
	 * @see wizard.ExtensionsPackage#getWizardFinisher_Cancellable()
	 * @model default="false"
	 * @generated
	 */
	boolean isCancellable();

	/**
	 * Sets the value of the '{@link wizard.WizardFinisher#isCancellable <em>Cancellable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellable</em>' attribute.
	 * @see #isCancellable()
	 * @generated
	 */
	void setCancellable(boolean value);

} // WizardFinisher
