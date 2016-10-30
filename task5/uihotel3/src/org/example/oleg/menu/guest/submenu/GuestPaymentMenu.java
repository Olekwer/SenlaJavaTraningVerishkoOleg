package org.example.oleg.menu.guest.submenu;

import org.example.oleg.event.PaymentGuest;
import org.example.oleg.menu.MenuFactory;

public class GuestPaymentMenu extends MenuFactory{
	public GuestPaymentMenu(){
		setEvent(new PaymentGuest());
		setTitle("Payment Guest");
	}
}
