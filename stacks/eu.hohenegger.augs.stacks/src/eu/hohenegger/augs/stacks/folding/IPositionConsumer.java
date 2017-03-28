package eu.hohenegger.augs.stacks.folding;

@FunctionalInterface
public interface IPositionConsumer {
	void consume(int offset, int length);
}