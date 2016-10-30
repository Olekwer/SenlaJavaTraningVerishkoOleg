package org.example.oleg.menu.option.submenu;

import org.example.oleg.event.OptionSorter;
import org.example.oleg.menu.MenuFactory;

public class OptionSortedMenu extends MenuFactory {
	public OptionSortedMenu(){
		setEvent(new OptionSorter());
		setTitle("Option Sorter");
	}
}
