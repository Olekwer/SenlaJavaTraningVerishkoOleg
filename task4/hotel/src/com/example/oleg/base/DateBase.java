package com.example.oleg.base;

import java.text.ParseException;
import java.util.List;


import com.danco.training.TextFileWorker;
import com.example.oleg.base.parser.TextParser;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public class DateBase {
	private List<Room> roomsList;
	private List<Guest> guestsList;
	private List<Option> optionsList;

	public DateBase(String path1, String path2, String path3)
			throws ParseException {

		this.roomsList = creteRoom(path1);
		this.guestsList = creteGuest(path2);
		this.optionsList = creteOption(path3);
		guestAddRoom();
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

	private List<Room> creteRoom(String path) {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] rooms = textFileWorker.readFromFile();		
		
		TextParser textParser=new TextParser();
		List<Room>roomList =	textParser.createRoomList(rooms);		
		
		return roomList;
	}

	// 2,3
	private List<Guest> creteGuest(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] guests = textFileWorker.readFromFile();
		List<Guest> list;
		TextParser textParser=new TextParser();
		list=textParser.createGuestList(guests);
		return list;
	}

	private List<Option> creteOption(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] options = textFileWorker.readFromFile();
		TextParser textParser=new TextParser();
		List<Option> list = textParser.createOptionList(options);
		
		return list;
	}

	private void guestAddRoom() {
		for (int i = 0; i < this.guestsList.size(); i++) {
			Guest guest = this.guestsList.get(i);
			this.roomsList.get(guest.getNumberRoom()).getGuest().add(guest);
		}
	}	

	
}
