package eu.hohenegger.xsd.liquibase;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.liquibase.xml.ns.dbchangelog.DbchangelogPackage;

public class LiquibaseDiffEngine extends DefaultDiffEngine {

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
				return attribute == DbchangelogPackage.eINSTANCE.getColumnType2_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getColumnType3_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getCreateProcedureType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getDeleteType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getDocumentRoot_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getLoadDataType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getLoadUpdateDataType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getOutputType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getParamType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getRollbackType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getSqlCheckType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getSqlType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getStopType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getUpdateType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getValidCheckSumType_Mixed() ||
						attribute == DbchangelogPackage.eINSTANCE.getWhereParamsType_Mixed() ||
						super.isIgnoredAttribute(attribute);
			}
		};
	}

}
