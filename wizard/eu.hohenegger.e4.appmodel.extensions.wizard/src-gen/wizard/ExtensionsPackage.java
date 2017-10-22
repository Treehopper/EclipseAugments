/**
 */
package wizard;

import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wizard.ExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hohenegger.eu/eclipse/e4/wizard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wizard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = wizard.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardImpl
	 * @see wizard.impl.ExtensionsPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__ELEMENT_ID = UiPackageImpl.UI_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Persisted State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PERSISTED_STATE = UiPackageImpl.UI_ELEMENT__PERSISTED_STATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TAGS = UiPackageImpl.UI_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Contributor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CONTRIBUTOR_URI = UiPackageImpl.UI_ELEMENT__CONTRIBUTOR_URI;

	/**
	 * The feature id for the '<em><b>Transient Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TRANSIENT_DATA = UiPackageImpl.UI_ELEMENT__TRANSIENT_DATA;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__WIDGET = UiPackageImpl.UI_ELEMENT__WIDGET;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__RENDERER = UiPackageImpl.UI_ELEMENT__RENDERER;

	/**
	 * The feature id for the '<em><b>To Be Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TO_BE_RENDERED = UiPackageImpl.UI_ELEMENT__TO_BE_RENDERED;

	/**
	 * The feature id for the '<em><b>On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__ON_TOP = UiPackageImpl.UI_ELEMENT__ON_TOP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__VISIBLE = UiPackageImpl.UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PARENT = UiPackageImpl.UI_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Container Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CONTAINER_DATA = UiPackageImpl.UI_ELEMENT__CONTAINER_DATA;

	/**
	 * The feature id for the '<em><b>Cur Shared Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CUR_SHARED_REF = UiPackageImpl.UI_ELEMENT__CUR_SHARED_REF;

	/**
	 * The feature id for the '<em><b>Visible When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__VISIBLE_WHEN = UiPackageImpl.UI_ELEMENT__VISIBLE_WHEN;

	/**
	 * The feature id for the '<em><b>Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__ACCESSIBILITY_PHRASE = UiPackageImpl.UI_ELEMENT__ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Localized Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__LOCALIZED_ACCESSIBILITY_PHRASE = UiPackageImpl.UI_ELEMENT__LOCALIZED_ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Contribution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CONTRIBUTION_URI = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__OBJECT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CHILDREN = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__SELECTED_ELEMENT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__LABEL = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__ICON_URI = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TOOLTIP = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Localized Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__LOCALIZED_LABEL = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Localized Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__LOCALIZED_TOOLTIP = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CONTEXT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__VARIABLES = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PROPERTIES = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__HANDLERS = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Binding Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__BINDING_CONTEXTS = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__SNIPPETS = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Main Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__MAIN_MENU = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__X = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__Y = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__WIDTH = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__HEIGHT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__WINDOWS = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Shared Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__SHARED_ELEMENTS = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGES = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Finisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__FINISHER = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CURRENT_PAGE = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Block On Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__BLOCK_ON_OPEN = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The operation id for the '<em>Update Localization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___UPDATE_LOCALIZATION = UiPackageImpl.UI_ELEMENT___UPDATE_LOCALIZATION;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = UiPackageImpl.UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.WizardPageImpl <em>Wizard Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardPageImpl
	 * @see wizard.impl.ExtensionsPackageImpl#getWizardPage()
	 * @generated
	 */
	int WIZARD_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__ELEMENT_ID = UiPackageImpl.UI_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Persisted State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__PERSISTED_STATE = UiPackageImpl.UI_ELEMENT__PERSISTED_STATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TAGS = UiPackageImpl.UI_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Contributor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CONTRIBUTOR_URI = UiPackageImpl.UI_ELEMENT__CONTRIBUTOR_URI;

	/**
	 * The feature id for the '<em><b>Transient Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TRANSIENT_DATA = UiPackageImpl.UI_ELEMENT__TRANSIENT_DATA;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__WIDGET = UiPackageImpl.UI_ELEMENT__WIDGET;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__RENDERER = UiPackageImpl.UI_ELEMENT__RENDERER;

	/**
	 * The feature id for the '<em><b>To Be Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TO_BE_RENDERED = UiPackageImpl.UI_ELEMENT__TO_BE_RENDERED;

	/**
	 * The feature id for the '<em><b>On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__ON_TOP = UiPackageImpl.UI_ELEMENT__ON_TOP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__VISIBLE = UiPackageImpl.UI_ELEMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__PARENT = UiPackageImpl.UI_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Container Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CONTAINER_DATA = UiPackageImpl.UI_ELEMENT__CONTAINER_DATA;

	/**
	 * The feature id for the '<em><b>Cur Shared Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CUR_SHARED_REF = UiPackageImpl.UI_ELEMENT__CUR_SHARED_REF;

	/**
	 * The feature id for the '<em><b>Visible When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__VISIBLE_WHEN = UiPackageImpl.UI_ELEMENT__VISIBLE_WHEN;

	/**
	 * The feature id for the '<em><b>Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__ACCESSIBILITY_PHRASE = UiPackageImpl.UI_ELEMENT__ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Localized Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__LOCALIZED_ACCESSIBILITY_PHRASE = UiPackageImpl.UI_ELEMENT__LOCALIZED_ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Contribution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__CONTRIBUTION_URI = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__OBJECT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wizard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__WIZARD = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__NAME = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__TITLE = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE__DESCRIPTION = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Wizard Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_FEATURE_COUNT = UiPackageImpl.UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Update Localization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE___UPDATE_LOCALIZATION = UiPackageImpl.UI_ELEMENT___UPDATE_LOCALIZATION;

	/**
	 * The number of operations of the '<em>Wizard Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PAGE_OPERATION_COUNT = UiPackageImpl.UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.DynamicWizardPageImpl <em>Dynamic Wizard Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.DynamicWizardPageImpl
	 * @see wizard.impl.ExtensionsPackageImpl#getDynamicWizardPage()
	 * @generated
	 */
	int DYNAMIC_WIZARD_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__ELEMENT_ID = WIZARD_PAGE__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Persisted State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__PERSISTED_STATE = WIZARD_PAGE__PERSISTED_STATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__TAGS = WIZARD_PAGE__TAGS;

	/**
	 * The feature id for the '<em><b>Contributor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__CONTRIBUTOR_URI = WIZARD_PAGE__CONTRIBUTOR_URI;

	/**
	 * The feature id for the '<em><b>Transient Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__TRANSIENT_DATA = WIZARD_PAGE__TRANSIENT_DATA;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__WIDGET = WIZARD_PAGE__WIDGET;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__RENDERER = WIZARD_PAGE__RENDERER;

	/**
	 * The feature id for the '<em><b>To Be Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__TO_BE_RENDERED = WIZARD_PAGE__TO_BE_RENDERED;

	/**
	 * The feature id for the '<em><b>On Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__ON_TOP = WIZARD_PAGE__ON_TOP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__VISIBLE = WIZARD_PAGE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__PARENT = WIZARD_PAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Container Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__CONTAINER_DATA = WIZARD_PAGE__CONTAINER_DATA;

	/**
	 * The feature id for the '<em><b>Cur Shared Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__CUR_SHARED_REF = WIZARD_PAGE__CUR_SHARED_REF;

	/**
	 * The feature id for the '<em><b>Visible When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__VISIBLE_WHEN = WIZARD_PAGE__VISIBLE_WHEN;

	/**
	 * The feature id for the '<em><b>Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__ACCESSIBILITY_PHRASE = WIZARD_PAGE__ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Localized Accessibility Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__LOCALIZED_ACCESSIBILITY_PHRASE = WIZARD_PAGE__LOCALIZED_ACCESSIBILITY_PHRASE;

	/**
	 * The feature id for the '<em><b>Contribution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__CONTRIBUTION_URI = WIZARD_PAGE__CONTRIBUTION_URI;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__OBJECT = WIZARD_PAGE__OBJECT;

	/**
	 * The feature id for the '<em><b>Wizard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__WIZARD = WIZARD_PAGE__WIZARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__NAME = WIZARD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__TITLE = WIZARD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__DESCRIPTION = WIZARD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__NEXT_PAGE = WIZARD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE = WIZARD_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Wizard Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE_FEATURE_COUNT = WIZARD_PAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Update Localization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE___UPDATE_LOCALIZATION = WIZARD_PAGE___UPDATE_LOCALIZATION;

	/**
	 * The number of operations of the '<em>Dynamic Wizard Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_WIZARD_PAGE_OPERATION_COUNT = WIZARD_PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.WizardFinisherImpl <em>Wizard Finisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardFinisherImpl
	 * @see wizard.impl.ExtensionsPackageImpl#getWizardFinisher()
	 * @generated
	 */
	int WIZARD_FINISHER = 3;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__ELEMENT_ID = ApplicationPackageImpl.CONTRIBUTION__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Persisted State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__PERSISTED_STATE = ApplicationPackageImpl.CONTRIBUTION__PERSISTED_STATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__TAGS = ApplicationPackageImpl.CONTRIBUTION__TAGS;

	/**
	 * The feature id for the '<em><b>Contributor URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__CONTRIBUTOR_URI = ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTOR_URI;

	/**
	 * The feature id for the '<em><b>Transient Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__TRANSIENT_DATA = ApplicationPackageImpl.CONTRIBUTION__TRANSIENT_DATA;

	/**
	 * The feature id for the '<em><b>Contribution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__CONTRIBUTION_URI = ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTION_URI;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__OBJECT = ApplicationPackageImpl.CONTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Needs Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__NEEDS_PROGRESS = ApplicationPackageImpl.CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__FORK = ApplicationPackageImpl.CONTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancellable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER__CANCELLABLE = ApplicationPackageImpl.CONTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wizard Finisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER_FEATURE_COUNT = ApplicationPackageImpl.CONTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Wizard Finisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FINISHER_OPERATION_COUNT = ApplicationPackageImpl.CONTRIBUTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizard.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see wizard.Wizard#getPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link wizard.Wizard#getFinisher <em>Finisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finisher</em>'.
	 * @see wizard.Wizard#getFinisher()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Finisher();

	/**
	 * Returns the meta object for the reference '{@link wizard.Wizard#getCurrentPage <em>Current Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Page</em>'.
	 * @see wizard.Wizard#getCurrentPage()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_CurrentPage();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Wizard#isBlockOnOpen <em>Block On Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block On Open</em>'.
	 * @see wizard.Wizard#isBlockOnOpen()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_BlockOnOpen();

	/**
	 * Returns the meta object for class '{@link wizard.WizardPage <em>Wizard Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Page</em>'.
	 * @see wizard.WizardPage
	 * @generated
	 */
	EClass getWizardPage();

	/**
	 * Returns the meta object for the container reference '{@link wizard.WizardPage#getWizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Wizard</em>'.
	 * @see wizard.WizardPage#getWizard()
	 * @see #getWizardPage()
	 * @generated
	 */
	EReference getWizardPage_Wizard();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizard.WizardPage#getName()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wizard.WizardPage#getTitle()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wizard.WizardPage#getDescription()
	 * @see #getWizardPage()
	 * @generated
	 */
	EAttribute getWizardPage_Description();

	/**
	 * Returns the meta object for class '{@link wizard.DynamicWizardPage <em>Dynamic Wizard Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Wizard Page</em>'.
	 * @see wizard.DynamicWizardPage
	 * @generated
	 */
	EClass getDynamicWizardPage();

	/**
	 * Returns the meta object for the reference '{@link wizard.DynamicWizardPage#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page</em>'.
	 * @see wizard.DynamicWizardPage#getNextPage()
	 * @see #getDynamicWizardPage()
	 * @generated
	 */
	EReference getDynamicWizardPage_NextPage();

	/**
	 * Returns the meta object for the reference '{@link wizard.DynamicWizardPage#getPreviousPage <em>Previous Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Page</em>'.
	 * @see wizard.DynamicWizardPage#getPreviousPage()
	 * @see #getDynamicWizardPage()
	 * @generated
	 */
	EReference getDynamicWizardPage_PreviousPage();

	/**
	 * Returns the meta object for class '{@link wizard.WizardFinisher <em>Wizard Finisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Finisher</em>'.
	 * @see wizard.WizardFinisher
	 * @generated
	 */
	EClass getWizardFinisher();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardFinisher#isNeedsProgress <em>Needs Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Progress</em>'.
	 * @see wizard.WizardFinisher#isNeedsProgress()
	 * @see #getWizardFinisher()
	 * @generated
	 */
	EAttribute getWizardFinisher_NeedsProgress();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardFinisher#isFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fork</em>'.
	 * @see wizard.WizardFinisher#isFork()
	 * @see #getWizardFinisher()
	 * @generated
	 */
	EAttribute getWizardFinisher_Fork();

	/**
	 * Returns the meta object for the attribute '{@link wizard.WizardFinisher#isCancellable <em>Cancellable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancellable</em>'.
	 * @see wizard.WizardFinisher#isCancellable()
	 * @see #getWizardFinisher()
	 * @generated
	 */
	EAttribute getWizardFinisher_Cancellable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardImpl
		 * @see wizard.impl.ExtensionsPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGES = eINSTANCE.getWizard_Pages();

		/**
		 * The meta object literal for the '<em><b>Finisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__FINISHER = eINSTANCE.getWizard_Finisher();

		/**
		 * The meta object literal for the '<em><b>Current Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__CURRENT_PAGE = eINSTANCE.getWizard_CurrentPage();

		/**
		 * The meta object literal for the '<em><b>Block On Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__BLOCK_ON_OPEN = eINSTANCE.getWizard_BlockOnOpen();

		/**
		 * The meta object literal for the '{@link wizard.impl.WizardPageImpl <em>Wizard Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardPageImpl
		 * @see wizard.impl.ExtensionsPackageImpl#getWizardPage()
		 * @generated
		 */
		EClass WIZARD_PAGE = eINSTANCE.getWizardPage();

		/**
		 * The meta object literal for the '<em><b>Wizard</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_PAGE__WIZARD = eINSTANCE.getWizardPage_Wizard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__NAME = eINSTANCE.getWizardPage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__TITLE = eINSTANCE.getWizardPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PAGE__DESCRIPTION = eINSTANCE.getWizardPage_Description();

		/**
		 * The meta object literal for the '{@link wizard.impl.DynamicWizardPageImpl <em>Dynamic Wizard Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.DynamicWizardPageImpl
		 * @see wizard.impl.ExtensionsPackageImpl#getDynamicWizardPage()
		 * @generated
		 */
		EClass DYNAMIC_WIZARD_PAGE = eINSTANCE.getDynamicWizardPage();

		/**
		 * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_WIZARD_PAGE__NEXT_PAGE = eINSTANCE.getDynamicWizardPage_NextPage();

		/**
		 * The meta object literal for the '<em><b>Previous Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_WIZARD_PAGE__PREVIOUS_PAGE = eINSTANCE.getDynamicWizardPage_PreviousPage();

		/**
		 * The meta object literal for the '{@link wizard.impl.WizardFinisherImpl <em>Wizard Finisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardFinisherImpl
		 * @see wizard.impl.ExtensionsPackageImpl#getWizardFinisher()
		 * @generated
		 */
		EClass WIZARD_FINISHER = eINSTANCE.getWizardFinisher();

		/**
		 * The meta object literal for the '<em><b>Needs Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_FINISHER__NEEDS_PROGRESS = eINSTANCE.getWizardFinisher_NeedsProgress();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_FINISHER__FORK = eINSTANCE.getWizardFinisher_Fork();

		/**
		 * The meta object literal for the '<em><b>Cancellable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_FINISHER__CANCELLABLE = eINSTANCE.getWizardFinisher_Cancellable();

	}

} //ExtensionsPackage
