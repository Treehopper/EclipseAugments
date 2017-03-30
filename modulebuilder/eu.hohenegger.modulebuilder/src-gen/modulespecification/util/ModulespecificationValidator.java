/**
 */
package modulespecification.util;

import java.util.Map;

import modulespecification.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see modulespecification.ModulespecificationPackage
 * @generated
 */
public class ModulespecificationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModulespecificationValidator INSTANCE = new ModulespecificationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "modulespecification";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulespecificationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModulespecificationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ModulespecificationPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case ModulespecificationPackage.VERSION:
				return validateVersion((String)value, diagnostics, context);
			case ModulespecificationPackage.OS_GI_SEGMENT:
				return validateOSGiSegment((String)value, diagnostics, context);
			case ModulespecificationPackage.OS_GI_NAME:
				return validateOSGiName((String)value, diagnostics, context);
			case ModulespecificationPackage.MANDATORY_STRING:
				return validateMandatoryString((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(module, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersion_Pattern(version, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersion_Pattern
	 */
	public static final  PatternMatcher [][] VERSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((\\d+)\\.)((\\d+)\\.)(\\d+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Pattern(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ModulespecificationPackage.Literals.VERSION, version, VERSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiSegment(String osGiSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOSGiSegment_Pattern(osGiSegment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOSGiSegment_Pattern
	 */
	public static final  PatternMatcher [][] OS_GI_SEGMENT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_.\\-0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>OS Gi Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiSegment_Pattern(String osGiSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ModulespecificationPackage.Literals.OS_GI_SEGMENT, osGiSegment, OS_GI_SEGMENT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiName(String osGiName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOSGiName_Pattern(osGiName, diagnostics, context);
		if (result || diagnostics != null) result &= validateOSGiName_MinLength(osGiName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOSGiName_Pattern
	 */
	public static final  PatternMatcher [][] OS_GI_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_.\\-0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>OS Gi Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiName_Pattern(String osGiName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ModulespecificationPackage.Literals.OS_GI_NAME, osGiName, OS_GI_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>OS Gi Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiName_MinLength(String osGiName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osGiName.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ModulespecificationPackage.Literals.OS_GI_NAME, osGiName, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryString(String mandatoryString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMandatoryString_Pattern(mandatoryString, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryString_MinLength(mandatoryString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMandatoryString_Pattern
	 */
	public static final  PatternMatcher [][] MANDATORY_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mandatory String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryString_Pattern(String mandatoryString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ModulespecificationPackage.Literals.MANDATORY_STRING, mandatoryString, MANDATORY_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Mandatory String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryString_MinLength(String mandatoryString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mandatoryString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ModulespecificationPackage.Literals.MANDATORY_STRING, mandatoryString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ModulespecificationValidator
