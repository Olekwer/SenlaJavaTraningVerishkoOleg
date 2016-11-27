package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import oleg.example.org.HttpClient;

public class NameOptionSorter implements IEvent {


	public void action() throws IOException {
		// TODO Auto-generated method stub
	//	Reader reader= new Reader();
		Printer printer=new Printer();
			printer.print(HttpClient.getRestHttp("nameOptionSorter"));
			
		
	}

}
