package org.example.oleg.event;

import java.io.IOException;

import org.example.oleg.reader.Printer;

import com.example.api.Request;



public class AllRooms implements IEvent {
	public void action() throws IOException {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
	/*	for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
			printer.print(facade.getRoomsList().get(i).toString());
			
		}*/
		String s=(String) Request.send("allRooms");
		printer.print(s);
		
	}

}
