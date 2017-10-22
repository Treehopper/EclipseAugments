package eu.hohenegger.e4.appmodel.extensions.wizard;

import java.lang.reflect.InvocationTargetException;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Composite;

import eu.hohenegger.e4.appmodel.extensions.wizard.factory.ReflectionContributionFactory;
import wizard.Wizard;
import wizard.WizardFinisher;

public class ProcessingWizard extends AbstractWizard {

	@Inject
	private Wizard wizard;
	
	@Inject
	private IEclipseContext context;

	@Inject
	private ReflectionContributionFactory contributionFactory;

	
	@Override
	public void createPageControls(Composite pageContainer) {
		context.set(Composite.class, pageContainer);
		contributionFactory.create(wizard.getContributionURI(), context);
		
		super.createPageControls(pageContainer);
	}
	
	@Override
	public boolean performFinish() {
		WizardFinisher finisherModel = wizard.getFinisher();
		if (finisherModel == null) {
			return true;
		}

		Object[] results = new Object[1];
		IRunnableWithProgress runnable = new IRunnableWithProgress() {
		    public void run(IProgressMonitor monitor) {
		        context.set(IProgressMonitor.class, monitor);
		        results[0] = contributionFactory.create(finisherModel.getContributionURI(), context);
		        ContextInjectionFactory.invoke(results[0], Execute.class, context);
		    }
		};
		try {
			getContainer().run(finisherModel.isFork(), finisherModel.isCancellable(), runnable);
		} catch (InterruptedException e) {
			ContextInjectionFactory.uninject(results[0], context);
			return false;
		} catch (InvocationTargetException e) {
			throw new RuntimeException("Encountered exception while finishing wizard", e);
		}

		ContextInjectionFactory.uninject(results[0], context);
		return true;
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

}
