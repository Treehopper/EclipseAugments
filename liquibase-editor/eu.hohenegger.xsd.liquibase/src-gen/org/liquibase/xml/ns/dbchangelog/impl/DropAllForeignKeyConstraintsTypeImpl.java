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
import org.liquibase.xml.ns.dbchangelog.DropAllForeignKeyConstraintsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop All Foreign Key Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl#getBaseTableCatalogName <em>Base Table Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl#getBaseTableName <em>Base Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl#getBaseTableSchemaName <em>Base Table Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.DropAllForeignKeyConstraintsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropAllForeignKeyConstraintsTypeImpl extends MinimalEObjectImpl.Container implements DropAllForeignKeyConstraintsType {
	/**
	 * The default value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_CATALOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableCatalogName() <em>Base Table Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableCatalogName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableCatalogName = BASE_TABLE_CATALOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableName() <em>Base Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableName = BASE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TABLE_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTableSchemaName() <em>Base Table Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTableSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String baseTableSchemaName = BASE_TABLE_SCHEMA_NAME_EDEFAULT;

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
	protected DropAllForeignKeyConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getDropAllForeignKeyConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableCatalogName() {
		return baseTableCatalogName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableCatalogName(String newBaseTableCatalogName) {
		String oldBaseTableCatalogName = baseTableCatalogName;
		baseTableCatalogName = newBaseTableCatalogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME, oldBaseTableCatalogName, baseTableCatalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableName() {
		return baseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableName(String newBaseTableName) {
		String oldBaseTableName = baseTableName;
		baseTableName = newBaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME, oldBaseTableName, baseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTableSchemaName() {
		return baseTableSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTableSchemaName(String newBaseTableSchemaName) {
		String oldBaseTableSchemaName = baseTableSchemaName;
		baseTableSchemaName = newBaseTableSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME, oldBaseTableSchemaName, baseTableSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME:
				return getBaseTableCatalogName();
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME:
				return getBaseTableName();
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME:
				return getBaseTableSchemaName();
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName((String)newValue);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME:
				setBaseTableName((String)newValue);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName((String)newValue);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME:
				setBaseTableCatalogName(BASE_TABLE_CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME:
				setBaseTableName(BASE_TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME:
				setBaseTableSchemaName(BASE_TABLE_SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_CATALOG_NAME:
				return BASE_TABLE_CATALOG_NAME_EDEFAULT == null ? baseTableCatalogName != null : !BASE_TABLE_CATALOG_NAME_EDEFAULT.equals(baseTableCatalogName);
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_NAME:
				return BASE_TABLE_NAME_EDEFAULT == null ? baseTableName != null : !BASE_TABLE_NAME_EDEFAULT.equals(baseTableName);
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__BASE_TABLE_SCHEMA_NAME:
				return BASE_TABLE_SCHEMA_NAME_EDEFAULT == null ? baseTableSchemaName != null : !BASE_TABLE_SCHEMA_NAME_EDEFAULT.equals(baseTableSchemaName);
			case DbchangelogPackage.DROP_ALL_FOREIGN_KEY_CONSTRAINTS_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (baseTableCatalogName: ");
		result.append(baseTableCatalogName);
		result.append(", baseTableName: ");
		result.append(baseTableName);
		result.append(", baseTableSchemaName: ");
		result.append(baseTableSchemaName);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DropAllForeignKeyConstraintsTypeImpl
