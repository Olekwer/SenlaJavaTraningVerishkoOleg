package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Input;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class DetailRoom implements IEvent {
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room";
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer print=new Printer(PLEACE_ENTER_NUMBER_ROOM);
		
		input.numberInt();
		try {
			int number = input.numberInt();
			print=new Printer(facade.detailRoom(number).toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
