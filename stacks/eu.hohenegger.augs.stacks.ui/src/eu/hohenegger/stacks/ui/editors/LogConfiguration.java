package eu.hohenegger.stacks.ui.editors;

import java.util.List;
import java.util.function.Consumer;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import eu.hohenegger.stacks.ui.editors.folding.LogReconcilingStrategy;

public class LogConfiguration extends SourceViewerConfiguration {
	private KeywordScanner keywordScanner;
	private ColorManager colorManager;
	private Consumer<List<Position>> updateRunnable;

	public LogConfiguration(ColorManager colorManager, Consumer<List<Position>> consumer) {
		this.colorManager = colorManager;
		this.updateRunnable = consumer;
	}

	protected KeywordScanner getKeywordScanner() {
		if (keywordScanner == null) {
			IToken defaultReturnToken = new Token(new TextAttribute(colorManager.getColor(ColorManager.DEFAULT)));
			keywordScanner = new KeywordScanner(colorManager, defaultReturnToken);
		}
		return keywordScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getKeywordScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant c = new ContentAssistant();
		c.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		c.enableAutoActivation(true);
		c.enableColoredLabels(true);
		return c;
	}

	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		return null;
	}

	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		LogReconcilingStrategy strategy = new LogReconcilingStrategy(updateRunnable);


		MonoReconciler reconciler = new MonoReconciler(strategy, false);

		return reconciler;
	}
}