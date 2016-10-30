package org.example.oleg.event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class AddGuest implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
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
	}

}
