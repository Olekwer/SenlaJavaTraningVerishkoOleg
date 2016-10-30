package org.example.oleg.menu.roommenu.submenu;

import org.example.oleg.event.SortedRoom;
import org.example.oleg.menu.MenuFactory;

public class RoomSortedMenu extends MenuFactory{
	public RoomSortedMenu(){
		setEvent(new SortedRoom());
		setTitle("Sorted Room");
	}
}
