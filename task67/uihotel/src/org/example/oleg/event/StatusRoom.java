package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;


import com.example.oleg.controller.Facade;

public class StatusRoom implements IEvent {
	private static final String STATUS_R = "r";
	private static final String STATUS_M = "m";
	private static final String PLEACE_ENTER_STATUSR_ROOM_M_OR_R = "Pleace enter statusr Room. m or r";
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room.";
	private Facade facade = Facade.getFacade();

	public void action() {
		Input input = new Input();
		Printer printer=new Printer();
		printer.print(PLEACE_ENTER_NUMBER_ROOM);

		int numberRoom = input.numberInt();
		printer.print(PLEACE_ENTER_STATUSR_ROOM_M_OR_R);

		String status = input.string();
		if (status.equals(STATUS_M)) {
			facade.maintainedRoom(numberRoom);
		} else if (status.equals(STATUS_R)) {
			facade.repairsRoom(numberRoom);
		}

	}

}
