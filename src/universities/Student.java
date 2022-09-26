/**
 */
package universities;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universities.Student#getName <em>Name</em>}</li>
 *   <li>{@link universities.Student#getStudent_nr <em>Student nr</em>}</li>
 * </ul>
 *
 * @see universities.UniversitiesPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universities.UniversitiesPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universities.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student nr</em>' attribute.
	 * @see #setStudent_nr(BigInteger)
	 * @see universities.UniversitiesPackage#getStudent_Student_nr()
	 * @model
	 * @generated
	 */
	BigInteger getStudent_nr();

	/**
	 * Sets the value of the '{@link universities.Student#getStudent_nr <em>Student nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student nr</em>' attribute.
	 * @see #getStudent_nr()
	 * @generated
	 */
	void setStudent_nr(BigInteger value);

} // Student
