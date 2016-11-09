package org.example.oleg.event;

<<<<<<< HEAD
import com.example.oleg.controller.Facade;

=======
import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


>>>>>>> task6new
public class AmountGuest implements IEvent {
	
	private Facade facade=Facade.getFacade();
	
	public void action() {
<<<<<<< HEAD
		System.out.println(facade.getServiceGuests().amountGuest());
=======
		Printer print=new Printer(String.valueOf(facade.amountGuest()));
>>>>>>> task6new
		
	}

}
