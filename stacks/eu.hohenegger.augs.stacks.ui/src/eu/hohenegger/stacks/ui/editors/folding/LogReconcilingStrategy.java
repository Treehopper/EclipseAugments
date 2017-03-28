package eu.hohenegger.stacks.ui.editors.folding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;

import eu.hohenegger.augs.stacks.folding.StackTraceParser;

public class LogReconcilingStrategy implements IReconcilingStrategy, IReconcilingStrategyExtension {

	private IDocument fDocument;

	/** The offset of the next character to be read */
	protected int fOffset;

	/** The end offset of the range to be scanned */
	protected int fRangeEnd;

	private Consumer<List<Position>> updateRunnable;

	private IProgressMonitor monitor = new NullProgressMonitor();

	public LogReconcilingStrategy(Consumer<List<Position>> updateRunnable) {
		this.updateRunnable = updateRunnable;
	}

	LogReconcilingStrategy() {
		this(positions -> {/*NOOP*/});
	}

	@Override
	public void setDocument(IDocument document) {
		this.fDocument = document;
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		initialReconcile();
	}

	@Override
	public void reconcile(IRegion partition) {
		initialReconcile();
	}

	@Override
	public void setProgressMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public void initialReconcile() {
		initialize();
		calculatePositions();
	}

	void initialize() {
		fOffset = 0;
		fRangeEnd = fDocument.getLength();
	}

	/**
	 * next character position - used locally and only valid while
	 * {@link #calculatePositions()} is in progress.
	 */
	protected int cNextPos = 0;

	/**
	 * uses {@link #fDocument}, {@link #fOffset} and {@link #fRangeEnd} to
	 * calculate {@link #fPositions}. About syntax errors: this method is not a
	 * validator, it is useful.
	 */
	private void calculatePositions() {
		cNextPos = fOffset;

		List<Position> fPositions = null;
		try {
			fPositions = findStacks();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		updateRunnable.accept(fPositions);
	}

	List<Position> findStacks() throws BadLocationException {
		StackTraceParser stackTraceParser = new StackTraceParser(fDocument.get(), monitor);

		final List<Position> fPositions = new ArrayList<>();
		stackTraceParser.findStacks((offset, length) -> {
			fPositions.add(createPosition(offset, length));
		});
		return fPositions;
	}

	protected Position createPosition(int startOffset, int length) {
		return new Position(startOffset, length);
	}
}

