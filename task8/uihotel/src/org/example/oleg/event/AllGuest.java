package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;

import com.example.api.Request;
import com.example.api.SendRequest;



public class AllGuest implements IEvent {
	//Facade facade =Facade.getFacade();
	public void action() throws IOException {
		Printer printer=new Printer();
		List<Object>list=new ArrayList<Object>();
		list.add("allGuest");
		Request request=new Request(list);
		String answer= (String) SendRequest.send(request, HeaderSoket.getSocket());
		printer.print(answer);

	}

}
