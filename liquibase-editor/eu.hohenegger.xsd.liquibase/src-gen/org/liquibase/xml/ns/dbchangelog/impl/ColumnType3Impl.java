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

import org.liquibase.xml.ns.dbchangelog.ColumnType3;
import org.liquibase.xml.ns.dbchangelog.ConstraintsType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getComputed <em>Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueComputed <em>Default Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueConstraintName <em>Default Value Constraint Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueNumeric <em>Default Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueSequenceCurrent <em>Default Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDefaultValueSequenceNext <em>Default Value Sequence Next</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getDescending <em>Descending</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getStartWith <em>Start With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueBlobFile <em>Value Blob File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueClobFile <em>Value Clob File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueComputed <em>Value Computed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueNumeric <em>Value Numeric</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueSequenceCurrent <em>Value Sequence Current</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getValueSequenceNext <em>Value Sequence Next</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.ColumnType3Impl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnType3Impl extends MinimalEObjectImpl.Container implements ColumnType3 {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTO_INCREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected Object autoIncrement = AUTO_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputed() <em>Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputed()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMPUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputed() <em>Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputed()
	 * @generated
	 * @ordered
	 */
	protected Object computed = COMPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_VALUE_BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected Object defaultValueBoolean = DEFAULT_VALUE_BOOLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueComputed() <em>Default Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueComputed()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_COMPUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueComputed() <em>Default Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueComputed()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueComputed = DEFAULT_VALUE_COMPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueConstraintName() <em>Default Value Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueConstraintName() <em>Default Value Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueConstraintName = DEFAULT_VALUE_CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueDate = DEFAULT_VALUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueNumeric() <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueNumeric() <em>Default Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueNumeric = DEFAULT_VALUE_NUMERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueSequenceCurrent() <em>Default Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_SEQUENCE_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueSequenceCurrent() <em>Default Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueSequenceCurrent = DEFAULT_VALUE_SEQUENCE_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueSequenceNext() <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueSequenceNext() <em>Default Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueSequenceNext = DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescending() <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescending()
	 * @generated
	 * @ordered
	 */
	protected static final Object DESCENDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescending() <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescending()
	 * @generated
	 * @ordered
	 */
	protected Object descending = DESCENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected static final long INCREMENT_BY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected long incrementBy = INCREMENT_BY_EDEFAULT;

	/**
	 * This is true if the Increment By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean incrementByESet;

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
	 * The default value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected static final long START_WITH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected long startWith = START_WITH_EDEFAULT;

	/**
	 * This is true if the Start With attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startWithESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueBlobFile() <em>Value Blob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBlobFile()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_BLOB_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueBlobFile() <em>Value Blob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBlobFile()
	 * @generated
	 * @ordered
	 */
	protected String valueBlobFile = VALUE_BLOB_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected String valueBoolean = VALUE_BOOLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueClobFile() <em>Value Clob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueClobFile()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_CLOB_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueClobFile() <em>Value Clob File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueClobFile()
	 * @generated
	 * @ordered
	 */
	protected String valueClobFile = VALUE_CLOB_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueComputed() <em>Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComputed()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_COMPUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueComputed() <em>Value Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComputed()
	 * @generated
	 * @ordered
	 */
	protected String valueComputed = VALUE_COMPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDate() <em>Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected String valueDate = VALUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueNumeric() <em>Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueNumeric() <em>Value Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNumeric()
	 * @generated
	 * @ordered
	 */
	protected String valueNumeric = VALUE_NUMERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSequenceCurrent() <em>Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SEQUENCE_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSequenceCurrent() <em>Value Sequence Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceCurrent()
	 * @generated
	 * @ordered
	 */
	protected String valueSequenceCurrent = VALUE_SEQUENCE_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSequenceNext() <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SEQUENCE_NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSequenceNext() <em>Value Sequence Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequenceNext()
	 * @generated
	 * @ordered
	 */
	protected String valueSequenceNext = VALUE_SEQUENCE_NEXT_EDEFAULT;

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
	protected ColumnType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getColumnType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.COLUMN_TYPE3__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return (ConstraintsType)getMixed().get(DbchangelogPackage.eINSTANCE.getColumnType3_Constraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DbchangelogPackage.eINSTANCE.getColumnType3_Constraints(), newConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		((FeatureMap.Internal)getMixed()).set(DbchangelogPackage.eINSTANCE.getColumnType3_Constraints(), newConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DbchangelogPackage.eINSTANCE.getColumnType3_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAutoIncrement() {
		return autoIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoIncrement(Object newAutoIncrement) {
		Object oldAutoIncrement = autoIncrement;
		autoIncrement = newAutoIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__AUTO_INCREMENT, oldAutoIncrement, autoIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComputed() {
		return computed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputed(Object newComputed) {
		Object oldComputed = computed;
		computed = newComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__COMPUTED, oldComputed, computed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultValueBoolean() {
		return defaultValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueBoolean(Object newDefaultValueBoolean) {
		Object oldDefaultValueBoolean = defaultValueBoolean;
		defaultValueBoolean = newDefaultValueBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, defaultValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueComputed() {
		return defaultValueComputed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueComputed(String newDefaultValueComputed) {
		String oldDefaultValueComputed = defaultValueComputed;
		defaultValueComputed = newDefaultValueComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED, oldDefaultValueComputed, defaultValueComputed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueConstraintName() {
		return defaultValueConstraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueConstraintName(String newDefaultValueConstraintName) {
		String oldDefaultValueConstraintName = defaultValueConstraintName;
		defaultValueConstraintName = newDefaultValueConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_CONSTRAINT_NAME, oldDefaultValueConstraintName, defaultValueConstraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueDate() {
		return defaultValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDate(String newDefaultValueDate) {
		String oldDefaultValueDate = defaultValueDate;
		defaultValueDate = newDefaultValueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_DATE, oldDefaultValueDate, defaultValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueNumeric() {
		return defaultValueNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueNumeric(String newDefaultValueNumeric) {
		String oldDefaultValueNumeric = defaultValueNumeric;
		defaultValueNumeric = newDefaultValueNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC, oldDefaultValueNumeric, defaultValueNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueSequenceCurrent() {
		return defaultValueSequenceCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueSequenceCurrent(String newDefaultValueSequenceCurrent) {
		String oldDefaultValueSequenceCurrent = defaultValueSequenceCurrent;
		defaultValueSequenceCurrent = newDefaultValueSequenceCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_CURRENT, oldDefaultValueSequenceCurrent, defaultValueSequenceCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueSequenceNext() {
		return defaultValueSequenceNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueSequenceNext(String newDefaultValueSequenceNext) {
		String oldDefaultValueSequenceNext = defaultValueSequenceNext;
		defaultValueSequenceNext = newDefaultValueSequenceNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_NEXT, oldDefaultValueSequenceNext, defaultValueSequenceNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDescending() {
		return descending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescending(Object newDescending) {
		Object oldDescending = descending;
		descending = newDescending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__DESCENDING, oldDescending, descending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(long newIncrementBy) {
		long oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		boolean oldIncrementByESet = incrementByESet;
		incrementByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY, oldIncrementBy, incrementBy, !oldIncrementByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncrementBy() {
		long oldIncrementBy = incrementBy;
		boolean oldIncrementByESet = incrementByESet;
		incrementBy = INCREMENT_BY_EDEFAULT;
		incrementByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY, oldIncrementBy, INCREMENT_BY_EDEFAULT, oldIncrementByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncrementBy() {
		return incrementByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartWith() {
		return startWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartWith(long newStartWith) {
		long oldStartWith = startWith;
		startWith = newStartWith;
		boolean oldStartWithESet = startWithESet;
		startWithESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__START_WITH, oldStartWith, startWith, !oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartWith() {
		long oldStartWith = startWith;
		boolean oldStartWithESet = startWithESet;
		startWith = START_WITH_EDEFAULT;
		startWithESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.COLUMN_TYPE3__START_WITH, oldStartWith, START_WITH_EDEFAULT, oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartWith() {
		return startWithESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueBlobFile() {
		return valueBlobFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBlobFile(String newValueBlobFile) {
		String oldValueBlobFile = valueBlobFile;
		valueBlobFile = newValueBlobFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_BLOB_FILE, oldValueBlobFile, valueBlobFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBoolean(String newValueBoolean) {
		String oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_BOOLEAN, oldValueBoolean, valueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueClobFile() {
		return valueClobFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueClobFile(String newValueClobFile) {
		String oldValueClobFile = valueClobFile;
		valueClobFile = newValueClobFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_CLOB_FILE, oldValueClobFile, valueClobFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueComputed() {
		return valueComputed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComputed(String newValueComputed) {
		String oldValueComputed = valueComputed;
		valueComputed = newValueComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_COMPUTED, oldValueComputed, valueComputed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDate(String newValueDate) {
		String oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_DATE, oldValueDate, valueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueNumeric() {
		return valueNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueNumeric(String newValueNumeric) {
		String oldValueNumeric = valueNumeric;
		valueNumeric = newValueNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_NUMERIC, oldValueNumeric, valueNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSequenceCurrent() {
		return valueSequenceCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSequenceCurrent(String newValueSequenceCurrent) {
		String oldValueSequenceCurrent = valueSequenceCurrent;
		valueSequenceCurrent = newValueSequenceCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_CURRENT, oldValueSequenceCurrent, valueSequenceCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSequenceNext() {
		return valueSequenceNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSequenceNext(String newValueSequenceNext) {
		String oldValueSequenceNext = valueSequenceNext;
		valueSequenceNext = newValueSequenceNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_NEXT, oldValueSequenceNext, valueSequenceNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.COLUMN_TYPE3__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.COLUMN_TYPE3__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case DbchangelogPackage.COLUMN_TYPE3__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.COLUMN_TYPE3__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.COLUMN_TYPE3__CONSTRAINTS:
				return getConstraints();
			case DbchangelogPackage.COLUMN_TYPE3__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case DbchangelogPackage.COLUMN_TYPE3__AUTO_INCREMENT:
				return getAutoIncrement();
			case DbchangelogPackage.COLUMN_TYPE3__COMPUTED:
				return getComputed();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE:
				return getDefaultValue();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED:
				return getDefaultValueComputed();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_CONSTRAINT_NAME:
				return getDefaultValueConstraintName();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC:
				return getDefaultValueNumeric();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_CURRENT:
				return getDefaultValueSequenceCurrent();
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_NEXT:
				return getDefaultValueSequenceNext();
			case DbchangelogPackage.COLUMN_TYPE3__DESCENDING:
				return getDescending();
			case DbchangelogPackage.COLUMN_TYPE3__ENCODING:
				return getEncoding();
			case DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY:
				return getIncrementBy();
			case DbchangelogPackage.COLUMN_TYPE3__NAME:
				return getName();
			case DbchangelogPackage.COLUMN_TYPE3__REMARKS:
				return getRemarks();
			case DbchangelogPackage.COLUMN_TYPE3__START_WITH:
				return getStartWith();
			case DbchangelogPackage.COLUMN_TYPE3__TYPE:
				return getType();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE:
				return getValue();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BLOB_FILE:
				return getValueBlobFile();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BOOLEAN:
				return getValueBoolean();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_CLOB_FILE:
				return getValueClobFile();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_COMPUTED:
				return getValueComputed();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_DATE:
				return getValueDate();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_NUMERIC:
				return getValueNumeric();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_CURRENT:
				return getValueSequenceCurrent();
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_NEXT:
				return getValueSequenceNext();
			case DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.COLUMN_TYPE3__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__AUTO_INCREMENT:
				setAutoIncrement(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__COMPUTED:
				setComputed(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_CONSTRAINT_NAME:
				setDefaultValueConstraintName((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_DATE:
				setDefaultValueDate((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_CURRENT:
				setDefaultValueSequenceCurrent((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_NEXT:
				setDefaultValueSequenceNext((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DESCENDING:
				setDescending(newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ENCODING:
				setEncoding((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY:
				setIncrementBy((Long)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__NAME:
				setName((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__REMARKS:
				setRemarks((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__START_WITH:
				setStartWith((Long)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__TYPE:
				setType((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE:
				setValue((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BLOB_FILE:
				setValueBlobFile((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BOOLEAN:
				setValueBoolean((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_CLOB_FILE:
				setValueClobFile((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_COMPUTED:
				setValueComputed((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_DATE:
				setValueDate((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_NUMERIC:
				setValueNumeric((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_CURRENT:
				setValueSequenceCurrent((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_NEXT:
				setValueSequenceNext((String)newValue);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.COLUMN_TYPE3__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.COLUMN_TYPE3__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ANY:
				getAny().clear();
				return;
			case DbchangelogPackage.COLUMN_TYPE3__AUTO_INCREMENT:
				setAutoIncrement(AUTO_INCREMENT_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__COMPUTED:
				setComputed(COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean(DEFAULT_VALUE_BOOLEAN_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED:
				setDefaultValueComputed(DEFAULT_VALUE_COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_CONSTRAINT_NAME:
				setDefaultValueConstraintName(DEFAULT_VALUE_CONSTRAINT_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_DATE:
				setDefaultValueDate(DEFAULT_VALUE_DATE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC:
				setDefaultValueNumeric(DEFAULT_VALUE_NUMERIC_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_CURRENT:
				setDefaultValueSequenceCurrent(DEFAULT_VALUE_SEQUENCE_CURRENT_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_NEXT:
				setDefaultValueSequenceNext(DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__DESCENDING:
				setDescending(DESCENDING_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY:
				unsetIncrementBy();
				return;
			case DbchangelogPackage.COLUMN_TYPE3__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__START_WITH:
				unsetStartWith();
				return;
			case DbchangelogPackage.COLUMN_TYPE3__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BLOB_FILE:
				setValueBlobFile(VALUE_BLOB_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BOOLEAN:
				setValueBoolean(VALUE_BOOLEAN_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_CLOB_FILE:
				setValueClobFile(VALUE_CLOB_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_COMPUTED:
				setValueComputed(VALUE_COMPUTED_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_DATE:
				setValueDate(VALUE_DATE_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_NUMERIC:
				setValueNumeric(VALUE_NUMERIC_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_CURRENT:
				setValueSequenceCurrent(VALUE_SEQUENCE_CURRENT_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_NEXT:
				setValueSequenceNext(VALUE_SEQUENCE_NEXT_EDEFAULT);
				return;
			case DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.COLUMN_TYPE3__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.COLUMN_TYPE3__CONSTRAINTS:
				return getConstraints() != null;
			case DbchangelogPackage.COLUMN_TYPE3__ANY:
				return !getAny().isEmpty();
			case DbchangelogPackage.COLUMN_TYPE3__AUTO_INCREMENT:
				return AUTO_INCREMENT_EDEFAULT == null ? autoIncrement != null : !AUTO_INCREMENT_EDEFAULT.equals(autoIncrement);
			case DbchangelogPackage.COLUMN_TYPE3__COMPUTED:
				return COMPUTED_EDEFAULT == null ? computed != null : !COMPUTED_EDEFAULT.equals(computed);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_BOOLEAN:
				return DEFAULT_VALUE_BOOLEAN_EDEFAULT == null ? defaultValueBoolean != null : !DEFAULT_VALUE_BOOLEAN_EDEFAULT.equals(defaultValueBoolean);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_COMPUTED:
				return DEFAULT_VALUE_COMPUTED_EDEFAULT == null ? defaultValueComputed != null : !DEFAULT_VALUE_COMPUTED_EDEFAULT.equals(defaultValueComputed);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_CONSTRAINT_NAME:
				return DEFAULT_VALUE_CONSTRAINT_NAME_EDEFAULT == null ? defaultValueConstraintName != null : !DEFAULT_VALUE_CONSTRAINT_NAME_EDEFAULT.equals(defaultValueConstraintName);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_DATE:
				return DEFAULT_VALUE_DATE_EDEFAULT == null ? defaultValueDate != null : !DEFAULT_VALUE_DATE_EDEFAULT.equals(defaultValueDate);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_NUMERIC:
				return DEFAULT_VALUE_NUMERIC_EDEFAULT == null ? defaultValueNumeric != null : !DEFAULT_VALUE_NUMERIC_EDEFAULT.equals(defaultValueNumeric);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_CURRENT:
				return DEFAULT_VALUE_SEQUENCE_CURRENT_EDEFAULT == null ? defaultValueSequenceCurrent != null : !DEFAULT_VALUE_SEQUENCE_CURRENT_EDEFAULT.equals(defaultValueSequenceCurrent);
			case DbchangelogPackage.COLUMN_TYPE3__DEFAULT_VALUE_SEQUENCE_NEXT:
				return DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT == null ? defaultValueSequenceNext != null : !DEFAULT_VALUE_SEQUENCE_NEXT_EDEFAULT.equals(defaultValueSequenceNext);
			case DbchangelogPackage.COLUMN_TYPE3__DESCENDING:
				return DESCENDING_EDEFAULT == null ? descending != null : !DESCENDING_EDEFAULT.equals(descending);
			case DbchangelogPackage.COLUMN_TYPE3__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case DbchangelogPackage.COLUMN_TYPE3__INCREMENT_BY:
				return isSetIncrementBy();
			case DbchangelogPackage.COLUMN_TYPE3__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbchangelogPackage.COLUMN_TYPE3__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case DbchangelogPackage.COLUMN_TYPE3__START_WITH:
				return isSetStartWith();
			case DbchangelogPackage.COLUMN_TYPE3__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BLOB_FILE:
				return VALUE_BLOB_FILE_EDEFAULT == null ? valueBlobFile != null : !VALUE_BLOB_FILE_EDEFAULT.equals(valueBlobFile);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_BOOLEAN:
				return VALUE_BOOLEAN_EDEFAULT == null ? valueBoolean != null : !VALUE_BOOLEAN_EDEFAULT.equals(valueBoolean);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_CLOB_FILE:
				return VALUE_CLOB_FILE_EDEFAULT == null ? valueClobFile != null : !VALUE_CLOB_FILE_EDEFAULT.equals(valueClobFile);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_COMPUTED:
				return VALUE_COMPUTED_EDEFAULT == null ? valueComputed != null : !VALUE_COMPUTED_EDEFAULT.equals(valueComputed);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_DATE:
				return VALUE_DATE_EDEFAULT == null ? valueDate != null : !VALUE_DATE_EDEFAULT.equals(valueDate);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_NUMERIC:
				return VALUE_NUMERIC_EDEFAULT == null ? valueNumeric != null : !VALUE_NUMERIC_EDEFAULT.equals(valueNumeric);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_CURRENT:
				return VALUE_SEQUENCE_CURRENT_EDEFAULT == null ? valueSequenceCurrent != null : !VALUE_SEQUENCE_CURRENT_EDEFAULT.equals(valueSequenceCurrent);
			case DbchangelogPackage.COLUMN_TYPE3__VALUE_SEQUENCE_NEXT:
				return VALUE_SEQUENCE_NEXT_EDEFAULT == null ? valueSequenceNext != null : !VALUE_SEQUENCE_NEXT_EDEFAULT.equals(valueSequenceNext);
			case DbchangelogPackage.COLUMN_TYPE3__ANY_ATTRIBUTE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", autoIncrement: ");
		result.append(autoIncrement);
		result.append(", computed: ");
		result.append(computed);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", defaultValueBoolean: ");
		result.append(defaultValueBoolean);
		result.append(", defaultValueComputed: ");
		result.append(defaultValueComputed);
		result.append(", defaultValueConstraintName: ");
		result.append(defaultValueConstraintName);
		result.append(", defaultValueDate: ");
		result.append(defaultValueDate);
		result.append(", defaultValueNumeric: ");
		result.append(defaultValueNumeric);
		result.append(", defaultValueSequenceCurrent: ");
		result.append(defaultValueSequenceCurrent);
		result.append(", defaultValueSequenceNext: ");
		result.append(defaultValueSequenceNext);
		result.append(", descending: ");
		result.append(descending);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", incrementBy: ");
		if (incrementByESet) result.append(incrementBy); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", startWith: ");
		if (startWithESet) result.append(startWith); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", valueBlobFile: ");
		result.append(valueBlobFile);
		result.append(", valueBoolean: ");
		result.append(valueBoolean);
		result.append(", valueClobFile: ");
		result.append(valueClobFile);
		result.append(", valueComputed: ");
		result.append(valueComputed);
		result.append(", valueDate: ");
		result.append(valueDate);
		result.append(", valueNumeric: ");
		result.append(valueNumeric);
		result.append(", valueSequenceCurrent: ");
		result.append(valueSequenceCurrent);
		result.append(", valueSequenceNext: ");
		result.append(valueSequenceNext);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ColumnType3Impl
