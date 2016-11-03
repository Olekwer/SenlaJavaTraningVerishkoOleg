package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class OrderGuest implements IEvent {
	private Facade facade=Facade.getFacade();
	public void action() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plece enter id Guest");
		int idGuest=sc.nextInt();
		for(int i=0;i<facade.getServiceOrder().optionGuest(idGuest).size();i++){
			System.out.println(facade.getServiceOrder().optionGuest(idGuest).get(i));
		}
	}

}
