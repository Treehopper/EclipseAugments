package eu.hohenegger.e4.appmodel.extensions.wizard.renderer;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class JFaceWizardPageRenderer extends AbstractWizardPageRenderer implements IWizardPage, IDialogPage, IMessageProvider {

	protected WizardPage jfaceWizardPage;

	@Inject
	public JFaceWizardPageRenderer(@Named(PAGE_NAME) String pageName) {
		jfaceWizardPage = new WizardPage(pageName) {
			
			@Override
			public void createControl(Composite parent) {
				Composite control = new Composite(parent, SWT.NONE);
				control.setLayout(new FillLayout());
				setControl(control);
				context.set(Composite.class, control);
				createPage();
				if (wizardPage == null) {
					throw new IllegalStateException("Unable to instantiate " + wizardPageModel.getContributionURI());
				}
				wizardPageModel.setObject(this);
				setTitle(wizardPageModel.getTitle());
				setDescription(wizardPageModel.getDescription());
			}
		};
	}

	@Override
	public void createControl(Composite parent) {
		jfaceWizardPage.createControl(parent);
	}

	@Override
	public Control getControl() {
		return jfaceWizardPage.getControl();
	}

	@Override
	public String getDescription() {
		return jfaceWizardPage.getDescription();
	}

	@Override
	public String getErrorMessage() {
		return jfaceWizardPage.getErrorMessage();
	}

	@Override
	public Image getImage() {
		return jfaceWizardPage.getImage();
	}

	@Override
	public String getMessage() {
		return jfaceWizardPage.getMessage();
	}

	@Override
	public String getTitle() {
		return jfaceWizardPage.getTitle();
	}

	@Override
	public void performHelp() {
		jfaceWizardPage.performHelp();
	}

	@Override
	public void setDescription(String description) {
		jfaceWizardPage.setDescription(description);		
	}

	@Override
	public void setImageDescriptor(ImageDescriptor image) {
		jfaceWizardPage.setImageDescriptor(image);
	}

	@Override
	public void setTitle(String title) {
		jfaceWizardPage.setTitle(title);
	}

	@Override
	public boolean canFlipToNextPage() {
		return jfaceWizardPage.canFlipToNextPage();
	}

	@Override
	public String getName() {
		return jfaceWizardPage.getName();
	}

	@Override
	public IWizardPage getNextPage() {
		return jfaceWizardPage.getNextPage();
	}

	@Override
	public IWizardPage getPreviousPage() {
		return jfaceWizardPage.getPreviousPage();
	}

	@Override
	public IWizard getWizard() {
		return jfaceWizardPage.getWizard();
	}

	@Override
	public boolean isPageComplete() {
		return jfaceWizardPage.isPageComplete();
	}

	@Override
	public void setPreviousPage(IWizardPage page) {
		jfaceWizardPage.setPreviousPage(page);		
	}

	@Override
	public void setWizard(IWizard newWizard) {
		jfaceWizardPage.setWizard(newWizard);		
	}

	@Override
	public int getMessageType() {
		return jfaceWizardPage.getMessageType();
	}
	
	@Override
	public void dispose() {
		ContextInjectionFactory.uninject(wizardPage, context);
		jfaceWizardPage.dispose();
	}

	@Override
	public void setVisible(boolean visible) {
		jfaceWizardPage.setVisible(visible);
		if (visible && wizardPage != null) {
			ContextInjectionFactory.invoke(wizardPage, Focus.class, context);
		}
	}
}