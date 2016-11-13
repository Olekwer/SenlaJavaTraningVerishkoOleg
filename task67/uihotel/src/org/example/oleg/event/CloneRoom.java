package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.oleg.controller.Facade;

public class CloneRoom implements IEvent {
	private static final String ID_NUMBER_ENTER = "id ������ ������";
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer printer=new Printer();
		printer.print(ID_NUMBER_ENTER);

		try {
			int a = input.numberInt();
			facade.cloneRoom(a);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
