package org.example.oleg.event;


import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;
import com.example.oleg.model.Room;


public class LastThreeGuest implements IEvent {
	private static final String PLEACE_ENTER_ID_ROOM = "Pleace enter id Room:";
	private static final int TWO = 2;
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Writer writer= new Writer();
		Reader reader=new Reader(PLEACE_ENTER_ID_ROOM);
		reader.print();
		try {
		writer.numberInt();
		int numderRoom = (int) writer.getResult();
		Room r=facade.detailRoom(numderRoom);
		
		for(int i=0;i<facade.historyGuestRoom(r, TWO).size();i++){
			reader.setText(facade.historyGuestRoom(r, TWO).get(i));
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
