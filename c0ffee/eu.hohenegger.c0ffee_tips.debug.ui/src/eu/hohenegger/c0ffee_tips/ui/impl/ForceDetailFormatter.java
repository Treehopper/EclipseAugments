package eu.hohenegger.c0ffee_tips.ui.impl;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.debug.core.IJavaType;
import org.eclipse.jdt.internal.debug.ui.DetailFormatter;
import org.eclipse.jdt.internal.debug.ui.JavaDetailFormattersManager;

class ForceDetailFormatter {
    
    class DetailType implements IJavaType {
        final String name;
        
        public DetailType(String name) {
            this.name = name;
        }

        public String getName() throws DebugException {
            return name;
        }

        public String getSignature() throws DebugException {
            return Signature.createTypeSignature(name, true);
        }

        public IDebugTarget getDebugTarget() {
            return null;
        }

        public ILaunch getLaunch() {
            return null;
        }

        public String getModelIdentifier() {
            return null;
        }

        public <T> T getAdapter(Class<T> adapter) {
            return null;
        }
        
    }

    private boolean referenceAlreadyExists(String typeName) {
        JavaDetailFormattersManager manager = JavaDetailFormattersManager.getDefault();
        return manager.hasAssociatedDetailFormatter(new DetailType(typeName));
    }
    
    private void addFormatter(String typeName, String snippet) {
        DetailFormatter formatter = new DetailFormatter(typeName, snippet, true);
        JavaDetailFormattersManager manager = JavaDetailFormattersManager.getDefault();
        manager.setAssociatedDetailFormatter(formatter);
    } 
    
    private void removeFormatter(String typeName, String snippet) {
        DetailFormatter formatter = new DetailFormatter(typeName, snippet, true);
        JavaDetailFormattersManager manager = JavaDetailFormattersManager.getDefault();
        manager.removeAssociatedDetailFormatter(formatter);
    }

    public void forceRemoveFormatter(Class<?> type, String snippet) {
        String typeName = type.getName();
        if (!referenceAlreadyExists(typeName)) {
            removeFormatter(typeName, snippet);
        }
    }
    public void forceFormatter(Class<?> type, String snippet) {
        String typeName = type.getName();
        if (!referenceAlreadyExists(typeName)) {
            addFormatter(typeName, snippet);
        }
    }
}