package org.example.oleg.menu.roommenu.submenu;

import org.example.oleg.event.AllFreeRoom;
import org.example.oleg.menu.MenuFactory;

public class RoomAllFreeMenu extends MenuFactory {
	public RoomAllFreeMenu(){
		setEvent(new AllFreeRoom());
		setTitle("All Free Room");
	}
}
