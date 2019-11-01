/**
 */
package eu.hohenegger.xsd.pom.provider;


import eu.hohenegger.xsd.pom.Build;
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
 * This is the item provider adapter for a {@link eu.hohenegger.xsd.pom.Build} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildItemProvider 
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
	public BuildItemProvider(AdapterFactory adapterFactory) {
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

			addSourceDirectoryPropertyDescriptor(object);
			addScriptSourceDirectoryPropertyDescriptor(object);
			addTestSourceDirectoryPropertyDescriptor(object);
			addOutputDirectoryPropertyDescriptor(object);
			addTestOutputDirectoryPropertyDescriptor(object);
			addDefaultGoalPropertyDescriptor(object);
			addDirectoryPropertyDescriptor(object);
			addFinalNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_sourceDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_sourceDirectory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__SOURCE_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script Source Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptSourceDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_scriptSourceDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_scriptSourceDirectory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__SCRIPT_SOURCE_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Test Source Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestSourceDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_testSourceDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_testSourceDirectory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__TEST_SOURCE_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_outputDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_outputDirectory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__OUTPUT_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Test Output Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestOutputDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_testOutputDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_testOutputDirectory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__TEST_OUTPUT_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Build_defaultGoal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_defaultGoal_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__DEFAULT_GOAL,
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
				 getString("_UI_Build_directory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_directory_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__DIRECTORY,
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
				 getString("_UI_Build_finalName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_finalName_feature", "_UI_Build_type"),
				 PomPackage.Literals.BUILD__FINAL_NAME,
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
			childrenFeatures.add(PomPackage.Literals.BUILD__EXTENSIONS);
			childrenFeatures.add(PomPackage.Literals.BUILD__RESOURCES);
			childrenFeatures.add(PomPackage.Literals.BUILD__TEST_RESOURCES);
			childrenFeatures.add(PomPackage.Literals.BUILD__FILTERS);
			childrenFeatures.add(PomPackage.Literals.BUILD__PLUGIN_MANAGEMENT);
			childrenFeatures.add(PomPackage.Literals.BUILD__PLUGINS);
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
	 * This returns Build.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Build"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Build)object).getFinalName();
		return label == null || label.length() == 0 ?
			getString("_UI_Build_type") :
			getString("_UI_Build_type") + " " + label;
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

		switch (notification.getFeatureID(Build.class)) {
			case PomPackage.BUILD__SOURCE_DIRECTORY:
			case PomPackage.BUILD__SCRIPT_SOURCE_DIRECTORY:
			case PomPackage.BUILD__TEST_SOURCE_DIRECTORY:
			case PomPackage.BUILD__OUTPUT_DIRECTORY:
			case PomPackage.BUILD__TEST_OUTPUT_DIRECTORY:
			case PomPackage.BUILD__DEFAULT_GOAL:
			case PomPackage.BUILD__DIRECTORY:
			case PomPackage.BUILD__FINAL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PomPackage.BUILD__EXTENSIONS:
			case PomPackage.BUILD__RESOURCES:
			case PomPackage.BUILD__TEST_RESOURCES:
			case PomPackage.BUILD__FILTERS:
			case PomPackage.BUILD__PLUGIN_MANAGEMENT:
			case PomPackage.BUILD__PLUGINS:
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
				(PomPackage.Literals.BUILD__EXTENSIONS,
				 PomFactory.eINSTANCE.createExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD__RESOURCES,
				 PomFactory.eINSTANCE.createResourcesType1()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD__TEST_RESOURCES,
				 PomFactory.eINSTANCE.createTestResourcesType1()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD__FILTERS,
				 PomFactory.eINSTANCE.createFiltersType1()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD__PLUGIN_MANAGEMENT,
				 PomFactory.eINSTANCE.createPluginManagement()));

		newChildDescriptors.add
			(createChildParameter
				(PomPackage.Literals.BUILD__PLUGINS,
				 PomFactory.eINSTANCE.createPluginsType1()));
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
