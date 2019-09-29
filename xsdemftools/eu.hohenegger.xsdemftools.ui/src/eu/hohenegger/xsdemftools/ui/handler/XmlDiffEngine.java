package eu.hohenegger.xsdemftools.ui.handler;

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
			}

			@Override
			protected boolean isIgnoredAttribute(EAttribute attribute) {
				return attribute == XMLTypePackage.eINSTANCE.getAnyType_Mixed() ||
						attribute == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Mixed() ||
						attribute == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text() ||
						super.isIgnoredAttribute(attribute);
			}
		};
	}

}
