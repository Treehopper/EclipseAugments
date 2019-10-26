package eu.hohenegger.xsdemftools;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

final class CustomizedOptionsXmlResourceImpl extends XMLResourceImpl {
	
	  private static final XMLParserPool XML_PARSER_POOL = new XMLParserPoolImpl(1, true);
	  private static final Map<Object, Object> DEFAULT_SAVE_OPTIONS;
	  private static final Map<Object, Object> DEFAULT_LOAD_OPTIONS;
	  static
	  {
	    Map<Object, Object> defaultLoadOptions = new HashMap<Object, Object>();
	    Map<Object, Object> defaultSaveOptions = new HashMap<Object, Object>();

	    defaultLoadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
	    defaultSaveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

	    ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(new EPackageRegistryImpl());
	    defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

	    XMLOptions xmlOptions = new XMLOptionsImpl();
	    xmlOptions.setProcessAnyXML(true);
	    defaultLoadOptions.put(XMLResource.OPTION_XML_OPTIONS, xmlOptions);

	    defaultLoadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, XML_PARSER_POOL);

	    DEFAULT_LOAD_OPTIONS = defaultLoadOptions;
	    DEFAULT_SAVE_OPTIONS = defaultSaveOptions;
	  }
	  
	CustomizedOptionsXmlResourceImpl(URI uri) {
		super(uri);
        defaultLoadOptions = DEFAULT_LOAD_OPTIONS;
        defaultSaveOptions = DEFAULT_SAVE_OPTIONS;
	}

}