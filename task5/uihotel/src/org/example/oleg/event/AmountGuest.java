package org.example.oleg.event;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AmountGuest implements IEvent {
	
	private Facade facade=Facade.getFacade();
	
	public void action() {
		Reader reader= new Reader(facade.amountGuest());
		reader.print();
		
	}

}
