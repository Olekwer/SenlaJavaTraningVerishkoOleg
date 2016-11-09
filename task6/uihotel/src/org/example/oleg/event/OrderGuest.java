package org.example.oleg.event;

<<<<<<< HEAD
import java.util.Scanner;
=======
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Writer;
>>>>>>> task6new

import com.example.oleg.controller.Facade;

public class OrderGuest implements IEvent {
<<<<<<< HEAD
	private Facade facade=Facade.getFacade();
	public void action() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plece enter id Guest");
		int idGuest=sc.nextInt();
		for(int i=0;i<facade.getServiceOrder().optionGuest(idGuest).size();i++){
			System.out.println(facade.getServiceOrder().optionGuest(idGuest).get(i));
=======
	private static final String PLECE_ENTER_ID_GUEST = "Plece enter id Guest";
	private Facade facade=Facade.getFacade();
	public void action() {
		Reader reader = new Reader();
		Writer writer =new Writer();
		reader.setText(PLECE_ENTER_ID_GUEST);
		reader.print();
		writer.numberInt();
		int idGuest=(int) writer.getResult();
		for(int i=0;i<facade.optionGuestOrder(idGuest).size();i++){
			reader.setText(facade.optionGuestOrder(idGuest).get(i));
			reader.print();
>>>>>>> task6new
		}
	}

}
