package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;

public class CapacityRoomSorter implements IEvent {
	private Facade facade=Facade.getFacade();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		for (int i = 0; i < facade.sortByCapacityRoom().size(); i++) {
			Printer print=new Printer(facade.sortByCapacityRoom().get(i).toString());
		}
	}

}
