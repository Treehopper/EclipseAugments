package eu.hohenegger.stacks.ui.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {

	private static RGB toRGB(int rgb) {
		return new RGB((rgb >> 16) & 0xff, (rgb >> 8) & 0xff, rgb & 0xff);
	}

	protected Map<RGB, Color> colorTable = new HashMap<>(10);
	public static final RGB MACRO = toRGB(0x646464);
	public static final RGB DEFAULT = toRGB(0x000000);
	public static final RGB STRING = toRGB(0x2733ff);
	public static final RGB KEYWORD = toRGB(0x801455);
	public static final RGB COMMENT = toRGB(0x3f7e60);

	public void dispose() {
		for (Color color : colorTable.values()) {
			color.dispose();
		}
	}

	public Color getColor(RGB rgb) {
		Color color = colorTable.get(rgb);
		if (color == null) {
			color = new Color(Display.getCurrent(), rgb);
			colorTable.put(rgb, color);
		}
		return color;
	}

	public Color getColor(int rgbColor) {
		RGB rgb = toRGB(rgbColor);
		return getColor(rgb);
	}
}
