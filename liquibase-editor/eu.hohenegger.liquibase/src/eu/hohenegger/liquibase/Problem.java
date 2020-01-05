package eu.hohenegger.liquibase;

import java.util.Optional;

import org.eclipse.core.resources.IResource;

public class Problem {
	private IResource resource;
	private String message;
	private Optional<Integer> lineNumber = Optional.empty();
	
	public Problem(IResource resource, String message, Integer lineNumber) {
		this.resource = resource;
		this.message = message;
		this.lineNumber = Optional.ofNullable(lineNumber);
	}
	
	public IResource getResource() {
		return resource;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Optional<Integer> getLineNumber() {
		return lineNumber;
	}
}
