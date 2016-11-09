package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AmountGuest implements IEvent {
	
	private Facade facade=Facade.getFacade();
	
	public void action() {
		Printer print=new Printer(String.valueOf(facade.amountGuest()));
		
	}

}
