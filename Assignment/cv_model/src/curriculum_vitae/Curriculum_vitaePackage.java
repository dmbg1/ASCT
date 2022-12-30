/**
 */
package curriculum_vitae;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see curriculum_vitae.Curriculum_vitaeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Curriculum_vitaePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "curriculum_vitae";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://curriculum_vitae";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "curriculum_vitae";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Curriculum_vitaePackage eINSTANCE = curriculum_vitae.impl.Curriculum_vitaePackageImpl.init();

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.CurriculumVitaeImpl <em>Curriculum Vitae</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.CurriculumVitaeImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getCurriculumVitae()
	 * @generated
	 */
	int CURRICULUM_VITAE = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE__PERSON = 0;

	/**
	 * The number of structural features of the '<em>Curriculum Vitae</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Curriculum Vitae</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRICULUM_VITAE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.PersonImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = 1;

	/**
	 * The feature id for the '<em><b>Phone number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Home address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOME_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Citation names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CITATION_NAMES = 5;

	/**
	 * The feature id for the '<em><b>Websites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WEBSITES = 6;

	/**
	 * The feature id for the '<em><b>Idioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDIOMS = 7;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEGREES = 8;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROJECTS = 9;

	/**
	 * The feature id for the '<em><b>Affiliation fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFILIATION_FIELDS = 10;

	/**
	 * The feature id for the '<em><b>Distinction types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DISTINCTION_TYPES = 11;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TECHNOLOGIES = 12;

	/**
	 * The feature id for the '<em><b>Activity types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACTIVITY_TYPES = 13;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.CitationNameImpl <em>Citation Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.CitationNameImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getCitationName()
	 * @generated
	 */
	int CITATION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Citation Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Citation Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.WebsiteImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__URL = 0;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.IdiomImpl <em>Idiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.IdiomImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getIdiom()
	 * @generated
	 */
	int IDIOM = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__LANG = 0;

	/**
	 * The feature id for the '<em><b>Speaking qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__SPEAKING_QUAL = 1;

	/**
	 * The feature id for the '<em><b>Reading qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__READING_QUAL = 2;

	/**
	 * The feature id for the '<em><b>Writing qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__WRITING_QUAL = 3;

	/**
	 * The feature id for the '<em><b>Listening qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__LISTENING_QUAL = 4;

	/**
	 * The feature id for the '<em><b>Native lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM__NATIVE_LANG = 5;

	/**
	 * The number of structural features of the '<em>Idiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Listening qual restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM___LISTENING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Speaking qual restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM___SPEAKING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Reading qual restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM___READING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Writing qual restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM___WRITING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Idiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIOM_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.DegreeImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 5;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__INSTITUTION = 0;

	/**
	 * The feature id for the '<em><b>Degree name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__DEGREE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__END = 3;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__PROJECTS = 4;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.ProjectImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.AffiliationImpl <em>Affiliation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.AffiliationImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getAffiliation()
	 * @generated
	 */
	int AFFILIATION = 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__EMPLOYER = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__END = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Affiliation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Affiliation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.AffiliationFieldImpl <em>Affiliation Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.AffiliationFieldImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getAffiliationField()
	 * @generated
	 */
	int AFFILIATION_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FIELD__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Affiliations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FIELD__AFFILIATIONS = 1;

	/**
	 * The number of structural features of the '<em>Affiliation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Affiliation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.DistinctionImpl <em>Distinction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.DistinctionImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDistinction()
	 * @generated
	 */
	int DISTINCTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION__DATE = 1;

	/**
	 * The number of structural features of the '<em>Distinction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distinction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.DistinctionTypeImpl <em>Distinction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.DistinctionTypeImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDistinctionType()
	 * @generated
	 */
	int DISTINCTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Distinctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_TYPE__DISTINCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Distinction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distinction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.ActivityImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.ActivityTypeImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__ACTIVITIES = 1;

	/**
	 * The number of structural features of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculum_vitae.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculum_vitae.impl.TechnologyImpl
	 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Proficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__PROFICIENCY = 1;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Proficiency Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY___PROFICIENCY_LIMIT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link curriculum_vitae.CurriculumVitae <em>Curriculum Vitae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curriculum Vitae</em>'.
	 * @see curriculum_vitae.CurriculumVitae
	 * @generated
	 */
	EClass getCurriculumVitae();

	/**
	 * Returns the meta object for the containment reference '{@link curriculum_vitae.CurriculumVitae#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see curriculum_vitae.CurriculumVitae#getPerson()
	 * @see #getCurriculumVitae()
	 * @generated
	 */
	EReference getCurriculumVitae_Person();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see curriculum_vitae.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Person#getFull_name <em>Full name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full name</em>'.
	 * @see curriculum_vitae.Person#getFull_name()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Full_name();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Person#getDate_of_birth <em>Date of birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date of birth</em>'.
	 * @see curriculum_vitae.Person#getDate_of_birth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Date_of_birth();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Person#getPhone_number <em>Phone number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone number</em>'.
	 * @see curriculum_vitae.Person#getPhone_number()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Phone_number();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Person#getHome_address <em>Home address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home address</em>'.
	 * @see curriculum_vitae.Person#getHome_address()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Home_address();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Person#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see curriculum_vitae.Person#getDescription()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getCitation_names <em>Citation names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Citation names</em>'.
	 * @see curriculum_vitae.Person#getCitation_names()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Citation_names();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getWebsites <em>Websites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Websites</em>'.
	 * @see curriculum_vitae.Person#getWebsites()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Websites();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getIdioms <em>Idioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idioms</em>'.
	 * @see curriculum_vitae.Person#getIdioms()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Idioms();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Degrees</em>'.
	 * @see curriculum_vitae.Person#getDegrees()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Degrees();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see curriculum_vitae.Person#getProjects()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getAffiliation_fields <em>Affiliation fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliation fields</em>'.
	 * @see curriculum_vitae.Person#getAffiliation_fields()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Affiliation_fields();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getDistinction_types <em>Distinction types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distinction types</em>'.
	 * @see curriculum_vitae.Person#getDistinction_types()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Distinction_types();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see curriculum_vitae.Person#getTechnologies()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Technologies();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Person#getActivity_types <em>Activity types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity types</em>'.
	 * @see curriculum_vitae.Person#getActivity_types()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Activity_types();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.CitationName <em>Citation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation Name</em>'.
	 * @see curriculum_vitae.CitationName
	 * @generated
	 */
	EClass getCitationName();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.CitationName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curriculum_vitae.CitationName#getName()
	 * @see #getCitationName()
	 * @generated
	 */
	EAttribute getCitationName_Name();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see curriculum_vitae.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Website#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see curriculum_vitae.Website#getUrl()
	 * @see #getWebsite()
	 * @generated
	 */
	EAttribute getWebsite_Url();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Idiom <em>Idiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idiom</em>'.
	 * @see curriculum_vitae.Idiom
	 * @generated
	 */
	EClass getIdiom();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see curriculum_vitae.Idiom#getLang()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Lang();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#getSpeaking_qual <em>Speaking qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speaking qual</em>'.
	 * @see curriculum_vitae.Idiom#getSpeaking_qual()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Speaking_qual();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#getReading_qual <em>Reading qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading qual</em>'.
	 * @see curriculum_vitae.Idiom#getReading_qual()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Reading_qual();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#getWriting_qual <em>Writing qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writing qual</em>'.
	 * @see curriculum_vitae.Idiom#getWriting_qual()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Writing_qual();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#getListening_qual <em>Listening qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listening qual</em>'.
	 * @see curriculum_vitae.Idiom#getListening_qual()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Listening_qual();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Idiom#isNative_lang <em>Native lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native lang</em>'.
	 * @see curriculum_vitae.Idiom#isNative_lang()
	 * @see #getIdiom()
	 * @generated
	 */
	EAttribute getIdiom_Native_lang();

	/**
	 * Returns the meta object for the '{@link curriculum_vitae.Idiom#listening_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Listening qual restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Listening qual restriction</em>' operation.
	 * @see curriculum_vitae.Idiom#listening_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdiom__Listening_qual_restriction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link curriculum_vitae.Idiom#speaking_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Speaking qual restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Speaking qual restriction</em>' operation.
	 * @see curriculum_vitae.Idiom#speaking_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdiom__Speaking_qual_restriction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link curriculum_vitae.Idiom#reading_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reading qual restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reading qual restriction</em>' operation.
	 * @see curriculum_vitae.Idiom#reading_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdiom__Reading_qual_restriction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link curriculum_vitae.Idiom#writing_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Writing qual restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Writing qual restriction</em>' operation.
	 * @see curriculum_vitae.Idiom#writing_qual_restriction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdiom__Writing_qual_restriction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see curriculum_vitae.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Degree#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see curriculum_vitae.Degree#getInstitution()
	 * @see #getDegree()
	 * @generated
	 */
	EAttribute getDegree_Institution();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Degree#getDegree_name <em>Degree name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree name</em>'.
	 * @see curriculum_vitae.Degree#getDegree_name()
	 * @see #getDegree()
	 * @generated
	 */
	EAttribute getDegree_Degree_name();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Degree#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see curriculum_vitae.Degree#getStart()
	 * @see #getDegree()
	 * @generated
	 */
	EAttribute getDegree_Start();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Degree#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see curriculum_vitae.Degree#getEnd()
	 * @see #getDegree()
	 * @generated
	 */
	EAttribute getDegree_End();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.Degree#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see curriculum_vitae.Degree#getProjects()
	 * @see #getDegree()
	 * @generated
	 */
	EReference getDegree_Projects();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see curriculum_vitae.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curriculum_vitae.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see curriculum_vitae.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Affiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affiliation</em>'.
	 * @see curriculum_vitae.Affiliation
	 * @generated
	 */
	EClass getAffiliation();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Affiliation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see curriculum_vitae.Affiliation#getRole()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Role();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Affiliation#getEmployer <em>Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employer</em>'.
	 * @see curriculum_vitae.Affiliation#getEmployer()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Employer();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Affiliation#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see curriculum_vitae.Affiliation#getStart()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Start();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Affiliation#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see curriculum_vitae.Affiliation#getEnd()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_End();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Affiliation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see curriculum_vitae.Affiliation#getDescription()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Description();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.AffiliationField <em>Affiliation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affiliation Field</em>'.
	 * @see curriculum_vitae.AffiliationField
	 * @generated
	 */
	EClass getAffiliationField();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.AffiliationField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see curriculum_vitae.AffiliationField#getField()
	 * @see #getAffiliationField()
	 * @generated
	 */
	EAttribute getAffiliationField_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.AffiliationField#getAffiliations <em>Affiliations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliations</em>'.
	 * @see curriculum_vitae.AffiliationField#getAffiliations()
	 * @see #getAffiliationField()
	 * @generated
	 */
	EReference getAffiliationField_Affiliations();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Distinction <em>Distinction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinction</em>'.
	 * @see curriculum_vitae.Distinction
	 * @generated
	 */
	EClass getDistinction();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Distinction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curriculum_vitae.Distinction#getName()
	 * @see #getDistinction()
	 * @generated
	 */
	EAttribute getDistinction_Name();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Distinction#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see curriculum_vitae.Distinction#getDate()
	 * @see #getDistinction()
	 * @generated
	 */
	EAttribute getDistinction_Date();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.DistinctionType <em>Distinction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinction Type</em>'.
	 * @see curriculum_vitae.DistinctionType
	 * @generated
	 */
	EClass getDistinctionType();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.DistinctionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see curriculum_vitae.DistinctionType#getType()
	 * @see #getDistinctionType()
	 * @generated
	 */
	EAttribute getDistinctionType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.DistinctionType#getDistinctions <em>Distinctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distinctions</em>'.
	 * @see curriculum_vitae.DistinctionType#getDistinctions()
	 * @see #getDistinctionType()
	 * @generated
	 */
	EReference getDistinctionType_Distinctions();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see curriculum_vitae.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Activity#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see curriculum_vitae.Activity#getRole()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Role();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Activity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see curriculum_vitae.Activity#getDescription()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Description();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Type</em>'.
	 * @see curriculum_vitae.ActivityType
	 * @generated
	 */
	EClass getActivityType();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.ActivityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see curriculum_vitae.ActivityType#getType()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculum_vitae.ActivityType#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see curriculum_vitae.ActivityType#getActivities()
	 * @see #getActivityType()
	 * @generated
	 */
	EReference getActivityType_Activities();

	/**
	 * Returns the meta object for class '{@link curriculum_vitae.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see curriculum_vitae.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curriculum_vitae.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the attribute '{@link curriculum_vitae.Technology#getProficiency <em>Proficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proficiency</em>'.
	 * @see curriculum_vitae.Technology#getProficiency()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Proficiency();

	/**
	 * Returns the meta object for the '{@link curriculum_vitae.Technology#proficiencyLimit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Proficiency Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Proficiency Limit</em>' operation.
	 * @see curriculum_vitae.Technology#proficiencyLimit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTechnology__ProficiencyLimit__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Curriculum_vitaeFactory getCurriculum_vitaeFactory();

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
		 * The meta object literal for the '{@link curriculum_vitae.impl.CurriculumVitaeImpl <em>Curriculum Vitae</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.CurriculumVitaeImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getCurriculumVitae()
		 * @generated
		 */
		EClass CURRICULUM_VITAE = eINSTANCE.getCurriculumVitae();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRICULUM_VITAE__PERSON = eINSTANCE.getCurriculumVitae_Person();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.PersonImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Full name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_Full_name();

		/**
		 * The meta object literal for the '<em><b>Date of birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_Date_of_birth();

		/**
		 * The meta object literal for the '<em><b>Phone number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE_NUMBER = eINSTANCE.getPerson_Phone_number();

		/**
		 * The meta object literal for the '<em><b>Home address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HOME_ADDRESS = eINSTANCE.getPerson_Home_address();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DESCRIPTION = eINSTANCE.getPerson_Description();

		/**
		 * The meta object literal for the '<em><b>Citation names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CITATION_NAMES = eINSTANCE.getPerson_Citation_names();

		/**
		 * The meta object literal for the '<em><b>Websites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__WEBSITES = eINSTANCE.getPerson_Websites();

		/**
		 * The meta object literal for the '<em><b>Idioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IDIOMS = eINSTANCE.getPerson_Idioms();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEGREES = eINSTANCE.getPerson_Degrees();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PROJECTS = eINSTANCE.getPerson_Projects();

		/**
		 * The meta object literal for the '<em><b>Affiliation fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AFFILIATION_FIELDS = eINSTANCE.getPerson_Affiliation_fields();

		/**
		 * The meta object literal for the '<em><b>Distinction types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DISTINCTION_TYPES = eINSTANCE.getPerson_Distinction_types();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TECHNOLOGIES = eINSTANCE.getPerson_Technologies();

		/**
		 * The meta object literal for the '<em><b>Activity types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ACTIVITY_TYPES = eINSTANCE.getPerson_Activity_types();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.CitationNameImpl <em>Citation Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.CitationNameImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getCitationName()
		 * @generated
		 */
		EClass CITATION_NAME = eINSTANCE.getCitationName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION_NAME__NAME = eINSTANCE.getCitationName_Name();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.WebsiteImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE__URL = eINSTANCE.getWebsite_Url();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.IdiomImpl <em>Idiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.IdiomImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getIdiom()
		 * @generated
		 */
		EClass IDIOM = eINSTANCE.getIdiom();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__LANG = eINSTANCE.getIdiom_Lang();

		/**
		 * The meta object literal for the '<em><b>Speaking qual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__SPEAKING_QUAL = eINSTANCE.getIdiom_Speaking_qual();

		/**
		 * The meta object literal for the '<em><b>Reading qual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__READING_QUAL = eINSTANCE.getIdiom_Reading_qual();

		/**
		 * The meta object literal for the '<em><b>Writing qual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__WRITING_QUAL = eINSTANCE.getIdiom_Writing_qual();

		/**
		 * The meta object literal for the '<em><b>Listening qual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__LISTENING_QUAL = eINSTANCE.getIdiom_Listening_qual();

		/**
		 * The meta object literal for the '<em><b>Native lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIOM__NATIVE_LANG = eINSTANCE.getIdiom_Native_lang();

		/**
		 * The meta object literal for the '<em><b>Listening qual restriction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDIOM___LISTENING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdiom__Listening_qual_restriction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Speaking qual restriction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDIOM___SPEAKING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdiom__Speaking_qual_restriction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Reading qual restriction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDIOM___READING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdiom__Reading_qual_restriction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Writing qual restriction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDIOM___WRITING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdiom__Writing_qual_restriction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.DegreeImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__INSTITUTION = eINSTANCE.getDegree_Institution();

		/**
		 * The meta object literal for the '<em><b>Degree name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__DEGREE_NAME = eINSTANCE.getDegree_Degree_name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__START = eINSTANCE.getDegree_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__END = eINSTANCE.getDegree_End();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE__PROJECTS = eINSTANCE.getDegree_Projects();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.ProjectImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.AffiliationImpl <em>Affiliation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.AffiliationImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getAffiliation()
		 * @generated
		 */
		EClass AFFILIATION = eINSTANCE.getAffiliation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__ROLE = eINSTANCE.getAffiliation_Role();

		/**
		 * The meta object literal for the '<em><b>Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__EMPLOYER = eINSTANCE.getAffiliation_Employer();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__START = eINSTANCE.getAffiliation_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__END = eINSTANCE.getAffiliation_End();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__DESCRIPTION = eINSTANCE.getAffiliation_Description();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.AffiliationFieldImpl <em>Affiliation Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.AffiliationFieldImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getAffiliationField()
		 * @generated
		 */
		EClass AFFILIATION_FIELD = eINSTANCE.getAffiliationField();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION_FIELD__FIELD = eINSTANCE.getAffiliationField_Field();

		/**
		 * The meta object literal for the '<em><b>Affiliations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFILIATION_FIELD__AFFILIATIONS = eINSTANCE.getAffiliationField_Affiliations();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.DistinctionImpl <em>Distinction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.DistinctionImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDistinction()
		 * @generated
		 */
		EClass DISTINCTION = eINSTANCE.getDistinction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINCTION__NAME = eINSTANCE.getDistinction_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINCTION__DATE = eINSTANCE.getDistinction_Date();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.DistinctionTypeImpl <em>Distinction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.DistinctionTypeImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getDistinctionType()
		 * @generated
		 */
		EClass DISTINCTION_TYPE = eINSTANCE.getDistinctionType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINCTION_TYPE__TYPE = eINSTANCE.getDistinctionType_Type();

		/**
		 * The meta object literal for the '<em><b>Distinctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTINCTION_TYPE__DISTINCTIONS = eINSTANCE.getDistinctionType_Distinctions();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.ActivityImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ROLE = eINSTANCE.getActivity_Role();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__DESCRIPTION = eINSTANCE.getActivity_Description();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.ActivityTypeImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getActivityType()
		 * @generated
		 */
		EClass ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__TYPE = eINSTANCE.getActivityType_Type();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TYPE__ACTIVITIES = eINSTANCE.getActivityType_Activities();

		/**
		 * The meta object literal for the '{@link curriculum_vitae.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculum_vitae.impl.TechnologyImpl
		 * @see curriculum_vitae.impl.Curriculum_vitaePackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Proficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__PROFICIENCY = eINSTANCE.getTechnology_Proficiency();

		/**
		 * The meta object literal for the '<em><b>Proficiency Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TECHNOLOGY___PROFICIENCY_LIMIT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTechnology__ProficiencyLimit__DiagnosticChain_Map();

	}

} //Curriculum_vitaePackage
