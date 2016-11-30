package org.example.oleg.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.api.Request;

public class OptionAdd implements IEvent {
	private static final String PLEACE_ENTER_PRICE_OPTION = "Pleace enter price option";
	private static final String PLEACE_ENTER_NAME_OPTION = "Pleace enter name option";

	public void action() throws IOException {
		Printer printer=new Printer();
		List<Object>args=new ArrayList<Object>();
		printer.print(PLEACE_ENTER_NAME_OPTION);
		Input input=new Input();
		
		String name = input.string();
		printer.print(PLEACE_ENTER_PRICE_OPTION);
		
		
		double price = input.numberDouble();
		args.add(name);
		args.add(price);
		Request.send(args);

	}

}
