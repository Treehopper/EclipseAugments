/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.ui.views;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.IShowInTarget;
import org.eclipse.ui.part.ShowInContext;

import eu.hohenegger.gitmine.IMiningService;

public class StatisticsView implements IShowInTarget {
	public static final String VIEWCOM_STATISTICS_OPEN = "viewcommunication/asyncEvent/statistics/open";

	public static final String MPART_ID = "eu.hohenegger.gitmine.ui.statistics";

	@Inject
	private IEclipseContext iEclipseContext;

	private LightweightSystem lws;
	private Canvas canvas;
	private StatisticsGraph graph;
	private MPart part;
	private Composite child;
	private Composite parent;

	@Inject
	private Shell activeShell;

	@Inject
	private IMiningService miningservice;

	@PostConstruct
	public void createPartControl(Composite parent, MPart part) {
		this.parent = parent;
		this.part = part;

		reset();
	}

	private void reset() {
		if (child != null && !child.isDisposed()) {
			child.dispose();
		}
		child = new Composite(parent, SWT.NONE);
		child.setLayout(new FillLayout());

		canvas = new Canvas(child, SWT.NONE);

		lws = new LightweightSystem(canvas);

		graph = ContextInjectionFactory.make(StatisticsGraph.class,
				iEclipseContext);

		lws.setContents(graph);

		parent.layout(true);
	}

	@Inject
	@Optional
	private void openRepository(
			@UIEventTopic(VIEWCOM_STATISTICS_OPEN) Repository repository,
			UISynchronize sync) {

		try {
			part.setLabel(repository.getDirectory() + " - "
					+ repository.getBranch());
			// If you want to update the UI, run it in the UI thread
			sync.syncExec(new Runnable() {
				@Override
				public void run() {
					reset();
				}
			});

			graph.addCurve("Commits", miningservice.scanCommitsPerDay(repository), new RGB(0, 0, 255), "#", true);
		} catch (IOException e) {
			// TODO log
			MessageDialog.openError(activeShell, "Error",
					e.getLocalizedMessage());
		}
	}

	@Focus
	public void setFocus() {
		canvas.setFocus();
	}

	@PreDestroy
	public void dispose() {
		child.dispose();
		lws.getUpdateManager().dispose();
		lws.getRootFigure().erase();
	}

	@Override
	public boolean show(ShowInContext context) {
		// TODO Auto-generated method stub
		return true;
	}
}
