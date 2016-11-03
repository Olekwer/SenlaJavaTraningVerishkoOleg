package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class SortedGuest implements IEvent {

	private Facade facade = Facade.getFacade();

	public void action() {
		System.out.println("n - sorted name; d - date out;");
		Scanner scanner = new Scanner(System.in);
		String m = scanner.nextLine();
		if (m.equals("d")) {
			for (int i = 0; i < facade.getServiceGuests().sortedByDateOut().size(); i++) {
				System.out.println(facade.getServiceGuests().sortedByDateOut().get(i));
			}
		} else if (m.equals("n")) {
			for (int i = 0; i < facade.getServiceGuests().sortedByName().size(); i++) {
				System.out.println(facade.getServiceGuests().sortedByName().get(i));
			}
		}

	}

}
