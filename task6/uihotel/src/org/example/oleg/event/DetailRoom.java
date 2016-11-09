package org.example.oleg.event;

<<<<<<< HEAD
import java.util.Scanner;
=======
import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Input;
import org.example.oleg.writer.Writer;
>>>>>>> task6new

import com.example.oleg.controller.Facade;

public class DetailRoom implements IEvent {
<<<<<<< HEAD
	private Facade facade = Facade.getFacade();
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Pleace enter number Room");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		System.out.println(facade.getServiceRooms().detailRoom(number));
	}
}


=======
	private static final String PLEACE_ENTER_NUMBER_ROOM = "Pleace enter number Room";
	private Facade facade = Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer print=new Printer(PLEACE_ENTER_NUMBER_ROOM);
		
		input.numberInt();
		try {
			int number = input.numberInt();
			print=new Printer(facade.detailRoom(number).toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
>>>>>>> task6new
