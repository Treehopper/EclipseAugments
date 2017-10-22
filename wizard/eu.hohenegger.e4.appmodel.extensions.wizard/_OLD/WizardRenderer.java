package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.internal.workbench.swt.CSSConstants;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.descriptor.basic.MPartDescriptor;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.IWindowCloseHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;

import eu.hohenegger.e4.appmodel.extensions.wizard.ProcessingWizard;
import eu.hohenegger.e4.appmodel.extensions.wizard.factory.ReflectionContributionFactory;
import wizard.ExtensionsPackage;
import wizard.WizardPage;

public class WizardRenderer extends AbstractPartRenderer {
	
	private static final String ICON_URI_FOR_PART = "IconUriForPart";

	@Inject
	private IEclipseContext context;
	
	@Inject
	private ReflectionContributionFactory contributionFactory;

	@Inject
	private Display display;
	
	@Inject
	private Logger logger;
	
	@Inject
	private IPresentationEngine engine;
	
	@Inject
	private EModelService modelService;
	
	boolean ignoreSizeChanges = false;
	
	private IEclipseContext localContext;
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		//TODO: re-use org.eclipse.e4.ui.workbench.renderers.swt.WBWRenderer.createWidget(MUIElement, Object)
		
		wizard.Wizard wizardElement = (wizard.Wizard) element;
		
		localContext = context.createChild();
		localContext.set(wizard.Wizard.class, wizardElement);
		
		
		Shell parentShell = null;
		if (parent != null) {
			parentShell = ((Control) parent).getShell();
		}

		final Shell shell;

		if (parentShell == null) {
			shell = new Shell(display, SWT.TITLE | SWT.RESIZE | SWT.MAX | SWT.CLOSE);
			wizardElement.getTags().add("topLevel"); //$NON-NLS-1$
		} else {
			shell = parentShell;
		}

		Wizard newWizard = (Wizard) ContextInjectionFactory.make(ProcessingWizard.class, localContext);
		
		newWizard.setNeedsProgressMonitor(wizardElement.getFinisher() != null && wizardElement.getFinisher().isNeedsProgress());
		WizardDialog wizardDialog = new WizardDialog(shell, newWizard);
		wizardElement.setObject(wizardDialog);
		
		@SuppressWarnings("unchecked")
		IObservableValue<wizard.WizardPage> currentWizardPageObserveValue = EMFObservables.observeValue(wizardElement, ExtensionsPackage.eINSTANCE.getWizard_CurrentPage());
		IChangeListener currentWizardPageChangeListener = setupProgrammaticPageFlip(wizardElement, wizardDialog);
		currentWizardPageObserveValue.addChangeListener(currentWizardPageChangeListener);

