package eu.hohenegger.xsdemftools.ui.contenttype.contentDescriber;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.XMLContentDescriber;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import eu.hohenegger.xsdemftools.XsdProvider;

public class ComparableXMLContentDescriber extends XMLContentDescriber {
	private static final QualifiedName[] SUPPORTED_OPTIONS = new QualifiedName[] {
			IContentDescription.CHARSET,
			IContentDescription.BYTE_ORDER_MARK
		};

	@Override
	public int describe(InputStream contents, IContentDescription description) throws IOException {
		// call the basic XML describer to do basic recognition
		if (super.describe(contents, description) == INVALID) {
			return INVALID;
		}
		// super.describe will have consumed some chars, need to rewind
		contents.reset();
		// Check to see if we matched our criteria.
		return checkCriteria(new InputSource(contents));
	}

	@Override
	public int describe(Reader contents, IContentDescription description) throws IOException {
		// call the basic XML describer to do basic recognition
		if (super.describe(contents, description) == INVALID) {
			return INVALID;
		}
		// super.describe will have consumed some chars, need to rewind
		contents.reset();
		// Check to see if we matched our criteria.
		return checkCriteria(new InputSource(contents));
	}

	public QualifiedName[] getSupportedOptions() {
		return SUPPORTED_OPTIONS;
	}

	private int checkCriteria(InputSource contents) throws IOException {
//		XsdProvider xsdProvider = new XsdProvider();
//		try {
//			xsdProvider.registerAvailableXsds();
//		} catch (CoreException e1) {
//			throw new RuntimeException(e1);
//		}
		
		XmlHandler xmlHandler = new XmlHandler();
		try {
			if (!xmlHandler.parseContents(contents)) {
				return INDETERMINATE;
			}
		} catch (SAXException e) {
			// we may be handed any kind of contents... it is normal we fail to parse
			return INDETERMINATE;
		} catch (ParserConfigurationException e) {
			// some bad thing happened - force this describer to be disabled
			throw new RuntimeException("descriptor disabled", e);
		}

		// Check to see if we matched our criteria.
		if (xmlHandler.hasRegisteredEmfPackage()) {
			return VALID;
		}
		
		return INDETERMINATE;
	}
}
