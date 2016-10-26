package com.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;

public class RoomsSorted implements IEvent {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("p - sorted price; s - sorted stars; c - sorted capacity");
		Scanner scanner= new Scanner(System.in);
		String m= scanner.nextLine();
		if(m.equals("p")){
			for(int i=0;i<Facade.getFacade().getServiceRooms().sortByPrice().size();i++){
				System.out.println(Facade.getFacade().getServiceRooms().sortByPrice().get(i));
			}
		}
		if(m.equals("s")){
			for(int i=0;i<Facade.getFacade().getServiceRooms().sortByStars().size();i++){
				System.out.println(Facade.getFacade().getServiceRooms().sortByStars().get(i));
			}
		}
		if(m.equals("c")){
			for(int i=0;i<Facade.getFacade().getServiceRooms().sortByCapacity().size();i++){
				System.out.println(Facade.getFacade().getServiceRooms().sortByCapacity().get(i));
			}
		}
	}

}
