package org.example.oleg.event;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;
import com.example.api.SendRequest;

public class DetailRoom implements IEvent {
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room";

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer printer=new Printer();
		printer.print(PLEACE_ENTER_NUMBER_ROOM);
		List<Object>list=new ArrayList<Object>();
	//	input.numberInt();
		try {
			int number = input.numberInt();
			list.add("cloneRoom");
			list.add(number);	
			Request request=new Request(list);
			System.out.println(SendRequest.send(request, HeaderSoket.getSocket()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
