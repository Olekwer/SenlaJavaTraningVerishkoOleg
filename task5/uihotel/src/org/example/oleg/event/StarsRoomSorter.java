package org.example.oleg.event;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;

public class StarsRoomSorter implements IEvent {

	private Facade facade=Facade.getFacade();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Reader reader= new Reader();
		for (int i = 0; i < facade.sortByStarsRoom().size(); i++) {
			reader.setText(facade.sortByStarsRoom().get(i));
			reader.print();
		}
	}

}
