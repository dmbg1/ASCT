/**
 */
package curriculum_vitae;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distinction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.DistinctionType#getType <em>Type</em>}</li>
 *   <li>{@link curriculum_vitae.DistinctionType#getDistinctions <em>Distinctions</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getDistinctionType()
 * @model
 * @generated
 */
public interface DistinctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDistinctionType_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link curriculum_vitae.DistinctionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Distinctions</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Distinction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinctions</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDistinctionType_Distinctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distinction> getDistinctions();

} // DistinctionType
