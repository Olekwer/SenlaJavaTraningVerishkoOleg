package org.example.oleg.display;

import org.example.oleg.navigator.Navigator;



public class Display {
	private Navigator navigator;

	public Display(Navigator navigator) {
		this.navigator = navigator;
	}
	public void draw(){
		System.out.println(navigator.getCurrentMenu());
	}
}
