package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class StatusRoom implements IEvent {
	private Facade facade = Facade.getFacade();

	public void action() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleace enter number Room.");
		int numberRoom=sc.nextInt();
		System.out.println("Pleace enter statusr Room. m or r");
		String status=sc.next();
		if(status.equals("m")){
			facade.getServiceRooms().maintainedRoom(numberRoom);
		}
		else if(status.equals("r")){
			facade.getServiceRooms().repairsRoom(numberRoom);
		}

	}

}
