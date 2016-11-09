package org.example.oleg.event;

<<<<<<< HEAD
import com.example.oleg.controller.Facade;

=======
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


>>>>>>> task6new
public class AllRooms implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
<<<<<<< HEAD
			System.out.println(facade.getServiceRooms().getRoomsList().get(i));
=======
			Reader reader= new Reader(facade.getRoomsList().get(i));
			reader.print();
>>>>>>> task6new
		}
	}

}
