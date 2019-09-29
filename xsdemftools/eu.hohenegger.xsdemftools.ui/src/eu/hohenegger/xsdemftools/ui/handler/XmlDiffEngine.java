package eu.hohenegger.xsdemftools.ui.handler;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EStructuralFeature;

public class XmlDiffEngine extends DefaultDiffEngine {

	@Override
	protected FeatureFilter createFeatureFilter() {
		return new FeatureFilter() {

			@Override
			public boolean checkForOrderingChanges(EStructuralFeature feature) {
				return false;
			}
		};
	}

}
