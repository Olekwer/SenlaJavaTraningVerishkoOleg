package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class OptionSorter implements IEvent {

	private Facade facade = Facade.getFacade();

	public void action() {
		System.out.println("n - sorted name; p - price;");
		Scanner scanner = new Scanner(System.in);
		String m = scanner.nextLine();
		if (m.equals("p")) {
			for (int i = 0; i < facade.getServiceOptions().sortByName().size(); i++) {
				System.out.println(facade.getServiceOptions().sortByPrice().get(i));
			}
		} else if (m.equals("n")) {
			for (int i = 0; i < Facade.getFacade().getServiceRooms().sortByStars().size(); i++) {
				System.out.println(facade.getServiceOptions().sortByName().get(i));
			}
		}

	}

}
