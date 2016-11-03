package org.example.oleg.event;

import java.util.Scanner;

import com.example.oleg.controller.Facade;
import com.example.oleg.model.Room;

public class LastThreeGuest implements IEvent {
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter id Room:");
		Scanner sc = new Scanner(System.in);
		try {
		int numderRoom = sc.nextInt();
		Room r=null;
		for(int i=0;i<facade.getRoomsList().size();i++){
			if(facade.getRoomsList().get(i).getId()==numderRoom){
				r=facade.getRoomsList().get(i);
			}
		}
		
		for(int i=0;i<facade.historyGuestRoom(r, 2).size();i++){
			System.out.println(facade.historyGuestRoom(r, 2).get(i));
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
