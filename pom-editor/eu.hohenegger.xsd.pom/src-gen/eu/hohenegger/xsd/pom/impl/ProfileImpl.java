/**
 */
package eu.hohenegger.xsd.pom.impl;

import eu.hohenegger.xsd.pom.Activation;
import eu.hohenegger.xsd.pom.BuildBase;
import eu.hohenegger.xsd.pom.DependenciesType;
import eu.hohenegger.xsd.pom.DependencyManagement;
import eu.hohenegger.xsd.pom.DistributionManagement;
import eu.hohenegger.xsd.pom.ModulesType;
import eu.hohenegger.xsd.pom.PluginRepositoriesType;
import eu.hohenegger.xsd.pom.PomPackage;
import eu.hohenegger.xsd.pom.Profile;
import eu.hohenegger.xsd.pom.PropertiesType1;
import eu.hohenegger.xsd.pom.Reporting;
import eu.hohenegger.xsd.pom.ReportsType1;
import eu.hohenegger.xsd.pom.RepositoriesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getDistributionManagement <em>Distribution Management</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getDependencyManagement <em>Dependency Management</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getPluginRepositories <em>Plugin Repositories</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getReports <em>Reports</em>}</li>
 *   <li>{@link eu.hohenegger.xsd.pom.impl.ProfileImpl#getReporting <em>Reporting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "default";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Activation activation;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected BuildBase build;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected ModulesType modules;

	/**
	 * The cached value of the '{@link #getDistributionManagement() <em>Distribution Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionManagement()
	 * @generated
	 * @ordered
	 */
	protected DistributionManagement distributionManagement;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType1 properties;

	/**
	 * The cached value of the '{@link #getDependencyManagement() <em>Dependency Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyManagement()
	 * @generated
	 * @ordered
	 */
	protected DependencyManagement dependencyManagement;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType dependencies;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected RepositoriesType repositories;

	/**
	 * The cached value of the '{@link #getPluginRepositories() <em>Plugin Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginRepositories()
	 * @generated
	 * @ordered
	 */
	protected PluginRepositoriesType pluginRepositories;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected ReportsType1 reports;

	/**
	 * The cached value of the '{@link #getReporting() <em>Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporting()
	 * @generated
	 * @ordered
	 */
	protected Reporting reporting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PomPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PomPackage.PROFILE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activation getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation(Activation newActivation, NotificationChain msgs) {
		Activation oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__ACTIVATION, oldActivation, newActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivation(Activation newActivation) {
		if (newActivation != activation) {
			NotificationChain msgs = null;
			if (activation != null)
				msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__ACTIVATION, null, msgs);
			if (newActivation != null)
				msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__ACTIVATION, null, msgs);
			msgs = basicSetActivation(newActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__ACTIVATION, newActivation, newActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildBase getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuild(BuildBase newBuild, NotificationChain msgs) {
		BuildBase oldBuild = build;
		build = newBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__BUILD, oldBuild, newBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuild(BuildBase newBuild) {
		if (newBuild != build) {
			NotificationChain msgs = null;
			if (build != null)
				msgs = ((InternalEObject)build).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__BUILD, null, msgs);
			if (newBuild != null)
				msgs = ((InternalEObject)newBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__BUILD, null, msgs);
			msgs = basicSetBuild(newBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__BUILD, newBuild, newBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModulesType getModules() {
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModules(ModulesType newModules, NotificationChain msgs) {
		ModulesType oldModules = modules;
		modules = newModules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__MODULES, oldModules, newModules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModules(ModulesType newModules) {
		if (newModules != modules) {
			NotificationChain msgs = null;
			if (modules != null)
				msgs = ((InternalEObject)modules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__MODULES, null, msgs);
			if (newModules != null)
				msgs = ((InternalEObject)newModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__MODULES, null, msgs);
			msgs = basicSetModules(newModules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__MODULES, newModules, newModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionManagement getDistributionManagement() {
		return distributionManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionManagement(DistributionManagement newDistributionManagement, NotificationChain msgs) {
		DistributionManagement oldDistributionManagement = distributionManagement;
		distributionManagement = newDistributionManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT, oldDistributionManagement, newDistributionManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionManagement(DistributionManagement newDistributionManagement) {
		if (newDistributionManagement != distributionManagement) {
			NotificationChain msgs = null;
			if (distributionManagement != null)
				msgs = ((InternalEObject)distributionManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT, null, msgs);
			if (newDistributionManagement != null)
				msgs = ((InternalEObject)newDistributionManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT, null, msgs);
			msgs = basicSetDistributionManagement(newDistributionManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT, newDistributionManagement, newDistributionManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType1 getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType1 newProperties, NotificationChain msgs) {
		PropertiesType1 oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperties(PropertiesType1 newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyManagement getDependencyManagement() {
		return dependencyManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyManagement(DependencyManagement newDependencyManagement, NotificationChain msgs) {
		DependencyManagement oldDependencyManagement = dependencyManagement;
		dependencyManagement = newDependencyManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DEPENDENCY_MANAGEMENT, oldDependencyManagement, newDependencyManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependencyManagement(DependencyManagement newDependencyManagement) {
		if (newDependencyManagement != dependencyManagement) {
			NotificationChain msgs = null;
			if (dependencyManagement != null)
				msgs = ((InternalEObject)dependencyManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DEPENDENCY_MANAGEMENT, null, msgs);
			if (newDependencyManagement != null)
				msgs = ((InternalEObject)newDependencyManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DEPENDENCY_MANAGEMENT, null, msgs);
			msgs = basicSetDependencyManagement(newDependencyManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DEPENDENCY_MANAGEMENT, newDependencyManagement, newDependencyManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependenciesType newDependencies, NotificationChain msgs) {
		DependenciesType oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependencies(DependenciesType newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__DEPENDENCIES, newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoriesType getRepositories() {
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositories(RepositoriesType newRepositories, NotificationChain msgs) {
		RepositoriesType oldRepositories = repositories;
		repositories = newRepositories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPOSITORIES, oldRepositories, newRepositories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepositories(RepositoriesType newRepositories) {
		if (newRepositories != repositories) {
			NotificationChain msgs = null;
			if (repositories != null)
				msgs = ((InternalEObject)repositories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPOSITORIES, null, msgs);
			if (newRepositories != null)
				msgs = ((InternalEObject)newRepositories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPOSITORIES, null, msgs);
			msgs = basicSetRepositories(newRepositories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPOSITORIES, newRepositories, newRepositories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PluginRepositoriesType getPluginRepositories() {
		return pluginRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginRepositories(PluginRepositoriesType newPluginRepositories, NotificationChain msgs) {
		PluginRepositoriesType oldPluginRepositories = pluginRepositories;
		pluginRepositories = newPluginRepositories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__PLUGIN_REPOSITORIES, oldPluginRepositories, newPluginRepositories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPluginRepositories(PluginRepositoriesType newPluginRepositories) {
		if (newPluginRepositories != pluginRepositories) {
			NotificationChain msgs = null;
			if (pluginRepositories != null)
				msgs = ((InternalEObject)pluginRepositories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__PLUGIN_REPOSITORIES, null, msgs);
			if (newPluginRepositories != null)
				msgs = ((InternalEObject)newPluginRepositories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__PLUGIN_REPOSITORIES, null, msgs);
			msgs = basicSetPluginRepositories(newPluginRepositories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__PLUGIN_REPOSITORIES, newPluginRepositories, newPluginRepositories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportsType1 getReports() {
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReports(ReportsType1 newReports, NotificationChain msgs) {
		ReportsType1 oldReports = reports;
		reports = newReports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPORTS, oldReports, newReports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReports(ReportsType1 newReports) {
		if (newReports != reports) {
			NotificationChain msgs = null;
			if (reports != null)
				msgs = ((InternalEObject)reports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPORTS, null, msgs);
			if (newReports != null)
				msgs = ((InternalEObject)newReports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPORTS, null, msgs);
			msgs = basicSetReports(newReports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPORTS, newReports, newReports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reporting getReporting() {
		return reporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReporting(Reporting newReporting, NotificationChain msgs) {
		Reporting oldReporting = reporting;
		reporting = newReporting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPORTING, oldReporting, newReporting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReporting(Reporting newReporting) {
		if (newReporting != reporting) {
			NotificationChain msgs = null;
			if (reporting != null)
				msgs = ((InternalEObject)reporting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPORTING, null, msgs);
			if (newReporting != null)
				msgs = ((InternalEObject)newReporting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PROFILE__REPORTING, null, msgs);
			msgs = basicSetReporting(newReporting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PROFILE__REPORTING, newReporting, newReporting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PomPackage.PROFILE__ACTIVATION:
				return basicSetActivation(null, msgs);
			case PomPackage.PROFILE__BUILD:
				return basicSetBuild(null, msgs);
			case PomPackage.PROFILE__MODULES:
				return basicSetModules(null, msgs);
			case PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT:
				return basicSetDistributionManagement(null, msgs);
			case PomPackage.PROFILE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case PomPackage.PROFILE__DEPENDENCY_MANAGEMENT:
				return basicSetDependencyManagement(null, msgs);
			case PomPackage.PROFILE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case PomPackage.PROFILE__REPOSITORIES:
				return basicSetRepositories(null, msgs);
			case PomPackage.PROFILE__PLUGIN_REPOSITORIES:
				return basicSetPluginRepositories(null, msgs);
			case PomPackage.PROFILE__REPORTS:
				return basicSetReports(null, msgs);
			case PomPackage.PROFILE__REPORTING:
				return basicSetReporting(null, msgs);
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
			case PomPackage.PROFILE__ID:
				return getId();
			case PomPackage.PROFILE__ACTIVATION:
				return getActivation();
			case PomPackage.PROFILE__BUILD:
				return getBuild();
			case PomPackage.PROFILE__MODULES:
				return getModules();
			case PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT:
				return getDistributionManagement();
			case PomPackage.PROFILE__PROPERTIES:
				return getProperties();
			case PomPackage.PROFILE__DEPENDENCY_MANAGEMENT:
				return getDependencyManagement();
			case PomPackage.PROFILE__DEPENDENCIES:
				return getDependencies();
			case PomPackage.PROFILE__REPOSITORIES:
				return getRepositories();
			case PomPackage.PROFILE__PLUGIN_REPOSITORIES:
				return getPluginRepositories();
			case PomPackage.PROFILE__REPORTS:
				return getReports();
			case PomPackage.PROFILE__REPORTING:
				return getReporting();
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
			case PomPackage.PROFILE__ID:
				setId((String)newValue);
				return;
			case PomPackage.PROFILE__ACTIVATION:
				setActivation((Activation)newValue);
				return;
			case PomPackage.PROFILE__BUILD:
				setBuild((BuildBase)newValue);
				return;
			case PomPackage.PROFILE__MODULES:
				setModules((ModulesType)newValue);
				return;
			case PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT:
				setDistributionManagement((DistributionManagement)newValue);
				return;
			case PomPackage.PROFILE__PROPERTIES:
				setProperties((PropertiesType1)newValue);
				return;
			case PomPackage.PROFILE__DEPENDENCY_MANAGEMENT:
				setDependencyManagement((DependencyManagement)newValue);
				return;
			case PomPackage.PROFILE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case PomPackage.PROFILE__REPOSITORIES:
				setRepositories((RepositoriesType)newValue);
				return;
			case PomPackage.PROFILE__PLUGIN_REPOSITORIES:
				setPluginRepositories((PluginRepositoriesType)newValue);
				return;
			case PomPackage.PROFILE__REPORTS:
				setReports((ReportsType1)newValue);
				return;
			case PomPackage.PROFILE__REPORTING:
				setReporting((Reporting)newValue);
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
			case PomPackage.PROFILE__ID:
				unsetId();
				return;
			case PomPackage.PROFILE__ACTIVATION:
				setActivation((Activation)null);
				return;
			case PomPackage.PROFILE__BUILD:
				setBuild((BuildBase)null);
				return;
			case PomPackage.PROFILE__MODULES:
				setModules((ModulesType)null);
				return;
			case PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT:
				setDistributionManagement((DistributionManagement)null);
				return;
			case PomPackage.PROFILE__PROPERTIES:
				setProperties((PropertiesType1)null);
				return;
			case PomPackage.PROFILE__DEPENDENCY_MANAGEMENT:
				setDependencyManagement((DependencyManagement)null);
				return;
			case PomPackage.PROFILE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case PomPackage.PROFILE__REPOSITORIES:
				setRepositories((RepositoriesType)null);
				return;
			case PomPackage.PROFILE__PLUGIN_REPOSITORIES:
				setPluginRepositories((PluginRepositoriesType)null);
				return;
			case PomPackage.PROFILE__REPORTS:
				setReports((ReportsType1)null);
				return;
			case PomPackage.PROFILE__REPORTING:
				setReporting((Reporting)null);
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
			case PomPackage.PROFILE__ID:
				return isSetId();
			case PomPackage.PROFILE__ACTIVATION:
				return activation != null;
			case PomPackage.PROFILE__BUILD:
				return build != null;
			case PomPackage.PROFILE__MODULES:
				return modules != null;
			case PomPackage.PROFILE__DISTRIBUTION_MANAGEMENT:
				return distributionManagement != null;
			case PomPackage.PROFILE__PROPERTIES:
				return properties != null;
			case PomPackage.PROFILE__DEPENDENCY_MANAGEMENT:
				return dependencyManagement != null;
			case PomPackage.PROFILE__DEPENDENCIES:
				return dependencies != null;
			case PomPackage.PROFILE__REPOSITORIES:
				return repositories != null;
			case PomPackage.PROFILE__PLUGIN_REPOSITORIES:
				return pluginRepositories != null;
			case PomPackage.PROFILE__REPORTS:
				return reports != null;
			case PomPackage.PROFILE__REPORTING:
				return reporting != null;
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
