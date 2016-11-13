package org.example.oleg.event;

import org.example.oleg.reader.Printer;

import com.example.oleg.controller.Facade;

public class PriceOptionSorter implements IEvent {

	private Facade facade=Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		//Reader reader= new Reader();
		Printer printer=new Printer();
		for (int i = 0; i < facade.sortByPriceOption().size(); i++) {
			printer.print(facade.sortByPriceOption().get(i).toString());
			
		}
	}

}
