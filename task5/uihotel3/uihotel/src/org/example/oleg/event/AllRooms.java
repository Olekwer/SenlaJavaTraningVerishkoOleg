package org.example.oleg.event;

import com.example.oleg.controller.Facade;

public class AllRooms implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
			System.out.println(facade.getServiceRooms().getRoomsList().get(i));
		}
	}

}
