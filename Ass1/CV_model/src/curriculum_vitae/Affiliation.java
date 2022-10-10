/**
 */
package curriculum_vitae;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affiliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.Affiliation#getRole <em>Role</em>}</li>
 *   <li>{@link curriculum_vitae.Affiliation#getEmployer <em>Employer</em>}</li>
 *   <li>{@link curriculum_vitae.Affiliation#getStart <em>Start</em>}</li>
 *   <li>{@link curriculum_vitae.Affiliation#getEnd <em>End</em>}</li>
 *   <li>{@link curriculum_vitae.Affiliation#getHost_institution <em>Host institution</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation()
 * @model
 * @generated
 */
public interface Affiliation extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Affiliation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer</em>' attribute.
	 * @see #setEmployer(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation_Employer()
	 * @model
	 * @generated
	 */
	String getEmployer();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Affiliation#getEmployer <em>Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer</em>' attribute.
	 * @see #getEmployer()
	 * @generated
	 */
	void setEmployer(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Affiliation#getStart <em>Start</em>}' attribute.
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
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Affiliation#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Host institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host institution</em>' attribute.
	 * @see #setHost_institution(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getAffiliation_Host_institution()
	 * @model
	 * @generated
	 */
	String getHost_institution();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Affiliation#getHost_institution <em>Host institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host institution</em>' attribute.
	 * @see #getHost_institution()
	 * @generated
	 */
	void setHost_institution(String value);

} // Affiliation
