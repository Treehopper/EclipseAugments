/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.ui.handlers;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jgit.lib.Repository;

import eu.hohenegger.gitmine.ui.views.StatisticsView;


public class OpenGitMiner {

	@Inject
	private IEventBroker broker;

	@Execute
	public void execute(EPartService partService, @Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection structuredSelection) {
		PlatformObject firstElement = (PlatformObject) structuredSelection.getFirstElement();
		try (Repository repository = firstElement.getAdapter(Repository.class);) {
			// Open Part
			String viewId = StatisticsView.MPART_ID;
			partService.showPart(viewId, PartState.VISIBLE);

			// Send asynchronous Event
			broker.post(StatisticsView.VIEWCOM_STATISTICS_OPEN, repository);
		}

	}

}
