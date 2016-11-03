package org.example.oleg.controller;

import java.util.Scanner;

import org.example.oleg.builder.Builder;
import org.example.oleg.display.Display;
import org.example.oleg.navigator.Navigator;

public class Controller {
	// private Builder builder;
	private Navigator navigator;
	Display display;

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
			if (com.equals("q")) {
				
				break;
			}
			try {
				int a = Integer.parseInt(com);
				navigator.selectMenu(a);
				this.display.draw();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("нет такой команды");
				continue;
			}

		}
	}
}
