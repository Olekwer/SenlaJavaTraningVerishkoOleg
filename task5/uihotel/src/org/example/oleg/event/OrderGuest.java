package org.example.oleg.event;

import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class OrderGuest implements IEvent {
	private static final String PLECE_ENTER_ID_GUEST = "Plece enter id Guest";
	private Facade facade=Facade.getFacade();
	public void action() {
		Reader reader = new Reader();
		Writer writer =new Writer();
		reader.setText(PLECE_ENTER_ID_GUEST);
		reader.print();
		writer.numberInt();
		int idGuest=(int) writer.getResult();
		for(int i=0;i<facade.optionGuestOrder(idGuest).size();i++){
			reader.setText(facade.optionGuestOrder(idGuest).get(i));
			reader.print();
		}
	}

}
