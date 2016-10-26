package com.example.oleg.event;

import com.example.oleg.controller.Facade;

public class RomsAll implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0;i<Facade.getFacade().getServiceRooms().getRoomsList().size();i++){
			System.out.println(Facade.getFacade().getServiceRooms().getRoomsList().get(i));
		}
	}

}
