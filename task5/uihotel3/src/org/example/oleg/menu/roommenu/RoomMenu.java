
package org.example.oleg.menu.roommenu;

import org.example.oleg.event.AllRooms;
import org.example.oleg.menu.MenuFactory;

public class RoomMenu extends MenuFactory{
	public RoomMenu(){
		setEvent(new AllRooms());
		setTitle("Root Menu");
	}
}
