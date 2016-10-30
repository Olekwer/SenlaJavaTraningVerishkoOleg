package org.example.oleg.menu.guest.submenu;

import org.example.oleg.event.SortedGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestSortedMenu extends MenuFactory {
	public GuestSortedMenu(){
		setEvent(new SortedGuest());
		setTitle("Sorted Guest");
	}
}
