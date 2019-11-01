/**
 */
package eu.hohenegger.xsd.pom.provider;


import eu.hohenegger.xsd.pom.BuildBase;
import eu.hohenegger.xsd.pom.PomFactory;
import eu.hohenegger.xsd.pom.PomPackage;

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
 * This is the item provider adapter for a {@link eu.hohenegger.xsd.pom.BuildBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildBaseItemProvider 
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
	public BuildBaseItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultGoalPropertyDescriptor(object);
			addDirectoryPropertyDescriptor(object);
			addFinalNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BuildBase_defaultGoal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BuildBase_defaultGoal_feature", "_UI_BuildBase_type"),
				 PomPackage.Literals.BUILD_BASE__DEFAULT_GOAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BuildBase_directory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BuildBase_directory_feature", "_UI_BuildBase_type"),
				 PomPackage.Literals.BUILD_BASE__DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BuildBase_finalName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BuildBase_finalName_feature", "_UI_BuildBase_type"),
				 PomPackage.Literals.BUILD_BASE__FINAL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(PomPackage.Literals.BUILD_BASE__RESOURCES);
			childrenFeatures.add(PomPackage.Literals.BUILD_BASE__TEST_RESOURCES);
			childrenFeatures.add(PomPackage.Literals.BUILD_BASE__FILTERS);
			childrenFeatures.add(PomPackage.Literals.BUILD_BASE__PLUGIN_MANAGEMENT);
			childrenFeatures.add(PomPackage.Literals.BUILD_BASE__PLUGINS);
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
	 * This returns BuildBase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BuildBase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BuildBase)object).getFinalName();
		return label == null || label.length() == 0 ?
			getString("_UI_BuildBase_type") :
			getString("_UI_BuildBase_type") + " " + label;
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

		switch (notification.getFeatureID(BuildBase.class)) {
			case PomPackage.BUILD_BASE__DEFAULT_GOAL:
			case PomPackage.BUILD_BASE__DIRECTORY:
			case PomPackage.BUILD_BASE__FINAL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PomPackage.BUILD_BASE__RESOURCES:
			case PomPackage.BUILD_BASE__TEST_RESOURCES:
			case PomPackage.BUILD_BASE__FILTERS:
			case PomPackage.BUILD_BASE__PLUGIN_MANAGEMENT:
			case PomPackage.BUILD_BASE__PLUGINS:
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
				(PomPackage.Literals.BUILD_BASE__RESOURCES,
				 PomFactory.eINSTANCE.createResourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD_BASE__TEST_RESOURCES,
				 PomFactory.eINSTANCE.createTestResourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD_BASE__FILTERS,
				 PomFactory.eINSTANCE.createFiltersType()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD_BASE__PLUGIN_MANAGEMENT,
				 PomFactory.eINSTANCE.createPluginManagement()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD_BASE__PLUGINS,
				 PomFactory.eINSTANCE.createPluginsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MavenPom4EditPlugin.INSTANCE;
	}

}
