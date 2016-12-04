package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;
import com.example.api.SendRequest;

public class SetPriceOption implements IEvent {
	private static final String PLEACE_ENTER_NEW_PRICE_OPTION = "Pleace enter new price option";
	private static final String PLEACE_ENTER_ID_OPTION = "Pleace enter id option";

	public void action() throws IOException {

		Input input = new Input();
		Printer printer=new Printer();
		List<Object>list=new ArrayList<Object>();
		printer.print(PLEACE_ENTER_ID_OPTION);
		
		
		int idOption = input.numberInt();
		printer.print(PLEACE_ENTER_NEW_PRICE_OPTION);

		
		double price = input.numberDouble();
		list.add("setPriceRoom");
		list.add(idOption);
		list.add(price);

		Request request=new Request(list);
		String answer= (String) SendRequest.send(request, HeaderSoket.getSocket());
	}

}
