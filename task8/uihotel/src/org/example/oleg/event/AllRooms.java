package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import oleg.example.org.HttpClient;


public class AllRooms implements IEvent {
	public void action() throws IOException {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
	/*	for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
			printer.print(facade.getRoomsList().get(i).toString());
			
		}*/
		String s=HttpClient.getRestHttp("allRooms");
		printer.print(s);
		
	}

}
