package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.example.oleg.base.DataBase;
import com.example.oleg.compare.guest.CompareGuestName;
import com.example.oleg.model.Guest;

public class GuestsService {

	private DataBase dateBase;

	public GuestsService(DataBase dateBase) {
		this.dateBase = dateBase;
	}

	public List<Guest> getGuestsList() {
		return dateBase.getGuestsList();
	}

	public void setGuestsList(List<Guest> guestsList) {
		this.dateBase.setGuestsList(guestsList);
	}

	public List<Guest> sortedByName() {
		ArrayList<Guest> sortList = new ArrayList<Guest>(this.dateBase.getGuestsList());
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}

	public List<Guest> sortedByDateOut() {
		ArrayList<Guest> sortList = new ArrayList<Guest>(this.dateBase.getGuestsList());
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}

	public void putGuestRoom(String name, int numberRoom, Date dateChange, Date dateOut) {
		int id = this.dateBase.getGuestsList().size() + 1;
		Guest guest = new Guest(id, name, numberRoom, dateChange, dateOut);
		this.dateBase.getGuestsList().add(guest);
	}

	public void guestOut(int idGuest) {
		this.dateBase.getGuestsList().remove(idGuest);
	}

	public void saveGuest(String filePath) {
		FileSaver saveFile = new FileSaver(filePath);
		saveFile.saveGuest(this.dateBase.getGuestsList());

	}

	public int amountGuest() {
		return this.dateBase.getGuestsList().size();
	}
}
