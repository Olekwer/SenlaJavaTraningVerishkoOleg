package org.example.oleg.event;

<<<<<<< HEAD
import java.awt.SystemColor;
import java.util.Scanner;
=======
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;
>>>>>>> task6new

import com.example.oleg.controller.Facade;

public class SetPriceOption implements IEvent {
<<<<<<< HEAD
	private Facade facade=Facade.getFacade();
	public void action() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleace enter id option");
		int idOption=sc.nextInt();
		System.out.println("Pleace enter new price option");
		double price=sc.nextDouble();
		facade.getServiceOptions().setPrice(idOption, price);
=======
	private static final String PLEACE_ENTER_NEW_PRICE_OPTION = "Pleace enter new price option";
	private static final String PLEACE_ENTER_ID_OPTION = "Pleace enter id option";
	private Facade facade=Facade.getFacade();
	public void action() {
		
		Reader reader = new Reader();
		Writer writer =new Writer();
		reader.setText(PLEACE_ENTER_ID_OPTION);
		reader.print();
		writer.numberInt();
		int idOption=(int) writer.getResult();
		reader.setText(PLEACE_ENTER_NEW_PRICE_OPTION);
		reader.print();
		writer.numberDouble();
		double price=(double) writer.getResult();
		facade.setPriceOption(idOption, price);
>>>>>>> task6new
	}

}
