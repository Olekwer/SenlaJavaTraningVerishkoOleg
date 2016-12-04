package org.example.oleg.controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.example.oleg.builder.Builder;
import org.example.oleg.display.Display;
import org.example.oleg.navigator.Navigator;

/*
 * запуск цикла 
 */
public class Controller {
	private static final String END = "q";

	// private Builder builder;
	private static Logger log=Logger.getLogger(Controller.class);

	private Navigator navigator;
	private Display display;

	public Controller(Builder builder) {
		// this.builder = builder;
		navigator = new Navigator();
		navigator.setCurrentMenu(builder.getStartMenu());
		this.display = new Display(navigator);
	}

	public void start() throws IOException {

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
				log.info("Exception: ", e);
				e.printStackTrace();
				continue;
			}

		}
		
	}
}
