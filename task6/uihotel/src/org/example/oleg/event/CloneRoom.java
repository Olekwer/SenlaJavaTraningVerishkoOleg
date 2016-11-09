package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Input;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class CloneRoom implements IEvent {
	private static final String ID_NUMBER_ENTER = "id номера ввести";
	private Facade facade = Facade.getFacade();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer print=new Printer(ID_NUMBER_ENTER);

		try {
			int a = input.numberInt();
			facade.cloneRoom(a);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
