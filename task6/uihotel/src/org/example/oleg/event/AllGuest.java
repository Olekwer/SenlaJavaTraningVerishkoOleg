package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AllGuest implements IEvent {
	Facade facade =Facade.getFacade();
	public void action() {
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
			Printer print=new Printer(facade.getGuestsList().get(i).toString());
		}

	}

}
