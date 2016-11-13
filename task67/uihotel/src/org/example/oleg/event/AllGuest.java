package org.example.oleg.event;

import org.example.oleg.reader.Printer;

import com.example.oleg.controller.Facade;


public class AllGuest implements IEvent {
	Facade facade =Facade.getFacade();
	public void action() {
		Printer printer=new Printer();
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
			printer.print(facade.getGuestsList().get(i).toString());
		}

	}

}
