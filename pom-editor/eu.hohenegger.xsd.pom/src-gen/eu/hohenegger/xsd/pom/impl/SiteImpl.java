/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.Site;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.SiteImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.SiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.SiteImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.SiteImpl#getChildSiteUrlInheritAppendPath <em>Child Site Url Inherit Append Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteImpl extends MinimalEObjectImpl.Container implements Site {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildSiteUrlInheritAppendPath() <em>Child Site Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSiteUrlInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_SITE_URL_INHERIT_APPEND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildSiteUrlInheritAppendPath() <em>Child Site Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSiteUrlInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected String childSiteUrlInheritAppendPath = CHILD_SITE_URL_INHERIT_APPEND_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SITE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SITE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildSiteUrlInheritAppendPath() {
		return childSiteUrlInheritAppendPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildSiteUrlInheritAppendPath(String newChildSiteUrlInheritAppendPath) {
		String oldChildSiteUrlInheritAppendPath = childSiteUrlInheritAppendPath;
		childSiteUrlInheritAppendPath = newChildSiteUrlInheritAppendPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SITE__CHILD_SITE_URL_INHERIT_APPEND_PATH, oldChildSiteUrlInheritAppendPath, childSiteUrlInheritAppendPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.SITE__ID:
				return getId();
			case PomPackage.SITE__NAME:
				return getName();
			case PomPackage.SITE__URL:
				return getUrl();
			case PomPackage.SITE__CHILD_SITE_URL_INHERIT_APPEND_PATH:
				return getChildSiteUrlInheritAppendPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PomPackage.SITE__ID:
				setId((String)newValue);
				return;
			case PomPackage.SITE__NAME:
				setName((String)newValue);
				return;
			case PomPackage.SITE__URL:
				setUrl((String)newValue);
				return;
			case PomPackage.SITE__CHILD_SITE_URL_INHERIT_APPEND_PATH:
				setChildSiteUrlInheritAppendPath((String)newValue);
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
			case PomPackage.SITE__ID:
				setId(ID_EDEFAULT);
				return;
			case PomPackage.SITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PomPackage.SITE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case PomPackage.SITE__CHILD_SITE_URL_INHERIT_APPEND_PATH:
				setChildSiteUrlInheritAppendPath(CHILD_SITE_URL_INHERIT_APPEND_PATH_EDEFAULT);
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
			case PomPackage.SITE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PomPackage.SITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PomPackage.SITE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case PomPackage.SITE__CHILD_SITE_URL_INHERIT_APPEND_PATH:
				return CHILD_SITE_URL_INHERIT_APPEND_PATH_EDEFAULT == null ? childSiteUrlInheritAppendPath != null : !CHILD_SITE_URL_INHERIT_APPEND_PATH_EDEFAULT.equals(childSiteUrlInheritAppendPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", childSiteUrlInheritAppendPath: ");
		result.append(childSiteUrlInheritAppendPath);
		result.append(')');
		return result.toString();
	}

} //SiteImpl
