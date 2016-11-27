package org.example.oleg.display;

import java.io.IOException;

import org.example.oleg.navigator.Navigator;


/*
 * ����� �� ����� ����
 */
public class Display {
	private Navigator navigator;

	public Display(Navigator navigator) {
		this.navigator = navigator;
	}
	public void draw() throws IOException{
		System.out.println(navigator.getCurrentMenu().getTitle());
		if(navigator.getCurrentMenu().getEvent()!=null){
			navigator.getCurrentMenu().getEvent().action();
		}
		System.out.println(navigator.getCurrentMenu().getHelp());
	}
}
