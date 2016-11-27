package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import oleg.example.org.HttpClient;


public class AllGuest implements IEvent {
	//Facade facade =Facade.getFacade();
	public void action() throws IOException {
		Printer printer=new Printer();
		printer.print(HttpClient.getRestHttp("allGuest"));

	}

}
