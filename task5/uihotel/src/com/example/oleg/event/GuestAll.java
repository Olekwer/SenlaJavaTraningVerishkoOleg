package com.example.oleg.event;

import com.example.oleg.controller.Facade;

public class GuestAll implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
			System.out.println(Facade.getFacade().getServiceGuests().getGuestsList().get(i));
		}
	}

}
