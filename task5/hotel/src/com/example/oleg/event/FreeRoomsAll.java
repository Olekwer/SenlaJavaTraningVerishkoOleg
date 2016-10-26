package com.example.oleg.event;

import java.util.Date;

import com.example.oleg.controller.Facade;

public class FreeRoomsAll implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0; i<Facade.getFacade().getServiceRooms().allFreeRoom(new Date()).size();i++){
			System.out.println(Facade.getFacade().getServiceRooms().allFreeRoom(new Date()).get(i));
		}
	}

}
