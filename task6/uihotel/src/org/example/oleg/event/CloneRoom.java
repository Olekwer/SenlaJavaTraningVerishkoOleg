package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class CloneRoom implements IEvent {
	private Facade facade = Facade.getFacade();
	@Override
	public void action() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			
		System.out.println("id номера ввести");
		try{
			int a=sc.nextInt();			
			facade.cloneRoom(a);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
