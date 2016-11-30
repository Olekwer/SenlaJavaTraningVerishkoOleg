package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import com.example.api.Request;


public class NameGuestSorter implements IEvent{

	public void action() throws IOException {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
			printer.print((String)Request.send("sortedByNameGuest"));
			
		
	}

}
