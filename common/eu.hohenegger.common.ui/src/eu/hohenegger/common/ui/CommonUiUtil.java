package eu.hohenegger.common.ui;

import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.menus.IMenuService;

public class CommonUiUtil {
	private static final String POPUP_MENU_ID_PREFIX = "popup:";

	public static boolean registerE4ContextMenu(EMenuService menuService, String menuId, Control viewerControl) {
		return menuService.registerContextMenu(viewerControl, POPUP_MENU_ID_PREFIX + menuId);
	}
	
	public static Menu registerE3ContextMenu(IMenuService menuService, String menuId, Control viewerControl) {
		MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(viewerControl);
		viewerControl.setMenu(menu);
		menuService.populateContributionManager(menuMgr, POPUP_MENU_ID_PREFIX + menuId);
		return menu;
	}
}
