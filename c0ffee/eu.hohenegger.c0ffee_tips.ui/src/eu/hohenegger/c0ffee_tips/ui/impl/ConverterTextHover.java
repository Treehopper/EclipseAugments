package eu.hohenegger.c0ffee_tips.ui.impl;

import org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import eu.hohenegger.c0ffee_tips.ConverterUtil;

public class ConverterTextHover implements /*ITextHoverExtension2, ITextHoverExtension,*/ IJavaEditorTextHover {

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		StringBuffer result = new StringBuffer();
		Display.getDefault().syncExec(() -> {
			try {
				result.append(textViewer.getDocument().get(hoverRegion.getOffset(), hoverRegion.getLength()));
			} catch (BadLocationException e) {
				//do nothing
			}
		});
		String hoverToken = result.toString();
		
		String int32dec = null;
		String int32bin = null;
		
		if (hoverToken.startsWith("0x")) {
			int32dec = ConverterUtil.convert2dec(hoverToken);
			int32bin = ConverterUtil.convert2bin(hoverToken);
		}
		if (int32dec != null) {
			return format(hoverToken, int32dec, int32bin);
		}
		return null;
	}

	private String format(String hoverToken, String int32dec, String int32bin) {
		String result = "<html>";
		result += String.format("<b>%s:</b>", hoverToken);
		result += "<br>";
		result += String.format("dec: %s", int32dec);
		result += "<br>";
		result += String.format("bin: %s", int32bin);
		result += "</html>";
		return result;
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEditor(IEditorPart editor) {
		// TODO Auto-generated method stub

	}
}
