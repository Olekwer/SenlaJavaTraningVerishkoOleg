package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class LastThreeGuest implements IEvent {
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter numder Room:");
		Scanner sc = new Scanner(System.in);
		int numderRoom = sc.nextInt();
		for (int i = 0; i < facade.getServiceRooms()
				.threeLostGuest(numderRoom).length; i++) {
			System.out.println(facade.getServiceRooms()
					.threeLostGuest(numderRoom)[i]);
		}
	}

}
