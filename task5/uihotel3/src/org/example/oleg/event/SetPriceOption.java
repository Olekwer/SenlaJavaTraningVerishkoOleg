package org.example.oleg.event;

import java.awt.SystemColor;
import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class SetPriceOption implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleace enter id option");
		int idOption=sc.nextInt();
		System.out.println("Pleace enter new price option");
		double price=sc.nextDouble();
		facade.getServiceOptions().setPrice(idOption, price);
	}

}
