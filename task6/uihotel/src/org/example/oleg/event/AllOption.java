package org.example.oleg.event;

<<<<<<< HEAD
import com.example.oleg.controller.Facade;

=======
import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;


>>>>>>> task6new
public class AllOption implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		for(int i=0; i<facade.getServiceOptions().getOptionsList().size();i++){
<<<<<<< HEAD
			System.out.println(facade.getServiceOptions().getOptionsList().get(i));
=======
			Printer print=new Printer(facade.getOptionsList().get(i).toString());
>>>>>>> task6new
		}
	}

}
