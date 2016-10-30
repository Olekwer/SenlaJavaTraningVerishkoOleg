package org.example.oleg.menu.guest.submenu;

import org.example.oleg.event.AddGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestAddMenu extends MenuFactory {
	public GuestAddMenu(){
		setEvent(new AddGuest());
		setTitle("Add Guest Menu");
	}
}
