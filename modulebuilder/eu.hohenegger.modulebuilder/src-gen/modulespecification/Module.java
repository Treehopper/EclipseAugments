/**
 */
package modulespecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.Module#getBaseId <em>Base Id</em>}</li>
 *   <li>{@link modulespecification.Module#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.Module#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.Module#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.Module#getLicenseUrl <em>License Url</em>}</li>
 *   <li>{@link modulespecification.Module#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.Module#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.Module#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.Module#getCopyRightYear <em>Copy Right Year</em>}</li>
 *   <li>{@link modulespecification.Module#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link modulespecification.Module#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link modulespecification.Module#getTychoVersion <em>Tycho Version</em>}</li>
 *   <li>{@link modulespecification.Module#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link modulespecification.Module#getBaseLocation <em>Base Location</em>}</li>
 *   <li>{@link modulespecification.Module#getCoreSuffix <em>Core Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#getUiSuffix <em>Ui Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateParent <em>Generate Parent</em>}</li>
 *   <li>{@link modulespecification.Module#getTychoParentName <em>Tycho Parent Name</em>}</li>
 *   <li>{@link modulespecification.Module#getMavenGroupId <em>Maven Group Id</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateTests <em>Generate Tests</em>}</li>
 *   <li>{@link modulespecification.Module#getTestsSuffix <em>Tests Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateFeature <em>Generate Feature</em>}</li>
 *   <li>{@link modulespecification.Module#getFeatureSuffix <em>Feature Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateUpdatesite <em>Generate Updatesite</em>}</li>
 *   <li>{@link modulespecification.Module#getUpdateSiteSuffix <em>Update Site Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#getUpdateSiteUrl <em>Update Site Url</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateTarget <em>Generate Target</em>}</li>
 *   <li>{@link modulespecification.Module#getTargetSuffix <em>Target Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#isGenerateUiFragment <em>Generate Ui Fragment</em>}</li>
 *   <li>{@link modulespecification.Module#getUie3Suffix <em>Uie3 Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#getMavenVersionSuffix <em>Maven Version Suffix</em>}</li>
 *   <li>{@link modulespecification.Module#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}</li>
 *   <li>{@link modulespecification.Module#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link modulespecification.Module#getUiId <em>Ui Id</em>}</li>
 *   <li>{@link modulespecification.Module#getUie3Id <em>Uie3 Id</em>}</li>
 *   <li>{@link modulespecification.Module#getTestsId <em>Tests Id</em>}</li>
 *   <li>{@link modulespecification.Module#getUpdateSiteId <em>Update Site Id</em>}</li>
 *   <li>{@link modulespecification.Module#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link modulespecification.Module#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link modulespecification.Module#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.Module#getOsgiVersion <em>Osgi Version</em>}</li>
 *   <li>{@link modulespecification.Module#getCoreModuleName <em>Core Module Name</em>}</li>
 *   <li>{@link modulespecification.Module#getUiModuleName <em>Ui Module Name</em>}</li>
 *   <li>{@link modulespecification.Module#isIsLicenseEmpty <em>Is License Empty</em>}</li>
 *   <li>{@link modulespecification.Module#isIsLicenseUrlEmpty <em>Is License Url Empty</em>}</li>
 *   <li>{@link modulespecification.Module#isIsUpdateSiteUrlEmpty <em>Is Update Site Url Empty</em>}</li>
 *   <li>{@link modulespecification.Module#isIsAuthorEmailEmpty <em>Is Author Email Empty</em>}</li>
 * </ul>
 *
 * @see modulespecification.ModulespecificationPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Id</em>' attribute.
	 * @see #setBaseId(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_BaseId()
	 * @model unique="false" dataType="modulespecification.OSGiName"
	 * @generated
	 */
	String getBaseId();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getBaseId <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Id</em>' attribute.
	 * @see #getBaseId()
	 * @generated
	 */
	void setBaseId(String value);

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_ModuleName()
	 * @model unique="false" dataType="modulespecification.MandatoryString"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_CategoryName()
	 * @model unique="false" dataType="modulespecification.MandatoryString"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_License()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>License Url</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Url</em>' attribute.
	 * @see #setLicenseUrl(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_LicenseUrl()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getLicenseUrl();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getLicenseUrl <em>License Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Url</em>' attribute.
	 * @see #getLicenseUrl()
	 * @generated
	 */
	void setLicenseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_Version()
	 * @model default="1.0.0" unique="false" dataType="modulespecification.Version"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Author Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Author Name</em>' attribute.
	 * @see #setCopyRightAuthorName(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_CopyRightAuthorName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCopyRightAuthorName();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getCopyRightAuthorName <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Author Name</em>' attribute.
	 * @see #getCopyRightAuthorName()
	 * @generated
	 */
	void setCopyRightAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Url</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Url</em>' attribute.
	 * @see #setCopyRightUrl(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_CopyRightUrl()
	 * @model default="http://www.example.org" unique="false"
	 * @generated
	 */
	String getCopyRightUrl();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getCopyRightUrl <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Url</em>' attribute.
	 * @see #getCopyRightUrl()
	 * @generated
	 */
	void setCopyRightUrl(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Year</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Year</em>' attribute.
	 * @see #setCopyRightYear(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_CopyRightYear()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCopyRightYear();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getCopyRightYear <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Year</em>' attribute.
	 * @see #getCopyRightYear()
	 * @generated
	 */
	void setCopyRightYear(String value);

	/**
	 * Returns the value of the '<em><b>Author Email</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Email</em>' attribute.
	 * @see #setAuthorEmail(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_AuthorEmail()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getAuthorEmail();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getAuthorEmail <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Email</em>' attribute.
	 * @see #getAuthorEmail()
	 * @generated
	 */
	void setAuthorEmail(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_ProviderName()
	 * @model default="http://www.example.org" unique="false"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Tycho Version</b></em>' attribute.
	 * The default value is <code>"0.25.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tycho Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tycho Version</em>' attribute.
	 * @see #setTychoVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_TychoVersion()
	 * @model default="0.25.0" unique="false"
	 * @generated
	 */
	String getTychoVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getTychoVersion <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tycho Version</em>' attribute.
	 * @see #getTychoVersion()
	 * @generated
	 */
	void setTychoVersion(String value);

	/**
	 * Returns the value of the '<em><b>Java Version</b></em>' attribute.
	 * The default value is <code>"JavaSE-1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Version</em>' attribute.
	 * @see #setJavaVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_JavaVersion()
	 * @model default="JavaSE-1.8" unique="false"
	 * @generated
	 */
	String getJavaVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getJavaVersion <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Version</em>' attribute.
	 * @see #getJavaVersion()
	 * @generated
	 */
	void setJavaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Base Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Location</em>' attribute.
	 * @see #setBaseLocation(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_BaseLocation()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBaseLocation();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getBaseLocation <em>Base Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Location</em>' attribute.
	 * @see #getBaseLocation()
	 * @generated
	 */
	void setBaseLocation(String value);

	/**
	 * Returns the value of the '<em><b>Core Suffix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Suffix</em>' attribute.
	 * @see #setCoreSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_CoreSuffix()
	 * @model default="" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getCoreSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getCoreSuffix <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Suffix</em>' attribute.
	 * @see #getCoreSuffix()
	 * @generated
	 */
	void setCoreSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Ui Suffix</b></em>' attribute.
	 * The default value is <code>".ui"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Suffix</em>' attribute.
	 * @see #setUiSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_UiSuffix()
	 * @model default=".ui" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getUiSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getUiSuffix <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Suffix</em>' attribute.
	 * @see #getUiSuffix()
	 * @generated
	 */
	void setUiSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Generate Parent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Parent</em>' attribute.
	 * @see #setGenerateParent(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateParent()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateParent();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateParent <em>Generate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Parent</em>' attribute.
	 * @see #isGenerateParent()
	 * @generated
	 */
	void setGenerateParent(boolean value);

	/**
	 * Returns the value of the '<em><b>Tycho Parent Name</b></em>' attribute.
	 * The default value is <code>"parent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tycho Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tycho Parent Name</em>' attribute.
	 * @see #setTychoParentName(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_TychoParentName()
	 * @model default="parent" unique="false" dataType="modulespecification.OSGiName"
	 * @generated
	 */
	String getTychoParentName();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getTychoParentName <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tycho Parent Name</em>' attribute.
	 * @see #getTychoParentName()
	 * @generated
	 */
	void setTychoParentName(String value);

	/**
	 * Returns the value of the '<em><b>Maven Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Group Id</em>' attribute.
	 * @see #setMavenGroupId(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_MavenGroupId()
	 * @model unique="false" dataType="modulespecification.MandatoryString"
	 * @generated
	 */
	String getMavenGroupId();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getMavenGroupId <em>Maven Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven Group Id</em>' attribute.
	 * @see #getMavenGroupId()
	 * @generated
	 */
	void setMavenGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Generate Tests</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Tests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Tests</em>' attribute.
	 * @see #setGenerateTests(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateTests()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateTests();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateTests <em>Generate Tests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Tests</em>' attribute.
	 * @see #isGenerateTests()
	 * @generated
	 */
	void setGenerateTests(boolean value);

	/**
	 * Returns the value of the '<em><b>Tests Suffix</b></em>' attribute.
	 * The default value is <code>".test"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Suffix</em>' attribute.
	 * @see #setTestsSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_TestsSuffix()
	 * @model default=".test" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getTestsSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getTestsSuffix <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests Suffix</em>' attribute.
	 * @see #getTestsSuffix()
	 * @generated
	 */
	void setTestsSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Generate Feature</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Feature</em>' attribute.
	 * @see #setGenerateFeature(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateFeature()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateFeature();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateFeature <em>Generate Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Feature</em>' attribute.
	 * @see #isGenerateFeature()
	 * @generated
	 */
	void setGenerateFeature(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Suffix</b></em>' attribute.
	 * The default value is <code>".feature"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Suffix</em>' attribute.
	 * @see #setFeatureSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_FeatureSuffix()
	 * @model default=".feature" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getFeatureSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getFeatureSuffix <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Suffix</em>' attribute.
	 * @see #getFeatureSuffix()
	 * @generated
	 */
	void setFeatureSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Generate Updatesite</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Updatesite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Updatesite</em>' attribute.
	 * @see #setGenerateUpdatesite(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateUpdatesite()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateUpdatesite();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateUpdatesite <em>Generate Updatesite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Updatesite</em>' attribute.
	 * @see #isGenerateUpdatesite()
	 * @generated
	 */
	void setGenerateUpdatesite(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Site Suffix</b></em>' attribute.
	 * The default value is <code>".p2updateSite"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Suffix</em>' attribute.
	 * @see #setUpdateSiteSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_UpdateSiteSuffix()
	 * @model default=".p2updateSite" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getUpdateSiteSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getUpdateSiteSuffix <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Site Suffix</em>' attribute.
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 */
	void setUpdateSiteSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Update Site Url</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Url</em>' attribute.
	 * @see #setUpdateSiteUrl(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_UpdateSiteUrl()
	 * @model default="http://www.example.org" unique="false"
	 * @generated
	 */
	String getUpdateSiteUrl();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getUpdateSiteUrl <em>Update Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Site Url</em>' attribute.
	 * @see #getUpdateSiteUrl()
	 * @generated
	 */
	void setUpdateSiteUrl(String value);

	/**
	 * Returns the value of the '<em><b>Generate Target</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Target</em>' attribute.
	 * @see #setGenerateTarget(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateTarget()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateTarget();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateTarget <em>Generate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Target</em>' attribute.
	 * @see #isGenerateTarget()
	 * @generated
	 */
	void setGenerateTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Suffix</b></em>' attribute.
	 * The default value is <code>".releng.targetplatform"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Suffix</em>' attribute.
	 * @see #setTargetSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_TargetSuffix()
	 * @model default=".releng.targetplatform" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getTargetSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getTargetSuffix <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Suffix</em>' attribute.
	 * @see #getTargetSuffix()
	 * @generated
	 */
	void setTargetSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Generate Ui Fragment</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Ui Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Ui Fragment</em>' attribute.
	 * @see #setGenerateUiFragment(boolean)
	 * @see modulespecification.ModulespecificationPackage#getModule_GenerateUiFragment()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateUiFragment();

	/**
	 * Sets the value of the '{@link modulespecification.Module#isGenerateUiFragment <em>Generate Ui Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Ui Fragment</em>' attribute.
	 * @see #isGenerateUiFragment()
	 * @generated
	 */
	void setGenerateUiFragment(boolean value);

	/**
	 * Returns the value of the '<em><b>Uie3 Suffix</b></em>' attribute.
	 * The default value is <code>".e3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uie3 Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uie3 Suffix</em>' attribute.
	 * @see #setUie3Suffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_Uie3Suffix()
	 * @model default=".e3" unique="false" dataType="modulespecification.OSGiSegment"
	 * @generated
	 */
	String getUie3Suffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getUie3Suffix <em>Uie3 Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uie3 Suffix</em>' attribute.
	 * @see #getUie3Suffix()
	 * @generated
	 */
	void setUie3Suffix(String value);

	/**
	 * Returns the value of the '<em><b>Maven Version Suffix</b></em>' attribute.
	 * The default value is <code>"-SNAPSHOT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Version Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Version Suffix</em>' attribute.
	 * @see #setMavenVersionSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_MavenVersionSuffix()
	 * @model default="-SNAPSHOT" unique="false"
	 * @generated
	 */
	String getMavenVersionSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getMavenVersionSuffix <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven Version Suffix</em>' attribute.
	 * @see #getMavenVersionSuffix()
	 * @generated
	 */
	void setMavenVersionSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Osgi Version Qualifier</b></em>' attribute.
	 * The default value is <code>".qualifier"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osgi Version Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osgi Version Qualifier</em>' attribute.
	 * @see #setOsgiVersionQualifier(String)
	 * @see modulespecification.ModulespecificationPackage#getModule_OsgiVersionQualifier()
	 * @model default=".qualifier" unique="false"
	 * @generated
	 */
	String getOsgiVersionQualifier();

	/**
	 * Sets the value of the '{@link modulespecification.Module#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osgi Version Qualifier</em>' attribute.
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 */
	void setOsgiVersionQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_CoreId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _coreSuffix = this.getCoreSuffix();\nreturn (_baseId + _coreSuffix);'"
	 * @generated
	 */
	String getCoreId();

	/**
	 * Returns the value of the '<em><b>Ui Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_UiId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _uiSuffix = this.getUiSuffix();\nreturn (_baseId + _uiSuffix);'"
	 * @generated
	 */
	String getUiId();

	/**
	 * Returns the value of the '<em><b>Uie3 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uie3 Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uie3 Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_Uie3Id()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _uiId = this.getUiId();\n<%java.lang.String%> _uie3Suffix = this.getUie3Suffix();\nreturn (_uiId + _uie3Suffix);'"
	 * @generated
	 */
	String getUie3Id();

	/**
	 * Returns the value of the '<em><b>Tests Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_TestsId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _testsSuffix = this.getTestsSuffix();\nreturn (_baseId + _testsSuffix);'"
	 * @generated
	 */
	String getTestsId();

	/**
	 * Returns the value of the '<em><b>Update Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_UpdateSiteId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _updateSiteSuffix = this.getUpdateSiteSuffix();\nreturn (_baseId + _updateSiteSuffix);'"
	 * @generated
	 */
	String getUpdateSiteId();

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_FeatureId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _featureSuffix = this.getFeatureSuffix();\nreturn (_baseId + _featureSuffix);'"
	 * @generated
	 */
	String getFeatureId();

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_TargetId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _targetSuffix = this.getTargetSuffix();\nreturn (_baseId + _targetSuffix);'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Returns the value of the '<em><b>Maven Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Version</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_MavenVersion()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _version = this.getVersion();\n<%java.lang.String%> _mavenVersionSuffix = this.getMavenVersionSuffix();\nreturn (_version + _mavenVersionSuffix);'"
	 * @generated
	 */
	String getMavenVersion();

	/**
	 * Returns the value of the '<em><b>Osgi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osgi Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osgi Version</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_OsgiVersion()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _version = this.getVersion();\n<%java.lang.String%> _osgiVersionQualifier = this.getOsgiVersionQualifier();\nreturn (_version + _osgiVersionQualifier);'"
	 * @generated
	 */
	String getOsgiVersion();

	/**
	 * Returns the value of the '<em><b>Core Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Module Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_CoreModuleName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _moduleName = this.getModuleName();\nreturn (_moduleName + \" Core\");'"
	 * @generated
	 */
	String getCoreModuleName();

	/**
	 * Returns the value of the '<em><b>Ui Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Module Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_UiModuleName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _moduleName = this.getModuleName();\nreturn (_moduleName + \" UI\");'"
	 * @generated
	 */
	String getUiModuleName();

	/**
	 * Returns the value of the '<em><b>Is License Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is License Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is License Empty</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_IsLicenseEmpty()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _or = false;\n<%java.lang.String%> _license = this.getLicense();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_license, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.lang.String%> _license_1 = this.getLicense();\n\tboolean _isEmpty = _license_1.isEmpty();\n\t_or = _isEmpty;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIsLicenseEmpty();

	/**
	 * Returns the value of the '<em><b>Is License Url Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is License Url Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is License Url Empty</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_IsLicenseUrlEmpty()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _or = false;\n<%java.lang.String%> _licenseUrl = this.getLicenseUrl();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_licenseUrl, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.lang.String%> _licenseUrl_1 = this.getLicenseUrl();\n\tboolean _isEmpty = _licenseUrl_1.isEmpty();\n\t_or = _isEmpty;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIsLicenseUrlEmpty();

	/**
	 * Returns the value of the '<em><b>Is Update Site Url Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Update Site Url Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Update Site Url Empty</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_IsUpdateSiteUrlEmpty()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _or = false;\n<%java.lang.String%> _updateSiteUrl = this.getUpdateSiteUrl();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_updateSiteUrl, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.lang.String%> _updateSiteUrl_1 = this.getUpdateSiteUrl();\n\tboolean _isEmpty = _updateSiteUrl_1.isEmpty();\n\t_or = _isEmpty;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIsUpdateSiteUrlEmpty();

	/**
	 * Returns the value of the '<em><b>Is Author Email Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Author Email Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Author Email Empty</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getModule_IsAuthorEmailEmpty()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _or = false;\n<%java.lang.String%> _authorEmail = this.getAuthorEmail();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_authorEmail, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.lang.String%> _authorEmail_1 = this.getAuthorEmail();\n\tboolean _isEmpty = _authorEmail_1.isEmpty();\n\t_or = _isEmpty;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIsAuthorEmailEmpty();

} // Module
