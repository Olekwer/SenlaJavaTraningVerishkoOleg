package org.example.oleg.menu.roommenu.submenu;

import org.example.oleg.event.LastThreeGuest;
import org.example.oleg.menu.MenuFactory;

public class RoomLastThreeGuestMenu extends MenuFactory{
	public RoomLastThreeGuestMenu(){
		setEvent(new LastThreeGuest());
	}
}
