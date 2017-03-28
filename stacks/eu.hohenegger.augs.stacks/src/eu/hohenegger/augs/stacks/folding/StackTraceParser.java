package eu.hohenegger.augs.stacks.folding;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

public class StackTraceParser {

	private String text;
	private int cNextPos;
	private int fRangeEnd;

	private IProgressMonitor monitor;

	public StackTraceParser(String text, IProgressMonitor monitor) {
		this.text = text;
		this.monitor = SubMonitor.convert(monitor, "Finding Stacks", fRangeEnd);
		this.fRangeEnd = text.length();
		this.cNextPos = 0;
	}

	public StackTraceParser(String text) {
		this(text, new NullProgressMonitor());
	}

	public void findStacks(IPositionConsumer positionConsumer) {
		boolean indent = false;

		int startOffset = 0;
		while (cNextPos < fRangeEnd) {
			char ch = eatChar();
			switch (ch) {
			case ' ':
			case '\t':
				indent = true;
				break;
			default:
				if (indent) {
					positionConsumer.consume(startOffset, cNextPos - startOffset);
					startOffset = cNextPos - 1;
				}
				indent = false;
				break;
			}
			eatLine();
		}
		if (indent) {
			positionConsumer.consume(startOffset, cNextPos - startOffset);
		}
	}

	private char eatChar() {
		char ch = text.charAt(cNextPos++);
		monitor.worked(1);
		return ch;
	}

	private void eatLine() {
		while (cNextPos < fRangeEnd) {
			if (eatChar() == '\n') {
				return;
			}
		}
	}
}

