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

import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.RenameColumnType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getColumnDataType <em>Column Data Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getNewColumnName <em>New Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getOldColumnName <em>Old Column Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.RenameColumnTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameColumnTypeImpl extends MinimalEObjectImpl.Container implements RenameColumnType {
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
	 * The default value of the '{@link #getColumnDataType() <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnDataType() <em>Column Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDataType()
	 * @generated
	 * @ordered
	 */
	protected String columnDataType = COLUMN_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewColumnName() <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewColumnName() <em>New Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewColumnName()
	 * @generated
	 * @ordered
	 */
	protected String newColumnName = NEW_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldColumnName() <em>Old Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldColumnName() <em>Old Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldColumnName()
	 * @generated
	 * @ordered
	 */
	protected String oldColumnName = OLD_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

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
	protected RenameColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getRenameColumnType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnDataType() {
		return columnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDataType(String newColumnDataType) {
		String oldColumnDataType = columnDataType;
		columnDataType = newColumnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE, oldColumnDataType, columnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewColumnName() {
		return newColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewColumnName(String newNewColumnName) {
		String oldNewColumnName = newColumnName;
		newColumnName = newNewColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__NEW_COLUMN_NAME, oldNewColumnName, newColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldColumnName() {
		return oldColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldColumnName(String newOldColumnName) {
		String oldOldColumnName = oldColumnName;
		oldColumnName = newOldColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__OLD_COLUMN_NAME, oldOldColumnName, oldColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.RENAME_COLUMN_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.RENAME_COLUMN_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE:
				return getColumnDataType();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__NEW_COLUMN_NAME:
				return getNewColumnName();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__OLD_COLUMN_NAME:
				return getOldColumnName();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__REMARKS:
				return getRemarks();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__TABLE_NAME:
				return getTableName();
			case DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.RENAME_COLUMN_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__NEW_COLUMN_NAME:
				setNewColumnName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__OLD_COLUMN_NAME:
				setOldColumnName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__REMARKS:
				setRemarks((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.RENAME_COLUMN_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE:
				setColumnDataType(COLUMN_DATA_TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__NEW_COLUMN_NAME:
				setNewColumnName(NEW_COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__OLD_COLUMN_NAME:
				setOldColumnName(OLD_COLUMN_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.RENAME_COLUMN_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__COLUMN_DATA_TYPE:
				return COLUMN_DATA_TYPE_EDEFAULT == null ? columnDataType != null : !COLUMN_DATA_TYPE_EDEFAULT.equals(columnDataType);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__NEW_COLUMN_NAME:
				return NEW_COLUMN_NAME_EDEFAULT == null ? newColumnName != null : !NEW_COLUMN_NAME_EDEFAULT.equals(newColumnName);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__OLD_COLUMN_NAME:
				return OLD_COLUMN_NAME_EDEFAULT == null ? oldColumnName != null : !OLD_COLUMN_NAME_EDEFAULT.equals(oldColumnName);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbchangelogPackage.RENAME_COLUMN_TYPE__ANY_ATTRIBUTE:
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
		result.append(", columnDataType: ");
		result.append(columnDataType);
		result.append(", newColumnName: ");
		result.append(newColumnName);
		result.append(", oldColumnName: ");
		result.append(oldColumnName);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RenameColumnTypeImpl
