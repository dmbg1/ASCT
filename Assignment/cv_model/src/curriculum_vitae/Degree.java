/**
 */
package curriculum_vitae;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.Degree#getInstitution <em>Institution</em>}</li>
 *   <li>{@link curriculum_vitae.Degree#getDegree_name <em>Degree name</em>}</li>
 *   <li>{@link curriculum_vitae.Degree#getStart <em>Start</em>}</li>
 *   <li>{@link curriculum_vitae.Degree#getEnd <em>End</em>}</li>
 *   <li>{@link curriculum_vitae.Degree#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree()
 * @model
 * @generated
 */
public interface Degree extends EObject {
	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Degree#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Degree name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree name</em>' attribute.
	 * @see #setDegree_name(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree_Degree_name()
	 * @model
	 * @generated
	 */
	String getDegree_name();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Degree#getDegree_name <em>Degree name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree name</em>' attribute.
	 * @see #getDegree_name()
	 * @generated
	 */
	void setDegree_name(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Degree#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Degree#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link curriculum_vitae.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see curriculum_vitae.Curriculum_vitaePackage#getDegree_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

} // Degree
