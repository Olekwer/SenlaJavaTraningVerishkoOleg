package org.example.oleg.menu.roommenu.submenu;

import org.example.oleg.event.StatusRoom;
import org.example.oleg.menu.MenuFactory;

public class RoomStatusMenu extends MenuFactory {
	public RoomStatusMenu(){
		setEvent(new StatusRoom());
		setTitle("Status Room");
	}
}