		return shell;
	}
	
	@Override
	public void postProcess(MUIElement shellME) {
		super.postProcess(shellME);
		
		wizard.Wizard wizardElement = (wizard.Wizard) shellME;
		WizardDialog wizardDialog = (WizardDialog) wizardElement.getObject();

		if (!shellME.isVisible()) {
			return;
		}

		Display.getDefault().asyncExec(() -> {
			wizardDialog.open();
		});
	}

	private IChangeListener setupProgrammaticPageFlip(wizard.Wizard wizardElement, WizardDialog wizardDialog) {
		wizardDialog.addPageChangedListener(event -> {
			Object selectedPage = event.getSelectedPage();
			List<WizardPage> pages = wizardElement.getPages();
			for (WizardPage wizardPage : pages) {
				Object pageObject = wizardPage.getObject();
				if (selectedPage.equals(pageObject)) {
					wizardElement.setCurrentPage(wizardPage);
				}
			}
		});
		
		IChangeListener result = event -> {
			EObjectObservableValue source = (EObjectObservableValue) event.getSource();
			wizard.WizardPage newWizardPage = (WizardPage) source.getValue();
			IWizardPage newPageObject = (IWizardPage) newWizardPage.getObject();
			boolean isInternallyTriggered = newPageObject.equals(wizardDialog.getCurrentPage());
			if (!isInternallyTriggered) {
				wizardDialog.showPage(newPageObject);
			}
		};
		return result;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> me) {
		logger.info("processContents");
	}

	@Override
	public void bindWidget(MUIElement me, Object widget) {
		if (widget instanceof Widget) {
			((Widget) widget).setData(OWNING_ME, me);

			// Set up the CSS Styling parameters; id & class
			setCSSInfo(me, widget);

			// Ensure that disposed widgets are unbound form the model
			Widget swtWidget = (Widget) widget;
			swtWidget.addDisposeListener(new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
					MUIElement element = (MUIElement) e.widget
							.getData(OWNING_ME);
					if (element != null)
						unbindWidget(element);
				}
			});
		}

		// Create a bi-directional link between the widget and the model
		me.setWidget(widget);
	}

	public Object unbindWidget(MUIElement me) {
		Widget widget = (Widget) me.getWidget();
		if (widget != null) {
			me.setWidget(null);
			if (!widget.isDisposed())
				widget.setData(OWNING_ME, null);
		}

		// Clear the factory reference
		me.setRenderer(null);

		return widget;
	}
	
	public void setCSSInfo(MUIElement me, Object widget) {
		// No SWT widget, nothing to style...
		if (widget == null)
			return;

		// Set up the CSS Styling parameters; id & class
		IEclipseContext ctxt = getContext(me);
		if (ctxt == null) {
			return;
		}

		final IStylingEngine engine = (IStylingEngine) ctxt
				.get(IStylingEngine.SERVICE_NAME);
		if (engine == null)
			return;

		// Put all the tags into the class string
		EObject eObj = (EObject) me;
		String cssClassStr = 'M' + eObj.eClass().getName();
		for (String tag : me.getTags())
			cssClassStr += ' ' + tag;

		// this will trigger style()
		String id = me.getElementId();
		if (id != null) {
			id = id.replace('.', '-');
		}
		engine.setClassnameAndId(widget, cssClassStr, id);
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		return (Widget) element.getParent().getWidget();
	}

	@Override
	public void disposeWidget(MUIElement element) {
		if (element.getWidget() instanceof Widget) {
			Widget curWidget = (Widget) element.getWidget();

			if (curWidget != null && !curWidget.isDisposed()) {
				unbindWidget(element);
				try {
					curWidget.dispose();
				} catch (Exception e) {
					Logger logService = context.get(Logger.class);
					if (logService != null) {
						String msg = "Error disposing widget for : " + element.getClass().getName(); //$NON-NLS-1$
						if (element instanceof MUILabel) {
							msg += ' ' + ((MUILabel) element)
									.getLocalizedLabel();
						}
						logService.error(e, msg);
					}
				}
			}
		}
		element.setWidget(null);
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		Widget widget = (Widget) me.getWidget();

		if (widget instanceof Shell && me instanceof MWindow) {
			final Shell shell = (Shell) widget;
			final MWindow w = (MWindow) me;
			shell.addControlListener(new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					// Don't store the maximized size in the model
					if (shell.getMaximized())
						return;

					try {
						ignoreSizeChanges = true;
						w.setWidth(shell.getSize().x);
						w.setHeight(shell.getSize().y);
					} finally {
						ignoreSizeChanges = false;
					}
				}

				@Override
				public void controlMoved(ControlEvent e) {
					// Don't store the maximized size in the model
					if (shell.getMaximized())
						return;

					try {
						ignoreSizeChanges = true;
						w.setX(shell.getLocation().x);
						w.setY(shell.getLocation().y);
					} finally {
						ignoreSizeChanges = false;
					}
				}
			});

			shell.addShellListener(new ShellAdapter() {
				@Override
				public void shellClosed(ShellEvent e) {
					// override the shell close event
					e.doit = false;
					MWindow window = (MWindow) e.widget.getData(OWNING_ME);
					IWindowCloseHandler closeHandler = window.getContext().get(IWindowCloseHandler.class);
					// if there's no handler or the handler permits the close
					// request, clean-up as necessary
					if (closeHandler == null || closeHandler.close(window)) {
						cleanUp(window);
					}
				}
			});
			shell.addListener(SWT.Activate, new Listener() {
				@Override
				public void handleEvent(org.eclipse.swt.widgets.Event event) {
					MUIElement parentME = w.getParent();
					if (parentME instanceof MApplication) {
						MApplication app = (MApplication) parentME;
						app.setSelectedElement(w);
						w.getContext().activate();
					} else if (parentME == null) {
						parentME = (MUIElement) ((EObject) w).eContainer();
						if (parentME instanceof MContext) {
							w.getContext().activate();
						}
					}
					updateNonFocusState(SWT.Activate, w);
				}
			});

			shell.addListener(SWT.Deactivate, new Listener() {
				@Override
				public void handleEvent(org.eclipse.swt.widgets.Event event) {
					updateNonFocusState(SWT.Deactivate, w);
				}
			});
		}
	}
	
	private void cleanUp(MWindow window) {
		Object parent = ((EObject) window).eContainer();
		if (parent instanceof MApplication) {
			MApplication application = (MApplication) parent;
			List<MWindow> children = application.getChildren();
			if (children.size() > 1) {
				// not the last window, destroy and remove
				window.setToBeRendered(false);
				children.remove(window);
			} else {
				// last window, just destroy without changing the model
				engine.removeGui(window);
			}
		} else if (parent != null) {
			window.setToBeRendered(false);
			// this is a detached window, check for parts
			if (modelService.findElements(window, null, MPart.class, null)
					.isEmpty()) {
				// if no parts, remove it
				if (parent instanceof MWindow) {
					((MWindow) parent).getWindows().remove(window);
				} else if (parent instanceof MPerspective) {
					((MPerspective) parent).getWindows().remove(window);
				}
			}
		}
	}
	
	private void updateNonFocusState(int event, MWindow win) {
		MPerspective perspective = modelService.getActivePerspective(win);
		if (perspective == null) {
			return;
		}

		List<MPartStack> stacks = modelService.findElements(perspective, null,
				MPartStack.class, Arrays.asList(CSSConstants.CSS_ACTIVE_CLASS));
		if (stacks.isEmpty()) {
			return;
		}

		MPartStack stack = stacks.get(0);
		int tagsCount = stack.getTags().size();
		boolean hasNonFocusTag = stack.getTags().contains(
				CSSConstants.CSS_NO_FOCUS_CLASS);

		if (event == SWT.Activate && hasNonFocusTag) {
			stack.getTags().remove(CSSConstants.CSS_NO_FOCUS_CLASS);
		} else if (event == SWT.Deactivate && !hasNonFocusTag) {
			stack.getTags().add(CSSConstants.CSS_NO_FOCUS_CLASS);
		}
		if (tagsCount != stack.getTags().size()) {
			setCSSInfo(stack, stack.getWidget());
		}
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
	}

	@Override
	public Image getImage(MUILabel element) {
		return null;
	}
	

	@Override
	protected boolean requiresFocus(MPart element) {
		MUIElement focussed = getModelElement(Display.getDefault()
				.getFocusControl());
		if (focussed == null) {
			return true;
		}
		// we ignore menus
		do {
			if (focussed == element || focussed == element.getToolbar()) {
				return false;
			}
			focussed = focussed.getParent();
		} while (focussed != null);
		return true;
	}
	
	static protected MUIElement getModelElement(Control ctrl) {
		if (ctrl == null)
			return null;

		MUIElement element = (MUIElement) ctrl
				.getData(AbstractPartRenderer.OWNING_ME);
		if (element != null) {
			return element;
			// FIXME: DndUtil.getModelElement() has the following check;
			// do we need this?
			// if (modelService.getTopLevelWindowFor(element) == topLevelWindow)
			// {
			// return element;
			// }
			// return null;
		}

		return getModelElement(ctrl.getParent());
	}

}
