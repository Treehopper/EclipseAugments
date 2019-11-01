package eu.hohenegger.xsd.pom;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PomDiffEngine extends DefaultDiffEngine {

	@Override
	protected FeatureFilter createFeatureFilter() {
		return new FeatureFilter() {

			@Override
			public boolean checkForOrderingChanges(EStructuralFeature feature) {
//				TODO: Generate DbchangelogPackage.Literals and use it for comparison
				return false;
			}

			@Override
			protected boolean isIgnoredAttribute(EAttribute attribute) {
				return PomPackage.eINSTANCE.getDocumentRoot_Mixed().equals(attribute) ||
						super.isIgnoredAttribute(attribute);
			}
		};
	}

}
