package org.example.oleg.event;

import java.util.Date;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Input;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;


public class AddGuest implements IEvent {
	private static final String ENTER_DATE_OUT_DD_MM_YYYY = "enter date Out (dd.MM.yyyy):";
	private static final String ENTER_DATE_CHANGE_DD_MM_YYYY = "enter date Change (dd.MM.yyyy) :";
	private static final String ENTER_NUMBER_ROOM_GUEST = "enter number Room Guest:";
	private static final String ENTER_NAME_GUEST = "enter name Guest:";
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Writer writer=new Writer();		
		Printer print=new Printer(ENTER_NAME_GUEST);
		
		String name= input.string();
		print = new Printer(ENTER_NUMBER_ROOM_GUEST);
				
		int numberRoom=input.numberInt(); 
		print = new Printer(ENTER_DATE_CHANGE_DD_MM_YYYY);
		
		
		Date dateChange=input.date();
		print = new Printer(ENTER_DATE_OUT_DD_MM_YYYY);
		
		
		
		Date dateOut=input.date();
		facade.getServiceGuests().putGuestRoom(name, numberRoom, dateChange, dateOut);
	}

}
