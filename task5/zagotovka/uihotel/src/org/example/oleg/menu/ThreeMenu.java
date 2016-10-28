package org.example.oleg.menu;

import org.example.oleg.event.IEvent;

public class ThreeMenu extends MenuFactory{
	public ThreeMenu(String title, MenuFactory[] subMenus, IEvent event){
		setTitle(title);
		setSubMenus(subMenus);
	}
}
