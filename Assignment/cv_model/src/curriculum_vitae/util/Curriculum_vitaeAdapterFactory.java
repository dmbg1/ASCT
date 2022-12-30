/**
 */
package curriculum_vitae.util;

import curriculum_vitae.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see curriculum_vitae.Curriculum_vitaePackage
 * @generated
 */
public class Curriculum_vitaeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Curriculum_vitaePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curriculum_vitaeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Curriculum_vitaePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Curriculum_vitaeSwitch<Adapter> modelSwitch =
		new Curriculum_vitaeSwitch<Adapter>() {
			@Override
			public Adapter caseCurriculumVitae(CurriculumVitae object) {
				return createCurriculumVitaeAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseCitationName(CitationName object) {
				return createCitationNameAdapter();
			}
			@Override
			public Adapter caseWebsite(Website object) {
				return createWebsiteAdapter();
			}
			@Override
			public Adapter caseIdiom(Idiom object) {
				return createIdiomAdapter();
			}
			@Override
			public Adapter caseDegree(Degree object) {
				return createDegreeAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseAffiliation(Affiliation object) {
				return createAffiliationAdapter();
			}
			@Override
			public Adapter caseAffiliationField(AffiliationField object) {
				return createAffiliationFieldAdapter();
			}
			@Override
			public Adapter caseDistinction(Distinction object) {
				return createDistinctionAdapter();
			}
			@Override
			public Adapter caseDistinctionType(DistinctionType object) {
				return createDistinctionTypeAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseActivityType(ActivityType object) {
				return createActivityTypeAdapter();
			}
			@Override
			public Adapter caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.CurriculumVitae <em>Curriculum Vitae</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.CurriculumVitae
	 * @generated
	 */
	public Adapter createCurriculumVitaeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.CitationName <em>Citation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.CitationName
	 * @generated
	 */
	public Adapter createCitationNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Idiom <em>Idiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Idiom
	 * @generated
	 */
	public Adapter createIdiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Affiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Affiliation
	 * @generated
	 */
	public Adapter createAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.AffiliationField <em>Affiliation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.AffiliationField
	 * @generated
	 */
	public Adapter createAffiliationFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Distinction <em>Distinction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Distinction
	 * @generated
	 */
	public Adapter createDistinctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.DistinctionType <em>Distinction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.DistinctionType
	 * @generated
	 */
	public Adapter createDistinctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.ActivityType
	 * @generated
	 */
	public Adapter createActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link curriculum_vitae.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see curriculum_vitae.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Curriculum_vitaeAdapterFactory
