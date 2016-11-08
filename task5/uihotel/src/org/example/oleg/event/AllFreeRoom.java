package org.example.oleg.event;

import java.util.Date;

import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


public class AllFreeRoom implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		for(int i=0; i<facade.getServiceRooms().allFreeRoom(new Date()).size();i++){
			Reader reader=new Reader(facade.getServiceRooms().allFreeRoom(new Date()).get(i));
			reader.print();
		//	System.out.println(facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}

	}

}
