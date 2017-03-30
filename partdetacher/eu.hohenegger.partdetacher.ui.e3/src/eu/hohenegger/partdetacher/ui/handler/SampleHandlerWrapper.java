package eu.hohenegger.partdetacher.ui.handler;

import org.eclipse.e4.tools.compat.parts.DIHandler;

import eu.hohenegger.partdetacher.ui.SampleHandler;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class SampleHandlerWrapper extends DIHandler<SampleHandler> {

	public SampleHandlerWrapper() {
		super(SampleHandler.class);
	}
}
