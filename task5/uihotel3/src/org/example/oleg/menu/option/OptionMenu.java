package org.example.oleg.menu.option;


import org.example.oleg.event.AllOption;
import org.example.oleg.menu.MenuFactory;

public class OptionMenu extends MenuFactory {
	public OptionMenu(){
		setEvent(new AllOption());
		setTitle("Option Menu");
	}
}
