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

import org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Unique Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getClustered <em>Clustered</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getForIndexCatalogName <em>For Index Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getForIndexName <em>For Index Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getForIndexSchemaName <em>For Index Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.AddUniqueConstraintTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddUniqueConstraintTypeImpl extends MinimalEObjectImpl.Container implements AddUniqueConstraintType {
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
	 * The default value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFERRABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeferrable() <em>Deferrable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrable()
	 * @generated
	 * @ordered
	 */
	protected Object deferrable = DEFERRABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Object DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected Object disabled = DISABLED_EDEFAULT;

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
	 * The default value of the '{@link #getInitiallyDeferred() <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyDeferred()
	 * @generated
	 * @ordered
	 */
	protected static final Object INITIALLY_DEFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiallyDeferred() <em>Initially Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyDeferred()
	 * @generated
	 * @ordered
	 */
	protected Object initiallyDeferred = INITIALLY_DEFERRED_EDEFAULT;

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
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALIDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected Object validate = VALIDATE_EDEFAULT;

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
	protected AddUniqueConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED, oldClustered, clustered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES, oldColumnNames, columnNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDeferrable() {
		return deferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferrable(Object newDeferrable) {
		Object oldDeferrable = deferrable;
		deferrable = newDeferrable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE, oldDeferrable, deferrable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(Object newDisabled) {
		Object oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED, oldDisabled, disabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME, oldForIndexCatalogName, forIndexCatalogName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME, oldForIndexName, forIndexName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME, oldForIndexSchemaName, forIndexSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInitiallyDeferred() {
		return initiallyDeferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiallyDeferred(Object newInitiallyDeferred) {
		Object oldInitiallyDeferred = initiallyDeferred;
		initiallyDeferred = newInitiallyDeferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED, oldInitiallyDeferred, initiallyDeferred));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE, oldTablespace, tablespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(Object newValidate) {
		Object oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED:
				return getClustered();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
				return getColumnNames();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return getConstraintName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
				return getDeferrable();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
				return getDisabled();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME:
				return getForIndexCatalogName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME:
				return getForIndexName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME:
				return getForIndexSchemaName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				return getInitiallyDeferred();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				return getTableName();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
				return getTablespace();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE:
				return getValidate();
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED:
				setClustered(newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
				setColumnNames((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
				setDeferrable(newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
				setDisabled(newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME:
				setForIndexCatalogName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME:
				setForIndexName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME:
				setForIndexSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
				setTablespace((String)newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE:
				setValidate(newValue);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED:
				setClustered(CLUSTERED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
				setColumnNames(COLUMN_NAMES_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
				setDeferrable(DEFERRABLE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME:
				setForIndexCatalogName(FOR_INDEX_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME:
				setForIndexName(FOR_INDEX_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME:
				setForIndexSchemaName(FOR_INDEX_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				setInitiallyDeferred(INITIALLY_DEFERRED_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
				setTablespace(TABLESPACE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED:
				return CLUSTERED_EDEFAULT == null ? clustered != null : !CLUSTERED_EDEFAULT.equals(clustered);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
				return COLUMN_NAMES_EDEFAULT == null ? columnNames != null : !COLUMN_NAMES_EDEFAULT.equals(columnNames);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
				return DEFERRABLE_EDEFAULT == null ? deferrable != null : !DEFERRABLE_EDEFAULT.equals(deferrable);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME:
				return FOR_INDEX_CATALOG_NAME_EDEFAULT == null ? forIndexCatalogName != null : !FOR_INDEX_CATALOG_NAME_EDEFAULT.equals(forIndexCatalogName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME:
				return FOR_INDEX_NAME_EDEFAULT == null ? forIndexName != null : !FOR_INDEX_NAME_EDEFAULT.equals(forIndexName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME:
				return FOR_INDEX_SCHEMA_NAME_EDEFAULT == null ? forIndexSchemaName != null : !FOR_INDEX_SCHEMA_NAME_EDEFAULT.equals(forIndexSchemaName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
				return INITIALLY_DEFERRED_EDEFAULT == null ? initiallyDeferred != null : !INITIALLY_DEFERRED_EDEFAULT.equals(initiallyDeferred);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
				return TABLESPACE_EDEFAULT == null ? tablespace != null : !TABLESPACE_EDEFAULT.equals(tablespace);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (catalogName: ");
		result.append(catalogName);
		result.append(", clustered: ");
		result.append(clustered);
		result.append(", columnNames: ");
		result.append(columnNames);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(", deferrable: ");
		result.append(deferrable);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", forIndexCatalogName: ");
		result.append(forIndexCatalogName);
		result.append(", forIndexName: ");
		result.append(forIndexName);
		result.append(", forIndexSchemaName: ");
		result.append(forIndexSchemaName);
		result.append(", initiallyDeferred: ");
		result.append(initiallyDeferred);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", tablespace: ");
		result.append(tablespace);
		result.append(", validate: ");
		result.append(validate);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AddUniqueConstraintTypeImpl
