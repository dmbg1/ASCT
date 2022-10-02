/**
 */
package universities;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universities.Edition#getEdition_nr <em>Edition nr</em>}</li>
 *   <li>{@link universities.Edition#getProfessors <em>Professors</em>}</li>
 *   <li>{@link universities.Edition#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see universities.UniversitiesPackage#getEdition()
 * @model
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition nr</em>' attribute.
	 * @see #setEdition_nr(BigInteger)
	 * @see universities.UniversitiesPackage#getEdition_Edition_nr()
	 * @model
	 * @generated
	 */
	BigInteger getEdition_nr();

	/**
	 * Sets the value of the '{@link universities.Edition#getEdition_nr <em>Edition nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition nr</em>' attribute.
	 * @see #getEdition_nr()
	 * @generated
	 */
	void setEdition_nr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' containment reference list.
	 * The list contents are of type {@link universities.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' containment reference list.
	 * @see universities.UniversitiesPackage#getEdition_Professors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor> getProfessors();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link universities.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see universities.UniversitiesPackage#getEdition_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // Edition
