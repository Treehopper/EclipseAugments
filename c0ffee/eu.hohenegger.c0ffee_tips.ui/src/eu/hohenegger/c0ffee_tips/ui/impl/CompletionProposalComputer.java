package eu.hohenegger.c0ffee_tips.ui.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.jdt.ui.text.java.IJavaCompletionProposalComputer;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Point;

import eu.hohenegger.c0ffee_tips.ConverterUtil;

public class CompletionProposalComputer implements IJavaCompletionProposalComputer {

	private String getSelectedText(final ContentAssistInvocationContext context) {
		Point selectedRange = context.getViewer().getSelectedRange();
		String string = "";
		try {
			string = context.getDocument().get(selectedRange.x, selectedRange.y);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}
	
	@Override
	public List<ICompletionProposal> computeCompletionProposals(final ContentAssistInvocationContext context,
			IProgressMonitor monitor) {

		String string = getSelectedText(context);
		String newString = ConverterUtil.convert2dec(string);
		
		if (newString.isEmpty()) {
			return Collections.emptyList();
		}
		
		List<ICompletionProposal> res = new ArrayList<ICompletionProposal>();
		
		
		
		res.add(new CompletionProposal(string, newString, context));
		return res;

	}

	@Override
	public List<IContextInformation> computeContextInformation(ContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		return Collections.emptyList();
	}

	@Override
	public String getErrorMessage() {
		return "error during code completion";
	}

	@Override
	public void sessionStarted() {
		// TODO
	}

	@Override
	public void sessionEnded() {
		// TODO
	}
}
