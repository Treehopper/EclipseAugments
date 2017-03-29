/**
 */
package modulespecification.impl;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;
import modulespecification.ModulespecificationPackage;

import modulespecification.util.ModulespecificationValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulespecificationPackageImpl extends EPackageImpl implements ModulespecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osGiSegmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType osGiNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mandatoryStringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modulespecification.ModulespecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModulespecificationPackageImpl() {
		super(eNS_URI, ModulespecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModulespecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModulespecificationPackage init() {
		if (isInited) return (ModulespecificationPackage)EPackage.Registry.INSTANCE.getEPackage(ModulespecificationPackage.eNS_URI);

		// Obtain or create and register package
		ModulespecificationPackageImpl theModulespecificationPackage = (ModulespecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModulespecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModulespecificationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModulespecificationPackage.createPackageContents();

		// Initialize created meta-data
		theModulespecificationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModulespecificationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModulespecificationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModulespecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModulespecificationPackage.eNS_URI, theModulespecificationPackage);
		return theModulespecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_BaseId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_ModuleName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CategoryName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_License() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_LicenseUrl() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Version() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CopyRightAuthorName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CopyRightUrl() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CopyRightYear() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_AuthorEmail() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_ProviderName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TychoVersion() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_JavaVersion() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_BaseLocation() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CoreSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UiSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateParent() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TychoParentName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_MavenGroupId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateTests() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TestsSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateFeature() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_FeatureSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateUpdatesite() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UpdateSiteSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UpdateSiteUrl() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateTarget() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TargetSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_GenerateUiFragment() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Uie3Suffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_MavenVersionSuffix() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_OsgiVersionQualifier() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CoreId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UiId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Uie3Id() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TestsId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UpdateSiteId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_FeatureId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TargetId() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_MavenVersion() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_OsgiVersion() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_CoreModuleName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_UiModuleName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_IsLicenseEmpty() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_IsLicenseUrlEmpty() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_IsUpdateSiteUrlEmpty() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_IsAuthorEmailEmpty() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOSGiSegment() {
		return osGiSegmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOSGiName() {
		return osGiNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMandatoryString() {
		return mandatoryStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulespecificationFactory getModulespecificationFactory() {
		return (ModulespecificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__BASE_ID);
		createEAttribute(moduleEClass, MODULE__MODULE_NAME);
		createEAttribute(moduleEClass, MODULE__CATEGORY_NAME);
		createEAttribute(moduleEClass, MODULE__LICENSE);
		createEAttribute(moduleEClass, MODULE__LICENSE_URL);
		createEAttribute(moduleEClass, MODULE__VERSION);
		createEAttribute(moduleEClass, MODULE__COPY_RIGHT_AUTHOR_NAME);
		createEAttribute(moduleEClass, MODULE__COPY_RIGHT_URL);
		createEAttribute(moduleEClass, MODULE__COPY_RIGHT_YEAR);
		createEAttribute(moduleEClass, MODULE__AUTHOR_EMAIL);
		createEAttribute(moduleEClass, MODULE__PROVIDER_NAME);
		createEAttribute(moduleEClass, MODULE__TYCHO_VERSION);
		createEAttribute(moduleEClass, MODULE__JAVA_VERSION);
		createEAttribute(moduleEClass, MODULE__BASE_LOCATION);
		createEAttribute(moduleEClass, MODULE__CORE_SUFFIX);
		createEAttribute(moduleEClass, MODULE__UI_SUFFIX);
		createEAttribute(moduleEClass, MODULE__GENERATE_PARENT);
		createEAttribute(moduleEClass, MODULE__TYCHO_PARENT_NAME);
		createEAttribute(moduleEClass, MODULE__MAVEN_GROUP_ID);
		createEAttribute(moduleEClass, MODULE__GENERATE_TESTS);
		createEAttribute(moduleEClass, MODULE__TESTS_SUFFIX);
		createEAttribute(moduleEClass, MODULE__GENERATE_FEATURE);
		createEAttribute(moduleEClass, MODULE__FEATURE_SUFFIX);
		createEAttribute(moduleEClass, MODULE__GENERATE_UPDATESITE);
		createEAttribute(moduleEClass, MODULE__UPDATE_SITE_SUFFIX);
		createEAttribute(moduleEClass, MODULE__UPDATE_SITE_URL);
		createEAttribute(moduleEClass, MODULE__GENERATE_TARGET);
		createEAttribute(moduleEClass, MODULE__TARGET_SUFFIX);
		createEAttribute(moduleEClass, MODULE__GENERATE_UI_FRAGMENT);
		createEAttribute(moduleEClass, MODULE__UIE3_SUFFIX);
		createEAttribute(moduleEClass, MODULE__MAVEN_VERSION_SUFFIX);
		createEAttribute(moduleEClass, MODULE__OSGI_VERSION_QUALIFIER);
		createEAttribute(moduleEClass, MODULE__CORE_ID);
		createEAttribute(moduleEClass, MODULE__UI_ID);
		createEAttribute(moduleEClass, MODULE__UIE3_ID);
		createEAttribute(moduleEClass, MODULE__TESTS_ID);
		createEAttribute(moduleEClass, MODULE__UPDATE_SITE_ID);
		createEAttribute(moduleEClass, MODULE__FEATURE_ID);
		createEAttribute(moduleEClass, MODULE__TARGET_ID);
		createEAttribute(moduleEClass, MODULE__MAVEN_VERSION);
		createEAttribute(moduleEClass, MODULE__OSGI_VERSION);
		createEAttribute(moduleEClass, MODULE__CORE_MODULE_NAME);
		createEAttribute(moduleEClass, MODULE__UI_MODULE_NAME);
		createEAttribute(moduleEClass, MODULE__IS_LICENSE_EMPTY);
		createEAttribute(moduleEClass, MODULE__IS_LICENSE_URL_EMPTY);
		createEAttribute(moduleEClass, MODULE__IS_UPDATE_SITE_URL_EMPTY);
		createEAttribute(moduleEClass, MODULE__IS_AUTHOR_EMAIL_EMPTY);

		// Create data types
		versionEDataType = createEDataType(VERSION);
		osGiSegmentEDataType = createEDataType(OS_GI_SEGMENT);
		osGiNameEDataType = createEDataType(OS_GI_NAME);
		mandatoryStringEDataType = createEDataType(MANDATORY_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_BaseId(), this.getOSGiName(), "baseId", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_ModuleName(), this.getMandatoryString(), "moduleName", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CategoryName(), this.getMandatoryString(), "categoryName", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_License(), theEcorePackage.getEString(), "license", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_LicenseUrl(), theEcorePackage.getEString(), "licenseUrl", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Version(), this.getVersion(), "version", "1.0.0", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CopyRightAuthorName(), theEcorePackage.getEString(), "copyRightAuthorName", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CopyRightUrl(), theEcorePackage.getEString(), "copyRightUrl", "http://www.example.org", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CopyRightYear(), theEcorePackage.getEString(), "copyRightYear", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_AuthorEmail(), theEcorePackage.getEString(), "authorEmail", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_ProviderName(), theEcorePackage.getEString(), "providerName", "http://www.example.org", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TychoVersion(), theEcorePackage.getEString(), "tychoVersion", "0.25.0", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_JavaVersion(), theEcorePackage.getEString(), "javaVersion", "JavaSE-1.8", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_BaseLocation(), theEcorePackage.getEString(), "baseLocation", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CoreSuffix(), this.getOSGiSegment(), "coreSuffix", "", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UiSuffix(), this.getOSGiSegment(), "uiSuffix", ".ui", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateParent(), theEcorePackage.getEBoolean(), "generateParent", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TychoParentName(), this.getOSGiName(), "tychoParentName", "parent", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_MavenGroupId(), this.getMandatoryString(), "mavenGroupId", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateTests(), theEcorePackage.getEBoolean(), "generateTests", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TestsSuffix(), this.getOSGiSegment(), "testsSuffix", ".test", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateFeature(), theEcorePackage.getEBoolean(), "generateFeature", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_FeatureSuffix(), this.getOSGiSegment(), "featureSuffix", ".feature", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateUpdatesite(), theEcorePackage.getEBoolean(), "generateUpdatesite", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UpdateSiteSuffix(), this.getOSGiSegment(), "updateSiteSuffix", ".p2updateSite", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UpdateSiteUrl(), theEcorePackage.getEString(), "updateSiteUrl", "http://www.example.org", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateTarget(), theEcorePackage.getEBoolean(), "generateTarget", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TargetSuffix(), this.getOSGiSegment(), "targetSuffix", ".releng.targetplatform", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_GenerateUiFragment(), theEcorePackage.getEBoolean(), "generateUiFragment", "true", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Uie3Suffix(), this.getOSGiSegment(), "uie3Suffix", ".e3", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_MavenVersionSuffix(), theEcorePackage.getEString(), "mavenVersionSuffix", "-SNAPSHOT", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_OsgiVersionQualifier(), theEcorePackage.getEString(), "osgiVersionQualifier", ".qualifier", 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CoreId(), theEcorePackage.getEString(), "coreId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UiId(), theEcorePackage.getEString(), "uiId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Uie3Id(), theEcorePackage.getEString(), "uie3Id", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TestsId(), theEcorePackage.getEString(), "testsId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UpdateSiteId(), theEcorePackage.getEString(), "updateSiteId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_FeatureId(), theEcorePackage.getEString(), "featureId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TargetId(), theEcorePackage.getEString(), "targetId", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_MavenVersion(), theEcorePackage.getEString(), "mavenVersion", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_OsgiVersion(), theEcorePackage.getEString(), "osgiVersion", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_CoreModuleName(), theEcorePackage.getEString(), "coreModuleName", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_UiModuleName(), theEcorePackage.getEString(), "uiModuleName", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_IsLicenseEmpty(), theEcorePackage.getEBoolean(), "isLicenseEmpty", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_IsLicenseUrlEmpty(), theEcorePackage.getEBoolean(), "isLicenseUrlEmpty", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_IsUpdateSiteUrlEmpty(), theEcorePackage.getEBoolean(), "isUpdateSiteUrlEmpty", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_IsAuthorEmailEmpty(), theEcorePackage.getEBoolean(), "isAuthorEmailEmpty", null, 0, 1, Module.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(versionEDataType, String.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osGiSegmentEDataType, String.class, "OSGiSegment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(osGiNameEDataType, String.class, "OSGiName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mandatoryStringEDataType, String.class, "MandatoryString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (versionEDataType, 
		   source, 
		   new String[] {
			 "pattern", "((\\d+)\\.)((\\d+)\\.)(\\d+)"
		   });	
		addAnnotation
		  (osGiSegmentEDataType, 
		   source, 
		   new String[] {
			 "pattern", "[a-zA-Z_.\\-0-9]*"
		   });	
		addAnnotation
		  (osGiNameEDataType, 
		   source, 
		   new String[] {
			 "pattern", "[a-zA-Z_.\\-0-9]+",
			 "minLength", "1"
		   });	
		addAnnotation
		  (mandatoryStringEDataType, 
		   source, 
		   new String[] {
			 "pattern", ".+",
			 "minLength", "1"
		   });
	}

} //ModulespecificationPackageImpl
