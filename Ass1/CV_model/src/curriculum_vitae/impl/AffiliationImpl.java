/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.Affiliation;
import curriculum_vitae.Curriculum_vitaePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.impl.AffiliationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link curriculum_vitae.impl.AffiliationImpl#getEmployer <em>Employer</em>}</li>
 *   <li>{@link curriculum_vitae.impl.AffiliationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link curriculum_vitae.impl.AffiliationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link curriculum_vitae.impl.AffiliationImpl#getHost_institution <em>Host institution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffiliationImpl extends MinimalEObjectImpl.Container implements Affiliation {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployer() <em>Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployer()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployer() <em>Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployer()
	 * @generated
	 * @ordered
	 */
	protected String employer = EMPLOYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost_institution() <em>Host institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_institution()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost_institution() <em>Host institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_institution()
	 * @generated
	 * @ordered
	 */
	protected String host_institution = HOST_INSTITUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Curriculum_vitaePackage.Literals.AFFILIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.AFFILIATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployer(String newEmployer) {
		String oldEmployer = employer;
		employer = newEmployer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.AFFILIATION__EMPLOYER, oldEmployer, employer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.AFFILIATION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.AFFILIATION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost_institution() {
		return host_institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost_institution(String newHost_institution) {
		String oldHost_institution = host_institution;
		host_institution = newHost_institution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.AFFILIATION__HOST_INSTITUTION, oldHost_institution, host_institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Curriculum_vitaePackage.AFFILIATION__ROLE:
				return getRole();
			case Curriculum_vitaePackage.AFFILIATION__EMPLOYER:
				return getEmployer();
			case Curriculum_vitaePackage.AFFILIATION__START:
				return getStart();
			case Curriculum_vitaePackage.AFFILIATION__END:
				return getEnd();
			case Curriculum_vitaePackage.AFFILIATION__HOST_INSTITUTION:
				return getHost_institution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Curriculum_vitaePackage.AFFILIATION__ROLE:
				setRole((String)newValue);
				return;
			case Curriculum_vitaePackage.AFFILIATION__EMPLOYER:
				setEmployer((String)newValue);
				return;
			case Curriculum_vitaePackage.AFFILIATION__START:
				setStart((Date)newValue);
				return;
			case Curriculum_vitaePackage.AFFILIATION__END:
				setEnd((Date)newValue);
				return;
			case Curriculum_vitaePackage.AFFILIATION__HOST_INSTITUTION:
				setHost_institution((String)newValue);
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
			case Curriculum_vitaePackage.AFFILIATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Curriculum_vitaePackage.AFFILIATION__EMPLOYER:
				setEmployer(EMPLOYER_EDEFAULT);
				return;
			case Curriculum_vitaePackage.AFFILIATION__START:
				setStart(START_EDEFAULT);
				return;
			case Curriculum_vitaePackage.AFFILIATION__END:
				setEnd(END_EDEFAULT);
				return;
			case Curriculum_vitaePackage.AFFILIATION__HOST_INSTITUTION:
				setHost_institution(HOST_INSTITUTION_EDEFAULT);
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
			case Curriculum_vitaePackage.AFFILIATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Curriculum_vitaePackage.AFFILIATION__EMPLOYER:
				return EMPLOYER_EDEFAULT == null ? employer != null : !EMPLOYER_EDEFAULT.equals(employer);
			case Curriculum_vitaePackage.AFFILIATION__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case Curriculum_vitaePackage.AFFILIATION__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case Curriculum_vitaePackage.AFFILIATION__HOST_INSTITUTION:
				return HOST_INSTITUTION_EDEFAULT == null ? host_institution != null : !HOST_INSTITUTION_EDEFAULT.equals(host_institution);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", employer: ");
		result.append(employer);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", host_institution: ");
		result.append(host_institution);
		result.append(')');
		return result.toString();
	}

} //AffiliationImpl
