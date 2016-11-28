package com.example.oleg.controller.iservice;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Date;
import java.util.List;

import com.example.oleg.base.DataBase;

import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;

public interface IRoomSrvice {
	public void setDateBase(DataBase dateBase) throws InstantiationException, IllegalAccessException;

	public void setRoomsList(List<Room> roomsList);

	public List<Room> getRoomsList();

	public List<Room> allFreeRoom(Date date);

	public Guest[] threeLostGuest(int numderRoom);

	public Room detailRoom(int numberRoom);

	public void repairsRoom(int numberRoom);

	public void maintainedRoom(int numberRoom);

	public String priceNumber(int numberRoom);

	public double paymentGuest(int idGuest);

	public List<Guest> historyGuest(Room room, int amountGuest);

	public void setPrice(int numberRoom, double price);

	public int amountFreeRoom();

	public List<Room> sortByPrice();

	public List<Room> sortByStars();

	public List<Room> sortByCapacity();

	public void saverRoom(String path) throws FileNotFoundException, IOException;

	public Room roomClone(int numberRoom);

	public void updatePriceRoom(Room room, double price);

	public void exportCSV(String path);

	public void importCsv(String path) throws IOException;
}
