package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;

public class OrderGuest implements IEvent {
	private static final String PLECE_ENTER_ID_GUEST = "Plece enter id Guest";

	public void action() throws IOException {

		Input input = new Input();
		Printer printer = new Printer();
		printer.print(PLECE_ENTER_ID_GUEST);
		List<Object> list = new ArrayList<Object>();
		int idGuest = input.numberInt();
		list.add(idGuest);

		printer.print((String)Request.send(list));

	}

}
