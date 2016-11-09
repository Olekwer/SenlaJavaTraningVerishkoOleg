package org.example.oleg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

<<<<<<< HEAD
=======

>>>>>>> task6new
import org.example.oleg.builder.Builder;
import org.example.oleg.controller.Controller;

import com.example.oleg.base.DataBase;
import com.example.oleg.controller.Facade;

public class Main {
<<<<<<< HEAD

=======
>>>>>>> task6new
	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
<<<<<<< HEAD
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {

		DataBase dataBase = new DataBase("room.txt", "guest.txt", "option.txt", "order.txt");
=======
	public static void main(String[] args) {

		// dataBase = null;
		DataBase dataBase = new DataBase("room.txt", "guest.txt", "option.txt", "order.txt");
	
>>>>>>> task6new
		// TODO Auto-generated method stub
		Facade facade = Facade.getFacade();
		facade.init(dataBase);

		Builder builder = new Builder();

		Controller controller = new Controller(builder);
		controller.start();
<<<<<<< HEAD
		facade.saverRoom("room.txt");
		facade.saverGuest("guest.txt");
		facade.saverOption("order.txt");
=======
		
>>>>>>> task6new
		/*
		 * Navigator navigator=new Navigator();
		 * navigator.setCurrentMenu(builder.getStartMenu());
		 * 
		 * Display display = new Display(navigator); display.draw();
		 * 
		 * @SuppressWarnings("resource")
		 * 
		 * Scanner sc=new Scanner(System.in); while (true) { int a=sc.nextInt();
		 * navigator.selectMenu(a); display.draw(); }
		 */

	}

}
