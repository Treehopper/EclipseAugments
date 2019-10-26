package eu.hohenegger.xsdemftools.ui.contenttype.contentDescriber;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.EPackage;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public final class XmlHandler extends DefaultHandler {

	private class StopParsingException extends SAXException {

		private static final long serialVersionUID = 1L;

		public StopParsingException() {
			super((String) null);
		}
	}

	private String topElementFound = null;
	private SAXParserFactory factory;
	private boolean registeredEmfPackageFound = false;

	private SAXParser createParser(SAXParserFactory parserFactory)
			throws ParserConfigurationException, SAXException, SAXNotRecognizedException, SAXNotSupportedException {
		SAXParser parser = parserFactory.newSAXParser();
		XMLReader reader = parser.getXMLReader();
		try {
			// be sure validation is "off" or the feature to ignore DTD's will not apply
			reader.setFeature("http://xml.org/sax/features/validation", false); //$NON-NLS-1$
			reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false); //$NON-NLS-1$
		} catch (SAXNotRecognizedException | SAXNotSupportedException e) {
			// not a big deal if the parser does not recognize the features
		}
		return parser;
	}

	private SAXParserFactory getFactory() {
		synchronized (this) {
			if (factory != null) {
				return factory;
			}
			factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
		}
		return factory;
	}

	protected boolean parseContents(InputSource contents)
			throws IOException, ParserConfigurationException, SAXException {
		try {
			factory = getFactory();
			if (factory == null) {
				return false;
			}
			final SAXParser parser = createParser(factory);
			contents.setSystemId("/");
			parser.parse(contents, this);
		} catch (StopParsingException e) {
			// Abort the parsing normally. Fall through...
		}
		return true;
	}

	@Override
	public InputSource resolveEntity(String publicId, String systemId) {
		return new InputSource(new StringReader(""));
	}

	@Override
	public void startElement(final String uri, final String elementName, final String qualifiedName,
			final Attributes attributes) throws SAXException {
		if (topElementFound != null) {
			return;
		}
		topElementFound = elementName;
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(uri);
		registeredEmfPackageFound = ePackage != null;

		if (!hasRegisteredEmfPackage()) {
			throw new StopParsingException();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}

	protected boolean hasRegisteredEmfPackage() {
		return registeredEmfPackageFound;
	}

}
