package com.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class RoomThreeLostGuest implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter numder Room:");
		Scanner sc=new Scanner(System.in);
		int numderRoom =sc.nextInt();
		for(int i=0; i<Facade.getFacade().getServiceRooms().threeLostGuest(numderRoom).length;i++){
			System.out.println(Facade.getFacade().getServiceRooms().threeLostGuest(numderRoom)[i]);
		}
	}

}
