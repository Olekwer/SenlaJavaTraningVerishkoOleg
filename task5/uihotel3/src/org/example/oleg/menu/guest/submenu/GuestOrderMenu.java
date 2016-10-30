package org.example.oleg.menu.guest.submenu;

import org.example.oleg.event.OrderGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestOrderMenu extends MenuFactory {
	public GuestOrderMenu(){
		setEvent(new OrderGuest());
		setTitle("Order Guest");
	}
}
