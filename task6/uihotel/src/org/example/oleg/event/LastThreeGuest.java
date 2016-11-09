package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.oleg.controller.Facade;
import com.example.oleg.model.Room;

public class LastThreeGuest implements IEvent {
	private static final String PLEACE_ENTER_ID_ROOM = "Pleace enter id Room:";
	private static final int TWO = 2;
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
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

	}

}
