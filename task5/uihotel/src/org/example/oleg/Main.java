package org.example.oleg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.example.oleg.builder.Builder;
import org.example.oleg.controller.Controller;

import com.example.oleg.base.DataBase;
import com.example.oleg.controller.Facade;

public class Main {
	private static Logger log;

	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {

		DataBase dataBase = null;
		try {
			dataBase = new DataBase("room.txt", "guest.txt", "option.txt", "order.txt");
		} catch (FileNotFoundException e) {
			log.log(Level.SEVERE, "Exception: ", e);
			e.printStackTrace();
		} catch (ParseException e) {
			log.log(Level.SEVERE, "Exception: ", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.log(Level.SEVERE, "Exception: ", e);
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		Facade facade = Facade.getFacade();
		facade.init(dataBase);

		Builder builder = new Builder();

		Controller controller = new Controller(builder);
		controller.start();
		
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
