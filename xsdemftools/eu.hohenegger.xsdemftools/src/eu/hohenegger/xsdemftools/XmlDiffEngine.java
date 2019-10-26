package eu.hohenegger.xsdemftools;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

public class XmlDiffEngine extends DefaultDiffEngine {

	@Override
	protected FeatureFilter createFeatureFilter() {
		return new FeatureFilter() {

			@Override
			public boolean checkForOrderingChanges(EStructuralFeature feature) {
				return false;
//				return feature.equals(XMLTypePackage.Literals.ANY_TYPE.getEAllStructuralFeatures()) ||
//						feature.equals(XMLTypePackage.Literals.ANY_SIMPLE_TYPE.getEAllStructuralFeatures()) ||
//						feature.equals(XMLTypePackage.Literals.ANY_TYPE__ANY.getEAllStructuralFeatures()) ||
//						feature.equals(XMLTypePackage.Literals.ANY_TYPE.getEAllStructuralFeatures()) ||
//						feature.equals(XMLTypePackage.Literals.ANY_TYPE.getEAllStructuralFeatures()) ||
//						;
			}

			@Override
			protected boolean isIgnoredAttribute(EAttribute attribute) {
				return attribute == XMLTypePackage.eINSTANCE.getAnyType_Mixed() ||
						attribute == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Mixed() ||
						attribute == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text() ||
						// this would work for any registred EMF model
//						attribute.getName().equals("mixed") ||
						super.isIgnoredAttribute(attribute);
			}
		};
	}

}
