package com.example.oleg.event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class GuestAdd implements IEvent {

	@Override
	public void action()  {
		System.out.println();
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
			Facade.getFacade().getServiceGuests().putGuestRoom(name, numberRoom, format.parse(dateChange), format.parse(dateOut));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
