package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.oleg.controller.Facade;

public class OptionAdd implements IEvent {
	private static final String PLEACE_ENTER_PRICE_OPTION = "Pleace enter price option";
	private static final String PLEACE_ENTER_NAME_OPTION = "Pleace enter name option";
	private Facade facade = Facade.getFacade();

	public void action() {
		Printer printer=new Printer();
		printer.print(PLEACE_ENTER_NAME_OPTION);
		Input input=new Input();
		
		String name = input.string();
		printer.print(PLEACE_ENTER_PRICE_OPTION);
		
		
		double price = input.numberDouble();
		facade.addOption(name, price);

	}

}
