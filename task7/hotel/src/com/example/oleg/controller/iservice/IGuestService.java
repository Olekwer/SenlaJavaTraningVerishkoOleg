package com.example.oleg.controller.iservice;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Date;
import java.util.List;

import com.example.oleg.base.DataBase;
import com.example.oleg.model.Guest;

public interface IGuestService {
	public List<Guest> getGuestsList();

	public void setDateBase(DataBase dateBase);

	public void setGuestsList(List<Guest> guestsList);

	public List<Guest> sortedByName();

	public List<Guest> sortedByDateOut();

	public void putGuestRoom(String name, int numberRoom, Date dateChange, Date dateOut);

	public void guestOut(int idGuest);

	public int amountGuest();

	public void saverGuest(String path) throws FileNotFoundException, IOException;
}
