package org.example.oleg.menu.roommenu.submenu;

import org.example.oleg.event.DetailRoom;
import org.example.oleg.menu.MenuFactory;

public class RoomDetailMenu extends MenuFactory {
	public RoomDetailMenu(){
		setEvent(new DetailRoom());
		setTitle("Detail Room");
	}
}
