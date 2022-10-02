/**
 */
package universities;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universities.Grade#getStudent <em>Student</em>}</li>
 *   <li>{@link universities.Grade#getEdition <em>Edition</em>}</li>
 *   <li>{@link universities.Grade#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see universities.UniversitiesPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends EObject {
	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference.
	 * @see #setStudent(Student)
	 * @see universities.UniversitiesPackage#getGrade_Student()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link universities.Grade#getStudent <em>Student</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' containment reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(Edition)
	 * @see universities.UniversitiesPackage#getGrade_Edition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Edition getEdition();

	/**
	 * Sets the value of the '{@link universities.Grade#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(Edition value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(BigDecimal)
	 * @see universities.UniversitiesPackage#getGrade_Grade()
	 * @model
	 * @generated
	 */
	BigDecimal getGrade();

	/**
	 * Sets the value of the '{@link universities.Grade#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(BigDecimal value);

} // Grade
