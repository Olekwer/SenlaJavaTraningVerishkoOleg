package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import oleg.example.org.HttpClient;


public class AmountGuest implements IEvent {
	
	
	public void action() throws IOException {
		Printer printer=new Printer();
		printer.print(HttpClient.getRestHttp("amountGuest"));
		
	}

}
