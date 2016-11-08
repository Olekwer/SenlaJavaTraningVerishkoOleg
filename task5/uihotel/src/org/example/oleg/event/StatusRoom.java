package org.example.oleg.event;

import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class StatusRoom implements IEvent {
	private static final String STATUS_R = "r";
	private static final String STATUS_M = "m";
	private static final String PLEACE_ENTER_STATUSR_ROOM_M_OR_R = "Pleace enter statusr Room. m or r";
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room.";
	private Facade facade = Facade.getFacade();

	public void action() {
		Reader reader = new Reader();
		Writer writer =new Writer();
		
		reader.setText(PLEACE_ENTER_NUMBER_ROOM);
		reader.print();
		writer.numberInt();
		int numberRoom=(int) writer.getResult();
		reader.setText(PLEACE_ENTER_STATUSR_ROOM_M_OR_R);
		reader.print();
		writer.string();
		String status=(String) writer.getResult();
		if(status.equals(STATUS_M)){
			facade.maintainedRoom(numberRoom);
		}
		else if(status.equals(STATUS_R)){
			facade.repairsRoom(numberRoom);
		}

	}

}
