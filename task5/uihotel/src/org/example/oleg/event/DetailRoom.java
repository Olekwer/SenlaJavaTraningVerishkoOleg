package org.example.oleg.event;

import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class DetailRoom implements IEvent {
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room";
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Reader reader = new Reader(PLEACE_ENTER_NUMBER_ROOM);
		reader.print();

		Writer writer = new Writer();
		writer.numberInt();
		try {
			int number = (int) writer.getResult();
			reader.setText(facade.detailRoom(number));
			reader.print();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
