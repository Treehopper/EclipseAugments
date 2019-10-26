/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.IncludeAllType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include All Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getErrorIfMissingOrEmpty <em>Error If Missing Or Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getRelativeToChangelogFile <em>Relative To Changelog File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getResourceComparator <em>Resource Comparator</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.IncludeAllTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeAllTypeImpl extends MinimalEObjectImpl.Container implements IncludeAllType {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorIfMissingOrEmpty() <em>Error If Missing Or Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorIfMissingOrEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final Object ERROR_IF_MISSING_OR_EMPTY_EDEFAULT = DbchangelogFactory.eINSTANCE.createFromString(DbchangelogPackage.eINSTANCE.getBooleanExp(), "false");

	/**
	 * The cached value of the '{@link #getErrorIfMissingOrEmpty() <em>Error If Missing Or Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorIfMissingOrEmpty()
	 * @generated
	 * @ordered
	 */
	protected Object errorIfMissingOrEmpty = ERROR_IF_MISSING_OR_EMPTY_EDEFAULT;

	/**
	 * This is true if the Error If Missing Or Empty attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorIfMissingOrEmptyESet;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeToChangelogFile() <em>Relative To Changelog File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeToChangelogFile()
	 * @generated
	 * @ordered
	 */
	protected static final Object RELATIVE_TO_CHANGELOG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeToChangelogFile() <em>Relative To Changelog File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeToChangelogFile()
	 * @generated
	 * @ordered
	 */
	protected Object relativeToChangelogFile = RELATIVE_TO_CHANGELOG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceComparator() <em>Resource Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceComparator()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_COMPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceComparator() <em>Resource Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceComparator()
	 * @generated
	 * @ordered
	 */
	protected String resourceComparator = RESOURCE_COMPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeAllTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getIncludeAllType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getErrorIfMissingOrEmpty() {
		return errorIfMissingOrEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorIfMissingOrEmpty(Object newErrorIfMissingOrEmpty) {
		Object oldErrorIfMissingOrEmpty = errorIfMissingOrEmpty;
		errorIfMissingOrEmpty = newErrorIfMissingOrEmpty;
		boolean oldErrorIfMissingOrEmptyESet = errorIfMissingOrEmptyESet;
		errorIfMissingOrEmptyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY, oldErrorIfMissingOrEmpty, errorIfMissingOrEmpty, !oldErrorIfMissingOrEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorIfMissingOrEmpty() {
		Object oldErrorIfMissingOrEmpty = errorIfMissingOrEmpty;
		boolean oldErrorIfMissingOrEmptyESet = errorIfMissingOrEmptyESet;
		errorIfMissingOrEmpty = ERROR_IF_MISSING_OR_EMPTY_EDEFAULT;
		errorIfMissingOrEmptyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY, oldErrorIfMissingOrEmpty, ERROR_IF_MISSING_OR_EMPTY_EDEFAULT, oldErrorIfMissingOrEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorIfMissingOrEmpty() {
		return errorIfMissingOrEmptyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRelativeToChangelogFile() {
		return relativeToChangelogFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeToChangelogFile(Object newRelativeToChangelogFile) {
		Object oldRelativeToChangelogFile = relativeToChangelogFile;
		relativeToChangelogFile = newRelativeToChangelogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE, oldRelativeToChangelogFile, relativeToChangelogFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceComparator() {
		return resourceComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceComparator(String newResourceComparator) {
		String oldResourceComparator = resourceComparator;
		resourceComparator = newResourceComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.INCLUDE_ALL_TYPE__RESOURCE_COMPARATOR, oldResourceComparator, resourceComparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case DbchangelogPackage.INCLUDE_ALL_TYPE__CONTEXT:
				return getContext();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY:
				return getErrorIfMissingOrEmpty();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__FILTER:
				return getFilter();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__PATH:
				return getPath();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return getRelativeToChangelogFile();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RESOURCE_COMPARATOR:
				return getResourceComparator();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case DbchangelogPackage.INCLUDE_ALL_TYPE__CONTEXT:
				setContext((String)newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY:
				setErrorIfMissingOrEmpty(newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__FILTER:
				setFilter((String)newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__PATH:
				setPath((String)newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RESOURCE_COMPARATOR:
				setResourceComparator((String)newValue);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case DbchangelogPackage.INCLUDE_ALL_TYPE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY:
				unsetErrorIfMissingOrEmpty();
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(RELATIVE_TO_CHANGELOG_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RESOURCE_COMPARATOR:
				setResourceComparator(RESOURCE_COMPARATOR_EDEFAULT);
				return;
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case DbchangelogPackage.INCLUDE_ALL_TYPE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ERROR_IF_MISSING_OR_EMPTY:
				return isSetErrorIfMissingOrEmpty();
			case DbchangelogPackage.INCLUDE_ALL_TYPE__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case DbchangelogPackage.INCLUDE_ALL_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return RELATIVE_TO_CHANGELOG_FILE_EDEFAULT == null ? relativeToChangelogFile != null : !RELATIVE_TO_CHANGELOG_FILE_EDEFAULT.equals(relativeToChangelogFile);
			case DbchangelogPackage.INCLUDE_ALL_TYPE__RESOURCE_COMPARATOR:
				return RESOURCE_COMPARATOR_EDEFAULT == null ? resourceComparator != null : !RESOURCE_COMPARATOR_EDEFAULT.equals(resourceComparator);
			case DbchangelogPackage.INCLUDE_ALL_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (context: ");
		result.append(context);
		result.append(", errorIfMissingOrEmpty: ");
		if (errorIfMissingOrEmptyESet) result.append(errorIfMissingOrEmpty); else result.append("<unset>");
		result.append(", filter: ");
		result.append(filter);
		result.append(", path: ");
		result.append(path);
		result.append(", relativeToChangelogFile: ");
		result.append(relativeToChangelogFile);
		result.append(", resourceComparator: ");
		result.append(resourceComparator);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //IncludeAllTypeImpl
