package eu.hohenegger.c0ffee_tips.ui.impl;

import org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

final class CompletionProposal implements ICompletionProposal {
	private String string;
	private String newString;
	private ContentAssistInvocationContext context;

	public CompletionProposal(String string, String newString, ContentAssistInvocationContext context) {
		this.string = string;
		this.newString = newString;
		this.context = context;
	}

	@Override
	public String getDisplayString() {
		return String.format("Replace '%s' with '%s'.", string, newString);
	}


	@Override
	public String getAdditionalProposalInfo() {
		return "Replace selected text";
	}

	@Override
	public IContextInformation getContextInformation() {
		return null;
	}

	/** Inserts the proposed completion at the cursor position */
	@Override
	public void apply(IDocument document) {
		Point selectedRange = context.getViewer().getSelectedRange();
		
		try {
			document.replace(context.getInvocationOffset(), selectedRange.y, newString);
		} catch (BadLocationException x) {
			// ignore
		}
	}

	@Override
	public Point getSelection(IDocument document) {
		return new Point(context.getInvocationOffset(), newString.length());
	}

	@Override
	public Image getImage() {
		// TODO: icon
		return null;
	}
}