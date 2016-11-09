package org.example.oleg.event;

import java.util.Date;

<<<<<<< HEAD
import com.example.oleg.controller.Facade;

=======
import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


>>>>>>> task6new
public class AllFreeRoom implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		for(int i=0; i<facade.getServiceRooms().allFreeRoom(new Date()).size();i++){
<<<<<<< HEAD
			System.out.println(facade.getServiceRooms().allFreeRoom(new Date()).get(i));
=======
			Printer print=new Printer(facade.getServiceRooms().allFreeRoom(new Date()).get(i).toString());
		//	System.out.println(facade.getServiceRooms().allFreeRoom(new Date()).get(i));
>>>>>>> task6new
		}

	}

}
