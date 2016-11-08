package org.example.oleg.menu.guest.submenu;

import org.example.oleg.event.AmountGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestAmount extends MenuFactory  {
	public GuestAmount(){
		setEvent(new AmountGuest());
		setTitle("Amount Guest Menu");
	}
}
