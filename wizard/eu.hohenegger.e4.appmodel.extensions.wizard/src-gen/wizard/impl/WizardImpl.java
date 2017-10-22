/**
 */
package wizard.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.LocalizationHelper;
import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.e4.ui.model.application.commands.MBindingContext;
import org.eclipse.e4.ui.model.application.commands.MBindings;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MHandlerContainer;

import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;

import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.impl.StringToStringMapImpl;

import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MSnippetContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;

import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;

import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;

import org.eclipse.e4.ui.model.application.ui.impl.UIElementImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import wizard.ExtensionsPackage;
import wizard.Wizard;
import wizard.WizardFinisher;
import wizard.WizardPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.WizardImpl#getContributionURI <em>Contribution URI</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getObject <em>Object</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getSelectedElement <em>Selected Element</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getIconURI <em>Icon URI</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getLocalizedLabel <em>Localized Label</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getLocalizedTooltip <em>Localized Tooltip</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getContext <em>Context</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getBindingContexts <em>Binding Contexts</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getSnippets <em>Snippets</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getMainMenu <em>Main Menu</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getX <em>X</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getY <em>Y</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getSharedElements <em>Shared Elements</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getFinisher <em>Finisher</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#getCurrentPage <em>Current Page</em>}</li>
 *   <li>{@link wizard.impl.WizardImpl#isBlockOnOpen <em>Block On Open</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WizardImpl extends UIElementImpl implements Wizard {
	/**
	 * The default value of the '{@link #getContributionURI() <em>Contribution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributionURI() <em>Contribution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionURI()
	 * @generated
	 * @ordered
	 */
	protected String contributionURI = CONTRIBUTION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Object object = OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MWindowElement> children;

	/**
	 * The cached value of the '{@link #getSelectedElement() <em>Selected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedElement()
	 * @generated
	 * @ordered
	 */
	protected MWindowElement selectedElement;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconURI() <em>Icon URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconURI() <em>Icon URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconURI()
	 * @generated
	 * @ordered
	 */
	protected String iconURI = ICON_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalizedLabel() <em>Localized Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZED_LABEL_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getLocalizedTooltip() <em>Localized Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZED_TOOLTIP_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final IEclipseContext CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected IEclipseContext context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<MHandler> handlers;

	/**
	 * The cached value of the '{@link #getBindingContexts() <em>Binding Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<MBindingContext> bindingContexts;

	/**
	 * The cached value of the '{@link #getSnippets() <em>Snippets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippets()
	 * @generated
	 * @ordered
	 */
	protected EList<MUIElement> snippets;

	/**
	 * The cached value of the '{@link #getMainMenu() <em>Main Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainMenu()
	 * @generated
	 * @ordered
	 */
	protected MMenu mainMenu;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = -2147483648;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = -2147483648;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<MWindow> windows;

	/**
	 * The cached value of the '{@link #getSharedElements() <em>Shared Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MUIElement> sharedElements;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<WizardPage> pages;

	/**
	 * The cached value of the '{@link #getFinisher() <em>Finisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinisher()
	 * @generated
	 * @ordered
	 */
	protected WizardFinisher finisher;

	/**
	 * The cached value of the '{@link #getCurrentPage() <em>Current Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPage()
	 * @generated
	 * @ordered
	 */
	protected WizardPage currentPage;

	/**
	 * The default value of the '{@link #isBlockOnOpen() <em>Block On Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockOnOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCK_ON_OPEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBlockOnOpen() <em>Block On Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockOnOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean blockOnOpen = BLOCK_ON_OPEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.WIZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributionURI() {
		return contributionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributionURI(String newContributionURI) {
		String oldContributionURI = contributionURI;
		contributionURI = newContributionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__CONTRIBUTION_URI, oldContributionURI, contributionURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Object newObject) {
		Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MWindowElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<MWindowElement>(MWindowElement.class, this, ExtensionsPackage.WIZARD__CHILDREN, UiPackageImpl.UI_ELEMENT__PARENT) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return MUIElement.class; } };
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindowElement getSelectedElement() {
		if (selectedElement != null && ((EObject)selectedElement).eIsProxy()) {
			InternalEObject oldSelectedElement = (InternalEObject)selectedElement;
			selectedElement = (MWindowElement)eResolveProxy(oldSelectedElement);
			if (selectedElement != oldSelectedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.WIZARD__SELECTED_ELEMENT, oldSelectedElement, selectedElement));
			}
		}
		return selectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindowElement basicGetSelectedElement() {
		return selectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedElement(MWindowElement newSelectedElement) {
		MWindowElement oldSelectedElement = selectedElement;
		selectedElement = newSelectedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__SELECTED_ELEMENT, oldSelectedElement, selectedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconURI() {
		return iconURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconURI(String newIconURI) {
		String oldIconURI = iconURI;
		iconURI = newIconURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__ICON_URI, oldIconURI, iconURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLocalizedLabel() {
		return LocalizationHelper.getLocalizedLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLocalizedTooltip() {
		return LocalizationHelper.getLocalizedTooltip(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEclipseContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(IEclipseContext newContext) {
		IEclipseContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, ExtensionsPackage.WIZARD__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, ExtensionsPackage.WIZARD__PROPERTIES);
		}
		return properties.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MHandler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<MHandler>(MHandler.class, this, ExtensionsPackage.WIZARD__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MBindingContext> getBindingContexts() {
		if (bindingContexts == null) {
			bindingContexts = new EObjectResolvingEList<MBindingContext>(MBindingContext.class, this, ExtensionsPackage.WIZARD__BINDING_CONTEXTS);
		}
		return bindingContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MUIElement> getSnippets() {
		if (snippets == null) {
			snippets = new EObjectContainmentEList<MUIElement>(MUIElement.class, this, ExtensionsPackage.WIZARD__SNIPPETS);
		}
		return snippets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMenu getMainMenu() {
		return mainMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainMenu(MMenu newMainMenu, NotificationChain msgs) {
		MMenu oldMainMenu = mainMenu;
		mainMenu = newMainMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__MAIN_MENU, oldMainMenu, newMainMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainMenu(MMenu newMainMenu) {
		if (newMainMenu != mainMenu) {
			NotificationChain msgs = null;
			if (mainMenu != null)
				msgs = ((InternalEObject)mainMenu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.WIZARD__MAIN_MENU, null, msgs);
			if (newMainMenu != null)
				msgs = ((InternalEObject)newMainMenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.WIZARD__MAIN_MENU, null, msgs);
			msgs = basicSetMainMenu(newMainMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__MAIN_MENU, newMainMenu, newMainMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MWindow> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<MWindow>(MWindow.class, this, ExtensionsPackage.WIZARD__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<MUIElement> getSharedElements() {
		if (sharedElements == null) {
			sharedElements = new EObjectContainmentEList<MUIElement>(MUIElement.class, this, ExtensionsPackage.WIZARD__SHARED_ELEMENTS);
		}
		return sharedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WizardPage> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<WizardPage>(WizardPage.class, this, ExtensionsPackage.WIZARD__PAGES, ExtensionsPackage.WIZARD_PAGE__WIZARD);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFinisher getFinisher() {
		return finisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinisher(WizardFinisher newFinisher, NotificationChain msgs) {
		WizardFinisher oldFinisher = finisher;
		finisher = newFinisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__FINISHER, oldFinisher, newFinisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinisher(WizardFinisher newFinisher) {
		if (newFinisher != finisher) {
			NotificationChain msgs = null;
			if (finisher != null)
				msgs = ((InternalEObject)finisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.WIZARD__FINISHER, null, msgs);
			if (newFinisher != null)
				msgs = ((InternalEObject)newFinisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.WIZARD__FINISHER, null, msgs);
			msgs = basicSetFinisher(newFinisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__FINISHER, newFinisher, newFinisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPage getCurrentPage() {
		if (currentPage != null && currentPage.eIsProxy()) {
			InternalEObject oldCurrentPage = (InternalEObject)currentPage;
			currentPage = (WizardPage)eResolveProxy(oldCurrentPage);
			if (currentPage != oldCurrentPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.WIZARD__CURRENT_PAGE, oldCurrentPage, currentPage));
			}
		}
		return currentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPage basicGetCurrentPage() {
		return currentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPage(WizardPage newCurrentPage) {
		WizardPage oldCurrentPage = currentPage;
		currentPage = newCurrentPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__CURRENT_PAGE, oldCurrentPage, currentPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlockOnOpen() {
		return blockOnOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockOnOpen(boolean newBlockOnOpen) {
		boolean oldBlockOnOpen = blockOnOpen;
		blockOnOpen = newBlockOnOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WIZARD__BLOCK_ON_OPEN, oldBlockOnOpen, blockOnOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__PROPERTIES:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getProperties()).eMap()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__SNIPPETS:
				return ((InternalEList<?>)getSnippets()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__MAIN_MENU:
				return basicSetMainMenu(null, msgs);
			case ExtensionsPackage.WIZARD__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__SHARED_ELEMENTS:
				return ((InternalEList<?>)getSharedElements()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case ExtensionsPackage.WIZARD__FINISHER:
				return basicSetFinisher(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CONTRIBUTION_URI:
				return getContributionURI();
			case ExtensionsPackage.WIZARD__OBJECT:
				return getObject();
			case ExtensionsPackage.WIZARD__CHILDREN:
				return getChildren();
			case ExtensionsPackage.WIZARD__SELECTED_ELEMENT:
				if (resolve) return getSelectedElement();
				return basicGetSelectedElement();
			case ExtensionsPackage.WIZARD__LABEL:
				return getLabel();
			case ExtensionsPackage.WIZARD__ICON_URI:
				return getIconURI();
			case ExtensionsPackage.WIZARD__TOOLTIP:
				return getTooltip();
			case ExtensionsPackage.WIZARD__LOCALIZED_LABEL:
				return getLocalizedLabel();
			case ExtensionsPackage.WIZARD__LOCALIZED_TOOLTIP:
				return getLocalizedTooltip();
			case ExtensionsPackage.WIZARD__CONTEXT:
				return getContext();
			case ExtensionsPackage.WIZARD__VARIABLES:
				return getVariables();
			case ExtensionsPackage.WIZARD__PROPERTIES:
				if (coreType) return ((EMap.InternalMapView<String, String>)getProperties()).eMap();
				else return getProperties();
			case ExtensionsPackage.WIZARD__HANDLERS:
				return getHandlers();
			case ExtensionsPackage.WIZARD__BINDING_CONTEXTS:
				return getBindingContexts();
			case ExtensionsPackage.WIZARD__SNIPPETS:
				return getSnippets();
			case ExtensionsPackage.WIZARD__MAIN_MENU:
				return getMainMenu();
			case ExtensionsPackage.WIZARD__X:
				return getX();
			case ExtensionsPackage.WIZARD__Y:
				return getY();
			case ExtensionsPackage.WIZARD__WIDTH:
				return getWidth();
			case ExtensionsPackage.WIZARD__HEIGHT:
				return getHeight();
			case ExtensionsPackage.WIZARD__WINDOWS:
				return getWindows();
			case ExtensionsPackage.WIZARD__SHARED_ELEMENTS:
				return getSharedElements();
			case ExtensionsPackage.WIZARD__PAGES:
				return getPages();
			case ExtensionsPackage.WIZARD__FINISHER:
				return getFinisher();
			case ExtensionsPackage.WIZARD__CURRENT_PAGE:
				if (resolve) return getCurrentPage();
				return basicGetCurrentPage();
			case ExtensionsPackage.WIZARD__BLOCK_ON_OPEN:
				return isBlockOnOpen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CONTRIBUTION_URI:
				setContributionURI((String)newValue);
				return;
			case ExtensionsPackage.WIZARD__OBJECT:
				setObject(newValue);
				return;
			case ExtensionsPackage.WIZARD__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MWindowElement>)newValue);
				return;
			case ExtensionsPackage.WIZARD__SELECTED_ELEMENT:
				setSelectedElement((MWindowElement)newValue);
				return;
			case ExtensionsPackage.WIZARD__LABEL:
				setLabel((String)newValue);
				return;
			case ExtensionsPackage.WIZARD__ICON_URI:
				setIconURI((String)newValue);
				return;
			case ExtensionsPackage.WIZARD__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case ExtensionsPackage.WIZARD__CONTEXT:
				setContext((IEclipseContext)newValue);
				return;
			case ExtensionsPackage.WIZARD__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
				return;
			case ExtensionsPackage.WIZARD__PROPERTIES:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getProperties()).eMap()).set(newValue);
				return;
			case ExtensionsPackage.WIZARD__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends MHandler>)newValue);
				return;
			case ExtensionsPackage.WIZARD__BINDING_CONTEXTS:
				getBindingContexts().clear();
				getBindingContexts().addAll((Collection<? extends MBindingContext>)newValue);
				return;
			case ExtensionsPackage.WIZARD__SNIPPETS:
				getSnippets().clear();
				getSnippets().addAll((Collection<? extends MUIElement>)newValue);
				return;
			case ExtensionsPackage.WIZARD__MAIN_MENU:
				setMainMenu((MMenu)newValue);
				return;
			case ExtensionsPackage.WIZARD__X:
				setX((Integer)newValue);
				return;
			case ExtensionsPackage.WIZARD__Y:
				setY((Integer)newValue);
				return;
			case ExtensionsPackage.WIZARD__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ExtensionsPackage.WIZARD__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ExtensionsPackage.WIZARD__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends MWindow>)newValue);
				return;
			case ExtensionsPackage.WIZARD__SHARED_ELEMENTS:
				getSharedElements().clear();
				getSharedElements().addAll((Collection<? extends MUIElement>)newValue);
				return;
			case ExtensionsPackage.WIZARD__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends WizardPage>)newValue);
				return;
			case ExtensionsPackage.WIZARD__FINISHER:
				setFinisher((WizardFinisher)newValue);
				return;
			case ExtensionsPackage.WIZARD__CURRENT_PAGE:
				setCurrentPage((WizardPage)newValue);
				return;
			case ExtensionsPackage.WIZARD__BLOCK_ON_OPEN:
				setBlockOnOpen((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CONTRIBUTION_URI:
				setContributionURI(CONTRIBUTION_URI_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__CHILDREN:
				getChildren().clear();
				return;
			case ExtensionsPackage.WIZARD__SELECTED_ELEMENT:
				setSelectedElement((MWindowElement)null);
				return;
			case ExtensionsPackage.WIZARD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__ICON_URI:
				setIconURI(ICON_URI_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__VARIABLES:
				getVariables().clear();
				return;
			case ExtensionsPackage.WIZARD__PROPERTIES:
				getProperties().clear();
				return;
			case ExtensionsPackage.WIZARD__HANDLERS:
				getHandlers().clear();
				return;
			case ExtensionsPackage.WIZARD__BINDING_CONTEXTS:
				getBindingContexts().clear();
				return;
			case ExtensionsPackage.WIZARD__SNIPPETS:
				getSnippets().clear();
				return;
			case ExtensionsPackage.WIZARD__MAIN_MENU:
				setMainMenu((MMenu)null);
				return;
			case ExtensionsPackage.WIZARD__X:
				setX(X_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__Y:
				setY(Y_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ExtensionsPackage.WIZARD__WINDOWS:
				getWindows().clear();
				return;
			case ExtensionsPackage.WIZARD__SHARED_ELEMENTS:
				getSharedElements().clear();
				return;
			case ExtensionsPackage.WIZARD__PAGES:
				getPages().clear();
				return;
			case ExtensionsPackage.WIZARD__FINISHER:
				setFinisher((WizardFinisher)null);
				return;
			case ExtensionsPackage.WIZARD__CURRENT_PAGE:
				setCurrentPage((WizardPage)null);
				return;
			case ExtensionsPackage.WIZARD__BLOCK_ON_OPEN:
				setBlockOnOpen(BLOCK_ON_OPEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.WIZARD__CONTRIBUTION_URI:
				return CONTRIBUTION_URI_EDEFAULT == null ? contributionURI != null : !CONTRIBUTION_URI_EDEFAULT.equals(contributionURI);
			case ExtensionsPackage.WIZARD__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case ExtensionsPackage.WIZARD__CHILDREN:
				return children != null && !children.isEmpty();
			case ExtensionsPackage.WIZARD__SELECTED_ELEMENT:
				return selectedElement != null;
			case ExtensionsPackage.WIZARD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ExtensionsPackage.WIZARD__ICON_URI:
				return ICON_URI_EDEFAULT == null ? iconURI != null : !ICON_URI_EDEFAULT.equals(iconURI);
			case ExtensionsPackage.WIZARD__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case ExtensionsPackage.WIZARD__LOCALIZED_LABEL:
				return LOCALIZED_LABEL_EDEFAULT == null ? getLocalizedLabel() != null : !LOCALIZED_LABEL_EDEFAULT.equals(getLocalizedLabel());
			case ExtensionsPackage.WIZARD__LOCALIZED_TOOLTIP:
				return LOCALIZED_TOOLTIP_EDEFAULT == null ? getLocalizedTooltip() != null : !LOCALIZED_TOOLTIP_EDEFAULT.equals(getLocalizedTooltip());
			case ExtensionsPackage.WIZARD__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case ExtensionsPackage.WIZARD__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ExtensionsPackage.WIZARD__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ExtensionsPackage.WIZARD__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case ExtensionsPackage.WIZARD__BINDING_CONTEXTS:
				return bindingContexts != null && !bindingContexts.isEmpty();
			case ExtensionsPackage.WIZARD__SNIPPETS:
				return snippets != null && !snippets.isEmpty();
			case ExtensionsPackage.WIZARD__MAIN_MENU:
				return mainMenu != null;
			case ExtensionsPackage.WIZARD__X:
				return x != X_EDEFAULT;
			case ExtensionsPackage.WIZARD__Y:
				return y != Y_EDEFAULT;
			case ExtensionsPackage.WIZARD__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ExtensionsPackage.WIZARD__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ExtensionsPackage.WIZARD__WINDOWS:
				return windows != null && !windows.isEmpty();
			case ExtensionsPackage.WIZARD__SHARED_ELEMENTS:
				return sharedElements != null && !sharedElements.isEmpty();
			case ExtensionsPackage.WIZARD__PAGES:
				return pages != null && !pages.isEmpty();
			case ExtensionsPackage.WIZARD__FINISHER:
				return finisher != null;
			case ExtensionsPackage.WIZARD__CURRENT_PAGE:
				return currentPage != null;
			case ExtensionsPackage.WIZARD__BLOCK_ON_OPEN:
				return blockOnOpen != BLOCK_ON_OPEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MContribution.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__CONTRIBUTION_URI: return ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTION_URI;
				case ExtensionsPackage.WIZARD__OBJECT: return ApplicationPackageImpl.CONTRIBUTION__OBJECT;
				default: return -1;
			}
		}
		if (baseClass == MElementContainer.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__CHILDREN: return UiPackageImpl.ELEMENT_CONTAINER__CHILDREN;
				case ExtensionsPackage.WIZARD__SELECTED_ELEMENT: return UiPackageImpl.ELEMENT_CONTAINER__SELECTED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MUILabel.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__LABEL: return UiPackageImpl.UI_LABEL__LABEL;
				case ExtensionsPackage.WIZARD__ICON_URI: return UiPackageImpl.UI_LABEL__ICON_URI;
				case ExtensionsPackage.WIZARD__TOOLTIP: return UiPackageImpl.UI_LABEL__TOOLTIP;
				case ExtensionsPackage.WIZARD__LOCALIZED_LABEL: return UiPackageImpl.UI_LABEL__LOCALIZED_LABEL;
				case ExtensionsPackage.WIZARD__LOCALIZED_TOOLTIP: return UiPackageImpl.UI_LABEL__LOCALIZED_TOOLTIP;
				default: return -1;
			}
		}
		if (baseClass == MContext.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__CONTEXT: return UiPackageImpl.CONTEXT__CONTEXT;
				case ExtensionsPackage.WIZARD__VARIABLES: return UiPackageImpl.CONTEXT__VARIABLES;
				case ExtensionsPackage.WIZARD__PROPERTIES: return UiPackageImpl.CONTEXT__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MHandlerContainer.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__HANDLERS: return CommandsPackageImpl.HANDLER_CONTAINER__HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == MBindings.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__BINDING_CONTEXTS: return CommandsPackageImpl.BINDINGS__BINDING_CONTEXTS;
				default: return -1;
			}
		}
		if (baseClass == MSnippetContainer.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__SNIPPETS: return UiPackageImpl.SNIPPET_CONTAINER__SNIPPETS;
				default: return -1;
			}
		}
		if (baseClass == MWindow.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.WIZARD__MAIN_MENU: return BasicPackageImpl.WINDOW__MAIN_MENU;
				case ExtensionsPackage.WIZARD__X: return BasicPackageImpl.WINDOW__X;
				case ExtensionsPackage.WIZARD__Y: return BasicPackageImpl.WINDOW__Y;
				case ExtensionsPackage.WIZARD__WIDTH: return BasicPackageImpl.WINDOW__WIDTH;
				case ExtensionsPackage.WIZARD__HEIGHT: return BasicPackageImpl.WINDOW__HEIGHT;
				case ExtensionsPackage.WIZARD__WINDOWS: return BasicPackageImpl.WINDOW__WINDOWS;
				case ExtensionsPackage.WIZARD__SHARED_ELEMENTS: return BasicPackageImpl.WINDOW__SHARED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MContribution.class) {
			switch (baseFeatureID) {
				case ApplicationPackageImpl.CONTRIBUTION__CONTRIBUTION_URI: return ExtensionsPackage.WIZARD__CONTRIBUTION_URI;
				case ApplicationPackageImpl.CONTRIBUTION__OBJECT: return ExtensionsPackage.WIZARD__OBJECT;
				default: return -1;
			}
		}
		if (baseClass == MElementContainer.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.ELEMENT_CONTAINER__CHILDREN: return ExtensionsPackage.WIZARD__CHILDREN;
				case UiPackageImpl.ELEMENT_CONTAINER__SELECTED_ELEMENT: return ExtensionsPackage.WIZARD__SELECTED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MUILabel.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.UI_LABEL__LABEL: return ExtensionsPackage.WIZARD__LABEL;
				case UiPackageImpl.UI_LABEL__ICON_URI: return ExtensionsPackage.WIZARD__ICON_URI;
				case UiPackageImpl.UI_LABEL__TOOLTIP: return ExtensionsPackage.WIZARD__TOOLTIP;
				case UiPackageImpl.UI_LABEL__LOCALIZED_LABEL: return ExtensionsPackage.WIZARD__LOCALIZED_LABEL;
				case UiPackageImpl.UI_LABEL__LOCALIZED_TOOLTIP: return ExtensionsPackage.WIZARD__LOCALIZED_TOOLTIP;
				default: return -1;
			}
		}
		if (baseClass == MContext.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.CONTEXT__CONTEXT: return ExtensionsPackage.WIZARD__CONTEXT;
				case UiPackageImpl.CONTEXT__VARIABLES: return ExtensionsPackage.WIZARD__VARIABLES;
				case UiPackageImpl.CONTEXT__PROPERTIES: return ExtensionsPackage.WIZARD__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MHandlerContainer.class) {
			switch (baseFeatureID) {
				case CommandsPackageImpl.HANDLER_CONTAINER__HANDLERS: return ExtensionsPackage.WIZARD__HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == MBindings.class) {
			switch (baseFeatureID) {
				case CommandsPackageImpl.BINDINGS__BINDING_CONTEXTS: return ExtensionsPackage.WIZARD__BINDING_CONTEXTS;
				default: return -1;
			}
		}
		if (baseClass == MSnippetContainer.class) {
			switch (baseFeatureID) {
				case UiPackageImpl.SNIPPET_CONTAINER__SNIPPETS: return ExtensionsPackage.WIZARD__SNIPPETS;
				default: return -1;
			}
		}
		if (baseClass == MWindow.class) {
			switch (baseFeatureID) {
				case BasicPackageImpl.WINDOW__MAIN_MENU: return ExtensionsPackage.WIZARD__MAIN_MENU;
				case BasicPackageImpl.WINDOW__X: return ExtensionsPackage.WIZARD__X;
				case BasicPackageImpl.WINDOW__Y: return ExtensionsPackage.WIZARD__Y;
				case BasicPackageImpl.WINDOW__WIDTH: return ExtensionsPackage.WIZARD__WIDTH;
				case BasicPackageImpl.WINDOW__HEIGHT: return ExtensionsPackage.WIZARD__HEIGHT;
				case BasicPackageImpl.WINDOW__WINDOWS: return ExtensionsPackage.WIZARD__WINDOWS;
				case BasicPackageImpl.WINDOW__SHARED_ELEMENTS: return ExtensionsPackage.WIZARD__SHARED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contributionURI: ");
		result.append(contributionURI);
		result.append(", object: ");
		result.append(object);
		result.append(", label: ");
		result.append(label);
		result.append(", iconURI: ");
		result.append(iconURI);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", context: ");
		result.append(context);
		result.append(", variables: ");
		result.append(variables);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", blockOnOpen: ");
		result.append(blockOnOpen);
		result.append(')');
		return result.toString();
	}

} //WizardImpl
