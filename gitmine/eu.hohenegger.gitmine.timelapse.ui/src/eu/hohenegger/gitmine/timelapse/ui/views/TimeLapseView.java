/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.timelapse.ui.views;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.egit.ui.internal.merge.GitCompareEditorInput;
import org.eclipse.egit.ui.internal.revision.GitCompareFileRevisionEditorInput;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IReusableEditor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IShowInTarget;
import org.eclipse.ui.part.ShowInContext;

public class TimeLapseView implements IShowInTarget {
	public static final String MPART_ID = "eu.hohenegger.gitmine.ui.statistics";

	private Scale scale;

	private List<RevCommit> commitList;

	private Repository repository;

	private IResource resource;

	private Button checkButtonReuseEditor;

	@PostConstruct
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		Composite main = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(main);
		Composite scaleParent = new Composite(main, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(scaleParent);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(scaleParent);
		scale = new Scale(scaleParent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(scale);
		final Text scaleValue = new Text(scaleParent, SWT.BORDER
				| SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		GridDataFactory.fillDefaults().hint(250, 25).grab(false, false)
		.applyTo(scaleValue);

		Rectangle clientArea = scaleParent.getClientArea();
		scale.setBounds(clientArea.x, clientArea.y, 200, 64);

		scale.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (commitList == null || commitList.isEmpty()) {
					return;
				}
				RevCommit revCommit = commitList.get(scale.getSelection());

				scaleValue.setText(new Date(revCommit.getCommitTime())
						.toString()
						+ "\n\n"
						+ revCommit.getName()
						+ "\n\n"
						+ revCommit.getShortMessage());

				RevCommit prevCommit = revCommit;
				if (scale.getSelection() > 0) {
					prevCommit = commitList.get(scale.getSelection() - 1);
				}
				execute(repository, resource, prevCommit, revCommit);
			}
		});

		checkButtonReuseEditor = new Button(main, SWT.CHECK);
		checkButtonReuseEditor.setText("Reuse Editor");

		Button closeEditorsButton = new Button(main, SWT.PUSH);
		closeEditorsButton.setText("Close All Compare Editors");
		closeEditorsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkbenchPage activePage = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				closeAllEditors(activePage);
				super.widgetSelected(e);
			}
		});
	}

	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection selection) {
		if (scale == null || scale.isDisposed()) {
			return;
		}

		if (selection == null) {
			return;
		}

		if (!(selection.getFirstElement() instanceof PlatformObject)) {
			return;
		}

		PlatformObject firstElement = (PlatformObject) selection
				.getFirstElement();


		resource = firstElement
				.getAdapter(IResource.class);

		if (resource == null) {
			return;
		}

		IProject project = resource.getProject();


		RepositoryMapping mapping = RepositoryMapping.getMapping(project
				.getLocation());
		if (mapping == null) {
			return;
		}
		repository = mapping.getRepository();

		String relativePath = createRelativePath(resource.getLocation()
				.toString(), repository);

		Git git = Git.wrap(repository);

		commitList = new ArrayList<>();

		Iterable<RevCommit> commits;

		LogCommand logCmd = git.log();
		if (!relativePath.isEmpty()) {
			logCmd.addPath(relativePath);
		}
		try {
			commits = logCmd.call();

			for (RevCommit revCommit : commits) {
				commitList.add(0, revCommit);
			}
			scale.setMaximum(commitList.size() - 1);
		} catch (NoHeadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void execute(Repository repo, Object input, RevCommit commit1,
			RevCommit commit2) {
		IWorkbenchPage workBenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		GitCompareEditorInput compareInput = new GitCompareEditorInput(
				commit1.name(), commit2.name(), repo, (IResource) input);
		openInCompare(workBenchPage, compareInput);
	}

	private void openInCompare(IWorkbenchPage workBenchPage,
			CompareEditorInput input) {
		// find reusable editor
		IEditorPart editor = null;
		IEditorReference[] editorRefs = workBenchPage.getEditorReferences();
		for (IEditorReference iEditorReference : editorRefs) {
			IEditorPart part = iEditorReference.getEditor(false);
			if (part == null
					|| !(isGitInput(part) && part instanceof IReusableEditor)) {
				continue;
			}
			if (isAlwaysReuse() || part.getEditorInput().equals(input)) {
				editor = part;
				break;
			}

		}

		// open input
		if (editor != null) {
			IEditorInput otherInput = editor.getEditorInput();
			if (isAlwaysReuse() || otherInput.equals(input)) {
				CompareUI.reuseCompareEditor(input, (IReusableEditor) editor);
			}
			workBenchPage.bringToTop(editor);
		} else {
			CompareUI.openCompareEditor(input, false);
		}
	}

	private void closeAllEditors(IWorkbenchPage workBenchPage) {
		IEditorReference[] editorRefs = workBenchPage.getEditorReferences();
		for (IEditorReference iEditorReference : editorRefs) {
			IEditorPart part = iEditorReference.getEditor(false);
			if (part == null
					|| !(isGitInput(part) && part instanceof IReusableEditor)) {
				continue;
			}

			workBenchPage.closeEditor(part, false);

		}
	}

	private static boolean isGitInput(IEditorPart part) {
		return part.getEditorInput() instanceof GitCompareFileRevisionEditorInput
				|| part.getEditorInput() instanceof GitCompareEditorInput;
	}

	private boolean isAlwaysReuse() {
		return checkButtonReuseEditor.getSelection();
	}

	private String createRelativePath(String absolutePath, Repository repository) {
		String relativePath;
		File directory = repository.getDirectory();
		String base = "";
		try {
			base = directory.getParentFile().getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		relativePath = createRelativePath(base, absolutePath);
		return relativePath;
	}

	public static String createRelativePath(String base, String path) {
		URI uri = new File(path).toURI();
		URI baseUri = new File(base).toURI();
		return baseUri.relativize(uri).getPath();
	}

	@Focus
	public void setFocus() {
		scale.setFocus();
	}

	@PreDestroy
	public void dispose() {
	}

	@Override
	public boolean show(ShowInContext context) {
		// TODO Auto-generated method stub
		return true;
	}
}
