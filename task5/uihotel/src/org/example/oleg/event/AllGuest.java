package org.example.oleg.event;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AllGuest implements IEvent {
	Facade facade =Facade.getFacade();
	public void action() {
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
			Reader reader= new Reader(facade.getGuestsList().get(i));
			reader.print();
		}

	}

}
