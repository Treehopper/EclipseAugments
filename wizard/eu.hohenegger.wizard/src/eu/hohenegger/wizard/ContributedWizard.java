package eu.hohenegger.wizard;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import eu.hohenegger.wizard.model.MyBean;

public class ContributedWizard  {

	@Inject
	private IEclipseContext context;

	@PostConstruct
	private void init() {
		context.set(MyBean.class, new MyBean());
	}
}
