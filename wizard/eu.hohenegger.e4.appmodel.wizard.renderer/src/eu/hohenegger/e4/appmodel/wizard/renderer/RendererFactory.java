package eu.hohenegger.e4.appmodel.wizard.renderer;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

import eu.hohenegger.e4.appmodel.extensions.wizard.renderer.WizardRenderer;
import wizard.Wizard;

@SuppressWarnings("restriction")
public class RendererFactory extends WorkbenchRendererFactory {

    private WizardRenderer renderer;

    @Override
    public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {

        if (uiElement instanceof Wizard) {
            if (renderer == null) {
                renderer = new WizardRenderer();
                super.initRenderer(renderer);
            }
            return renderer;
        }

        return super.getRenderer(uiElement, parent);
    }
}
