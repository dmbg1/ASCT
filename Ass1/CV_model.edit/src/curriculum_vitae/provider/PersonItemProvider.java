/**
 */
package curriculum_vitae.provider;


import curriculum_vitae.Curriculum_vitaeFactory;
import curriculum_vitae.Curriculum_vitaePackage;
import curriculum_vitae.Person;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link curriculum_vitae.Person} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFull_namePropertyDescriptor(object);
			addDate_of_birthPropertyDescriptor(object);
			addPhone_numberPropertyDescriptor(object);
			addHome_addressPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addActivity_typesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Full name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFull_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_full_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_full_name_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__FULL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date of birth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDate_of_birthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_date_of_birth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_date_of_birth_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__DATE_OF_BIRTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phone number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhone_numberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_phone_number_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_phone_number_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__PHONE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Home address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHome_addressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_home_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_home_address_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__HOME_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_description_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activity types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivity_typesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_activity_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_activity_types_feature", "_UI_Person_type"),
				 Curriculum_vitaePackage.Literals.PERSON__ACTIVITY_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__CITATION_NAMES);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__WEBSITES);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__IDIOMS);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__DEGREES);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__PROJECTS);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__AFFILIATION_CATEGORIES);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__DISTINCTION_TYPES);
			childrenFeatures.add(Curriculum_vitaePackage.Literals.PERSON__TECHNOLOGIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Person.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Person"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Person)object).getFull_name();
		return label == null || label.length() == 0 ?
			getString("_UI_Person_type") :
			getString("_UI_Person_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Person.class)) {
			case Curriculum_vitaePackage.PERSON__FULL_NAME:
			case Curriculum_vitaePackage.PERSON__DATE_OF_BIRTH:
			case Curriculum_vitaePackage.PERSON__PHONE_NUMBER:
			case Curriculum_vitaePackage.PERSON__HOME_ADDRESS:
			case Curriculum_vitaePackage.PERSON__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Curriculum_vitaePackage.PERSON__CITATION_NAMES:
			case Curriculum_vitaePackage.PERSON__WEBSITES:
			case Curriculum_vitaePackage.PERSON__IDIOMS:
			case Curriculum_vitaePackage.PERSON__DEGREES:
			case Curriculum_vitaePackage.PERSON__PROJECTS:
			case Curriculum_vitaePackage.PERSON__AFFILIATION_CATEGORIES:
			case Curriculum_vitaePackage.PERSON__DISTINCTION_TYPES:
			case Curriculum_vitaePackage.PERSON__TECHNOLOGIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__CITATION_NAMES,
				 Curriculum_vitaeFactory.eINSTANCE.createCitationName()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__WEBSITES,
				 Curriculum_vitaeFactory.eINSTANCE.createWebsite()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__IDIOMS,
				 Curriculum_vitaeFactory.eINSTANCE.createIdiom()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__DEGREES,
				 Curriculum_vitaeFactory.eINSTANCE.createDegree()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__PROJECTS,
				 Curriculum_vitaeFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__AFFILIATION_CATEGORIES,
				 Curriculum_vitaeFactory.eINSTANCE.createAffiliationField()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__DISTINCTION_TYPES,
				 Curriculum_vitaeFactory.eINSTANCE.createDistinctionType()));

		newChildDescriptors.add
			(createChildParameter
				(Curriculum_vitaePackage.Literals.PERSON__TECHNOLOGIES,
				 Curriculum_vitaeFactory.eINSTANCE.createTechnology()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Cv_generatorEditPlugin.INSTANCE;
	}

}
