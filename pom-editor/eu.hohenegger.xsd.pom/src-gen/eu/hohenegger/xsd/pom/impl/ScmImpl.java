/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.Scm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getDeveloperConnection <em>Developer Connection</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getChildScmConnectionInheritAppendPath <em>Child Scm Connection Inherit Append Path</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getChildScmDeveloperConnectionInheritAppendPath <em>Child Scm Developer Connection Inherit Append Path</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ScmImpl#getChildScmUrlInheritAppendPath <em>Child Scm Url Inherit Append Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScmImpl extends MinimalEObjectImpl.Container implements Scm {
	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected String connection = CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeveloperConnection() <em>Developer Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloperConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPER_CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeveloperConnection() <em>Developer Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloperConnection()
	 * @generated
	 * @ordered
	 */
	protected String developerConnection = DEVELOPER_CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = "HEAD";

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * This is true if the Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagESet;

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
	 * The default value of the '{@link #getChildScmConnectionInheritAppendPath() <em>Child Scm Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmConnectionInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildScmConnectionInheritAppendPath() <em>Child Scm Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmConnectionInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected String childScmConnectionInheritAppendPath = CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildScmDeveloperConnectionInheritAppendPath() <em>Child Scm Developer Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmDeveloperConnectionInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildScmDeveloperConnectionInheritAppendPath() <em>Child Scm Developer Connection Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmDeveloperConnectionInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected String childScmDeveloperConnectionInheritAppendPath = CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildScmUrlInheritAppendPath() <em>Child Scm Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmUrlInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_SCM_URL_INHERIT_APPEND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildScmUrlInheritAppendPath() <em>Child Scm Url Inherit Append Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScmUrlInheritAppendPath()
	 * @generated
	 * @ordered
	 */
	protected String childScmUrlInheritAppendPath = CHILD_SCM_URL_INHERIT_APPEND_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.SCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(String newConnection) {
		String oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeveloperConnection() {
		return developerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeveloperConnection(String newDeveloperConnection) {
		String oldDeveloperConnection = developerConnection;
		developerConnection = newDeveloperConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__DEVELOPER_CONNECTION, oldDeveloperConnection, developerConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		boolean oldTagESet = tagESet;
		tagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__TAG, oldTag, tag, !oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTag() {
		String oldTag = tag;
		boolean oldTagESet = tagESet;
		tag = TAG_EDEFAULT;
		tagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PomPackage.SCM__TAG, oldTag, TAG_EDEFAULT, oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTag() {
		return tagESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildScmConnectionInheritAppendPath() {
		return childScmConnectionInheritAppendPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildScmConnectionInheritAppendPath(String newChildScmConnectionInheritAppendPath) {
		String oldChildScmConnectionInheritAppendPath = childScmConnectionInheritAppendPath;
		childScmConnectionInheritAppendPath = newChildScmConnectionInheritAppendPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH, oldChildScmConnectionInheritAppendPath, childScmConnectionInheritAppendPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildScmDeveloperConnectionInheritAppendPath() {
		return childScmDeveloperConnectionInheritAppendPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildScmDeveloperConnectionInheritAppendPath(String newChildScmDeveloperConnectionInheritAppendPath) {
		String oldChildScmDeveloperConnectionInheritAppendPath = childScmDeveloperConnectionInheritAppendPath;
		childScmDeveloperConnectionInheritAppendPath = newChildScmDeveloperConnectionInheritAppendPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH, oldChildScmDeveloperConnectionInheritAppendPath, childScmDeveloperConnectionInheritAppendPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildScmUrlInheritAppendPath() {
		return childScmUrlInheritAppendPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildScmUrlInheritAppendPath(String newChildScmUrlInheritAppendPath) {
		String oldChildScmUrlInheritAppendPath = childScmUrlInheritAppendPath;
		childScmUrlInheritAppendPath = newChildScmUrlInheritAppendPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__CHILD_SCM_URL_INHERIT_APPEND_PATH, oldChildScmUrlInheritAppendPath, childScmUrlInheritAppendPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PomPackage.SCM__CONNECTION:
				return getConnection();
			case PomPackage.SCM__DEVELOPER_CONNECTION:
				return getDeveloperConnection();
			case PomPackage.SCM__TAG:
				return getTag();
			case PomPackage.SCM__URL:
				return getUrl();
			case PomPackage.SCM__CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH:
				return getChildScmConnectionInheritAppendPath();
			case PomPackage.SCM__CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH:
				return getChildScmDeveloperConnectionInheritAppendPath();
			case PomPackage.SCM__CHILD_SCM_URL_INHERIT_APPEND_PATH:
				return getChildScmUrlInheritAppendPath();
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
			case PomPackage.SCM__CONNECTION:
				setConnection((String)newValue);
				return;
			case PomPackage.SCM__DEVELOPER_CONNECTION:
				setDeveloperConnection((String)newValue);
				return;
			case PomPackage.SCM__TAG:
				setTag((String)newValue);
				return;
			case PomPackage.SCM__URL:
				setUrl((String)newValue);
				return;
			case PomPackage.SCM__CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH:
				setChildScmConnectionInheritAppendPath((String)newValue);
				return;
			case PomPackage.SCM__CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH:
				setChildScmDeveloperConnectionInheritAppendPath((String)newValue);
				return;
			case PomPackage.SCM__CHILD_SCM_URL_INHERIT_APPEND_PATH:
				setChildScmUrlInheritAppendPath((String)newValue);
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
			case PomPackage.SCM__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case PomPackage.SCM__DEVELOPER_CONNECTION:
				setDeveloperConnection(DEVELOPER_CONNECTION_EDEFAULT);
				return;
			case PomPackage.SCM__TAG:
				unsetTag();
				return;
			case PomPackage.SCM__URL:
				setUrl(URL_EDEFAULT);
				return;
			case PomPackage.SCM__CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH:
				setChildScmConnectionInheritAppendPath(CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT);
				return;
			case PomPackage.SCM__CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH:
				setChildScmDeveloperConnectionInheritAppendPath(CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT);
				return;
			case PomPackage.SCM__CHILD_SCM_URL_INHERIT_APPEND_PATH:
				setChildScmUrlInheritAppendPath(CHILD_SCM_URL_INHERIT_APPEND_PATH_EDEFAULT);
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
			case PomPackage.SCM__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case PomPackage.SCM__DEVELOPER_CONNECTION:
				return DEVELOPER_CONNECTION_EDEFAULT == null ? developerConnection != null : !DEVELOPER_CONNECTION_EDEFAULT.equals(developerConnection);
			case PomPackage.SCM__TAG:
				return isSetTag();
			case PomPackage.SCM__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case PomPackage.SCM__CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH:
				return CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT == null ? childScmConnectionInheritAppendPath != null : !CHILD_SCM_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT.equals(childScmConnectionInheritAppendPath);
			case PomPackage.SCM__CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH:
				return CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT == null ? childScmDeveloperConnectionInheritAppendPath != null : !CHILD_SCM_DEVELOPER_CONNECTION_INHERIT_APPEND_PATH_EDEFAULT.equals(childScmDeveloperConnectionInheritAppendPath);
			case PomPackage.SCM__CHILD_SCM_URL_INHERIT_APPEND_PATH:
				return CHILD_SCM_URL_INHERIT_APPEND_PATH_EDEFAULT == null ? childScmUrlInheritAppendPath != null : !CHILD_SCM_URL_INHERIT_APPEND_PATH_EDEFAULT.equals(childScmUrlInheritAppendPath);
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
		result.append(" (connection: ");
		result.append(connection);
		result.append(", developerConnection: ");
		result.append(developerConnection);
		result.append(", tag: ");
		if (tagESet) result.append(tag); else result.append("<unset>");
		result.append(", url: ");
		result.append(url);
		result.append(", childScmConnectionInheritAppendPath: ");
		result.append(childScmConnectionInheritAppendPath);
		result.append(", childScmDeveloperConnectionInheritAppendPath: ");
		result.append(childScmDeveloperConnectionInheritAppendPath);
		result.append(", childScmUrlInheritAppendPath: ");
		result.append(childScmUrlInheritAppendPath);
		result.append(')');
		return result.toString();
	}

} //ScmImpl
