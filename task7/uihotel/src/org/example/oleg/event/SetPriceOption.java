package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.writer.Input;

import com.example.oleg.controller.Facade;

public class SetPriceOption implements IEvent {
	private static final String PLEACE_ENTER_NEW_PRICE_OPTION = "Pleace enter new price option";
	private static final String PLEACE_ENTER_ID_OPTION = "Pleace enter id option";
	private Facade facade = Facade.getFacade();

	public void action() {

		Input input = new Input();
		Printer printer=new Printer();
		printer.print(PLEACE_ENTER_ID_OPTION);

		
		int idOption = input.numberInt();
		printer.print(PLEACE_ENTER_NEW_PRICE_OPTION);

		
		double price = input.numberDouble();
		facade.setPriceOption(idOption, price);
	}

}
