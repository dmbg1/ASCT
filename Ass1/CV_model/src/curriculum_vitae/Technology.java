/**
 */
package curriculum_vitae;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.Technology#getName <em>Name</em>}</li>
 *   <li>{@link curriculum_vitae.Technology#getProficiency <em>Proficiency</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getTechnology()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='proficiencyLimit'"
 * @generated
 */
public interface Technology extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getTechnology_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Technology#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Proficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proficiency</em>' attribute.
	 * @see #setProficiency(int)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getTechnology_Proficiency()
	 * @model required="true"
	 * @generated
	 */
	int getProficiency();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Technology#getProficiency <em>Proficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proficiency</em>' attribute.
	 * @see #getProficiency()
	 * @generated
	 */
	void setProficiency(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.proficiency &gt;= 1 and self.proficiency &lt;= 5'"
	 * @generated
	 */
	boolean proficiencyLimit(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Technology
