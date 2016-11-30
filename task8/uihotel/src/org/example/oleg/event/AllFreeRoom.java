package org.example.oleg.event;


import java.io.IOException;

import org.example.oleg.reader.Printer;

import com.example.api.Request;



public class AllFreeRoom implements IEvent {
	//private Facade facade=Facade.getFacade();
	public void action() throws IOException {
		Printer print=new Printer();
		print.print((String)Request.send("allFreeRoom"));
		
	}

	

}
