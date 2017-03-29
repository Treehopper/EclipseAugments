package eu.hohenegger.stacks.ui.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class KeywordScanner extends RuleBasedScanner {

	private static final String[] KEYWORDS = { "at" };


	public KeywordScanner(ColorManager manager, IToken defaultReturnToken) {
		setDefaultReturnToken(defaultReturnToken);

		IToken keyword = new Token(new TextAttribute(
				manager.getColor(ColorManager.KEYWORD), null, SWT.BOLD));

		WordRule wordRule = new WordRule(new IWordDetector() {
			@Override
			public boolean isWordStart(char c) {
				return Character.isJavaIdentifierStart(c);
			}

			@Override
			public boolean isWordPart(char c) {
				return Character.isJavaIdentifierPart(c);
			}
		}, defaultReturnToken);

		for (String k : KEYWORDS) {
			wordRule.addWord(k, keyword);
		}

		setRules(new IRule[] { wordRule });

	}

}
