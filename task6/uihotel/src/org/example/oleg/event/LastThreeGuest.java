package org.example.oleg.event;

<<<<<<< HEAD
import java.util.Scanner;
=======
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;
>>>>>>> task6new

import com.example.oleg.controller.Facade;
import com.example.oleg.model.Room;

public class LastThreeGuest implements IEvent {
<<<<<<< HEAD
=======
	private static final String PLEACE_ENTER_ID_ROOM = "Pleace enter id Room:";
	private static final int TWO = 2;
>>>>>>> task6new
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
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
		
=======
		Input input = new Input();
		@SuppressWarnings("unused")
		Printer printer = new Printer(PLEACE_ENTER_ID_ROOM);
		
		try {
			int numderRoom = input.numberInt();
			Room r = facade.detailRoom(numderRoom);

			for (int i = 0; i < facade.historyGuestRoom(r, TWO).size(); i++) {
				printer=new Printer(facade.historyGuestRoom(r, TWO).get(i).toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

>>>>>>> task6new
	}

}
