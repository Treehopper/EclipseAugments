/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.PluginRepositoriesType;
import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Repositories Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.PluginRepositoriesTypeImpl#getPluginRepository <em>Plugin Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginRepositoriesTypeImpl extends MinimalEObjectImpl.Container implements PluginRepositoriesType {
	/**
	 * The cached value of the '{@link #getPluginRepository() <em>Plugin Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> pluginRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginRepositoriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.PLUGIN_REPOSITORIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getPluginRepository() {
		if (pluginRepository == null) {
			pluginRepository = new EObjectContainmentEList<Repository>(Repository.class, this, PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY);
		}
		return pluginRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY:
				return ((InternalEList<?>)getPluginRepository()).basicRemove(otherEnd, msgs);
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
			case PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY:
				return getPluginRepository();
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
			case PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY:
				getPluginRepository().clear();
				getPluginRepository().addAll((Collection<? extends Repository>)newValue);
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
			case PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY:
				getPluginRepository().clear();
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
			case PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY:
				return pluginRepository != null && !pluginRepository.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PluginRepositoriesTypeImpl
