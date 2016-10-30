package org.example.oleg.menu.guest;

import org.example.oleg.event.AllGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestMenu extends MenuFactory {
	public GuestMenu(){
		setEvent(new AllGuest());
		setTitle("Guest Menu");
		
		
	}
	
}
