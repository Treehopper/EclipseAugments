/**
 */
package org.liquibase.xml.ns.dbchangelog.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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

import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;
import org.liquibase.xml.ns.dbchangelog.LoadDataType;

/**
 * This is the item provider adapter for a {@link org.liquibase.xml.ns.dbchangelog.LoadDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadDataTypeItemProvider 
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
	public LoadDataTypeItemProvider(AdapterFactory adapterFactory) {
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
			addCommentLineStartsWithPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addFilePropertyDescriptor(object);
			addQuotcharPropertyDescriptor(object);
			addRelativeToChangelogFilePropertyDescriptor(object);
			addSchemaNamePropertyDescriptor(object);
			addSeparatorPropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addUsePreparedStatementsPropertyDescriptor(object);
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
				 getString("_UI_LoadDataType_catalogName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_catalogName_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_CatalogName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment Line Starts With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentLineStartsWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_commentLineStartsWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_commentLineStartsWith_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_CommentLineStartsWith(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_encoding_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_Encoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_file_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_file_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_File(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quotchar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuotcharPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_quotchar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_quotchar_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_Quotchar(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative To Changelog File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeToChangelogFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_relativeToChangelogFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_relativeToChangelogFile_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_RelativeToChangelogFile(),
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
				 getString("_UI_LoadDataType_schemaName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_schemaName_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_SchemaName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Separator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeparatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_separator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_separator_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_Separator(),
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
				 getString("_UI_LoadDataType_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_tableName_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_TableName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Prepared Statements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsePreparedStatementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LoadDataType_usePreparedStatements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LoadDataType_usePreparedStatements_feature", "_UI_LoadDataType_type"),
				 DbchangelogPackage.eINSTANCE.getLoadDataType_UsePreparedStatements(),
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
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed());
			childrenFeatures.add(DbchangelogPackage.eINSTANCE.getLoadDataType_AnyAttribute());
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
	 * This returns LoadDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoadDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LoadDataType)object).getCatalogName();
		return label == null || label.length() == 0 ?
			getString("_UI_LoadDataType_type") :
			getString("_UI_LoadDataType_type") + " " + label;
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

		switch (notification.getFeatureID(LoadDataType.class)) {
			case DbchangelogPackage.LOAD_DATA_TYPE__CATALOG_NAME:
			case DbchangelogPackage.LOAD_DATA_TYPE__COMMENT_LINE_STARTS_WITH:
			case DbchangelogPackage.LOAD_DATA_TYPE__ENCODING:
			case DbchangelogPackage.LOAD_DATA_TYPE__FILE:
			case DbchangelogPackage.LOAD_DATA_TYPE__QUOTCHAR:
			case DbchangelogPackage.LOAD_DATA_TYPE__RELATIVE_TO_CHANGELOG_FILE:
			case DbchangelogPackage.LOAD_DATA_TYPE__SCHEMA_NAME:
			case DbchangelogPackage.LOAD_DATA_TYPE__SEPARATOR:
			case DbchangelogPackage.LOAD_DATA_TYPE__TABLE_NAME:
			case DbchangelogPackage.LOAD_DATA_TYPE__USE_PREPARED_STATEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbchangelogPackage.LOAD_DATA_TYPE__MIXED:
			case DbchangelogPackage.LOAD_DATA_TYPE__ANY_ATTRIBUTE:
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
				(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed(),
				 FeatureMapUtil.createEntry
					(DbchangelogPackage.eINSTANCE.getLoadDataType_Column(),
					 DbchangelogFactory.eINSTANCE.createColumnType())));
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
