package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;

import com.example.api.Request;
import com.example.api.SendRequest;

public class NameOptionSorter implements IEvent {


	public void action() throws IOException {
		// TODO Auto-generated method stub
	//	Reader reader= new Reader();
		Printer printer=new Printer();
			List<Object>list=new ArrayList<Object>();
			list.add("nameOptionSorter");
			Request request=new Request(list);
			String answer= (String) SendRequest.send(request, HeaderSoket.getSocket());
			printer.print(answer);
		
	}

}
