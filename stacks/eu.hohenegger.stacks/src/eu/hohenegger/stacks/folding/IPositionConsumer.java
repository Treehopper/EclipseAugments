package eu.hohenegger.stacks.folding;

@FunctionalInterface
public interface IPositionConsumer {
	void consume(int offset, int length);
}