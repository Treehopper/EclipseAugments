package eu.hohenegger.stacks.ui.editors.assist;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IDocument;


public class WordScanner {

	private static final int MIN_WORD_LENGTH = 3;
	private static final int MAX_CACHE_ENTRIES = 50;

	private static class FileWordCache {
		long lastScanned;
		Collection<String> words = Collections.emptyList();
	}

	private static Map<File, FileWordCache> cache = new HashMap<>();

	public static Collection<String> scan(IDocument document) {
		return scan(document.get());
	}

	public static Collection<String> scan(File f) throws IOException {
		if (cache.size() > MAX_CACHE_ENTRIES) {
			cache.clear();
		}

		FileWordCache wordCache = cache.get(f);
		if (wordCache == null || wordCache.lastScanned < f.lastModified()) {
			wordCache = new FileWordCache();
			wordCache.lastScanned = System.currentTimeMillis();
			wordCache.words = scan(new String(Files.readAllBytes(f.toPath())));
			cache.put(f, wordCache);
		}
		return wordCache.words;
	}

	public static Collection<String> scan(IFile f) throws IOException {
		return scan(f.getLocation().toFile());
	}

	public static Collection<String> scan(String document) {
		Set<String> words = new HashSet<>();
		for (String word : splitWordIgnoreCommentsAndStrings(document)) {
			if (word.length() >= MIN_WORD_LENGTH) {
				words.add(word);
			}
		}

		return words;
	}

	/**
	 * Splits a string into single words that are valid identifiers, e.g.
	 * doSomething(abcd); returns "doSomething" and "abcd"
	 *
	 * @param s
	 * @return
	 */
	public static Set<String> splitWord(String s) {
		Set<String> words = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isJavaIdentifierPart(c)) {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					words.add(sb.toString());
					sb = new StringBuilder();
				}
			}
		}
		if (sb.length() > 0) {
			words.add(sb.toString());
		}
		return words;
	}

	/**
	 * Splits a string into single words that are valid identifiers, e.g.
	 * doSomething(abcd); returns "doSomething" and "abcd". Contents of strings
	 * and comments are ignored.
	 *
	 * @param s
	 * @return
	 */
	public static Set<String> splitWordIgnoreCommentsAndStrings(String s) {
		Set<String> words = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		char oldChar = 0;
		boolean inComment = false;
		boolean inString = false;
		boolean inEolComment = false;
		for (char c : s.toCharArray()) {
			if (inEolComment && c == '\n') {
				inEolComment = false;
			} else if (!inComment && !inString && oldChar == '/' && c == '/') {
				inEolComment = true;
			} else if (!inEolComment && !inString && oldChar == '/' && c == '*') {
				inComment = true;
			} else if (inComment && !inString && oldChar == '*' && c == '/') {
				inComment = false;
			} else if (!inString && !inComment && !inEolComment && c == '"') {
				inString = true;
			} else if (inString) {
				if (c == '\n') {
					inString = false;
				} else if (c == '\\' && oldChar == '\\') {
					c = 0;
				} else if (c == '"' && oldChar == '\\') {
					c = 0;
				} else if (c == '"') {
					inString = false;
				}
			}
			oldChar = c;
			if (inComment || inEolComment || inString) {
				continue;
			}
			if (Character.isJavaIdentifierPart(c)) {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					words.add(sb.toString());
					sb = new StringBuilder();
				}
			}
		}
		if (sb.length() > 0) {
			words.add(sb.toString());
		}
		return words;
	}
}
