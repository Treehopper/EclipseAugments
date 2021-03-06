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

import org.liquibase.xml.ns.dbchangelog.CreateSequenceType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getSequenceName <em>Sequence Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.CreateSequenceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSequenceTypeImpl extends MinimalEObjectImpl.Container implements CreateSequenceType {
	/**
	 * The default value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected String cacheSize = CACHE_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected static final Object CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected Object cycle = CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected static final String INCREMENT_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected String incrementBy = INCREMENT_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected String maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected String minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Object ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected Object ordered = ORDERED_EDEFAULT;

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
	 * The default value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected String sequenceName = SEQUENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final String START_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected String startValue = START_VALUE_EDEFAULT;

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
	protected CreateSequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getCreateSequenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheSize() {
		return cacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheSize(String newCacheSize) {
		String oldCacheSize = cacheSize;
		cacheSize = newCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__CACHE_SIZE, oldCacheSize, cacheSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycle(Object newCycle) {
		Object oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__CYCLE, oldCycle, cycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(String newIncrementBy) {
		String oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__INCREMENT_BY, oldIncrementBy, incrementBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(String newMaxValue) {
		String oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(String newMinValue) {
		String oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(Object newOrdered) {
		Object oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__ORDERED, oldOrdered, ordered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequenceName() {
		return sequenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceName(String newSequenceName) {
		String oldSequenceName = sequenceName;
		sequenceName = newSequenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__SEQUENCE_NAME, oldSequenceName, sequenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(String newStartValue) {
		String oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.CREATE_SEQUENCE_TYPE__START_VALUE, oldStartValue, startValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CACHE_SIZE:
				return getCacheSize();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CYCLE:
				return getCycle();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__INCREMENT_BY:
				return getIncrementBy();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MAX_VALUE:
				return getMaxValue();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MIN_VALUE:
				return getMinValue();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ORDERED:
				return getOrdered();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SEQUENCE_NAME:
				return getSequenceName();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__START_VALUE:
				return getStartValue();
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CACHE_SIZE:
				setCacheSize((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CYCLE:
				setCycle(newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__INCREMENT_BY:
				setIncrementBy((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MAX_VALUE:
				setMaxValue((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MIN_VALUE:
				setMinValue((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ORDERED:
				setOrdered(newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SEQUENCE_NAME:
				setSequenceName((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__START_VALUE:
				setStartValue((String)newValue);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CACHE_SIZE:
				setCacheSize(CACHE_SIZE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CYCLE:
				setCycle(CYCLE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__INCREMENT_BY:
				setIncrementBy(INCREMENT_BY_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SEQUENCE_NAME:
				setSequenceName(SEQUENCE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__START_VALUE:
				setStartValue(START_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CACHE_SIZE:
				return CACHE_SIZE_EDEFAULT == null ? cacheSize != null : !CACHE_SIZE_EDEFAULT.equals(cacheSize);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__CYCLE:
				return CYCLE_EDEFAULT == null ? cycle != null : !CYCLE_EDEFAULT.equals(cycle);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__INCREMENT_BY:
				return INCREMENT_BY_EDEFAULT == null ? incrementBy != null : !INCREMENT_BY_EDEFAULT.equals(incrementBy);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? maxValue != null : !MAX_VALUE_EDEFAULT.equals(maxValue);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? minValue != null : !MIN_VALUE_EDEFAULT.equals(minValue);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ORDERED:
				return ORDERED_EDEFAULT == null ? ordered != null : !ORDERED_EDEFAULT.equals(ordered);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__SEQUENCE_NAME:
				return SEQUENCE_NAME_EDEFAULT == null ? sequenceName != null : !SEQUENCE_NAME_EDEFAULT.equals(sequenceName);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__START_VALUE:
				return START_VALUE_EDEFAULT == null ? startValue != null : !START_VALUE_EDEFAULT.equals(startValue);
			case DbchangelogPackage.CREATE_SEQUENCE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (cacheSize: ");
		result.append(cacheSize);
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", cycle: ");
		result.append(cycle);
		result.append(", incrementBy: ");
		result.append(incrementBy);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", sequenceName: ");
		result.append(sequenceName);
		result.append(", startValue: ");
		result.append(startValue);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CreateSequenceTypeImpl
