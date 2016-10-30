package org.example.oleg.event;

import java.util.Date;

import com.example.oleg.controller.Facade;

public class AllFreeRoom implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		for(int i=0; i<facade.getServiceRooms().allFreeRoom(new Date()).size();i++){
			System.out.println(facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}

	}

}
