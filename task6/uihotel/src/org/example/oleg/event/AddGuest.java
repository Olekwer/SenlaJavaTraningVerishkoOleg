package org.example.oleg.event;

<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class AddGuest implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name Guest:");
		String name= sc.nextLine();
		System.out.println("enter number Room Guest:");
		int numberRoom=sc.nextInt(); 
		System.out.println("enter date Change (dd.MM.yyyy) :");
		String dateChange=sc.next(); 
		System.out.println("enter date Out (dd.MM.yyyy):");
		String dateOut=sc.next();
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
		try {
			facade.getServiceGuests().putGuestRoom(name, numberRoom, format.parse(dateChange), format.parse(dateOut));
		} catch (ParseException e) {
			e.printStackTrace();
		}
=======
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
>>>>>>> task6new
	}

}
