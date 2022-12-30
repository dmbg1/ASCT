/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.Activity;
import curriculum_vitae.ActivityType;
import curriculum_vitae.Affiliation;
import curriculum_vitae.AffiliationField;
import curriculum_vitae.CitationName;
import curriculum_vitae.CurriculumVitae;
import curriculum_vitae.Curriculum_vitaeFactory;
import curriculum_vitae.Curriculum_vitaePackage;
import curriculum_vitae.Degree;
import curriculum_vitae.Distinction;
import curriculum_vitae.DistinctionType;
import curriculum_vitae.Idiom;
import curriculum_vitae.Person;
import curriculum_vitae.Project;
import curriculum_vitae.Technology;
import curriculum_vitae.Website;

import curriculum_vitae.util.Curriculum_vitaeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Curriculum_vitaePackageImpl extends EPackageImpl implements Curriculum_vitaePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curriculumVitaeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affiliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affiliationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distinctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distinctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;

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
	 * @see curriculum_vitae.Curriculum_vitaePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Curriculum_vitaePackageImpl() {
		super(eNS_URI, Curriculum_vitaeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Curriculum_vitaePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Curriculum_vitaePackage init() {
		if (isInited) return (Curriculum_vitaePackage)EPackage.Registry.INSTANCE.getEPackage(Curriculum_vitaePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCurriculum_vitaePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Curriculum_vitaePackageImpl theCurriculum_vitaePackage = registeredCurriculum_vitaePackage instanceof Curriculum_vitaePackageImpl ? (Curriculum_vitaePackageImpl)registeredCurriculum_vitaePackage : new Curriculum_vitaePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCurriculum_vitaePackage.createPackageContents();

		// Initialize created meta-data
		theCurriculum_vitaePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCurriculum_vitaePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Curriculum_vitaeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCurriculum_vitaePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Curriculum_vitaePackage.eNS_URI, theCurriculum_vitaePackage);
		return theCurriculum_vitaePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurriculumVitae() {
		return curriculumVitaeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurriculumVitae_Person() {
		return (EReference)curriculumVitaeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Full_name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Date_of_birth() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Phone_number() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Home_address() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Description() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Citation_names() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Websites() {
		return (EReference)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Idioms() {
		return (EReference)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Degrees() {
		return (EReference)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Projects() {
		return (EReference)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Affiliation_fields() {
		return (EReference)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Distinction_types() {
		return (EReference)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Technologies() {
		return (EReference)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Activity_types() {
		return (EReference)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitationName() {
		return citationNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitationName_Name() {
		return (EAttribute)citationNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsite() {
		return websiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsite_Url() {
		return (EAttribute)websiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdiom() {
		return idiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Lang() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Speaking_qual() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Reading_qual() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Writing_qual() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Listening_qual() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdiom_Native_lang() {
		return (EAttribute)idiomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdiom__Listening_qual_restriction__DiagnosticChain_Map() {
		return idiomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdiom__Speaking_qual_restriction__DiagnosticChain_Map() {
		return idiomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdiom__Reading_qual_restriction__DiagnosticChain_Map() {
		return idiomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdiom__Writing_qual_restriction__DiagnosticChain_Map() {
		return idiomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegree() {
		return degreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree_Institution() {
		return (EAttribute)degreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree_Degree_name() {
		return (EAttribute)degreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree_Start() {
		return (EAttribute)degreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree_End() {
		return (EAttribute)degreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDegree_Projects() {
		return (EReference)degreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffiliation() {
		return affiliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Role() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Employer() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Start() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_End() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Description() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffiliationField() {
		return affiliationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliationField_Field() {
		return (EAttribute)affiliationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffiliationField_Affiliations() {
		return (EReference)affiliationFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistinction() {
		return distinctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinction_Name() {
		return (EAttribute)distinctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinction_Date() {
		return (EAttribute)distinctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistinctionType() {
		return distinctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinctionType_Type() {
		return (EAttribute)distinctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistinctionType_Distinctions() {
		return (EReference)distinctionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Role() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Description() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityType() {
		return activityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_Type() {
		return (EAttribute)activityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_Activities() {
		return (EReference)activityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnology_Name() {
		return (EAttribute)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnology_Proficiency() {
		return (EAttribute)technologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTechnology__ProficiencyLimit__DiagnosticChain_Map() {
		return technologyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curriculum_vitaeFactory getCurriculum_vitaeFactory() {
		return (Curriculum_vitaeFactory)getEFactoryInstance();
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
		curriculumVitaeEClass = createEClass(CURRICULUM_VITAE);
		createEReference(curriculumVitaeEClass, CURRICULUM_VITAE__PERSON);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FULL_NAME);
		createEAttribute(personEClass, PERSON__DATE_OF_BIRTH);
		createEAttribute(personEClass, PERSON__PHONE_NUMBER);
		createEAttribute(personEClass, PERSON__HOME_ADDRESS);
		createEAttribute(personEClass, PERSON__DESCRIPTION);
		createEReference(personEClass, PERSON__CITATION_NAMES);
		createEReference(personEClass, PERSON__WEBSITES);
		createEReference(personEClass, PERSON__IDIOMS);
		createEReference(personEClass, PERSON__DEGREES);
		createEReference(personEClass, PERSON__PROJECTS);
		createEReference(personEClass, PERSON__AFFILIATION_FIELDS);
		createEReference(personEClass, PERSON__DISTINCTION_TYPES);
		createEReference(personEClass, PERSON__TECHNOLOGIES);
		createEReference(personEClass, PERSON__ACTIVITY_TYPES);

		citationNameEClass = createEClass(CITATION_NAME);
		createEAttribute(citationNameEClass, CITATION_NAME__NAME);

		websiteEClass = createEClass(WEBSITE);
		createEAttribute(websiteEClass, WEBSITE__URL);

		idiomEClass = createEClass(IDIOM);
		createEAttribute(idiomEClass, IDIOM__LANG);
		createEAttribute(idiomEClass, IDIOM__SPEAKING_QUAL);
		createEAttribute(idiomEClass, IDIOM__READING_QUAL);
		createEAttribute(idiomEClass, IDIOM__WRITING_QUAL);
		createEAttribute(idiomEClass, IDIOM__LISTENING_QUAL);
		createEAttribute(idiomEClass, IDIOM__NATIVE_LANG);
		createEOperation(idiomEClass, IDIOM___LISTENING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(idiomEClass, IDIOM___SPEAKING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(idiomEClass, IDIOM___READING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(idiomEClass, IDIOM___WRITING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);

		degreeEClass = createEClass(DEGREE);
		createEAttribute(degreeEClass, DEGREE__INSTITUTION);
		createEAttribute(degreeEClass, DEGREE__DEGREE_NAME);
		createEAttribute(degreeEClass, DEGREE__START);
		createEAttribute(degreeEClass, DEGREE__END);
		createEReference(degreeEClass, DEGREE__PROJECTS);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);

		affiliationEClass = createEClass(AFFILIATION);
		createEAttribute(affiliationEClass, AFFILIATION__ROLE);
		createEAttribute(affiliationEClass, AFFILIATION__EMPLOYER);
		createEAttribute(affiliationEClass, AFFILIATION__START);
		createEAttribute(affiliationEClass, AFFILIATION__END);
		createEAttribute(affiliationEClass, AFFILIATION__DESCRIPTION);

		affiliationFieldEClass = createEClass(AFFILIATION_FIELD);
		createEAttribute(affiliationFieldEClass, AFFILIATION_FIELD__FIELD);
		createEReference(affiliationFieldEClass, AFFILIATION_FIELD__AFFILIATIONS);

		distinctionEClass = createEClass(DISTINCTION);
		createEAttribute(distinctionEClass, DISTINCTION__NAME);
		createEAttribute(distinctionEClass, DISTINCTION__DATE);

		distinctionTypeEClass = createEClass(DISTINCTION_TYPE);
		createEAttribute(distinctionTypeEClass, DISTINCTION_TYPE__TYPE);
		createEReference(distinctionTypeEClass, DISTINCTION_TYPE__DISTINCTIONS);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__ROLE);
		createEAttribute(activityEClass, ACTIVITY__DESCRIPTION);

		activityTypeEClass = createEClass(ACTIVITY_TYPE);
		createEAttribute(activityTypeEClass, ACTIVITY_TYPE__TYPE);
		createEReference(activityTypeEClass, ACTIVITY_TYPE__ACTIVITIES);

		technologyEClass = createEClass(TECHNOLOGY);
		createEAttribute(technologyEClass, TECHNOLOGY__NAME);
		createEAttribute(technologyEClass, TECHNOLOGY__PROFICIENCY);
		createEOperation(technologyEClass, TECHNOLOGY___PROFICIENCY_LIMIT__DIAGNOSTICCHAIN_MAP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(curriculumVitaeEClass, CurriculumVitae.class, "CurriculumVitae", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurriculumVitae_Person(), this.getPerson(), null, "Person", null, 1, 1, CurriculumVitae.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Full_name(), ecorePackage.getEString(), "full_name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Date_of_birth(), ecorePackage.getEDate(), "date_of_birth", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Phone_number(), ecorePackage.getELong(), "phone_number", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Home_address(), ecorePackage.getEString(), "home_address", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Description(), ecorePackage.getEString(), "description", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Citation_names(), this.getCitationName(), null, "citation_names", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Websites(), this.getWebsite(), null, "websites", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Idioms(), this.getIdiom(), null, "idioms", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Degrees(), this.getDegree(), null, "degrees", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Projects(), this.getProject(), null, "projects", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Affiliation_fields(), this.getAffiliationField(), null, "affiliation_fields", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Distinction_types(), this.getDistinctionType(), null, "distinction_types", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Technologies(), this.getTechnology(), null, "technologies", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Activity_types(), this.getActivityType(), null, "activity_types", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citationNameEClass, CitationName.class, "CitationName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCitationName_Name(), ecorePackage.getEString(), "name", null, 0, 1, CitationName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websiteEClass, Website.class, "Website", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsite_Url(), ecorePackage.getEString(), "url", null, 0, 1, Website.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idiomEClass, Idiom.class, "Idiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdiom_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdiom_Speaking_qual(), ecorePackage.getEString(), "speaking_qual", null, 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdiom_Reading_qual(), ecorePackage.getEString(), "reading_qual", null, 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdiom_Writing_qual(), ecorePackage.getEString(), "writing_qual", null, 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdiom_Listening_qual(), ecorePackage.getEString(), "listening_qual", null, 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdiom_Native_lang(), ecorePackage.getEBoolean(), "native_lang", "false", 0, 1, Idiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getIdiom__Listening_qual_restriction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "listening_qual_restriction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdiom__Speaking_qual_restriction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "speaking_qual_restriction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdiom__Reading_qual_restriction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "reading_qual_restriction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdiom__Writing_qual_restriction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "writing_qual_restriction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(degreeEClass, Degree.class, "Degree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegree_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegree_Degree_name(), ecorePackage.getEString(), "degree_name", null, 0, 1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegree_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegree_End(), ecorePackage.getEDate(), "end", null, 0, 1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegree_Projects(), this.getProject(), null, "projects", null, 0, -1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affiliationEClass, Affiliation.class, "Affiliation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffiliation_Role(), ecorePackage.getEString(), "role", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Employer(), ecorePackage.getEString(), "employer", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_End(), ecorePackage.getEDate(), "end", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affiliationFieldEClass, AffiliationField.class, "AffiliationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffiliationField_Field(), ecorePackage.getEString(), "field", null, 0, 1, AffiliationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffiliationField_Affiliations(), this.getAffiliation(), null, "affiliations", null, 0, -1, AffiliationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distinctionEClass, Distinction.class, "Distinction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistinction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Distinction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistinction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Distinction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distinctionTypeEClass, DistinctionType.class, "DistinctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistinctionType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DistinctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistinctionType_Distinctions(), this.getDistinction(), null, "distinctions", null, 0, -1, DistinctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Role(), ecorePackage.getEString(), "role", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityTypeEClass, ActivityType.class, "ActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityType_Activities(), this.getActivity(), null, "activities", null, 0, -1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnology_Name(), ecorePackage.getEString(), "name", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnology_Proficiency(), ecorePackage.getEInt(), "proficiency", null, 1, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTechnology__ProficiencyLimit__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "proficiencyLimit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (idiomEClass,
		   source,
		   new String[] {
			   "constraints", "writing_qual_restriction"
		   });
		addAnnotation
		  (technologyEClass,
		   source,
		   new String[] {
			   "constraints", "proficiencyLimit"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getIdiom__Listening_qual_restriction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}->includes(self.listening_qual)"
		   });
		addAnnotation
		  (getIdiom__Speaking_qual_restriction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}->includes(self.speaking_qual)"
		   });
		addAnnotation
		  (getIdiom__Reading_qual_restriction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}->includes(self.reading_qual)"
		   });
		addAnnotation
		  (getIdiom__Writing_qual_restriction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}->includes(self.writing_qual)"
		   });
		addAnnotation
		  (getTechnology__ProficiencyLimit__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.proficiency >= 1 and self.proficiency <= 5"
		   });
	}

} //Curriculum_vitaePackageImpl
