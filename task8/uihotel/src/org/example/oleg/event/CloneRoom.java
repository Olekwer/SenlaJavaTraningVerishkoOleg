package org.example.oleg.event;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.headersoket.HeaderSoket;
import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;
import com.example.api.SendRequest;

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
			list.add("cloneRoom");
			list.add(a);	
			Request request=new Request(list);
			SendRequest.send(request, HeaderSoket.getSocket());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
