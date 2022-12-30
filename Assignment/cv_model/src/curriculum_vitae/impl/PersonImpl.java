/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.ActivityType;
import curriculum_vitae.AffiliationField;
import curriculum_vitae.CitationName;
import curriculum_vitae.Curriculum_vitaePackage;
import curriculum_vitae.Degree;
import curriculum_vitae.DistinctionType;
import curriculum_vitae.Idiom;
import curriculum_vitae.Person;
import curriculum_vitae.Project;
import curriculum_vitae.Technology;
import curriculum_vitae.Website;

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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getFull_name <em>Full name</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getPhone_number <em>Phone number</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getHome_address <em>Home address</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getCitation_names <em>Citation names</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getWebsites <em>Websites</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getIdioms <em>Idioms</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getAffiliation_fields <em>Affiliation fields</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getDistinction_types <em>Distinction types</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link curriculum_vitae.impl.PersonImpl#getActivity_types <em>Activity types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected String full_name = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected Date date_of_birth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone_number() <em>Phone number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_number()
	 * @generated
	 * @ordered
	 */
	protected static final long PHONE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPhone_number() <em>Phone number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_number()
	 * @generated
	 * @ordered
	 */
	protected long phone_number = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_address() <em>Home address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_address()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHome_address() <em>Home address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_address()
	 * @generated
	 * @ordered
	 */
	protected String home_address = HOME_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCitation_names() <em>Citation names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation_names()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationName> citation_names;

	/**
	 * The cached value of the '{@link #getWebsites() <em>Websites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsites()
	 * @generated
	 * @ordered
	 */
	protected EList<Website> websites;

	/**
	 * The cached value of the '{@link #getIdioms() <em>Idioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdioms()
	 * @generated
	 * @ordered
	 */
	protected EList<Idiom> idioms;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Degree> degrees;

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
	 * The cached value of the '{@link #getAffiliation_fields() <em>Affiliation fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation_fields()
	 * @generated
	 * @ordered
	 */
	protected EList<AffiliationField> affiliation_fields;

	/**
	 * The cached value of the '{@link #getDistinction_types() <em>Distinction types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinction_types()
	 * @generated
	 * @ordered
	 */
	protected EList<DistinctionType> distinction_types;

	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> technologies;

	/**
	 * The cached value of the '{@link #getActivity_types() <em>Activity types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_types()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity_types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Curriculum_vitaePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFull_name() {
		return full_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFull_name(String newFull_name) {
		String oldFull_name = full_name;
		full_name = newFull_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.PERSON__FULL_NAME, oldFull_name, full_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_of_birth(Date newDate_of_birth) {
		Date oldDate_of_birth = date_of_birth;
		date_of_birth = newDate_of_birth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH, oldDate_of_birth, date_of_birth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPhone_number() {
		return phone_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone_number(long newPhone_number) {
		long oldPhone_number = phone_number;
		phone_number = newPhone_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.PERSON__PHONE_NUMBER, oldPhone_number, phone_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHome_address() {
		return home_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_address(String newHome_address) {
		String oldHome_address = home_address;
		home_address = newHome_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.PERSON__HOME_ADDRESS, oldHome_address, home_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.PERSON__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationName> getCitation_names() {
		if (citation_names == null) {
			citation_names = new EObjectContainmentEList<CitationName>(CitationName.class, this, Curriculum_vitaePackage.PERSON__CITATION_NAMES);
		}
		return citation_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Website> getWebsites() {
		if (websites == null) {
			websites = new EObjectContainmentEList<Website>(Website.class, this, Curriculum_vitaePackage.PERSON__WEBSITES);
		}
		return websites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Idiom> getIdioms() {
		if (idioms == null) {
			idioms = new EObjectContainmentEList<Idiom>(Idiom.class, this, Curriculum_vitaePackage.PERSON__IDIOMS);
		}
		return idioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Degree> getDegrees() {
		if (degrees == null) {
			degrees = new EObjectContainmentEList<Degree>(Degree.class, this, Curriculum_vitaePackage.PERSON__DEGREES);
		}
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, Curriculum_vitaePackage.PERSON__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AffiliationField> getAffiliation_fields() {
		if (affiliation_fields == null) {
			affiliation_fields = new EObjectContainmentEList<AffiliationField>(AffiliationField.class, this, Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS);
		}
		return affiliation_fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistinctionType> getDistinction_types() {
		if (distinction_types == null) {
			distinction_types = new EObjectContainmentEList<DistinctionType>(DistinctionType.class, this, Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES);
		}
		return distinction_types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Technology> getTechnologies() {
		if (technologies == null) {
			technologies = new EObjectContainmentEList<Technology>(Technology.class, this, Curriculum_vitaePackage.PERSON__TECHNOLOGIES);
		}
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity_types() {
		if (activity_types == null) {
			activity_types = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES);
		}
		return activity_types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
				return ((InternalEList<?>)getCitation_names()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__WEBSITES:
				return ((InternalEList<?>)getWebsites()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__IDIOMS:
				return ((InternalEList<?>)getIdioms()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__DEGREES:
				return ((InternalEList<?>)getDegrees()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS:
				return ((InternalEList<?>)getAffiliation_fields()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
				return ((InternalEList<?>)getDistinction_types()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				return ((InternalEList<?>)getTechnologies()).basicRemove(otherEnd, msgs);
			case Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES:
				return ((InternalEList<?>)getActivity_types()).basicRemove(otherEnd, msgs);
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
			case Curriculum_vitaePackage.PERSON__FULL_NAME:
				return getFull_name();
			case Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH:
				return getDate_of_birth();
			case Curriculum_vitaePackage.PERSON__PHONE_NUMBER:
				return getPhone_number();
			case Curriculum_vitaePackage.PERSON__HOME_ADDRESS:
				return getHome_address();
			case Curriculum_vitaePackage.PERSON__DESCRIPTION:
				return getDescription();
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
				return getCitation_names();
			case Curriculum_vitaePackage.PERSON__WEBSITES:
				return getWebsites();
			case Curriculum_vitaePackage.PERSON__IDIOMS:
				return getIdioms();
			case Curriculum_vitaePackage.PERSON__DEGREES:
				return getDegrees();
			case Curriculum_vitaePackage.PERSON__PROJECTS:
				return getProjects();
			case Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS:
				return getAffiliation_fields();
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
				return getDistinction_types();
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				return getTechnologies();
			case Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES:
				return getActivity_types();
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
			case Curriculum_vitaePackage.PERSON__FULL_NAME:
				setFull_name((String)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH:
				setDate_of_birth((Date)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__PHONE_NUMBER:
				setPhone_number((Long)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__HOME_ADDRESS:
				setHome_address((String)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
				getCitation_names().clear();
				getCitation_names().addAll((Collection<? extends CitationName>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__WEBSITES:
				getWebsites().clear();
				getWebsites().addAll((Collection<? extends Website>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__IDIOMS:
				getIdioms().clear();
				getIdioms().addAll((Collection<? extends Idiom>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends Degree>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS:
				getAffiliation_fields().clear();
				getAffiliation_fields().addAll((Collection<? extends AffiliationField>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
				getDistinction_types().clear();
				getDistinction_types().addAll((Collection<? extends DistinctionType>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				getTechnologies().clear();
				getTechnologies().addAll((Collection<? extends Technology>)newValue);
				return;
			case Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES:
				getActivity_types().clear();
				getActivity_types().addAll((Collection<? extends ActivityType>)newValue);
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
			case Curriculum_vitaePackage.PERSON__FULL_NAME:
				setFull_name(FULL_NAME_EDEFAULT);
				return;
			case Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH:
				setDate_of_birth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case Curriculum_vitaePackage.PERSON__PHONE_NUMBER:
				setPhone_number(PHONE_NUMBER_EDEFAULT);
				return;
			case Curriculum_vitaePackage.PERSON__HOME_ADDRESS:
				setHome_address(HOME_ADDRESS_EDEFAULT);
				return;
			case Curriculum_vitaePackage.PERSON__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
				getCitation_names().clear();
				return;
			case Curriculum_vitaePackage.PERSON__WEBSITES:
				getWebsites().clear();
				return;
			case Curriculum_vitaePackage.PERSON__IDIOMS:
				getIdioms().clear();
				return;
			case Curriculum_vitaePackage.PERSON__DEGREES:
				getDegrees().clear();
				return;
			case Curriculum_vitaePackage.PERSON__PROJECTS:
				getProjects().clear();
				return;
			case Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS:
				getAffiliation_fields().clear();
				return;
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
				getDistinction_types().clear();
				return;
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				getTechnologies().clear();
				return;
			case Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES:
				getActivity_types().clear();
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
			case Curriculum_vitaePackage.PERSON__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? full_name != null : !FULL_NAME_EDEFAULT.equals(full_name);
			case Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? date_of_birth != null : !DATE_OF_BIRTH_EDEFAULT.equals(date_of_birth);
			case Curriculum_vitaePackage.PERSON__PHONE_NUMBER:
				return phone_number != PHONE_NUMBER_EDEFAULT;
			case Curriculum_vitaePackage.PERSON__HOME_ADDRESS:
				return HOME_ADDRESS_EDEFAULT == null ? home_address != null : !HOME_ADDRESS_EDEFAULT.equals(home_address);
			case Curriculum_vitaePackage.PERSON__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
				return citation_names != null && !citation_names.isEmpty();
			case Curriculum_vitaePackage.PERSON__WEBSITES:
				return websites != null && !websites.isEmpty();
			case Curriculum_vitaePackage.PERSON__IDIOMS:
				return idioms != null && !idioms.isEmpty();
			case Curriculum_vitaePackage.PERSON__DEGREES:
				return degrees != null && !degrees.isEmpty();
			case Curriculum_vitaePackage.PERSON__PROJECTS:
				return projects != null && !projects.isEmpty();
			case Curriculum_vitaePackage.PERSON__AFFILIATION_FIELDS:
				return affiliation_fields != null && !affiliation_fields.isEmpty();
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
				return distinction_types != null && !distinction_types.isEmpty();
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				return technologies != null && !technologies.isEmpty();
			case Curriculum_vitaePackage.PERSON__ACTIVITY_TYPES:
				return activity_types != null && !activity_types.isEmpty();
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
		result.append(" (full_name: ");
		result.append(full_name);
		result.append(", date_of_birth: ");
		result.append(date_of_birth);
		result.append(", phone_number: ");
		result.append(phone_number);
		result.append(", home_address: ");
		result.append(home_address);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
