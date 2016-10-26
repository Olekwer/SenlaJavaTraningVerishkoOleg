package com.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class OrdersAll implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter id Guest");
		Scanner scanner=new Scanner(System.in);
		int sad=scanner.nextInt();
		for(int i=0;i<Facade.getFacade().getServiceOrder().optionGuest(sad).size();i++){
			System.out.println(Facade.getFacade().getServiceOrder().optionGuest(sad).get(i));
		}
	}

}
