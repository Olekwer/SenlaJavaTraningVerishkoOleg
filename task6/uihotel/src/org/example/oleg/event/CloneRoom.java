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

public class CloneRoom implements IEvent {
<<<<<<< HEAD
	private Facade facade = Facade.getFacade();
	@Override
	public void action() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			
		System.out.println("id номера ввести");
		try{
			int a=sc.nextInt();			
			facade.cloneRoom(a);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
=======
	private static final String ID_NUMBER_ENTER = "id номера ввести";
	private Facade facade = Facade.getFacade();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Input input=new Input();
		Printer print=new Printer(ID_NUMBER_ENTER);

		try {
			int a = input.numberInt();
			facade.cloneRoom(a);
		} catch (Exception e) {
			// TODO: handle exception
		}

>>>>>>> task6new
	}

}
