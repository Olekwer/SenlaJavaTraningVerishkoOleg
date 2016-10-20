package com.example.oleg;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.example.oleg.base.DateBase;
import com.example.oleg.controller.Facade;

public class Main {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		
		DateBase dateBase = new DateBase(args[0], args[1], args[2]);
		Facade facade = new Facade(dateBase);
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().getRoomsList().size(); i++) {
			System.out.println(facade.getServiceRooms().getRoomsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceOptions().getOptionsList().size(); i++) {
			System.out.println(facade.getServiceOptions().getOptionsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().sortedByName().size(); i++) {
			System.out.println(facade.getServiceGuests().sortedByName().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().sortedByName().size(); i++) {
			System.out.println(facade.getServiceGuests().sortedByDateOut().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().allFreeRoom(new Date()).size(); i++) {
			System.out.println("asd " + facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}
		System.out.println("-----------------------------------------------------");
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");

		facade.getServiceGuests().putGuestRoom("kira",1, format.parse("19.10.2016"), format.parse("30.10.2016"));
		facade.getServiceGuests().saveGuest(args[1]);
		dateBase = new DateBase(args[0], args[1], args[2]);
		facade=new Facade(dateBase);
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().allFreeRoom(new Date()).size(); i++) {
			System.out.println("asd " + facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<facade.getServiceRooms().threeLostGuest(4).length;i++){
			System.out.println(facade.getServiceRooms().threeLostGuest(2)[i]);
		}
		System.out.println("-----------------------------------------------------");		
		System.out.println(facade.getServiceRooms().detailRoom(4));
		System.out.println("-----------------------------------------------------");		
		System.out.println(facade.getServiceRooms().paymentGuest(4));
	}

	

}
