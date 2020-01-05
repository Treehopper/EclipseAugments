package eu.hohenegger.liquibase.ui.handler;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleUtil {
	
	public static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		
		return myConsole;
	}
	
	public static void show(MessageConsole console) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.display(console);
		} catch (PartInitException e) {
			throw new IllegalStateException(e);
		}
	}
	
	public static Writer createConsoleWriter(MessageConsole console) {
		MessageConsoleStream messageStream = console.newMessageStream();
		StringWriter stringWriter = new StringWriter();
		return new Writer() {

			@Override
			public void close() throws IOException {
				stringWriter.close();
			}

			@Override
			public void flush() throws IOException {
				stringWriter.flush();
				messageStream.print(stringWriter.getBuffer().toString());
			}

			@Override
			public void write(char[] cbuf, int off, int len) throws IOException {
				stringWriter.write(cbuf, off, len);
			}
		};
	}
}
