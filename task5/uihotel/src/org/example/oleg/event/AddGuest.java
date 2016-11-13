package org.example.oleg.event;

import java.util.Date;

import org.example.oleg.reader.Reader;
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
		Writer writer=new Writer();		
		Reader reader = new Reader(ENTER_NAME_GUEST);
		reader.print();
		writer.string();
		String name= (String) writer.getResult();
		reader = new Reader(ENTER_NUMBER_ROOM_GUEST);
		reader.print();
		writer.numberInt();
		int numberRoom=(int) writer.getResult(); 
		reader = new Reader(ENTER_DATE_CHANGE_DD_MM_YYYY);
		reader.print();
		writer.date();
		Date dateChange=(Date) writer.getResult();
		reader = new Reader(ENTER_DATE_OUT_DD_MM_YYYY);
		reader.print();
		writer.date();
		
		Date dateOut=(Date) writer.getResult();
		facade.getServiceGuests().putGuestRoom(name, numberRoom, dateChange, dateOut);
	}

}
