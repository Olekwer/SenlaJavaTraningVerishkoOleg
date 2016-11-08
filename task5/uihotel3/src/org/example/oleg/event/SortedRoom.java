package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class SortedRoom implements IEvent {
	private Facade facade = Facade.getFacade();

	public void action() {
		System.out.println("p - sorted price; s - sorted stars; c - sorted capacity");
		Scanner scanner = new Scanner(System.in);
		String m = scanner.nextLine();
		if (m.equals("p")) {
			for (int i = 0; i < facade.getServiceRooms().sortByPrice().size(); i++) {
				System.out.println(facade.getServiceRooms().sortByPrice().get(i));
			}
		} else if (m.equals("s")) {
			for (int i = 0; i < Facade.getFacade().getServiceRooms().sortByStars().size(); i++) {
				System.out.println(facade.getServiceRooms().sortByStars().get(i));
			}
		} else if (m.equals("c")) {
			for (int i = 0; i < Facade.getFacade().getServiceRooms().sortByCapacity().size(); i++) {
				System.out.println(facade.getServiceRooms().sortByCapacity().get(i));
			}
		}

	}

}
