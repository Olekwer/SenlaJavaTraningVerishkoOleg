package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;
import com.example.api.SendRequest;

public class StatusRoom implements IEvent {
	private static final String STATUS_R = "r";
	private static final String STATUS_M = "m";
	private static final String PLEACE_ENTER_STATUSR_ROOM_M_OR_R = "Pleace enter statusr Room. m or r";
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room.";

	public void action() throws IOException {
		Input input = new Input();
		Printer printer = new Printer();
		List<Object> list = new ArrayList<Object>();
		printer.print(PLEACE_ENTER_NUMBER_ROOM);

		int numberRoom = input.numberInt();
		printer.print(PLEACE_ENTER_STATUSR_ROOM_M_OR_R);

		String status = input.string();

		String header = null;
		list.add(numberRoom);
		if (status.equals(STATUS_M)) {
			header = "repairsRoom";
		} else if (status.equals(STATUS_R)) {
			header = "maintainedRoom";
		}
		list.add(header);
		list.add(numberRoom);
		Request request = new Request(list);

		SendRequest.send(request, HeaderSoket.getSocket());

	}

}
