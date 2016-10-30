package org.example.oleg.menu.option.submenu;

import org.example.oleg.event.SetPriceOption;
import org.example.oleg.menu.MenuFactory;

public class OptionSetPriceMenu extends MenuFactory {
	public OptionSetPriceMenu(){
		setEvent(new SetPriceOption());
		setTitle("Set Price Option");
	}
}
