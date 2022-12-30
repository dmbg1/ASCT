/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.Curriculum_vitaePackage;
import curriculum_vitae.Degree;
import curriculum_vitae.Project;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.impl.DegreeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link curriculum_vitae.impl.DegreeImpl#getDegree_name <em>Degree name</em>}</li>
 *   <li>{@link curriculum_vitae.impl.DegreeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link curriculum_vitae.impl.DegreeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link curriculum_vitae.impl.DegreeImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeImpl extends MinimalEObjectImpl.Container implements Degree {
	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegree_name() <em>Degree name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegree_name() <em>Degree name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree_name()
	 * @generated
	 * @ordered
	 */
	protected String degree_name = DEGREE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Curriculum_vitaePackage.Literals.DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.DEGREE__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegree_name() {
		return degree_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree_name(String newDegree_name) {
		String oldDegree_name = degree_name;
		degree_name = newDegree_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.DEGREE__DEGREE_NAME, oldDegree_name, degree_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.DEGREE__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.DEGREE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, Curriculum_vitaePackage.DEGREE__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Curriculum_vitaePackage.DEGREE__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Curriculum_vitaePackage.DEGREE__INSTITUTION:
				return getInstitution();
			case Curriculum_vitaePackage.DEGREE__DEGREE_NAME:
				return getDegree_name();
			case Curriculum_vitaePackage.DEGREE__START:
				return getStart();
			case Curriculum_vitaePackage.DEGREE__END:
				return getEnd();
			case Curriculum_vitaePackage.DEGREE__PROJECTS:
				return getProjects();
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
			case Curriculum_vitaePackage.DEGREE__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case Curriculum_vitaePackage.DEGREE__DEGREE_NAME:
				setDegree_name((String)newValue);
				return;
			case Curriculum_vitaePackage.DEGREE__START:
				setStart((Date)newValue);
				return;
			case Curriculum_vitaePackage.DEGREE__END:
				setEnd((Date)newValue);
				return;
			case Curriculum_vitaePackage.DEGREE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
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
			case Curriculum_vitaePackage.DEGREE__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case Curriculum_vitaePackage.DEGREE__DEGREE_NAME:
				setDegree_name(DEGREE_NAME_EDEFAULT);
				return;
			case Curriculum_vitaePackage.DEGREE__START:
				setStart(START_EDEFAULT);
				return;
			case Curriculum_vitaePackage.DEGREE__END:
				setEnd(END_EDEFAULT);
				return;
			case Curriculum_vitaePackage.DEGREE__PROJECTS:
				getProjects().clear();
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
			case Curriculum_vitaePackage.DEGREE__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case Curriculum_vitaePackage.DEGREE__DEGREE_NAME:
				return DEGREE_NAME_EDEFAULT == null ? degree_name != null : !DEGREE_NAME_EDEFAULT.equals(degree_name);
			case Curriculum_vitaePackage.DEGREE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case Curriculum_vitaePackage.DEGREE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case Curriculum_vitaePackage.DEGREE__PROJECTS:
				return projects != null && !projects.isEmpty();
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
		result.append(" (institution: ");
		result.append(institution);
		result.append(", degree_name: ");
		result.append(degree_name);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //DegreeImpl
