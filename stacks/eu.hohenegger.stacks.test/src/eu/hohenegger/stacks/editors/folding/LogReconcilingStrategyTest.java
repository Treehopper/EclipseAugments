package eu.hohenegger.stacks.editors.folding;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import eu.hohenegger.stacks.folding.StackTraceParser;

public class LogReconcilingStrategyTest {

	private StackTraceParser logReconcilingStrategy;

	private int consumerCalled;

	@Before
	public void setup() {
		consumerCalled = 0;
	}

	@Test
	public void testSingle() throws Exception {
		String stackTrace = "java.lang.NullPointerException foo\n" + "\tat foo.bar.com 1\n";
		logReconcilingStrategy = new StackTraceParser(stackTrace);

		logReconcilingStrategy.findStacks((offset, length) -> {
			consumerCalled++;
			assertEquals(0, offset);
			assertEquals(stackTrace.length(), length);
		});
		assertEquals(1, consumerCalled);
	}

	@Test
	public void testDouble() throws Exception {
		String firstStack = "java.lang.NullPointerException foo\n"
						+"\tat foo.bar.com 1\n";
		String secondStack = "java.lang.IllegalArgumentException bar\n"
						+"\tat foo.bar.com 2\n";

		logReconcilingStrategy = new StackTraceParser(firstStack +secondStack);

		logReconcilingStrategy.findStacks((offset, length) -> {
			consumerCalled++;
			if (consumerCalled == 1) {
				assertEquals(0, offset);
				assertEquals(firstStack.length() + 1, length);
			} else if (consumerCalled == 2) {
				assertEquals(firstStack.length(), offset);
				assertEquals(secondStack.length(), length);
			}
		});
		assertEquals(2, consumerCalled);
	}

	@Test
	public void testMultilineTrace() throws Exception {
		String firstStack = "java.lang.NullPointerException foo\n"
				+ "\tat foo.bar.com 1\n"
				+ "\tat foo.bar.com 2\n"
				+ "\tat foo.bar.com 3\n";
		String secondStack = "java.lang.IllegalArgumentException bar\n"
				+"\tat foo.bar.com 1\n";

		logReconcilingStrategy = new StackTraceParser(firstStack + secondStack);

		logReconcilingStrategy.findStacks((offset, length) -> {
			consumerCalled++;
			if (consumerCalled == 1) {
				assertEquals(0, offset);
				assertEquals(firstStack.length() + 1, length);
			} else if (consumerCalled == 2) {
				assertEquals(firstStack.length(), offset);
				assertEquals(secondStack.length(), length);
			}
		});
		assertEquals(2, consumerCalled);
	}

}
