package org.example.oleg.event;

import org.example.oleg.reader.Printer;

import com.example.oleg.controller.Facade;


public class AmountGuest implements IEvent {
	
	private Facade facade=Facade.getFacade();
	
	public void action() {
		Printer printer=new Printer();
		printer.print(String.valueOf(facade.amountGuest()));
		
	}

}
