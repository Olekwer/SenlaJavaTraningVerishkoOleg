package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;

import com.example.api.Request;
import com.example.api.SendRequest;



public class AllRooms implements IEvent {
	public void action() throws IOException {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
	/*	for(int i=0;i<facade.getServiceRooms().getRoomsList().size();i++){
			printer.print(facade.getRoomsList().get(i).toString());
			
		}*/
		List<Object>list=new ArrayList<Object>();
		list.add("getRoomsList");
		Request request=new Request(list);
		//String answer= (String) SendRequest.send(request, HeaderSoket.getSocket());
		System.out.println(SendRequest.send(request, HeaderSoket.getSocket()));
		List<Object>roomList=(List) SendRequest.send(request, HeaderSoket.getSocket());
		for (Object s: roomList) {
			System.out.println(s.toString());
		}
		//printer.print(answer);
		
	}

}
