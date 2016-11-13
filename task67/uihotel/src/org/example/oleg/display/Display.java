package org.example.oleg.display;

import org.example.oleg.navigator.Navigator;


/*
 * вывод на экран меню
 */
public class Display {
	private Navigator navigator;

	public Display(Navigator navigator) {
		this.navigator = navigator;
	}
	public void draw(){
		System.out.println(navigator.getCurrentMenu().getTitle());
		if(navigator.getCurrentMenu().getEvent()!=null){
			navigator.getCurrentMenu().getEvent().action();
		}
		System.out.println(navigator.getCurrentMenu().getHelp());
	}
}
