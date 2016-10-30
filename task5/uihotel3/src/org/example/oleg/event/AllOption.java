package org.example.oleg.event;

import com.example.oleg.controller.Facade;

public class AllOption implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0; i<facade.getServiceOptions().getOptionsList().size();i++){
			System.out.println(facade.getServiceOptions().getOptionsList().get(i));
		}
	}

}
