package org.example.oleg.event;

import com.example.oleg.controller.Facade;

public class AllGuest implements IEvent {
	Facade facade =Facade.getFacade();
	public void action() {
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
			System.out.println(Facade.getFacade().getServiceGuests().getGuestsList().get(i));
		}

	}

}
