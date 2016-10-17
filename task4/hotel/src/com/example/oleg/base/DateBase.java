package com.example.oleg.base;

import java.util.List;

import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public class DateBase {
	private List<Room> roomsList;
	private List<Guest> guestsList;
	private List<Option> optionsList;
	
	public DateBase(String path1,String path2,String path3){
		
	}
	public List<Room> getRoomsList() {
		return roomsList;
	}
	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}
	public List<Guest> getGuestsList() {
		return guestsList;
	}
	public void setGuestsList(List<Guest> guestsList) {
		this.guestsList = guestsList;
	}
	public List<Option> getOptionsList() {
		return optionsList;
	}
	public void setOptionsList(List<Option> optionsList) {
		this.optionsList = optionsList;
	}
}
