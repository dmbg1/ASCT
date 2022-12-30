/**
 */
package curriculum_vitae;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curriculum Vitae</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.CurriculumVitae#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getCurriculumVitae()
 * @model
 * @generated
 */
public interface CurriculumVitae extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getCurriculumVitae_Person()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link curriculum_vitae.CurriculumVitae#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // CurriculumVitae
