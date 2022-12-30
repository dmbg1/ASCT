/**
 */
package curriculum_vitae.util;

import curriculum_vitae.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see curriculum_vitae.Curriculum_vitaePackage
 * @generated
 */
public class Curriculum_vitaeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Curriculum_vitaeValidator INSTANCE = new Curriculum_vitaeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "curriculum_vitae";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Listening qual restriction' of 'Idiom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDIOM__LISTENING_QUAL_RESTRICTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Speaking qual restriction' of 'Idiom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDIOM__SPEAKING_QUAL_RESTRICTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reading qual restriction' of 'Idiom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDIOM__READING_QUAL_RESTRICTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Writing qual restriction' of 'Idiom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDIOM__WRITING_QUAL_RESTRICTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Proficiency Limit' of 'Technology'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TECHNOLOGY__PROFICIENCY_LIMIT = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
	public Curriculum_vitaeValidator() {
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
	  return Curriculum_vitaePackage.eINSTANCE;
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
			case Curriculum_vitaePackage.CURRICULUM_VITAE:
				return validateCurriculumVitae((CurriculumVitae)value, diagnostics, context);
			case Curriculum_vitaePackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case Curriculum_vitaePackage.CITATION_NAME:
				return validateCitationName((CitationName)value, diagnostics, context);
			case Curriculum_vitaePackage.WEBSITE:
				return validateWebsite((Website)value, diagnostics, context);
			case Curriculum_vitaePackage.IDIOM:
				return validateIdiom((Idiom)value, diagnostics, context);
			case Curriculum_vitaePackage.DEGREE:
				return validateDegree((Degree)value, diagnostics, context);
			case Curriculum_vitaePackage.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case Curriculum_vitaePackage.AFFILIATION:
				return validateAffiliation((Affiliation)value, diagnostics, context);
			case Curriculum_vitaePackage.AFFILIATION_FIELD:
				return validateAffiliationField((AffiliationField)value, diagnostics, context);
			case Curriculum_vitaePackage.DISTINCTION:
				return validateDistinction((Distinction)value, diagnostics, context);
			case Curriculum_vitaePackage.DISTINCTION_TYPE:
				return validateDistinctionType((DistinctionType)value, diagnostics, context);
			case Curriculum_vitaePackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case Curriculum_vitaePackage.ACTIVITY_TYPE:
				return validateActivityType((ActivityType)value, diagnostics, context);
			case Curriculum_vitaePackage.TECHNOLOGY:
				return validateTechnology((Technology)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurriculumVitae(CurriculumVitae curriculumVitae, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curriculumVitae, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationName(CitationName citationName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsite(Website website, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(website, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdiom(Idiom idiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(idiom, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdiom_writing_qual_restriction(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdiom_listening_qual_restriction(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdiom_speaking_qual_restriction(idiom, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdiom_reading_qual_restriction(idiom, diagnostics, context);
		return result;
	}

	/**
	 * Validates the writing_qual_restriction constraint of '<em>Idiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdiom_writing_qual_restriction(Idiom idiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idiom.writing_qual_restriction(diagnostics, context);
	}

	/**
	 * Validates the listening_qual_restriction constraint of '<em>Idiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdiom_listening_qual_restriction(Idiom idiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idiom.listening_qual_restriction(diagnostics, context);
	}

	/**
	 * Validates the speaking_qual_restriction constraint of '<em>Idiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdiom_speaking_qual_restriction(Idiom idiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idiom.speaking_qual_restriction(diagnostics, context);
	}

	/**
	 * Validates the reading_qual_restriction constraint of '<em>Idiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdiom_reading_qual_restriction(Idiom idiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idiom.reading_qual_restriction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree(Degree degree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliation(Affiliation affiliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affiliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliationField(AffiliationField affiliationField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affiliationField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinction(Distinction distinction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distinction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinctionType(DistinctionType distinctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distinctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnology(Technology technology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(technology, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(technology, diagnostics, context);
		if (result || diagnostics != null) result &= validateTechnology_proficiencyLimit(technology, diagnostics, context);
		return result;
	}

	/**
	 * Validates the proficiencyLimit constraint of '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnology_proficiencyLimit(Technology technology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return technology.proficiencyLimit(diagnostics, context);
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

} //Curriculum_vitaeValidator
