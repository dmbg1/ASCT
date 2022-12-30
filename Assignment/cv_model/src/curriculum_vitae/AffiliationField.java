/**
 */
package curriculum_vitae;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affiliation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.AffiliationField#getField <em>Field</em>}</li>
 *   <li>{@link curriculum_vitae.AffiliationField#getAffiliations <em>Affiliations</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliationField()
 * @model
 * @generated
 */
public interface AffiliationField extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliationField_Field()
	 * @model
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link curriculum_vitae.AffiliationField#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Affiliations</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Affiliation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliations</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliationField_Affiliations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Affiliation> getAffiliations();

} // AffiliationField
