package org.example.oleg.event;

import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class CloneRoom implements IEvent {
	private static final String ID_NUMBER_ENTER = "id номера ввести";
	private Facade facade = Facade.getFacade();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Writer writer = new Writer();

		Reader reader = new Reader(ID_NUMBER_ENTER);
		reader.print();

		try {
			writer.numberInt();
			int a = (int) writer.getResult();
			facade.cloneRoom(a);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
