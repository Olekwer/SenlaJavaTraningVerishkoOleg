package org.example.oleg.menu.option.submenu;

import org.example.oleg.event.OptionAdd;
import org.example.oleg.menu.MenuFactory;

public class OptionAddMenu extends MenuFactory {
	public OptionAddMenu(){
		setEvent(new OptionAdd());
	}
}
