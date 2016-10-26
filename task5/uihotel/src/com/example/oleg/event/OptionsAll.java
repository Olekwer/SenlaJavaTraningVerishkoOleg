package com.example.oleg.event;

import com.example.oleg.controller.Facade;

public class OptionsAll implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0; i<Facade.getFacade().getServiceOptions().getOptionsList().size();i++){
			System.out.println(Facade.getFacade().getServiceOptions().getOptionsList().get(i));
		}
	}

}
