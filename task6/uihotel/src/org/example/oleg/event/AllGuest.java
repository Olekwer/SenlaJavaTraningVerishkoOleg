package org.example.oleg.event;

<<<<<<< HEAD
import com.example.oleg.controller.Facade;

=======
import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


>>>>>>> task6new
public class AllGuest implements IEvent {
	Facade facade =Facade.getFacade();
	public void action() {
		for(int i=0;i<Facade.getFacade().getServiceGuests().getGuestsList().size();i++){
<<<<<<< HEAD
			System.out.println(Facade.getFacade().getServiceGuests().getGuestsList().get(i));
=======
			Printer print=new Printer(facade.getGuestsList().get(i).toString());
>>>>>>> task6new
		}

	}

}
