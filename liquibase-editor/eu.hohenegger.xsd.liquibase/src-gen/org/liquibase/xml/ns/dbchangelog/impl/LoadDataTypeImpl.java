/**
 */
package org.liquibase.xml.ns.dbchangelog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.liquibase.xml.ns.dbchangelog.ColumnType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.LoadDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getCommentLineStartsWith <em>Comment Line Starts With</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getQuotchar <em>Quotchar</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getRelativeToChangelogFile <em>Relative To Changelog File</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getUsePreparedStatements <em>Use Prepared Statements</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.impl.LoadDataTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadDataTypeImpl extends MinimalEObjectImpl.Container implements LoadDataType {
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
	 * The default value of the '{@link #getCommentLineStartsWith() <em>Comment Line Starts With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentLineStartsWith()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_LINE_STARTS_WITH_EDEFAULT = "#";

	/**
	 * The cached value of the '{@link #getCommentLineStartsWith() <em>Comment Line Starts With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentLineStartsWith()
	 * @generated
	 * @ordered
	 */
	protected String commentLineStartsWith = COMMENT_LINE_STARTS_WITH_EDEFAULT;

	/**
	 * This is true if the Comment Line Starts With attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commentLineStartsWithESet;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = "UTF-8";

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
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotchar() <em>Quotchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotchar()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTCHAR_EDEFAULT = "\"";

	/**
	 * The cached value of the '{@link #getQuotchar() <em>Quotchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotchar()
	 * @generated
	 * @ordered
	 */
	protected String quotchar = QUOTCHAR_EDEFAULT;

	/**
	 * This is true if the Quotchar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quotcharESet;

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
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = ",";

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean separatorESet;

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
	 * The default value of the '{@link #getUsePreparedStatements() <em>Use Prepared Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePreparedStatements()
	 * @generated
	 * @ordered
	 */
	protected static final Object USE_PREPARED_STATEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsePreparedStatements() <em>Use Prepared Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePreparedStatements()
	 * @generated
	 * @ordered
	 */
	protected Object usePreparedStatements = USE_PREPARED_STATEMENTS_EDEFAULT;

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
	protected LoadDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbchangelogPackage.eINSTANCE.getLoadDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DbchangelogPackage.LOAD_DATA_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnType> getColumn() {
		return getMixed().list(DbchangelogPackage.eINSTANCE.getLoadDataType_Column());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME, oldCatalogName, catalogName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentLineStartsWith() {
		return commentLineStartsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentLineStartsWith(String newCommentLineStartsWith) {
		String oldCommentLineStartsWith = commentLineStartsWith;
		commentLineStartsWith = newCommentLineStartsWith;
		boolean oldCommentLineStartsWithESet = commentLineStartsWithESet;
		commentLineStartsWithESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH, oldCommentLineStartsWith, commentLineStartsWith, !oldCommentLineStartsWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommentLineStartsWith() {
		String oldCommentLineStartsWith = commentLineStartsWith;
		boolean oldCommentLineStartsWithESet = commentLineStartsWithESet;
		commentLineStartsWith = COMMENT_LINE_STARTS_WITH_EDEFAULT;
		commentLineStartsWithESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH, oldCommentLineStartsWith, COMMENT_LINE_STARTS_WITH_EDEFAULT, oldCommentLineStartsWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommentLineStartsWith() {
		return commentLineStartsWithESet;
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
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		String oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.LOAD_DATA_TYPE__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuotchar() {
		return quotchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuotchar(String newQuotchar) {
		String oldQuotchar = quotchar;
		quotchar = newQuotchar;
		boolean oldQuotcharESet = quotcharESet;
		quotcharESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR, oldQuotchar, quotchar, !oldQuotcharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuotchar() {
		String oldQuotchar = quotchar;
		boolean oldQuotcharESet = quotcharESet;
		quotchar = QUOTCHAR_EDEFAULT;
		quotcharESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR, oldQuotchar, QUOTCHAR_EDEFAULT, oldQuotcharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuotchar() {
		return quotcharESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE, oldRelativeToChangelogFile, relativeToChangelogFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME, oldSchemaName, schemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		boolean oldSeparatorESet = separatorESet;
		separatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR, oldSeparator, separator, !oldSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeparator() {
		String oldSeparator = separator;
		boolean oldSeparatorESet = separatorESet;
		separator = SEPARATOR_EDEFAULT;
		separatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR, oldSeparator, SEPARATOR_EDEFAULT, oldSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeparator() {
		return separatorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUsePreparedStatements() {
		return usePreparedStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsePreparedStatements(Object newUsePreparedStatements) {
		Object oldUsePreparedStatements = usePreparedStatements;
		usePreparedStatements = newUsePreparedStatements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS, oldUsePreparedStatements, usePreparedStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE);
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
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.LOAD_DATA_TYPE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DbchangelogPackage.LOAD_DATA_TYPE__COLUMN:
				return getColumn();
			case DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME:
				return getCatalogName();
			case DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH:
				return getCommentLineStartsWith();
			case DbchangelogPackage.LOAD_DATA_TYPE__ENCODING:
				return getEncoding();
			case DbchangelogPackage.LOAD_DATA_TYPE__FILE:
				return getFile();
			case DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR:
				return getQuotchar();
			case DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return getRelativeToChangelogFile();
			case DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME:
				return getSchemaName();
			case DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR:
				return getSeparator();
			case DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME:
				return getTableName();
			case DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS:
				return getUsePreparedStatements();
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends ColumnType>)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME:
				setCatalogName((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH:
				setCommentLineStartsWith((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__FILE:
				setFile((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR:
				setQuotchar((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR:
				setSeparator((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS:
				setUsePreparedStatements(newValue);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
				getMixed().clear();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__COLUMN:
				getColumn().clear();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME:
				setCatalogName(CATALOG_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH:
				unsetCommentLineStartsWith();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__ENCODING:
				unsetEncoding();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR:
				unsetQuotchar();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				setRelativeToChangelogFile(RELATIVE_TO_CHANGELOG_FILE_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR:
				unsetSeparator();
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS:
				setUsePreparedStatements(USE_PREPARED_STATEMENTS_EDEFAULT);
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DbchangelogPackage.LOAD_DATA_TYPE__COLUMN:
				return !getColumn().isEmpty();
			case DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME:
				return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
			case DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH:
				return isSetCommentLineStartsWith();
			case DbchangelogPackage.LOAD_DATA_TYPE__ENCODING:
				return isSetEncoding();
			case DbchangelogPackage.LOAD_DATA_TYPE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR:
				return isSetQuotchar();
			case DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE:
				return RELATIVE_TO_CHANGELOG_FILE_EDEFAULT == null ? relativeToChangelogFile != null : !RELATIVE_TO_CHANGELOG_FILE_EDEFAULT.equals(relativeToChangelogFile);
			case DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
			case DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR:
				return isSetSeparator();
			case DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS:
				return USE_PREPARED_STATEMENTS_EDEFAULT == null ? usePreparedStatements != null : !USE_PREPARED_STATEMENTS_EDEFAULT.equals(usePreparedStatements);
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
		result.append(", catalogName: ");
		result.append(catalogName);
		result.append(", commentLineStartsWith: ");
		if (commentLineStartsWithESet) result.append(commentLineStartsWith); else result.append("<unset>");
		result.append(", encoding: ");
		if (encodingESet) result.append(encoding); else result.append("<unset>");
		result.append(", file: ");
		result.append(file);
		result.append(", quotchar: ");
		if (quotcharESet) result.append(quotchar); else result.append("<unset>");
		result.append(", relativeToChangelogFile: ");
		result.append(relativeToChangelogFile);
		result.append(", schemaName: ");
		result.append(schemaName);
		result.append(", separator: ");
		if (separatorESet) result.append(separator); else result.append("<unset>");
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", usePreparedStatements: ");
		result.append(usePreparedStatements);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //LoadDataTypeImpl
