package eu.hohenegger.gister.ui.handler;

import static eu.hohenegger.gister.ui.handler.Constants.PLUGIN_ID;
import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PAGE_ID;
import static eu.hohenegger.gister.ui.handler.Constants.TOKEN_PREF_KEY;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonMap;
import static org.apache.commons.io.IOUtils.copy;
import static org.eclipse.core.runtime.Adapters.adapt;
import static org.eclipse.core.runtime.preferences.InstanceScope.INSTANCE;
import static org.eclipse.jface.dialogs.MessageDialog.openError;
import static org.eclipse.jface.viewers.StructuredSelection.EMPTY;
import static org.eclipse.jface.window.Window.CANCEL;
import static org.eclipse.ui.PlatformUI.getWorkbench;
import static org.eclipse.ui.dialogs.PreferencesUtil.createPreferenceDialogOn;
import static org.eclipse.ui.handlers.HandlerUtil.getActiveEditorInput;
import static org.eclipse.ui.handlers.HandlerUtil.getActiveShell;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection;
import static org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.ResourceUtil;
import org.osgi.service.prefs.Preferences;

import eu.hohenegger.gister.api.ApiClient;
import eu.hohenegger.gister.api.ApiException;
import eu.hohenegger.gister.api.Configuration;
import eu.hohenegger.gister.api.DefaultApi;
import eu.hohenegger.gister.model.Gist;
import eu.hohenegger.gister.model.GistFile;

public class SnipGistHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection currentSelection = getCurrentStructuredSelection(event);
		ISelection selection = getCurrentSelection(event);
		Map<String, String> fileContents;
		if (currentSelection != EMPTY) {
			fileContents = getFileSelectionContent(currentSelection);
		} else if (selection instanceof TextSelection) {
			TextSelection textSelection = (TextSelection) selection;
			IFile file = ResourceUtil.getFile(getActiveEditorInput(event));
			fileContents = getTextSelectionContent(textSelection, file.getName());
		} else {
			return null;
		}
		
		if (fileContents.isEmpty()) {
			openError(null, "Empty Text Selection", "Cannot create empty Gist.");
			return null;
		}
		
		Gist body = createGist(fileContents);
		
		DefaultApi api = new DefaultApi();
		
		ApiClient client = Configuration.getDefaultApiClient();
		Optional<String> opToken = getToken();
		while(!opToken.isPresent() || opToken.get().isEmpty() ) {
			PreferenceDialog dialog = createPreferenceDialogOn(getActiveShell(event), TOKEN_PAGE_ID, new String[] {TOKEN_PAGE_ID}, null);
			if (dialog.open() == CANCEL) {
				return null;
			}
			opToken = getToken();
		}
		client.setAccessToken(opToken.get());
		api.setApiClient(client);
		
		pushGist(body, api);
		
		return null;
	}

	public Map<String, String> getTextSelectionContent(TextSelection textSelection, String fileName) throws ExecutionException {
		String fileContent = textSelection.getText();
		if (fileContent.isEmpty()) {
			return emptyMap();
		}
		return singletonMap(fileName, fileContent);
	}
	
	public Map<String, String> getFileSelectionContent(IStructuredSelection currentSelection) throws ExecutionException {
		Map<String, String> filesContents = new HashMap<>();
		Iterator<?> iterator = currentSelection.iterator();
		while (iterator.hasNext()) {
			IResource resource = adapt(iterator.next(), IResource.class);
			
			if (!(resource instanceof IFile)) {
				continue;
			}
			
			IFile file = (IFile) resource;
			String fileName = file.getName();
			
			InputStream inputStream;
			String charset;
			try {
				inputStream = file.getContents();
				charset = file.getCharset();
			} catch (CoreException e) {
				throw new ExecutionException("Error opening InputStream", e);
			}
			String fileContent = convert(inputStream, charset);
			
			filesContents.put(fileName, fileContent);
		}
		
		return filesContents;
	}
	
	public Gist createGist(Map<String, String> filesContents) throws ExecutionException {
		Gist body = new Gist();
		body.setPublic(false);
		
		filesContents.forEach((fileName, fileContent) -> {
			GistFile fileItem = new GistFile();
			fileItem.setContent(fileContent);
			body.putFilesItem(fileName, fileItem);
		});
		
		body.setPublic(false);
		
		return body;
	}
	public void pushGist(Gist body, DefaultApi api) throws ExecutionException {
		Job uploadJob = new Job("Upload Gists") {

			@Override
			public IStatus run(IProgressMonitor monitor) {
				try {
					Gist response = api.create(body);
					getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(response.getHtmlUrl()));
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
	}

	private Optional<String> getToken() {
		Preferences preferences = INSTANCE.getNode(TOKEN_PAGE_ID);
		String token = preferences.get(TOKEN_PREF_KEY, "");
		return Optional.of(token);
	}

	private String convert(InputStream inputStream, String charset) throws ExecutionException {
		StringWriter writer = new StringWriter();
		try {
			copy(inputStream, writer, charset);
		} catch (IOException e) {
			throw new ExecutionException("Error getting file content", e);
		}
		return writer.toString();
	}

}
