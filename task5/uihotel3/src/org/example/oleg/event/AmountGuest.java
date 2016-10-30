package org.example.oleg.event;

import com.example.oleg.controller.Facade;

public class AmountGuest implements IEvent {
	
	private Facade facade=Facade.getFacade();
	
	public void action() {
		System.out.println(facade.getServiceGuests().amountGuest());
		
	}

}
