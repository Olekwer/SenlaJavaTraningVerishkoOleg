package org.example.oleg.event;

import org.example.oleg.reader.Printer;

import com.example.oleg.controller.Facade;

public class NameGuestSorter implements IEvent{
	private Facade facade=Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
		for (int i = 0; i < facade.sortedByNameGuest().size(); i++) {
			printer.print(facade.sortedByNameGuest().get(i).toString());
			
		}
	}

}
