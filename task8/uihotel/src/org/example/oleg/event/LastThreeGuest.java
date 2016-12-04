package org.example.oleg.event;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;
import com.example.api.SendRequest;

public class LastThreeGuest implements IEvent {
	private static final String PLEACE_ENTER_ID_ROOM = "Pleace enter id Room:";
	private static final int TWO = 2;

	public void action() {
		// TODO Auto-generated method stub
		Input input = new Input();
		Printer printer=new Printer();
		List<Object>args=new ArrayList<Object>();
		printer.print(PLEACE_ENTER_ID_ROOM);
		
		try {
			int numderRoom = input.numberInt();
			args.add("historyGuestRoom");
			args.add(numderRoom);	
			Request request=new Request(args);
			System.out.println(SendRequest.send(request, HeaderSoket.getSocket()));
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
