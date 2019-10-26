/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getArg <em>Arg</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getExecutable <em>Executable</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getOs <em>Os</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType()
 * @model extendedMetaData="name='executeCommand_._type' kind='elementOnly'"
 * @generated
 */
public interface ExecuteCommandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link org.liquibase.xml.ns.dbchangelog.ArgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType_Arg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArgType> getArg();

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType_Executable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='executable'"
	 * @generated
	 */
	String getExecutable();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.ExecuteCommandType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getExecuteCommandType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ExecuteCommandType
