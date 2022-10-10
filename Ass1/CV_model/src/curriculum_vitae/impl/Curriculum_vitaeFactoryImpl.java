/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Curriculum_vitaeFactoryImpl extends EFactoryImpl implements Curriculum_vitaeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Curriculum_vitaeFactory init() {
		try {
			Curriculum_vitaeFactory theCurriculum_vitaeFactory = (Curriculum_vitaeFactory)EPackage.Registry.INSTANCE.getEFactory(Curriculum_vitaePackage.eNS_URI);
			if (theCurriculum_vitaeFactory != null) {
				return theCurriculum_vitaeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Curriculum_vitaeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curriculum_vitaeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Curriculum_vitaePackage.CURRICULUM_VITAE: return createCurriculumVitae();
			case Curriculum_vitaePackage.PERSON: return createPerson();
			case Curriculum_vitaePackage.CITATION_NAME: return createCitationName();
			case Curriculum_vitaePackage.WEBSITE: return createWebsite();
			case Curriculum_vitaePackage.IDIOM: return createIdiom();
			case Curriculum_vitaePackage.DEGREE: return createDegree();
			case Curriculum_vitaePackage.PROJECT: return createProject();
			case Curriculum_vitaePackage.AFFILIATION: return createAffiliation();
			case Curriculum_vitaePackage.AFFILIATION_FIELD: return createAffiliationField();
			case Curriculum_vitaePackage.DISTINCTION: return createDistinction();
			case Curriculum_vitaePackage.DISTINCTION_TYPE: return createDistinctionType();
			case Curriculum_vitaePackage.ACTIVITY: return createActivity();
			case Curriculum_vitaePackage.ACTIVITY_TYPE: return createActivityType();
			case Curriculum_vitaePackage.TECHNOLOGY: return createTechnology();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurriculumVitae createCurriculumVitae() {
		CurriculumVitaeImpl curriculumVitae = new CurriculumVitaeImpl();
		return curriculumVitae;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationName createCitationName() {
		CitationNameImpl citationName = new CitationNameImpl();
		return citationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Idiom createIdiom() {
		IdiomImpl idiom = new IdiomImpl();
		return idiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree createDegree() {
		DegreeImpl degree = new DegreeImpl();
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affiliation createAffiliation() {
		AffiliationImpl affiliation = new AffiliationImpl();
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffiliationField createAffiliationField() {
		AffiliationFieldImpl affiliationField = new AffiliationFieldImpl();
		return affiliationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distinction createDistinction() {
		DistinctionImpl distinction = new DistinctionImpl();
		return distinction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinctionType createDistinctionType() {
		DistinctionTypeImpl distinctionType = new DistinctionTypeImpl();
		return distinctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityType() {
		ActivityTypeImpl activityType = new ActivityTypeImpl();
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curriculum_vitaePackage getCurriculum_vitaePackage() {
		return (Curriculum_vitaePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Curriculum_vitaePackage getPackage() {
		return Curriculum_vitaePackage.eINSTANCE;
	}

} //Curriculum_vitaeFactoryImpl
