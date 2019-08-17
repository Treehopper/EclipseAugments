package eu.hohenegger.gister.ui.handler;

import static eu.hohenegger.gister.ui.handler.Constants.PLUGIN_ID;
import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PAGE_ID;
import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PREF_KEY;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;
import org.osgi.service.prefs.Preferences;

import eu.hohenegger.gister.api.ApiClient;
import eu.hohenegger.gister.api.ApiException;
import eu.hohenegger.gister.api.Configuration;
import eu.hohenegger.gister.api.DefaultApi;
import eu.hohenegger.gister.model.Gist;
import eu.hohenegger.gister.model.GistFile;

public class SnipGistHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
			return null;
		}
		
		Gist body = new Gist();
		body.setPublic(false);
		
		DefaultApi api = new DefaultApi();
		
		ApiClient client = Configuration.getDefaultApiClient();
		Preferences preferences = InstanceScope.INSTANCE.getNode(TOKEN_PAGE_ID);
		String token = preferences.get(TOKEN_PREF_KEY, "");
		if (token.isEmpty()) {
			MessageDialog.openError(null, "Token is empty", "A token must be set in the preferences, in order to use this feature.");
			return null;
		}
		client.setAccessToken(token);
		api.setApiClient(client);
		
		IStructuredSelection currentSelection = (IStructuredSelection) selection;
		Iterator<?> iterator = currentSelection.iterator();
		while (iterator.hasNext()) {
			IResource resource = Adapters.adapt(iterator.next(), IResource.class);
			
			if (!(resource instanceof IFile)) {
				return null;
			}
			
			IFile file = (IFile) resource;
			
			StringWriter writer;
			try {
				InputStream inputStream = file.getContents();
				writer = new StringWriter();
				IOUtils.copy(inputStream, writer, file.getCharset());
			} catch (IOException | CoreException e) {
				throw new ExecutionException("Error getting file content", e);
			}
			String content = writer.toString();
			
			GistFile filesItem = new GistFile();
			filesItem.setContent(content);
			body.putFilesItem(file.getName(), filesItem);
			body.setPublic(false);
		}

		UIJob uploadJob = new UIJob("Upload Gists") {

			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				try {
					Gist response = api.create(body);
					PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(response.getHtmlUrl()));
				} catch (ApiException e) {
					return new Status(IStatus.ERROR, PLUGIN_ID, "Error creating Gist", e);
				} catch (PartInitException | MalformedURLException e) {
					return new Status(IStatus.ERROR, PLUGIN_ID, "Error opening Gist", e);
				}
				return Status.OK_STATUS;
			}
		};
		uploadJob.setUser(true);
		uploadJob.schedule();
		
		return null;
	}

}
