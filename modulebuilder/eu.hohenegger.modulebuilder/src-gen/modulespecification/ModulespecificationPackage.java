/**
 */
package modulespecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modulespecification.ModulespecificationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/eu.hohenegger.modulebuilder/src-gen' editDirectory='/eu.hohenegger.modulebuilder.edit/src-gen' fileExtensions='modulespecification'"
 * @generated
 */
public interface ModulespecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modulespecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "modulespecification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modulespecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModulespecificationPackage eINSTANCE = modulespecification.impl.ModulespecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link modulespecification.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modulespecification.impl.ModuleImpl
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Base Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BASE_ID = 0;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CATEGORY_NAME = 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LICENSE = 3;

	/**
	 * The feature id for the '<em><b>License Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LICENSE_URL = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Copy Right Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COPY_RIGHT_AUTHOR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Copy Right Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COPY_RIGHT_URL = 7;

	/**
	 * The feature id for the '<em><b>Copy Right Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COPY_RIGHT_YEAR = 8;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__AUTHOR_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PROVIDER_NAME = 10;

	/**
	 * The feature id for the '<em><b>Tycho Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYCHO_VERSION = 11;

	/**
	 * The feature id for the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__JAVA_VERSION = 12;

	/**
	 * The feature id for the '<em><b>Base Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BASE_LOCATION = 13;

	/**
	 * The feature id for the '<em><b>Core Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CORE_SUFFIX = 14;

	/**
	 * The feature id for the '<em><b>Ui Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UI_SUFFIX = 15;

	/**
	 * The feature id for the '<em><b>Generate Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_PARENT = 16;

	/**
	 * The feature id for the '<em><b>Tycho Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYCHO_PARENT_NAME = 17;

	/**
	 * The feature id for the '<em><b>Maven Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAVEN_GROUP_ID = 18;

	/**
	 * The feature id for the '<em><b>Generate Tests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_TESTS = 19;

	/**
	 * The feature id for the '<em><b>Tests Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TESTS_SUFFIX = 20;

	/**
	 * The feature id for the '<em><b>Generate Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_FEATURE = 21;

	/**
	 * The feature id for the '<em><b>Feature Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FEATURE_SUFFIX = 22;

	/**
	 * The feature id for the '<em><b>Generate Updatesite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_UPDATESITE = 23;

	/**
	 * The feature id for the '<em><b>Update Site Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UPDATE_SITE_SUFFIX = 24;

	/**
	 * The feature id for the '<em><b>Update Site Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UPDATE_SITE_URL = 25;

	/**
	 * The feature id for the '<em><b>Generate Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_TARGET = 26;

	/**
	 * The feature id for the '<em><b>Target Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TARGET_SUFFIX = 27;

	/**
	 * The feature id for the '<em><b>Generate Ui Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATE_UI_FRAGMENT = 28;

	/**
	 * The feature id for the '<em><b>Uie3 Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UIE3_SUFFIX = 29;

	/**
	 * The feature id for the '<em><b>Maven Version Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAVEN_VERSION_SUFFIX = 30;

	/**
	 * The feature id for the '<em><b>Osgi Version Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OSGI_VERSION_QUALIFIER = 31;

	/**
	 * The feature id for the '<em><b>Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CORE_ID = 32;

	/**
	 * The feature id for the '<em><b>Ui Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UI_ID = 33;

	/**
	 * The feature id for the '<em><b>Uie3 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UIE3_ID = 34;

	/**
	 * The feature id for the '<em><b>Tests Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TESTS_ID = 35;

	/**
	 * The feature id for the '<em><b>Update Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UPDATE_SITE_ID = 36;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FEATURE_ID = 37;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TARGET_ID = 38;

	/**
	 * The feature id for the '<em><b>Maven Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAVEN_VERSION = 39;

	/**
	 * The feature id for the '<em><b>Osgi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OSGI_VERSION = 40;

	/**
	 * The feature id for the '<em><b>Core Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CORE_MODULE_NAME = 41;

	/**
	 * The feature id for the '<em><b>Ui Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UI_MODULE_NAME = 42;

	/**
	 * The feature id for the '<em><b>Is License Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_LICENSE_EMPTY = 43;

	/**
	 * The feature id for the '<em><b>Is License Url Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_LICENSE_URL_EMPTY = 44;

	/**
	 * The feature id for the '<em><b>Is Update Site Url Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_UPDATE_SITE_URL_EMPTY = 45;

	/**
	 * The feature id for the '<em><b>Is Author Email Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_AUTHOR_EMAIL_EMPTY = 46;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 47;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 1;

	/**
	 * The meta object id for the '<em>OS Gi Segment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getOSGiSegment()
	 * @generated
	 */
	int OS_GI_SEGMENT = 2;

	/**
	 * The meta object id for the '<em>OS Gi Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getOSGiName()
	 * @generated
	 */
	int OS_GI_NAME = 3;

	/**
	 * The meta object id for the '<em>Mandatory String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getMandatoryString()
	 * @generated
	 */
	int MANDATORY_STRING = 4;


	/**
	 * Returns the meta object for class '{@link modulespecification.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see modulespecification.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getBaseId <em>Base Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Id</em>'.
	 * @see modulespecification.Module#getBaseId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_BaseId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see modulespecification.Module#getModuleName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see modulespecification.Module#getCategoryName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CategoryName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see modulespecification.Module#getLicense()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_License();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getLicenseUrl <em>License Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Url</em>'.
	 * @see modulespecification.Module#getLicenseUrl()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_LicenseUrl();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see modulespecification.Module#getVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Version();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCopyRightAuthorName <em>Copy Right Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Author Name</em>'.
	 * @see modulespecification.Module#getCopyRightAuthorName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CopyRightAuthorName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCopyRightUrl <em>Copy Right Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Url</em>'.
	 * @see modulespecification.Module#getCopyRightUrl()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CopyRightUrl();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCopyRightYear <em>Copy Right Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Year</em>'.
	 * @see modulespecification.Module#getCopyRightYear()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CopyRightYear();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getAuthorEmail <em>Author Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Email</em>'.
	 * @see modulespecification.Module#getAuthorEmail()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_AuthorEmail();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see modulespecification.Module#getProviderName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTychoVersion <em>Tycho Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tycho Version</em>'.
	 * @see modulespecification.Module#getTychoVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TychoVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getJavaVersion <em>Java Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Version</em>'.
	 * @see modulespecification.Module#getJavaVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_JavaVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getBaseLocation <em>Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Location</em>'.
	 * @see modulespecification.Module#getBaseLocation()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_BaseLocation();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCoreSuffix <em>Core Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Suffix</em>'.
	 * @see modulespecification.Module#getCoreSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CoreSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUiSuffix <em>Ui Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Suffix</em>'.
	 * @see modulespecification.Module#getUiSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UiSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateParent <em>Generate Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Parent</em>'.
	 * @see modulespecification.Module#isGenerateParent()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateParent();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTychoParentName <em>Tycho Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tycho Parent Name</em>'.
	 * @see modulespecification.Module#getTychoParentName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TychoParentName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getMavenGroupId <em>Maven Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Group Id</em>'.
	 * @see modulespecification.Module#getMavenGroupId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_MavenGroupId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateTests <em>Generate Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Tests</em>'.
	 * @see modulespecification.Module#isGenerateTests()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateTests();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTestsSuffix <em>Tests Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Suffix</em>'.
	 * @see modulespecification.Module#getTestsSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TestsSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateFeature <em>Generate Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Feature</em>'.
	 * @see modulespecification.Module#isGenerateFeature()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateFeature();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getFeatureSuffix <em>Feature Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Suffix</em>'.
	 * @see modulespecification.Module#getFeatureSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_FeatureSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateUpdatesite <em>Generate Updatesite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Updatesite</em>'.
	 * @see modulespecification.Module#isGenerateUpdatesite()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateUpdatesite();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUpdateSiteSuffix <em>Update Site Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Suffix</em>'.
	 * @see modulespecification.Module#getUpdateSiteSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UpdateSiteSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUpdateSiteUrl <em>Update Site Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Url</em>'.
	 * @see modulespecification.Module#getUpdateSiteUrl()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UpdateSiteUrl();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateTarget <em>Generate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Target</em>'.
	 * @see modulespecification.Module#isGenerateTarget()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateTarget();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTargetSuffix <em>Target Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Suffix</em>'.
	 * @see modulespecification.Module#getTargetSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TargetSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isGenerateUiFragment <em>Generate Ui Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Ui Fragment</em>'.
	 * @see modulespecification.Module#isGenerateUiFragment()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_GenerateUiFragment();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUie3Suffix <em>Uie3 Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uie3 Suffix</em>'.
	 * @see modulespecification.Module#getUie3Suffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Uie3Suffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getMavenVersionSuffix <em>Maven Version Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Version Suffix</em>'.
	 * @see modulespecification.Module#getMavenVersionSuffix()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_MavenVersionSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osgi Version Qualifier</em>'.
	 * @see modulespecification.Module#getOsgiVersionQualifier()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_OsgiVersionQualifier();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCoreId <em>Core Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Id</em>'.
	 * @see modulespecification.Module#getCoreId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CoreId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUiId <em>Ui Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Id</em>'.
	 * @see modulespecification.Module#getUiId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UiId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUie3Id <em>Uie3 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uie3 Id</em>'.
	 * @see modulespecification.Module#getUie3Id()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Uie3Id();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTestsId <em>Tests Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Id</em>'.
	 * @see modulespecification.Module#getTestsId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TestsId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUpdateSiteId <em>Update Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Id</em>'.
	 * @see modulespecification.Module#getUpdateSiteId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UpdateSiteId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Id</em>'.
	 * @see modulespecification.Module#getFeatureId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_FeatureId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see modulespecification.Module#getTargetId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getMavenVersion <em>Maven Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Version</em>'.
	 * @see modulespecification.Module#getMavenVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_MavenVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getOsgiVersion <em>Osgi Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osgi Version</em>'.
	 * @see modulespecification.Module#getOsgiVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_OsgiVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getCoreModuleName <em>Core Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Module Name</em>'.
	 * @see modulespecification.Module#getCoreModuleName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CoreModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#getUiModuleName <em>Ui Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Module Name</em>'.
	 * @see modulespecification.Module#getUiModuleName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_UiModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isIsLicenseEmpty <em>Is License Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is License Empty</em>'.
	 * @see modulespecification.Module#isIsLicenseEmpty()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsLicenseEmpty();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isIsLicenseUrlEmpty <em>Is License Url Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is License Url Empty</em>'.
	 * @see modulespecification.Module#isIsLicenseUrlEmpty()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsLicenseUrlEmpty();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isIsUpdateSiteUrlEmpty <em>Is Update Site Url Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Update Site Url Empty</em>'.
	 * @see modulespecification.Module#isIsUpdateSiteUrlEmpty()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsUpdateSiteUrlEmpty();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Module#isIsAuthorEmailEmpty <em>Is Author Email Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Author Email Empty</em>'.
	 * @see modulespecification.Module#isIsAuthorEmailEmpty()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsAuthorEmailEmpty();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='((\\d+)\\.)((\\d+)\\.)(\\d+)'"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>OS Gi Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OS Gi Segment</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[a-zA-Z_.\\-0-9]*'"
	 * @generated
	 */
	EDataType getOSGiSegment();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>OS Gi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OS Gi Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[a-zA-Z_.\\-0-9]+' minLength='1'"
	 * @generated
	 */
	EDataType getOSGiName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mandatory String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mandatory String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='.+' minLength='1'"
	 * @generated
	 */
	EDataType getMandatoryString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModulespecificationFactory getModulespecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modulespecification.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modulespecification.impl.ModuleImpl
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Base Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__BASE_ID = eINSTANCE.getModule_BaseId();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MODULE_NAME = eINSTANCE.getModule_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CATEGORY_NAME = eINSTANCE.getModule_CategoryName();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LICENSE = eINSTANCE.getModule_License();

		/**
		 * The meta object literal for the '<em><b>License Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LICENSE_URL = eINSTANCE.getModule_LicenseUrl();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__VERSION = eINSTANCE.getModule_Version();

		/**
		 * The meta object literal for the '<em><b>Copy Right Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__COPY_RIGHT_AUTHOR_NAME = eINSTANCE.getModule_CopyRightAuthorName();

		/**
		 * The meta object literal for the '<em><b>Copy Right Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__COPY_RIGHT_URL = eINSTANCE.getModule_CopyRightUrl();

		/**
		 * The meta object literal for the '<em><b>Copy Right Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__COPY_RIGHT_YEAR = eINSTANCE.getModule_CopyRightYear();

		/**
		 * The meta object literal for the '<em><b>Author Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__AUTHOR_EMAIL = eINSTANCE.getModule_AuthorEmail();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PROVIDER_NAME = eINSTANCE.getModule_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Tycho Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TYCHO_VERSION = eINSTANCE.getModule_TychoVersion();

		/**
		 * The meta object literal for the '<em><b>Java Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__JAVA_VERSION = eINSTANCE.getModule_JavaVersion();

		/**
		 * The meta object literal for the '<em><b>Base Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__BASE_LOCATION = eINSTANCE.getModule_BaseLocation();

		/**
		 * The meta object literal for the '<em><b>Core Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CORE_SUFFIX = eINSTANCE.getModule_CoreSuffix();

		/**
		 * The meta object literal for the '<em><b>Ui Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UI_SUFFIX = eINSTANCE.getModule_UiSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_PARENT = eINSTANCE.getModule_GenerateParent();

		/**
		 * The meta object literal for the '<em><b>Tycho Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TYCHO_PARENT_NAME = eINSTANCE.getModule_TychoParentName();

		/**
		 * The meta object literal for the '<em><b>Maven Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MAVEN_GROUP_ID = eINSTANCE.getModule_MavenGroupId();

		/**
		 * The meta object literal for the '<em><b>Generate Tests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_TESTS = eINSTANCE.getModule_GenerateTests();

		/**
		 * The meta object literal for the '<em><b>Tests Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TESTS_SUFFIX = eINSTANCE.getModule_TestsSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_FEATURE = eINSTANCE.getModule_GenerateFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__FEATURE_SUFFIX = eINSTANCE.getModule_FeatureSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Updatesite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_UPDATESITE = eINSTANCE.getModule_GenerateUpdatesite();

		/**
		 * The meta object literal for the '<em><b>Update Site Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UPDATE_SITE_SUFFIX = eINSTANCE.getModule_UpdateSiteSuffix();

		/**
		 * The meta object literal for the '<em><b>Update Site Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UPDATE_SITE_URL = eINSTANCE.getModule_UpdateSiteUrl();

		/**
		 * The meta object literal for the '<em><b>Generate Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_TARGET = eINSTANCE.getModule_GenerateTarget();

		/**
		 * The meta object literal for the '<em><b>Target Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TARGET_SUFFIX = eINSTANCE.getModule_TargetSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Ui Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GENERATE_UI_FRAGMENT = eINSTANCE.getModule_GenerateUiFragment();

		/**
		 * The meta object literal for the '<em><b>Uie3 Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UIE3_SUFFIX = eINSTANCE.getModule_Uie3Suffix();

		/**
		 * The meta object literal for the '<em><b>Maven Version Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MAVEN_VERSION_SUFFIX = eINSTANCE.getModule_MavenVersionSuffix();

		/**
		 * The meta object literal for the '<em><b>Osgi Version Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__OSGI_VERSION_QUALIFIER = eINSTANCE.getModule_OsgiVersionQualifier();

		/**
		 * The meta object literal for the '<em><b>Core Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CORE_ID = eINSTANCE.getModule_CoreId();

		/**
		 * The meta object literal for the '<em><b>Ui Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UI_ID = eINSTANCE.getModule_UiId();

		/**
		 * The meta object literal for the '<em><b>Uie3 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UIE3_ID = eINSTANCE.getModule_Uie3Id();

		/**
		 * The meta object literal for the '<em><b>Tests Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TESTS_ID = eINSTANCE.getModule_TestsId();

		/**
		 * The meta object literal for the '<em><b>Update Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UPDATE_SITE_ID = eINSTANCE.getModule_UpdateSiteId();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__FEATURE_ID = eINSTANCE.getModule_FeatureId();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TARGET_ID = eINSTANCE.getModule_TargetId();

		/**
		 * The meta object literal for the '<em><b>Maven Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MAVEN_VERSION = eINSTANCE.getModule_MavenVersion();

		/**
		 * The meta object literal for the '<em><b>Osgi Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__OSGI_VERSION = eINSTANCE.getModule_OsgiVersion();

		/**
		 * The meta object literal for the '<em><b>Core Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CORE_MODULE_NAME = eINSTANCE.getModule_CoreModuleName();

		/**
		 * The meta object literal for the '<em><b>Ui Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__UI_MODULE_NAME = eINSTANCE.getModule_UiModuleName();

		/**
		 * The meta object literal for the '<em><b>Is License Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_LICENSE_EMPTY = eINSTANCE.getModule_IsLicenseEmpty();

		/**
		 * The meta object literal for the '<em><b>Is License Url Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_LICENSE_URL_EMPTY = eINSTANCE.getModule_IsLicenseUrlEmpty();

		/**
		 * The meta object literal for the '<em><b>Is Update Site Url Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_UPDATE_SITE_URL_EMPTY = eINSTANCE.getModule_IsUpdateSiteUrlEmpty();

		/**
		 * The meta object literal for the '<em><b>Is Author Email Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_AUTHOR_EMAIL_EMPTY = eINSTANCE.getModule_IsAuthorEmailEmpty();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>OS Gi Segment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getOSGiSegment()
		 * @generated
		 */
		EDataType OS_GI_SEGMENT = eINSTANCE.getOSGiSegment();

		/**
		 * The meta object literal for the '<em>OS Gi Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getOSGiName()
		 * @generated
		 */
		EDataType OS_GI_NAME = eINSTANCE.getOSGiName();

		/**
		 * The meta object literal for the '<em>Mandatory String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getMandatoryString()
		 * @generated
		 */
		EDataType MANDATORY_STRING = eINSTANCE.getMandatoryString();

	}

} //ModulespecificationPackage
