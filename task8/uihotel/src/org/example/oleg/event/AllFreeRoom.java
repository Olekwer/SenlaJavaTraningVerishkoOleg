package org.example.oleg.event;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;

import com.example.api.Request;
import com.example.api.SendRequest;



public class AllFreeRoom implements IEvent {
	//private Facade facade=Facade.getFacade();
	public void action() throws IOException {
		Printer print=new Printer();
		List<Object>list=new ArrayList<Object>();
		list.add("allFreeRoom");
		Request request=new Request(list);
		String answer= (String) SendRequest.send(request, HeaderSoket.getSocket());
		print.print(answer);
		
	}

	

}
