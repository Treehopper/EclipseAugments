package eu.hohenegger.scratchpad.wizard;

import static java.util.stream.IntStream.range;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

import wizard.Wizard;

public class ContributedWizardFinisher {

	@Inject
	private Wizard wizard;
	
	@Inject
	private IEclipseContext context;
	
	@Inject
	private IWorkbench workbench;
	
	@Execute
	private void run(IProgressMonitor monitor) {
		monitor.beginTask("Working on 100 units", 100);
		
		range(0, 100).forEach(value -> {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			monitor.worked(1);
		});
		
		monitor.done();
	}
	
	@PreDestroy
	private void dispose() {
		workbench.close();
	}
}
