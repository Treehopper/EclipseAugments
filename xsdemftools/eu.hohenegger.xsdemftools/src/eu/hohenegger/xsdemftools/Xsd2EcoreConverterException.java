package eu.hohenegger.xsdemftools;

public class Xsd2EcoreConverterException extends Exception {
	
	private static final long serialVersionUID = 6608233803285408368L;

	public Xsd2EcoreConverterException(String message) {
		super(message);
	}

	public Xsd2EcoreConverterException(String message, Exception e) {
		super(message, e);
	}

}
