/**
 */
package org.liquibase.xml.ns.dbchangelog.provider;


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

import org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.AddUniqueConstraintType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddUniqueConstraintTypeItemProvider 
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
	public AddUniqueConstraintTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCatalogNamePropertyDescriptor(object);
			addClusteredPropertyDescriptor(object);
			addColumnNamesPropertyDescriptor(object);
			addConstraintNamePropertyDescriptor(object);
			addDeferrablePropertyDescriptor(object);
			addDisabledPropertyDescriptor(object);
			addForIndexCatalogNamePropertyDescriptor(object);
			addForIndexNamePropertyDescriptor(object);
			addForIndexSchemaNamePropertyDescriptor(object);
			addInitiallyDeferredPropertyDescriptor(object);
			addSchemaNamePropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addTablespacePropertyDescriptor(object);
			addValidatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_catalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_catalogName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_CatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clustered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusteredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_clustered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_clustered_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Clustered(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_columnNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_columnNames_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ColumnNames(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_constraintName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_constraintName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ConstraintName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deferrable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeferrablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_deferrable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_deferrable_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Deferrable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_disabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_disabled_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Disabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Index Catalog Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForIndexCatalogNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_forIndexCatalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_forIndexCatalogName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ForIndexCatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Index Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForIndexNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_forIndexName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_forIndexName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ForIndexName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Index Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForIndexSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_forIndexSchemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_forIndexSchemaName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_ForIndexSchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initially Deferred feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitiallyDeferredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_initiallyDeferred_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_initiallyDeferred_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_InitiallyDeferred(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_schemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_schemaName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_SchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_tableName_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_TableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tablespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_tablespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_tablespace_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Tablespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddUniqueConstraintType_validate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddUniqueConstraintType_validate_feature", "_UI_AddUniqueConstraintType_type"),
				 DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_Validate(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getAddUniqueConstraintType_AnyAttribute());
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
	 * This returns AddUniqueConstraintType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddUniqueConstraintType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddUniqueConstraintType)object).getCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddUniqueConstraintType_type") :
			getString("_UI_AddUniqueConstraintType_type") + " " + label;
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

		switch (notification.getFeatureID(AddUniqueConstraintType.class)) {
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CATALOG_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CLUSTERED:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__COLUMN_NAMES:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__CONSTRAINT_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DEFERRABLE:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__DISABLED:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_CATALOG_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__FOR_INDEX_SCHEMA_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__INITIALLY_DEFERRED:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__SCHEMA_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLE_NAME:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__TABLESPACE:
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__VALIDATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.ADD_UNIQUE_CONSTRAINT_TYPE__ANY_ATTRIBUTE:
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Dbchangelog3EditPlugin.INSTANCE;
	}

}
