package org.example.oleg.navigator;

<<<<<<< HEAD
import org.example.oleg.builder.Builder;
import org.example.oleg.menu.MenuFactory;

public class Navigator {
	private MenuFactory currentMenu;
	private Builder builder;
=======
import org.example.oleg.menu.MenuFactory;
/*
 * хождение по меню
 */
public class Navigator {
	private MenuFactory currentMenu;
//	private Builder builder;
>>>>>>> task6new

	
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
