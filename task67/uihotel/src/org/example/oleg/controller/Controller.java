package org.example.oleg.controller;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.example.oleg.builder.Builder;
import org.example.oleg.display.Display;
import org.example.oleg.navigator.Navigator;

import com.example.oleg.controller.Facade;
/*
 * запуск цикла 
 */
public class Controller {
	private static final String END = "q";

	// private Builder builder;
	private static Logger log;

	private Navigator navigator;
	private Display display;
	private Facade facade=Facade.getFacade();

	public Controller(Builder builder) {
		// this.builder = builder;
		navigator = new Navigator();
		navigator.setCurrentMenu(builder.getStartMenu());
		this.display = new Display(navigator);
	}

	public void start() {

		this.display.draw();
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		while (true) {
			String com = sc.nextLine();
			if (com.equals(END)) {
				
				break;
			}
			try {
				int a = Integer.parseInt(com);
				navigator.selectMenu(a);
				this.display.draw();
			} catch (Exception e) {
				// TODO: handle exception
				log.log(Level.SEVERE, "Exception: ", e);
				System.out.println("нет такой команды");
				continue;
			}

		}
		facade.saverRoom("room.txt");
		facade.saverGuest("guest.txt");
		facade.saverOption("order.txt");
	}
}
