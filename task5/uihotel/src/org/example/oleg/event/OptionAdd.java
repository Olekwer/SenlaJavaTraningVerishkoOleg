package org.example.oleg.event;

import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class OptionAdd implements IEvent {
	private static final String PLEACE_ENTER_PRICE_OPTION = "Pleace enter price option";
	private static final String PLEACE_ENTER_NAME_OPTION = "Pleace enter name option";
	private Facade facade = Facade.getFacade();

	public void action() {
		Reader reader=new Reader();
		Writer writer =new Writer();
		reader.setText(PLEACE_ENTER_NAME_OPTION);
		reader.print();
		writer.string();
		String name = (String) writer.getResult();
		reader.setText(PLEACE_ENTER_PRICE_OPTION);
		reader.print();
		writer.numberDouble();
		double price = (double) writer.getResult();
		facade.addOption(name, price);

	}

}
