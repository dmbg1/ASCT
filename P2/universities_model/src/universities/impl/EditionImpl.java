/**
 */
package universities.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universities.Edition;
import universities.Professor;
import universities.Student;
import universities.UniversitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universities.impl.EditionImpl#getEdition_nr <em>Edition nr</em>}</li>
 *   <li>{@link universities.impl.EditionImpl#getProfessors <em>Professors</em>}</li>
 *   <li>{@link universities.impl.EditionImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditionImpl extends MinimalEObjectImpl.Container implements Edition {
	/**
	 * The default value of the '{@link #getEdition_nr() <em>Edition nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition_nr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EDITION_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition_nr() <em>Edition nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition_nr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger edition_nr = EDITION_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfessors() <em>Professors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professors;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversitiesPackage.Literals.EDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEdition_nr() {
		return edition_nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition_nr(BigInteger newEdition_nr) {
		BigInteger oldEdition_nr = edition_nr;
		edition_nr = newEdition_nr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversitiesPackage.EDITION__EDITION_NR, oldEdition_nr, edition_nr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professor> getProfessors() {
		if (professors == null) {
			professors = new EObjectResolvingEList<Professor>(Professor.class, this, UniversitiesPackage.EDITION__PROFESSORS);
		}
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectResolvingEList<Student>(Student.class, this, UniversitiesPackage.EDITION__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversitiesPackage.EDITION__EDITION_NR:
				return getEdition_nr();
			case UniversitiesPackage.EDITION__PROFESSORS:
				return getProfessors();
			case UniversitiesPackage.EDITION__STUDENTS:
				return getStudents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversitiesPackage.EDITION__EDITION_NR:
				setEdition_nr((BigInteger)newValue);
				return;
			case UniversitiesPackage.EDITION__PROFESSORS:
				getProfessors().clear();
				getProfessors().addAll((Collection<? extends Professor>)newValue);
				return;
			case UniversitiesPackage.EDITION__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversitiesPackage.EDITION__EDITION_NR:
				setEdition_nr(EDITION_NR_EDEFAULT);
				return;
			case UniversitiesPackage.EDITION__PROFESSORS:
				getProfessors().clear();
				return;
			case UniversitiesPackage.EDITION__STUDENTS:
				getStudents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversitiesPackage.EDITION__EDITION_NR:
				return EDITION_NR_EDEFAULT == null ? edition_nr != null : !EDITION_NR_EDEFAULT.equals(edition_nr);
			case UniversitiesPackage.EDITION__PROFESSORS:
				return professors != null && !professors.isEmpty();
			case UniversitiesPackage.EDITION__STUDENTS:
				return students != null && !students.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (edition_nr: ");
		result.append(edition_nr);
		result.append(')');
		return result.toString();
	}

} //EditionImpl
