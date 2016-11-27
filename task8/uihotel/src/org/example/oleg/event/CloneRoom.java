package org.example.oleg.event;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import oleg.example.org.HttpClient;

public class CloneRoom implements IEvent {
	private static final String ID_NUMBER_ENTER = "id ������ ������";

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer printer=new Printer();
		printer.print(ID_NUMBER_ENTER);
		List<Object>list=new ArrayList<Object>();
		try {
			int a = input.numberInt();
			list.add(a);
			HttpClient.postHttp("cloneRoom", list);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
