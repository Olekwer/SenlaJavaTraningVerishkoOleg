package org.example.oleg.event;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import oleg.example.org.HttpClient;

public class DetailRoom implements IEvent {
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room";

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer printer=new Printer();
		printer.print(PLEACE_ENTER_NUMBER_ROOM);
		List<Object>list=new ArrayList<Object>();
	//	input.numberInt();
		try {
			int number = input.numberInt();
			list.add(number);
			printer.print(HttpClient.postHttp("detailRoom",list));
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
