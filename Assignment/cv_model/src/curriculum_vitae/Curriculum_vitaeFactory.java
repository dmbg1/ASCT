/**
 */
package curriculum_vitae;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see curriculum_vitae.Curriculum_vitaePackage
 * @generated
 */
public interface Curriculum_vitaeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Curriculum_vitaeFactory eINSTANCE = curriculum_vitae.impl.Curriculum_vitaeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Curriculum Vitae</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curriculum Vitae</em>'.
	 * @generated
	 */
	CurriculumVitae createCurriculumVitae();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Citation Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation Name</em>'.
	 * @generated
	 */
	CitationName createCitationName();

	/**
	 * Returns a new object of class '<em>Website</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Website</em>'.
	 * @generated
	 */
	Website createWebsite();

	/**
	 * Returns a new object of class '<em>Idiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idiom</em>'.
	 * @generated
	 */
	Idiom createIdiom();

	/**
	 * Returns a new object of class '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree</em>'.
	 * @generated
	 */
	Degree createDegree();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affiliation</em>'.
	 * @generated
	 */
	Affiliation createAffiliation();

	/**
	 * Returns a new object of class '<em>Affiliation Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affiliation Field</em>'.
	 * @generated
	 */
	AffiliationField createAffiliationField();

	/**
	 * Returns a new object of class '<em>Distinction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distinction</em>'.
	 * @generated
	 */
	Distinction createDistinction();

	/**
	 * Returns a new object of class '<em>Distinction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distinction Type</em>'.
	 * @generated
	 */
	DistinctionType createDistinctionType();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Type</em>'.
	 * @generated
	 */
	ActivityType createActivityType();

	/**
	 * Returns a new object of class '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technology</em>'.
	 * @generated
	 */
	Technology createTechnology();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Curriculum_vitaePackage getCurriculum_vitaePackage();

} //Curriculum_vitaeFactory
