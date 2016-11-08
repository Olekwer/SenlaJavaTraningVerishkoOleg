package org.example.oleg.event;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AllRooms implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
			Reader reader= new Reader(facade.getRoomsList().get(i));
			reader.print();
		}
	}

}
