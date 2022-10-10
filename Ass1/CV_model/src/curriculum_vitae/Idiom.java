/**
 */
package curriculum_vitae;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.Idiom#getLang <em>Lang</em>}</li>
 *   <li>{@link curriculum_vitae.Idiom#getSpeaking_qual <em>Speaking qual</em>}</li>
 *   <li>{@link curriculum_vitae.Idiom#getReading_qual <em>Reading qual</em>}</li>
 *   <li>{@link curriculum_vitae.Idiom#getWriting_qual <em>Writing qual</em>}</li>
 *   <li>{@link curriculum_vitae.Idiom#getListening_qual <em>Listening qual</em>}</li>
 * </ul>
 *
 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='writing_qual_restriction'"
 * @generated
 */
public interface Idiom extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Idiom#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Speaking qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaking qual</em>' attribute.
	 * @see #setSpeaking_qual(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom_Speaking_qual()
	 * @model
	 * @generated
	 */
	String getSpeaking_qual();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Idiom#getSpeaking_qual <em>Speaking qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaking qual</em>' attribute.
	 * @see #getSpeaking_qual()
	 * @generated
	 */
	void setSpeaking_qual(String value);

	/**
	 * Returns the value of the '<em><b>Reading qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading qual</em>' attribute.
	 * @see #setReading_qual(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom_Reading_qual()
	 * @model
	 * @generated
	 */
	String getReading_qual();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Idiom#getReading_qual <em>Reading qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading qual</em>' attribute.
	 * @see #getReading_qual()
	 * @generated
	 */
	void setReading_qual(String value);

	/**
	 * Returns the value of the '<em><b>Writing qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing qual</em>' attribute.
	 * @see #setWriting_qual(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom_Writing_qual()
	 * @model
	 * @generated
	 */
	String getWriting_qual();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Idiom#getWriting_qual <em>Writing qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writing qual</em>' attribute.
	 * @see #getWriting_qual()
	 * @generated
	 */
	void setWriting_qual(String value);

	/**
	 * Returns the value of the '<em><b>Listening qual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listening qual</em>' attribute.
	 * @see #setListening_qual(String)
	 * @see curriculum_vitae.Curriculum_vitaePackage#getIdiom_Listening_qual()
	 * @model
	 * @generated
	 */
	String getListening_qual();

	/**
	 * Sets the value of the '{@link curriculum_vitae.Idiom#getListening_qual <em>Listening qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listening qual</em>' attribute.
	 * @see #getListening_qual()
	 * @generated
	 */
	void setListening_qual(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}-&gt;includes(self.listening_qual)'"
	 * @generated
	 */
	boolean listening_qual_restriction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}-&gt;includes(self.speaking_qual)'"
	 * @generated
	 */
	boolean speaking_qual_restriction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}-&gt;includes(self.reading_qual)'"
	 * @generated
	 */
	boolean reading_qual_restriction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'C1\', \'c1\', \'C2\', \'c2\', \'B1\', \'b1\', \'B2\', \'b2\', \'A1\', \'a1\', \'A2\', \'a2\'}-&gt;includes(self.writing_qual)'"
	 * @generated
	 */
	boolean writing_qual_restriction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Idiom
