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

import org.liquibase.xml.ns.dbchangelog.AddPrimaryKeyType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Primary Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getClustered <em>Clustered</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getForIndexCatalogName <em>For Index Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getForIndexName <em>For Index Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getForIndexSchemaName <em>For Index Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddPrimaryKeyTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddPrimaryKeyTypeImpl extends MinimalEObjectImpl.Container implements AddPrimaryKeyType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String catalogName = CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClustered() <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClustered()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLUSTERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClustered() <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClustered()
	 * @generated
	 * @ordered
	 */
	protected Object clustered = CLUSTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnNames() <em>Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNames()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnNames() <em>Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNames()
	 * @generated
	 * @ordered
	 */
	protected String columnNames = COLUMN_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForIndexCatalogName() <em>For Index Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_INDEX_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForIndexCatalogName() <em>For Index Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String forIndexCatalogName = FOR_INDEX_CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForIndexName() <em>For Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_INDEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForIndexName() <em>For Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexName()
	 * @generated
	 * @ordered
	 */
	protected String forIndexName = FOR_INDEX_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForIndexSchemaName() <em>For Index Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_INDEX_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForIndexSchemaName() <em>For Index Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForIndexSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String forIndexSchemaName = FOR_INDEX_SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String schemaName = SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTablespace() <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTablespace() <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablespace()
	 * @generated
	 * @ordered
	 */
	protected String tablespace = TABLESPACE_EDEFAULT;

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
	protected AddPrimaryKeyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddPrimaryKeyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getAddPrimaryKeyType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalogName() {
		return catalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogName(String newCatalogName) {
		String oldCatalogName = catalogName;
		catalogName = newCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClustered() {
		return clustered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClustered(Object newClustered) {
		Object oldClustered = clustered;
		clustered = newClustered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CLUSTERED, oldClustered, clustered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnNames() {
		return columnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnNames(String newColumnNames) {
		String oldColumnNames = columnNames;
		columnNames = newColumnNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES, oldColumnNames, columnNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForIndexCatalogName() {
		return forIndexCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForIndexCatalogName(String newForIndexCatalogName) {
		String oldForIndexCatalogName = forIndexCatalogName;
		forIndexCatalogName = newForIndexCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_CATALOG_NAME, oldForIndexCatalogName, forIndexCatalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForIndexName() {
		return forIndexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForIndexName(String newForIndexName) {
		String oldForIndexName = forIndexName;
		forIndexName = newForIndexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_NAME, oldForIndexName, forIndexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForIndexSchemaName() {
		return forIndexSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForIndexSchemaName(String newForIndexSchemaName) {
		String oldForIndexSchemaName = forIndexSchemaName;
		forIndexSchemaName = newForIndexSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_SCHEMA_NAME, oldForIndexSchemaName, forIndexSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaName() {
		return schemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaName(String newSchemaName) {
		String oldSchemaName = schemaName;
		schemaName = newSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTablespace() {
		return tablespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablespace(String newTablespace) {
		String oldTablespace = tablespace;
		tablespace = newTablespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLESPACE, oldTablespace, tablespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CLUSTERED:
				return getClustered();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES:
				return getColumnNames();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_CATALOG_NAME:
				return getForIndexCatalogName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_NAME:
				return getForIndexName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_SCHEMA_NAME:
				return getForIndexSchemaName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLE_NAME:
				return getTableName();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLESPACE:
				return getTablespace();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CLUSTERED:
				setClustered(newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES:
				setColumnNames((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_CATALOG_NAME:
				setForIndexCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_NAME:
				setForIndexName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_SCHEMA_NAME:
				setForIndexSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLESPACE:
				setTablespace((String)newValue);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP:
				getGroup().clear();
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY:
				getAny().clear();
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CLUSTERED:
				setClustered(CLUSTERED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES:
				setColumnNames(COLUMN_NAMES_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_CATALOG_NAME:
				setForIndexCatalogName(FOR_INDEX_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_NAME:
				setForIndexName(FOR_INDEX_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_SCHEMA_NAME:
				setForIndexSchemaName(FOR_INDEX_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLESPACE:
				setTablespace(TABLESPACE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY:
				return !getAny().isEmpty();
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CLUSTERED:
				return CLUSTERED_EDEFAULT == null ? clustered != null : !CLUSTERED_EDEFAULT.equals(clustered);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__COLUMN_NAMES:
				return COLUMN_NAMES_EDEFAULT == null ? columnNames != null : !COLUMN_NAMES_EDEFAULT.equals(columnNames);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_CATALOG_NAME:
				return FOR_INDEX_CATALOG_NAME_EDEFAULT == null ? forIndexCatalogName != null : !FOR_INDEX_CATALOG_NAME_EDEFAULT.equals(forIndexCatalogName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_NAME:
				return FOR_INDEX_NAME_EDEFAULT == null ? forIndexName != null : !FOR_INDEX_NAME_EDEFAULT.equals(forIndexName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__FOR_INDEX_SCHEMA_NAME:
				return FOR_INDEX_SCHEMA_NAME_EDEFAULT == null ? forIndexSchemaName != null : !FOR_INDEX_SCHEMA_NAME_EDEFAULT.equals(forIndexSchemaName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__TABLESPACE:
				return TABLESPACE_EDEFAULT == null ? tablespace != null : !TABLESPACE_EDEFAULT.equals(tablespace);
			case DbchangelogPackage.ADD_PRIMARY_KEY_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", clustered: ");
		result.append(clustered);
		result.append(", columnNames: ");
		result.append(columnNames);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(", forIndexCatalogName: ");
		result.append(forIndexCatalogName);
		result.append(", forIndexName: ");
		result.append(forIndexName);
		result.append(", forIndexSchemaName: ");
		result.append(forIndexSchemaName);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", tablespace: ");
		result.append(tablespace);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AddPrimaryKeyTypeImpl
