package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class OptionAdd implements IEvent {
	private Facade facade = Facade.getFacade();

	public void action() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleace enter name option");
		String name = sc.next();
		System.out.println("Pleace enter price option");
		double price = sc.nextDouble();
		facade.getServiceOptions().addOption(name, price);

	}

}
