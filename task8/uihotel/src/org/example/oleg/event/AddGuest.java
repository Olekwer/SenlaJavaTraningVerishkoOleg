package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;



public class AddGuest implements IEvent {
	private static final String ENTER_DATE_OUT_DD_MM_YYYY = "enter date Out (dd.MM.yyyy):";
	private static final String ENTER_DATE_CHANGE_DD_MM_YYYY = "enter date Change (dd.MM.yyyy) :";
	private static final String ENTER_NUMBER_ROOM_GUEST = "enter number Room Guest:";
	private static final String ENTER_NAME_GUEST = "enter name Guest:";
	//private Facade facade=Facade.getFacade();
	public void action() throws IOException {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer print=new Printer();
		print.print(ENTER_NAME_GUEST);
		
		String name= input.string();
		print.print(ENTER_NUMBER_ROOM_GUEST);
				
		int numberRoom=input.numberInt(); 
		print.print(ENTER_DATE_CHANGE_DD_MM_YYYY);
		
		
		Date dateChange=input.date();
		print.print(ENTER_DATE_OUT_DD_MM_YYYY);
		
		
		
		Date dateOut=input.date();
		List<Object>list=new ArrayList<Object>();
		list.add(name);
		list.add(numberRoom);
		list.add(dateChange);
		list.add(dateOut);
		Request.send(list);
		//facade.getServiceGuests().putGuestRoom(name, numberRoom, dateChange, dateOut);
	}

}
