package org.example.oleg.navigator;

import org.example.oleg.menu.MenuFactory;
/*
 * хождение по меню
 */
public class Navigator {
	private MenuFactory currentMenu;
//	private Builder builder;

	
	public void setCurrentMenu(MenuFactory currentMenu) {
		this.currentMenu = currentMenu;
	}

	public void selectMenu(int next) {

		if (next == 0) {
			this.currentMenu = this.currentMenu.getRootMenu();

		} else {
			this.currentMenu = this.currentMenu.getSubMenyList().get(next-1);

		}

	}

	public MenuFactory getCurrentMenu() {
		return this.currentMenu;
	}

}
