/**
 */
package curriculum_vitae;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.Person#getFull_name <em>Full name</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getPhone_number <em>Phone number</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getHome_address <em>Home address</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getDescription <em>Description</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getCitation_names <em>Citation names</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getWebsites <em>Websites</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getIdioms <em>Idioms</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getProjects <em>Projects</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getAffiliation_fields <em>Affiliation fields</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getDistinction_types <em>Distinction types</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link curriculum_vitae.Person#getActivity_types <em>Activity types</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full name</em>' attribute.
	 * @see #setFull_name(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Full_name()
	 * @model
	 * @generated
	 */
	String getFull_name();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Person#getFull_name <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full name</em>' attribute.
	 * @see #getFull_name()
	 * @generated
	 */
	void setFull_name(String value);

	/**
	 * Returns the value of the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date of birth</em>' attribute.
	 * @see #setDate_of_birth(Date)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Date_of_birth()
	 * @model
	 * @generated
	 */
	Date getDate_of_birth();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Person#getDate_of_birth <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of birth</em>' attribute.
	 * @see #getDate_of_birth()
	 * @generated
	 */
	void setDate_of_birth(Date value);

	/**
	 * Returns the value of the '<em><b>Phone number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone number</em>' attribute.
	 * @see #setPhone_number(long)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Phone_number()
	 * @model
	 * @generated
	 */
	long getPhone_number();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Person#getPhone_number <em>Phone number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone number</em>' attribute.
	 * @see #getPhone_number()
	 * @generated
	 */
	void setPhone_number(long value);

	/**
	 * Returns the value of the '<em><b>Home address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home address</em>' attribute.
	 * @see #setHome_address(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Home_address()
	 * @model
	 * @generated
	 */
	String getHome_address();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Person#getHome_address <em>Home address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home address</em>' attribute.
	 * @see #getHome_address()
	 * @generated
	 */
	void setHome_address(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Person#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Citation names</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.CitationName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation names</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Citation_names()
	 * @model containment="true"
	 * @generated
	 */
	EList<CitationName> getCitation_names();

	/**
	 * Returns the value of the '<em><b>Websites</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Website}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Websites</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Websites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Website> getWebsites();

	/**
	 * Returns the value of the '<em><b>Idioms</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Idiom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idioms</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Idioms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Idiom> getIdioms();

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Degrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Degree> getDegrees();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Affiliation fields</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.AffiliationField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation fields</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Affiliation_fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffiliationField> getAffiliation_fields();

	/**
	 * Returns the value of the '<em><b>Distinction types</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.DistinctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinction types</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Distinction_types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DistinctionType> getDistinction_types();

	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologies</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getTechnologies();

	/**
	 * Returns the value of the '<em><b>Activity types</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity types</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getPerson_Activity_types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityType> getActivity_types();

} // Person
