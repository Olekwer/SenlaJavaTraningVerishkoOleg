package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class DetailRoom implements IEvent {
	private Facade facade = Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter number Room");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		System.out.println(facade.getServiceRooms().detailRoom(number));
	}
}


