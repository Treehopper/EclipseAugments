/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getAnd <em>And</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getOr <em>Or</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getNot <em>Not</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getDbms <em>Dbms</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getRunningAs <em>Running As</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getChangeSetExecuted <em>Change Set Executed</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getTableExists <em>Table Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getColumnExists <em>Column Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getSequenceExists <em>Sequence Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getForeignKeyConstraintExists <em>Foreign Key Constraint Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getIndexExists <em>Index Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getPrimaryKeyExists <em>Primary Key Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getViewExists <em>View Exists</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getTableIsEmpty <em>Table Is Empty</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getSqlCheck <em>Sql Check</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getChangeLogPropertyDefined <em>Change Log Property Defined</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getExpectedQuotingStrategy <em>Expected Quoting Strategy</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getCustomPrecondition <em>Custom Precondition</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.OrType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType()
 * @model extendedMetaData="name='or_._type' kind='elementOnly'"
 * @generated
 */
public interface OrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.AndType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_And()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AndType> getAnd();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.OrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_Or()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OrType> getOr();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.NotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_Not()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='not' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NotType> getNot();

	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.DbmsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_Dbms()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dbms' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DbmsType> getDbms();

	/**
	 * Returns the value of the '<em><b>Running As</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RunningAsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running As</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_RunningAs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runningAs' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RunningAsType> getRunningAs();

	/**
	 * Returns the value of the '<em><b>Change Set Executed</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ChangeSetExecutedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set Executed</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ChangeSetExecuted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeSetExecuted' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ChangeSetExecutedType> getChangeSetExecuted();

	/**
	 * Returns the value of the '<em><b>Table Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.TableExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_TableExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TableExistsType> getTableExists();

	/**
	 * Returns the value of the '<em><b>Column Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ColumnExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ColumnExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='columnExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ColumnExistsType> getColumnExists();

	/**
	 * Returns the value of the '<em><b>Sequence Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SequenceExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_SequenceExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequenceExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SequenceExistsType> getSequenceExists();

	/**
	 * Returns the value of the '<em><b>Foreign Key Constraint Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ForeignKeyConstraintExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Constraint Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ForeignKeyConstraintExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignKeyConstraintExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ForeignKeyConstraintExistsType> getForeignKeyConstraintExists();

	/**
	 * Returns the value of the '<em><b>Index Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.IndexExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_IndexExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indexExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexExistsType> getIndexExists();

	/**
	 * Returns the value of the '<em><b>Primary Key Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.PrimaryKeyExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_PrimaryKeyExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryKeyExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PrimaryKeyExistsType> getPrimaryKeyExists();

	/**
	 * Returns the value of the '<em><b>View Exists</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ViewExistsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Exists</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ViewExists()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewExists' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ViewExistsType> getViewExists();

	/**
	 * Returns the value of the '<em><b>Table Is Empty</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.TableIsEmptyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Is Empty</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_TableIsEmpty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableIsEmpty' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TableIsEmptyType> getTableIsEmpty();

	/**
	 * Returns the value of the '<em><b>Row Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.RowCountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Count</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_RowCount()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rowCount' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RowCountType> getRowCount();

	/**
	 * Returns the value of the '<em><b>Sql Check</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.SqlCheckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Check</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_SqlCheck()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sqlCheck' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SqlCheckType> getSqlCheck();

	/**
	 * Returns the value of the '<em><b>Change Log Property Defined</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ChangeLogPropertyDefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Property Defined</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ChangeLogPropertyDefined()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeLogPropertyDefined' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ChangeLogPropertyDefinedType> getChangeLogPropertyDefined();

	/**
	 * Returns the value of the '<em><b>Expected Quoting Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ExpectedQuotingStrategyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Quoting Strategy</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_ExpectedQuotingStrategy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expectedQuotingStrategy' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExpectedQuotingStrategyType> getExpectedQuotingStrategy();

	/**
	 * Returns the value of the '<em><b>Custom Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.CustomPreconditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Precondition</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_CustomPrecondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customPrecondition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomPreconditionType> getCustomPrecondition();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getOrType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':20' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // OrType
