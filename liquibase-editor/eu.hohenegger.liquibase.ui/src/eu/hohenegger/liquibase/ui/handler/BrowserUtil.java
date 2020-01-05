package eu.hohenegger.liquibase.ui.handler;

import java.net.URL;
import java.util.Optional;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

public class BrowserUtil {
	private Optional<IWebBrowser> browser = Optional.empty();

	public void open(URL url) {
		IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
		Display.getDefault().asyncExec(() -> {
				try {
					browser = Optional.of(browserSupport.createBrowser(Constants.PLUGIN_ID));
				} catch (PartInitException e1) {
					throw new IllegalStateException(e1);
				}
				browser.ifPresent(wb -> {
					try {
						wb.openURL(url);
					} catch (PartInitException e) {
						throw new IllegalStateException(e);
					}
				});
		});
	}

	public void close() {
		browser.ifPresent(IWebBrowser::close);
	}
}
