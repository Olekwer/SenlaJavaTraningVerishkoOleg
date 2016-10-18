package com.example.oleg.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public class DateBase {
	private List<Room> roomsList;
	private List<Guest> guestsList;
	private List<Option> optionsList;

	public DateBase(String path1, String path2, String path3)throws ParseException {
			
		this.roomsList = creteRoom(path1);
		this.guestsList = creteGuest(path2);
		this.optionsList = creteOption(path3);
		zasunutGuestVnomera();
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

	private ArrayList<Room> creteRoom(String path) {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] rooms = textFileWorker.readFromFile();
		ArrayList<Room> list = new ArrayList<Room>();
		for (int i = 0; i < rooms.length; i++) {
			String[] roomStr = rooms[i].split(";");
			int number = Integer.parseInt(roomStr[0]);
			double price = Double.parseDouble(roomStr[1]);
			int capacity = Integer.parseInt(roomStr[2]);
			int stars = Integer.parseInt(roomStr[3]);
			Room room = new Room(number, price, capacity, stars);
			list.add(room);
		}
		return list;
	}

	// 2,3
	private ArrayList<Guest> creteGuest(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] guests = textFileWorker.readFromFile();
		ArrayList<Guest> list = new ArrayList<Guest>();
		for (int i = 0; i < guests.length; i++) {
			String[] guestStr = guests[i].split(";");
			int id = Integer.parseInt(guestStr[0]);
			String name = guestStr[1];
			int numberRoom = Integer.parseInt(guestStr[2]);
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			Date dateChange = format.parse(guestStr[3]);
			Date dateOut = format.parse(guestStr[4]);
			Guest guest = new Guest(id, name, numberRoom, dateChange, dateOut);
			list.add(guest);
		}
		
		return list;
	}

	private ArrayList<Option> creteOption(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] options = textFileWorker.readFromFile();
		ArrayList<Option> list = new ArrayList<Option>();
		for (int i = 0; i < options.length; i++) {
			String[] optionStr = options[i].split(";");
			int id = Integer.parseInt(optionStr[0]);
			String name = optionStr[1];
			double price=Double.parseDouble(optionStr[2]);
			Option option= new Option(id, name, price);
			 list.add(option);
		}
		return list;
	}
	
	private void zasunutGuestVnomera(){
		for(int i=0;i<this.guestsList.size();i++){
			Guest guest=this.guestsList.get(i);
			this.roomsList.get(guest.getNumberRoom()).getGuest().add(guest);
		}
	}

}
