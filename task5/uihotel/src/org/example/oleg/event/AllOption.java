package org.example.oleg.event;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AllOption implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0; i<facade.getServiceOptions().getOptionsList().size();i++){
			Reader reader= new Reader(facade.getOptionsList().get(i));
			reader.print();
		}
	}

}
