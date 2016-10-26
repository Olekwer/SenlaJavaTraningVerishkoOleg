package com.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class RoomDetail implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter number Room");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		System.out.println(Facade.getFacade().getServiceRooms().detailRoom(number));
	}

}
