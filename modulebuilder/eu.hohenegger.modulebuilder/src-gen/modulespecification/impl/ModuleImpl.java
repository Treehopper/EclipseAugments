/**
 */
package modulespecification.impl;

import com.google.common.base.Objects;

import modulespecification.Module;
import modulespecification.ModulespecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.impl.ModuleImpl#getBaseId <em>Base Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getLicenseUrl <em>License Url</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCopyRightYear <em>Copy Right Year</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTychoVersion <em>Tycho Version</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getBaseLocation <em>Base Location</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCoreSuffix <em>Core Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUiSuffix <em>Ui Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateParent <em>Generate Parent</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTychoParentName <em>Tycho Parent Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getMavenGroupId <em>Maven Group Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateTests <em>Generate Tests</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTestsSuffix <em>Tests Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateFeature <em>Generate Feature</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getFeatureSuffix <em>Feature Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateUpdatesite <em>Generate Updatesite</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUpdateSiteSuffix <em>Update Site Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUpdateSiteUrl <em>Update Site Url</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateTarget <em>Generate Target</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTargetSuffix <em>Target Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isGenerateUiFragment <em>Generate Ui Fragment</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUie3Suffix <em>Uie3 Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getMavenVersionSuffix <em>Maven Version Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUiId <em>Ui Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUie3Id <em>Uie3 Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTestsId <em>Tests Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUpdateSiteId <em>Update Site Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getOsgiVersion <em>Osgi Version</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getCoreModuleName <em>Core Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUiModuleName <em>Ui Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isIsLicenseEmpty <em>Is License Empty</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isIsLicenseUrlEmpty <em>Is License Url Empty</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isIsUpdateSiteUrlEmpty <em>Is Update Site Url Empty</em>}</li>
 *   <li>{@link modulespecification.impl.ModuleImpl#isIsAuthorEmailEmpty <em>Is Author Email Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The default value of the '{@link #getBaseId() <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseId()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseId() <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseId()
	 * @generated
	 * @ordered
	 */
	protected String baseId = BASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseUrl() <em>License Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_URL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLicenseUrl() <em>License Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseUrl()
	 * @generated
	 * @ordered
	 */
	protected String licenseUrl = LICENSE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightAuthorName() <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_AUTHOR_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCopyRightAuthorName() <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String copyRightAuthorName = COPY_RIGHT_AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightUrl() <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_URL_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getCopyRightUrl() <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightUrl()
	 * @generated
	 * @ordered
	 */
	protected String copyRightUrl = COPY_RIGHT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightYear() <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightYear()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_YEAR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCopyRightYear() <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightYear()
	 * @generated
	 * @ordered
	 */
	protected String copyRightYear = COPY_RIGHT_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EMAIL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected String authorEmail = AUTHOR_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTychoVersion() <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TYCHO_VERSION_EDEFAULT = "0.25.0";

	/**
	 * The cached value of the '{@link #getTychoVersion() <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoVersion()
	 * @generated
	 * @ordered
	 */
	protected String tychoVersion = TYCHO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_VERSION_EDEFAULT = "JavaSE-1.8";

	/**
	 * The cached value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected String javaVersion = JAVA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseLocation() <em>Base Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_LOCATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBaseLocation() <em>Base Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocation()
	 * @generated
	 * @ordered
	 */
	protected String baseLocation = BASE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreSuffix() <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_SUFFIX_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCoreSuffix() <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreSuffix()
	 * @generated
	 * @ordered
	 */
	protected String coreSuffix = CORE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUiSuffix() <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_SUFFIX_EDEFAULT = ".ui";

	/**
	 * The cached value of the '{@link #getUiSuffix() <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiSuffix()
	 * @generated
	 * @ordered
	 */
	protected String uiSuffix = UI_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateParent() <em>Generate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_PARENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateParent() <em>Generate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateParent()
	 * @generated
	 * @ordered
	 */
	protected boolean generateParent = GENERATE_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTychoParentName() <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYCHO_PARENT_NAME_EDEFAULT = "parent";

	/**
	 * The cached value of the '{@link #getTychoParentName() <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoParentName()
	 * @generated
	 * @ordered
	 */
	protected String tychoParentName = TYCHO_PARENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMavenGroupId() <em>Maven Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMavenGroupId() <em>Maven Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenGroupId()
	 * @generated
	 * @ordered
	 */
	protected String mavenGroupId = MAVEN_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTests() <em>Generate Tests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTests()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TESTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTests() <em>Generate Tests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTests()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTests = GENERATE_TESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestsSuffix() <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_SUFFIX_EDEFAULT = ".test";

	/**
	 * The cached value of the '{@link #getTestsSuffix() <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsSuffix()
	 * @generated
	 * @ordered
	 */
	protected String testsSuffix = TESTS_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateFeature() <em>Generate Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateFeature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_FEATURE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateFeature() <em>Generate Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateFeature()
	 * @generated
	 * @ordered
	 */
	protected boolean generateFeature = GENERATE_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureSuffix() <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_SUFFIX_EDEFAULT = ".feature";

	/**
	 * The cached value of the '{@link #getFeatureSuffix() <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSuffix()
	 * @generated
	 * @ordered
	 */
	protected String featureSuffix = FEATURE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateUpdatesite() <em>Generate Updatesite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUpdatesite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_UPDATESITE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateUpdatesite() <em>Generate Updatesite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUpdatesite()
	 * @generated
	 * @ordered
	 */
	protected boolean generateUpdatesite = GENERATE_UPDATESITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSiteSuffix() <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_SUFFIX_EDEFAULT = ".p2updateSite";

	/**
	 * The cached value of the '{@link #getUpdateSiteSuffix() <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 * @ordered
	 */
	protected String updateSiteSuffix = UPDATE_SITE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSiteUrl() <em>Update Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_URL_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getUpdateSiteUrl() <em>Update Site Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteUrl()
	 * @generated
	 * @ordered
	 */
	protected String updateSiteUrl = UPDATE_SITE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTarget() <em>Generate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TARGET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTarget() <em>Generate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTarget = GENERATE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSuffix() <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SUFFIX_EDEFAULT = ".releng.targetplatform";

	/**
	 * The cached value of the '{@link #getTargetSuffix() <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSuffix()
	 * @generated
	 * @ordered
	 */
	protected String targetSuffix = TARGET_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateUiFragment() <em>Generate Ui Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUiFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_UI_FRAGMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateUiFragment() <em>Generate Ui Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUiFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean generateUiFragment = GENERATE_UI_FRAGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUie3Suffix() <em>Uie3 Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUie3Suffix()
	 * @generated
	 * @ordered
	 */
	protected static final String UIE3_SUFFIX_EDEFAULT = ".e3";

	/**
	 * The cached value of the '{@link #getUie3Suffix() <em>Uie3 Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUie3Suffix()
	 * @generated
	 * @ordered
	 */
	protected String uie3Suffix = UIE3_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMavenVersionSuffix() <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersionSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_VERSION_SUFFIX_EDEFAULT = "-SNAPSHOT";

	/**
	 * The cached value of the '{@link #getMavenVersionSuffix() <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersionSuffix()
	 * @generated
	 * @ordered
	 */
	protected String mavenVersionSuffix = MAVEN_VERSION_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsgiVersionQualifier() <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OSGI_VERSION_QUALIFIER_EDEFAULT = ".qualifier";

	/**
	 * The cached value of the '{@link #getOsgiVersionQualifier() <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 * @ordered
	 */
	protected String osgiVersionQualifier = OSGI_VERSION_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUiId() <em>Ui Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiId()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUie3Id() <em>Uie3 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUie3Id()
	 * @generated
	 * @ordered
	 */
	protected static final String UIE3_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTestsId() <em>Tests Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateSiteId() <em>Update Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMavenVersion() <em>Maven Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOsgiVersion() <em>Osgi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OSGI_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCoreModuleName() <em>Core Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_MODULE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUiModuleName() <em>Ui Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_MODULE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsLicenseEmpty() <em>Is License Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLicenseEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LICENSE_EMPTY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsLicenseUrlEmpty() <em>Is License Url Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLicenseUrlEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LICENSE_URL_EMPTY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsUpdateSiteUrlEmpty() <em>Is Update Site Url Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUpdateSiteUrlEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UPDATE_SITE_URL_EMPTY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsAuthorEmailEmpty() <em>Is Author Email Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthorEmailEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTHOR_EMAIL_EMPTY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulespecificationPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseId() {
		return baseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseId(String newBaseId) {
		String oldBaseId = baseId;
		baseId = newBaseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__BASE_ID, oldBaseId, baseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__CATEGORY_NAME, oldCategoryName, categoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicenseUrl() {
		return licenseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseUrl(String newLicenseUrl) {
		String oldLicenseUrl = licenseUrl;
		licenseUrl = newLicenseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__LICENSE_URL, oldLicenseUrl, licenseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightAuthorName() {
		return copyRightAuthorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightAuthorName(String newCopyRightAuthorName) {
		String oldCopyRightAuthorName = copyRightAuthorName;
		copyRightAuthorName = newCopyRightAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__COPY_RIGHT_AUTHOR_NAME, oldCopyRightAuthorName, copyRightAuthorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightUrl() {
		return copyRightUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightUrl(String newCopyRightUrl) {
		String oldCopyRightUrl = copyRightUrl;
		copyRightUrl = newCopyRightUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__COPY_RIGHT_URL, oldCopyRightUrl, copyRightUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightYear() {
		return copyRightYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightYear(String newCopyRightYear) {
		String oldCopyRightYear = copyRightYear;
		copyRightYear = newCopyRightYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__COPY_RIGHT_YEAR, oldCopyRightYear, copyRightYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorEmail() {
		return authorEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorEmail(String newAuthorEmail) {
		String oldAuthorEmail = authorEmail;
		authorEmail = newAuthorEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__AUTHOR_EMAIL, oldAuthorEmail, authorEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTychoVersion() {
		return tychoVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTychoVersion(String newTychoVersion) {
		String oldTychoVersion = tychoVersion;
		tychoVersion = newTychoVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__TYCHO_VERSION, oldTychoVersion, tychoVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaVersion() {
		return javaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaVersion(String newJavaVersion) {
		String oldJavaVersion = javaVersion;
		javaVersion = newJavaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__JAVA_VERSION, oldJavaVersion, javaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseLocation() {
		return baseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseLocation(String newBaseLocation) {
		String oldBaseLocation = baseLocation;
		baseLocation = newBaseLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__BASE_LOCATION, oldBaseLocation, baseLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreSuffix() {
		return coreSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreSuffix(String newCoreSuffix) {
		String oldCoreSuffix = coreSuffix;
		coreSuffix = newCoreSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__CORE_SUFFIX, oldCoreSuffix, coreSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiSuffix() {
		return uiSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiSuffix(String newUiSuffix) {
		String oldUiSuffix = uiSuffix;
		uiSuffix = newUiSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__UI_SUFFIX, oldUiSuffix, uiSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateParent() {
		return generateParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateParent(boolean newGenerateParent) {
		boolean oldGenerateParent = generateParent;
		generateParent = newGenerateParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_PARENT, oldGenerateParent, generateParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTychoParentName() {
		return tychoParentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTychoParentName(String newTychoParentName) {
		String oldTychoParentName = tychoParentName;
		tychoParentName = newTychoParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__TYCHO_PARENT_NAME, oldTychoParentName, tychoParentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMavenGroupId() {
		return mavenGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMavenGroupId(String newMavenGroupId) {
		String oldMavenGroupId = mavenGroupId;
		mavenGroupId = newMavenGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__MAVEN_GROUP_ID, oldMavenGroupId, mavenGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTests() {
		return generateTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTests(boolean newGenerateTests) {
		boolean oldGenerateTests = generateTests;
		generateTests = newGenerateTests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_TESTS, oldGenerateTests, generateTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsSuffix() {
		return testsSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestsSuffix(String newTestsSuffix) {
		String oldTestsSuffix = testsSuffix;
		testsSuffix = newTestsSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__TESTS_SUFFIX, oldTestsSuffix, testsSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateFeature() {
		return generateFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateFeature(boolean newGenerateFeature) {
		boolean oldGenerateFeature = generateFeature;
		generateFeature = newGenerateFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_FEATURE, oldGenerateFeature, generateFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureSuffix() {
		return featureSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureSuffix(String newFeatureSuffix) {
		String oldFeatureSuffix = featureSuffix;
		featureSuffix = newFeatureSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__FEATURE_SUFFIX, oldFeatureSuffix, featureSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateUpdatesite() {
		return generateUpdatesite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateUpdatesite(boolean newGenerateUpdatesite) {
		boolean oldGenerateUpdatesite = generateUpdatesite;
		generateUpdatesite = newGenerateUpdatesite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_UPDATESITE, oldGenerateUpdatesite, generateUpdatesite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteSuffix() {
		return updateSiteSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSiteSuffix(String newUpdateSiteSuffix) {
		String oldUpdateSiteSuffix = updateSiteSuffix;
		updateSiteSuffix = newUpdateSiteSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__UPDATE_SITE_SUFFIX, oldUpdateSiteSuffix, updateSiteSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteUrl() {
		return updateSiteUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSiteUrl(String newUpdateSiteUrl) {
		String oldUpdateSiteUrl = updateSiteUrl;
		updateSiteUrl = newUpdateSiteUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__UPDATE_SITE_URL, oldUpdateSiteUrl, updateSiteUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTarget() {
		return generateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTarget(boolean newGenerateTarget) {
		boolean oldGenerateTarget = generateTarget;
		generateTarget = newGenerateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_TARGET, oldGenerateTarget, generateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetSuffix() {
		return targetSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSuffix(String newTargetSuffix) {
		String oldTargetSuffix = targetSuffix;
		targetSuffix = newTargetSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__TARGET_SUFFIX, oldTargetSuffix, targetSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateUiFragment() {
		return generateUiFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateUiFragment(boolean newGenerateUiFragment) {
		boolean oldGenerateUiFragment = generateUiFragment;
		generateUiFragment = newGenerateUiFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__GENERATE_UI_FRAGMENT, oldGenerateUiFragment, generateUiFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUie3Suffix() {
		return uie3Suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUie3Suffix(String newUie3Suffix) {
		String oldUie3Suffix = uie3Suffix;
		uie3Suffix = newUie3Suffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__UIE3_SUFFIX, oldUie3Suffix, uie3Suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMavenVersionSuffix() {
		return mavenVersionSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMavenVersionSuffix(String newMavenVersionSuffix) {
		String oldMavenVersionSuffix = mavenVersionSuffix;
		mavenVersionSuffix = newMavenVersionSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__MAVEN_VERSION_SUFFIX, oldMavenVersionSuffix, mavenVersionSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsgiVersionQualifier() {
		return osgiVersionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsgiVersionQualifier(String newOsgiVersionQualifier) {
		String oldOsgiVersionQualifier = osgiVersionQualifier;
		osgiVersionQualifier = newOsgiVersionQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.MODULE__OSGI_VERSION_QUALIFIER, oldOsgiVersionQualifier, osgiVersionQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreId() {
		String _baseId = this.getBaseId();
		String _coreSuffix = this.getCoreSuffix();
		return (_baseId + _coreSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiId() {
		String _baseId = this.getBaseId();
		String _uiSuffix = this.getUiSuffix();
		return (_baseId + _uiSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUie3Id() {
		String _uiId = this.getUiId();
		String _uie3Suffix = this.getUie3Suffix();
		return (_uiId + _uie3Suffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsId() {
		String _baseId = this.getBaseId();
		String _testsSuffix = this.getTestsSuffix();
		return (_baseId + _testsSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteId() {
		String _baseId = this.getBaseId();
		String _updateSiteSuffix = this.getUpdateSiteSuffix();
		return (_baseId + _updateSiteSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureId() {
		String _baseId = this.getBaseId();
		String _featureSuffix = this.getFeatureSuffix();
		return (_baseId + _featureSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetId() {
		String _baseId = this.getBaseId();
		String _targetSuffix = this.getTargetSuffix();
		return (_baseId + _targetSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMavenVersion() {
		String _version = this.getVersion();
		String _mavenVersionSuffix = this.getMavenVersionSuffix();
		return (_version + _mavenVersionSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsgiVersion() {
		String _version = this.getVersion();
		String _osgiVersionQualifier = this.getOsgiVersionQualifier();
		return (_version + _osgiVersionQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreModuleName() {
		String _moduleName = this.getModuleName();
		return (_moduleName + " Core");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiModuleName() {
		String _moduleName = this.getModuleName();
		return (_moduleName + " UI");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLicenseEmpty() {
		boolean _or = false;
		String _license = this.getLicense();
		boolean _equals = Objects.equal(_license, null);
		if (_equals) {
			_or = true;
		} else {
			String _license_1 = this.getLicense();
			boolean _isEmpty = _license_1.isEmpty();
			_or = _isEmpty;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLicenseUrlEmpty() {
		boolean _or = false;
		String _licenseUrl = this.getLicenseUrl();
		boolean _equals = Objects.equal(_licenseUrl, null);
		if (_equals) {
			_or = true;
		} else {
			String _licenseUrl_1 = this.getLicenseUrl();
			boolean _isEmpty = _licenseUrl_1.isEmpty();
			_or = _isEmpty;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUpdateSiteUrlEmpty() {
		boolean _or = false;
		String _updateSiteUrl = this.getUpdateSiteUrl();
		boolean _equals = Objects.equal(_updateSiteUrl, null);
		if (_equals) {
			_or = true;
		} else {
			String _updateSiteUrl_1 = this.getUpdateSiteUrl();
			boolean _isEmpty = _updateSiteUrl_1.isEmpty();
			_or = _isEmpty;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuthorEmailEmpty() {
		boolean _or = false;
		String _authorEmail = this.getAuthorEmail();
		boolean _equals = Objects.equal(_authorEmail, null);
		if (_equals) {
			_or = true;
		} else {
			String _authorEmail_1 = this.getAuthorEmail();
			boolean _isEmpty = _authorEmail_1.isEmpty();
			_or = _isEmpty;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulespecificationPackage.MODULE__BASE_ID:
				return getBaseId();
			case ModulespecificationPackage.MODULE__MODULE_NAME:
				return getModuleName();
			case ModulespecificationPackage.MODULE__CATEGORY_NAME:
				return getCategoryName();
			case ModulespecificationPackage.MODULE__LICENSE:
				return getLicense();
			case ModulespecificationPackage.MODULE__LICENSE_URL:
				return getLicenseUrl();
			case ModulespecificationPackage.MODULE__VERSION:
				return getVersion();
			case ModulespecificationPackage.MODULE__COPY_RIGHT_AUTHOR_NAME:
				return getCopyRightAuthorName();
			case ModulespecificationPackage.MODULE__COPY_RIGHT_URL:
				return getCopyRightUrl();
			case ModulespecificationPackage.MODULE__COPY_RIGHT_YEAR:
				return getCopyRightYear();
			case ModulespecificationPackage.MODULE__AUTHOR_EMAIL:
				return getAuthorEmail();
			case ModulespecificationPackage.MODULE__PROVIDER_NAME:
				return getProviderName();
			case ModulespecificationPackage.MODULE__TYCHO_VERSION:
				return getTychoVersion();
			case ModulespecificationPackage.MODULE__JAVA_VERSION:
				return getJavaVersion();
			case ModulespecificationPackage.MODULE__BASE_LOCATION:
				return getBaseLocation();
			case ModulespecificationPackage.MODULE__CORE_SUFFIX:
				return getCoreSuffix();
			case ModulespecificationPackage.MODULE__UI_SUFFIX:
				return getUiSuffix();
			case ModulespecificationPackage.MODULE__GENERATE_PARENT:
				return isGenerateParent();
			case ModulespecificationPackage.MODULE__TYCHO_PARENT_NAME:
				return getTychoParentName();
			case ModulespecificationPackage.MODULE__MAVEN_GROUP_ID:
				return getMavenGroupId();
			case ModulespecificationPackage.MODULE__GENERATE_TESTS:
				return isGenerateTests();
			case ModulespecificationPackage.MODULE__TESTS_SUFFIX:
				return getTestsSuffix();
			case ModulespecificationPackage.MODULE__GENERATE_FEATURE:
				return isGenerateFeature();
			case ModulespecificationPackage.MODULE__FEATURE_SUFFIX:
				return getFeatureSuffix();
			case ModulespecificationPackage.MODULE__GENERATE_UPDATESITE:
				return isGenerateUpdatesite();
			case ModulespecificationPackage.MODULE__UPDATE_SITE_SUFFIX:
				return getUpdateSiteSuffix();
			case ModulespecificationPackage.MODULE__UPDATE_SITE_URL:
				return getUpdateSiteUrl();
			case ModulespecificationPackage.MODULE__GENERATE_TARGET:
				return isGenerateTarget();
			case ModulespecificationPackage.MODULE__TARGET_SUFFIX:
				return getTargetSuffix();
			case ModulespecificationPackage.MODULE__GENERATE_UI_FRAGMENT:
				return isGenerateUiFragment();
			case ModulespecificationPackage.MODULE__UIE3_SUFFIX:
				return getUie3Suffix();
			case ModulespecificationPackage.MODULE__MAVEN_VERSION_SUFFIX:
				return getMavenVersionSuffix();
			case ModulespecificationPackage.MODULE__OSGI_VERSION_QUALIFIER:
				return getOsgiVersionQualifier();
			case ModulespecificationPackage.MODULE__CORE_ID:
				return getCoreId();
			case ModulespecificationPackage.MODULE__UI_ID:
				return getUiId();
			case ModulespecificationPackage.MODULE__UIE3_ID:
				return getUie3Id();
			case ModulespecificationPackage.MODULE__TESTS_ID:
				return getTestsId();
			case ModulespecificationPackage.MODULE__UPDATE_SITE_ID:
				return getUpdateSiteId();
			case ModulespecificationPackage.MODULE__FEATURE_ID:
				return getFeatureId();
			case ModulespecificationPackage.MODULE__TARGET_ID:
				return getTargetId();
			case ModulespecificationPackage.MODULE__MAVEN_VERSION:
				return getMavenVersion();
			case ModulespecificationPackage.MODULE__OSGI_VERSION:
				return getOsgiVersion();
			case ModulespecificationPackage.MODULE__CORE_MODULE_NAME:
				return getCoreModuleName();
			case ModulespecificationPackage.MODULE__UI_MODULE_NAME:
				return getUiModuleName();
			case ModulespecificationPackage.MODULE__IS_LICENSE_EMPTY:
				return isIsLicenseEmpty();
			case ModulespecificationPackage.MODULE__IS_LICENSE_URL_EMPTY:
				return isIsLicenseUrlEmpty();
			case ModulespecificationPackage.MODULE__IS_UPDATE_SITE_URL_EMPTY:
				return isIsUpdateSiteUrlEmpty();
			case ModulespecificationPackage.MODULE__IS_AUTHOR_EMAIL_EMPTY:
				return isIsAuthorEmailEmpty();
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
			case ModulespecificationPackage.MODULE__BASE_ID:
				setBaseId((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__LICENSE:
				setLicense((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__LICENSE_URL:
				setLicenseUrl((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__VERSION:
				setVersion((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_AUTHOR_NAME:
				setCopyRightAuthorName((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_URL:
				setCopyRightUrl((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_YEAR:
				setCopyRightYear((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__AUTHOR_EMAIL:
				setAuthorEmail((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__TYCHO_VERSION:
				setTychoVersion((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__JAVA_VERSION:
				setJavaVersion((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__BASE_LOCATION:
				setBaseLocation((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__CORE_SUFFIX:
				setCoreSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__UI_SUFFIX:
				setUiSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_PARENT:
				setGenerateParent((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__TYCHO_PARENT_NAME:
				setTychoParentName((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__MAVEN_GROUP_ID:
				setMavenGroupId((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_TESTS:
				setGenerateTests((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__TESTS_SUFFIX:
				setTestsSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_FEATURE:
				setGenerateFeature((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__FEATURE_SUFFIX:
				setFeatureSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_UPDATESITE:
				setGenerateUpdatesite((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__UPDATE_SITE_URL:
				setUpdateSiteUrl((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_TARGET:
				setGenerateTarget((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__TARGET_SUFFIX:
				setTargetSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_UI_FRAGMENT:
				setGenerateUiFragment((Boolean)newValue);
				return;
			case ModulespecificationPackage.MODULE__UIE3_SUFFIX:
				setUie3Suffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__MAVEN_VERSION_SUFFIX:
				setMavenVersionSuffix((String)newValue);
				return;
			case ModulespecificationPackage.MODULE__OSGI_VERSION_QUALIFIER:
				setOsgiVersionQualifier((String)newValue);
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
			case ModulespecificationPackage.MODULE__BASE_ID:
				setBaseId(BASE_ID_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__LICENSE_URL:
				setLicenseUrl(LICENSE_URL_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_AUTHOR_NAME:
				setCopyRightAuthorName(COPY_RIGHT_AUTHOR_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_URL:
				setCopyRightUrl(COPY_RIGHT_URL_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__COPY_RIGHT_YEAR:
				setCopyRightYear(COPY_RIGHT_YEAR_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__AUTHOR_EMAIL:
				setAuthorEmail(AUTHOR_EMAIL_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__TYCHO_VERSION:
				setTychoVersion(TYCHO_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__JAVA_VERSION:
				setJavaVersion(JAVA_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__BASE_LOCATION:
				setBaseLocation(BASE_LOCATION_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__CORE_SUFFIX:
				setCoreSuffix(CORE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__UI_SUFFIX:
				setUiSuffix(UI_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_PARENT:
				setGenerateParent(GENERATE_PARENT_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__TYCHO_PARENT_NAME:
				setTychoParentName(TYCHO_PARENT_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__MAVEN_GROUP_ID:
				setMavenGroupId(MAVEN_GROUP_ID_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_TESTS:
				setGenerateTests(GENERATE_TESTS_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__TESTS_SUFFIX:
				setTestsSuffix(TESTS_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_FEATURE:
				setGenerateFeature(GENERATE_FEATURE_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__FEATURE_SUFFIX:
				setFeatureSuffix(FEATURE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_UPDATESITE:
				setGenerateUpdatesite(GENERATE_UPDATESITE_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix(UPDATE_SITE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__UPDATE_SITE_URL:
				setUpdateSiteUrl(UPDATE_SITE_URL_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_TARGET:
				setGenerateTarget(GENERATE_TARGET_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__TARGET_SUFFIX:
				setTargetSuffix(TARGET_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__GENERATE_UI_FRAGMENT:
				setGenerateUiFragment(GENERATE_UI_FRAGMENT_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__UIE3_SUFFIX:
				setUie3Suffix(UIE3_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__MAVEN_VERSION_SUFFIX:
				setMavenVersionSuffix(MAVEN_VERSION_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.MODULE__OSGI_VERSION_QUALIFIER:
				setOsgiVersionQualifier(OSGI_VERSION_QUALIFIER_EDEFAULT);
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
			case ModulespecificationPackage.MODULE__BASE_ID:
				return BASE_ID_EDEFAULT == null ? baseId != null : !BASE_ID_EDEFAULT.equals(baseId);
			case ModulespecificationPackage.MODULE__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case ModulespecificationPackage.MODULE__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case ModulespecificationPackage.MODULE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case ModulespecificationPackage.MODULE__LICENSE_URL:
				return LICENSE_URL_EDEFAULT == null ? licenseUrl != null : !LICENSE_URL_EDEFAULT.equals(licenseUrl);
			case ModulespecificationPackage.MODULE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModulespecificationPackage.MODULE__COPY_RIGHT_AUTHOR_NAME:
				return COPY_RIGHT_AUTHOR_NAME_EDEFAULT == null ? copyRightAuthorName != null : !COPY_RIGHT_AUTHOR_NAME_EDEFAULT.equals(copyRightAuthorName);
			case ModulespecificationPackage.MODULE__COPY_RIGHT_URL:
				return COPY_RIGHT_URL_EDEFAULT == null ? copyRightUrl != null : !COPY_RIGHT_URL_EDEFAULT.equals(copyRightUrl);
			case ModulespecificationPackage.MODULE__COPY_RIGHT_YEAR:
				return COPY_RIGHT_YEAR_EDEFAULT == null ? copyRightYear != null : !COPY_RIGHT_YEAR_EDEFAULT.equals(copyRightYear);
			case ModulespecificationPackage.MODULE__AUTHOR_EMAIL:
				return AUTHOR_EMAIL_EDEFAULT == null ? authorEmail != null : !AUTHOR_EMAIL_EDEFAULT.equals(authorEmail);
			case ModulespecificationPackage.MODULE__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case ModulespecificationPackage.MODULE__TYCHO_VERSION:
				return TYCHO_VERSION_EDEFAULT == null ? tychoVersion != null : !TYCHO_VERSION_EDEFAULT.equals(tychoVersion);
			case ModulespecificationPackage.MODULE__JAVA_VERSION:
				return JAVA_VERSION_EDEFAULT == null ? javaVersion != null : !JAVA_VERSION_EDEFAULT.equals(javaVersion);
			case ModulespecificationPackage.MODULE__BASE_LOCATION:
				return BASE_LOCATION_EDEFAULT == null ? baseLocation != null : !BASE_LOCATION_EDEFAULT.equals(baseLocation);
			case ModulespecificationPackage.MODULE__CORE_SUFFIX:
				return CORE_SUFFIX_EDEFAULT == null ? coreSuffix != null : !CORE_SUFFIX_EDEFAULT.equals(coreSuffix);
			case ModulespecificationPackage.MODULE__UI_SUFFIX:
				return UI_SUFFIX_EDEFAULT == null ? uiSuffix != null : !UI_SUFFIX_EDEFAULT.equals(uiSuffix);
			case ModulespecificationPackage.MODULE__GENERATE_PARENT:
				return generateParent != GENERATE_PARENT_EDEFAULT;
			case ModulespecificationPackage.MODULE__TYCHO_PARENT_NAME:
				return TYCHO_PARENT_NAME_EDEFAULT == null ? tychoParentName != null : !TYCHO_PARENT_NAME_EDEFAULT.equals(tychoParentName);
			case ModulespecificationPackage.MODULE__MAVEN_GROUP_ID:
				return MAVEN_GROUP_ID_EDEFAULT == null ? mavenGroupId != null : !MAVEN_GROUP_ID_EDEFAULT.equals(mavenGroupId);
			case ModulespecificationPackage.MODULE__GENERATE_TESTS:
				return generateTests != GENERATE_TESTS_EDEFAULT;
			case ModulespecificationPackage.MODULE__TESTS_SUFFIX:
				return TESTS_SUFFIX_EDEFAULT == null ? testsSuffix != null : !TESTS_SUFFIX_EDEFAULT.equals(testsSuffix);
			case ModulespecificationPackage.MODULE__GENERATE_FEATURE:
				return generateFeature != GENERATE_FEATURE_EDEFAULT;
			case ModulespecificationPackage.MODULE__FEATURE_SUFFIX:
				return FEATURE_SUFFIX_EDEFAULT == null ? featureSuffix != null : !FEATURE_SUFFIX_EDEFAULT.equals(featureSuffix);
			case ModulespecificationPackage.MODULE__GENERATE_UPDATESITE:
				return generateUpdatesite != GENERATE_UPDATESITE_EDEFAULT;
			case ModulespecificationPackage.MODULE__UPDATE_SITE_SUFFIX:
				return UPDATE_SITE_SUFFIX_EDEFAULT == null ? updateSiteSuffix != null : !UPDATE_SITE_SUFFIX_EDEFAULT.equals(updateSiteSuffix);
			case ModulespecificationPackage.MODULE__UPDATE_SITE_URL:
				return UPDATE_SITE_URL_EDEFAULT == null ? updateSiteUrl != null : !UPDATE_SITE_URL_EDEFAULT.equals(updateSiteUrl);
			case ModulespecificationPackage.MODULE__GENERATE_TARGET:
				return generateTarget != GENERATE_TARGET_EDEFAULT;
			case ModulespecificationPackage.MODULE__TARGET_SUFFIX:
				return TARGET_SUFFIX_EDEFAULT == null ? targetSuffix != null : !TARGET_SUFFIX_EDEFAULT.equals(targetSuffix);
			case ModulespecificationPackage.MODULE__GENERATE_UI_FRAGMENT:
				return generateUiFragment != GENERATE_UI_FRAGMENT_EDEFAULT;
			case ModulespecificationPackage.MODULE__UIE3_SUFFIX:
				return UIE3_SUFFIX_EDEFAULT == null ? uie3Suffix != null : !UIE3_SUFFIX_EDEFAULT.equals(uie3Suffix);
			case ModulespecificationPackage.MODULE__MAVEN_VERSION_SUFFIX:
				return MAVEN_VERSION_SUFFIX_EDEFAULT == null ? mavenVersionSuffix != null : !MAVEN_VERSION_SUFFIX_EDEFAULT.equals(mavenVersionSuffix);
			case ModulespecificationPackage.MODULE__OSGI_VERSION_QUALIFIER:
				return OSGI_VERSION_QUALIFIER_EDEFAULT == null ? osgiVersionQualifier != null : !OSGI_VERSION_QUALIFIER_EDEFAULT.equals(osgiVersionQualifier);
			case ModulespecificationPackage.MODULE__CORE_ID:
				return CORE_ID_EDEFAULT == null ? getCoreId() != null : !CORE_ID_EDEFAULT.equals(getCoreId());
			case ModulespecificationPackage.MODULE__UI_ID:
				return UI_ID_EDEFAULT == null ? getUiId() != null : !UI_ID_EDEFAULT.equals(getUiId());
			case ModulespecificationPackage.MODULE__UIE3_ID:
				return UIE3_ID_EDEFAULT == null ? getUie3Id() != null : !UIE3_ID_EDEFAULT.equals(getUie3Id());
			case ModulespecificationPackage.MODULE__TESTS_ID:
				return TESTS_ID_EDEFAULT == null ? getTestsId() != null : !TESTS_ID_EDEFAULT.equals(getTestsId());
			case ModulespecificationPackage.MODULE__UPDATE_SITE_ID:
				return UPDATE_SITE_ID_EDEFAULT == null ? getUpdateSiteId() != null : !UPDATE_SITE_ID_EDEFAULT.equals(getUpdateSiteId());
			case ModulespecificationPackage.MODULE__FEATURE_ID:
				return FEATURE_ID_EDEFAULT == null ? getFeatureId() != null : !FEATURE_ID_EDEFAULT.equals(getFeatureId());
			case ModulespecificationPackage.MODULE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? getTargetId() != null : !TARGET_ID_EDEFAULT.equals(getTargetId());
			case ModulespecificationPackage.MODULE__MAVEN_VERSION:
				return MAVEN_VERSION_EDEFAULT == null ? getMavenVersion() != null : !MAVEN_VERSION_EDEFAULT.equals(getMavenVersion());
			case ModulespecificationPackage.MODULE__OSGI_VERSION:
				return OSGI_VERSION_EDEFAULT == null ? getOsgiVersion() != null : !OSGI_VERSION_EDEFAULT.equals(getOsgiVersion());
			case ModulespecificationPackage.MODULE__CORE_MODULE_NAME:
				return CORE_MODULE_NAME_EDEFAULT == null ? getCoreModuleName() != null : !CORE_MODULE_NAME_EDEFAULT.equals(getCoreModuleName());
			case ModulespecificationPackage.MODULE__UI_MODULE_NAME:
				return UI_MODULE_NAME_EDEFAULT == null ? getUiModuleName() != null : !UI_MODULE_NAME_EDEFAULT.equals(getUiModuleName());
			case ModulespecificationPackage.MODULE__IS_LICENSE_EMPTY:
				return isIsLicenseEmpty() != IS_LICENSE_EMPTY_EDEFAULT;
			case ModulespecificationPackage.MODULE__IS_LICENSE_URL_EMPTY:
				return isIsLicenseUrlEmpty() != IS_LICENSE_URL_EMPTY_EDEFAULT;
			case ModulespecificationPackage.MODULE__IS_UPDATE_SITE_URL_EMPTY:
				return isIsUpdateSiteUrlEmpty() != IS_UPDATE_SITE_URL_EMPTY_EDEFAULT;
			case ModulespecificationPackage.MODULE__IS_AUTHOR_EMAIL_EMPTY:
				return isIsAuthorEmailEmpty() != IS_AUTHOR_EMAIL_EMPTY_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseId: ");
		result.append(baseId);
		result.append(", moduleName: ");
		result.append(moduleName);
		result.append(", categoryName: ");
		result.append(categoryName);
		result.append(", license: ");
		result.append(license);
		result.append(", licenseUrl: ");
		result.append(licenseUrl);
		result.append(", version: ");
		result.append(version);
		result.append(", copyRightAuthorName: ");
		result.append(copyRightAuthorName);
		result.append(", copyRightUrl: ");
		result.append(copyRightUrl);
		result.append(", copyRightYear: ");
		result.append(copyRightYear);
		result.append(", authorEmail: ");
		result.append(authorEmail);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", tychoVersion: ");
		result.append(tychoVersion);
		result.append(", javaVersion: ");
		result.append(javaVersion);
		result.append(", baseLocation: ");
		result.append(baseLocation);
		result.append(", coreSuffix: ");
		result.append(coreSuffix);
		result.append(", uiSuffix: ");
		result.append(uiSuffix);
		result.append(", generateParent: ");
		result.append(generateParent);
		result.append(", tychoParentName: ");
		result.append(tychoParentName);
		result.append(", mavenGroupId: ");
		result.append(mavenGroupId);
		result.append(", generateTests: ");
		result.append(generateTests);
		result.append(", testsSuffix: ");
		result.append(testsSuffix);
		result.append(", generateFeature: ");
		result.append(generateFeature);
		result.append(", featureSuffix: ");
		result.append(featureSuffix);
		result.append(", generateUpdatesite: ");
		result.append(generateUpdatesite);
		result.append(", updateSiteSuffix: ");
		result.append(updateSiteSuffix);
		result.append(", updateSiteUrl: ");
		result.append(updateSiteUrl);
		result.append(", generateTarget: ");
		result.append(generateTarget);
		result.append(", targetSuffix: ");
		result.append(targetSuffix);
		result.append(", generateUiFragment: ");
		result.append(generateUiFragment);
		result.append(", uie3Suffix: ");
		result.append(uie3Suffix);
		result.append(", mavenVersionSuffix: ");
		result.append(mavenVersionSuffix);
		result.append(", osgiVersionQualifier: ");
		result.append(osgiVersionQualifier);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
