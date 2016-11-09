package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.example.oleg.base.DataBase;

import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public class Facade {

	private static Facade facade;

	private GuestsService serviceGuests;
	private RoomsService serviceRooms;
	private OptionsService serviceOptions;
	private OrderService serviceOrder;

	private Facade() {
		
	}

	public static Facade getFacade() {
		if (facade == null) {
			facade = new Facade();
		}
		return facade;
	}

	public void init(DataBase dataBase) {
		this.serviceGuests = new GuestsService(dataBase);
		this.serviceRooms = new RoomsService(dataBase);
		this.serviceOptions = new OptionsService(dataBase);
		this.setServiceOrder(new OrderService(dataBase));
	}

	public List<Guest> sortedByNameGuest() {

		return this.serviceGuests.sortedByName();
	}

	public List<Guest> getGuestsList() {
		return this.serviceGuests.getGuestsList();
	}

	public List<Guest> sortedByDateOutGuest() {

		return this.serviceGuests.sortedByDateOut();
	}

	public void putGuestRoom(String name, int numberRoom, Date dateChange, Date dateOut) {
		this.serviceGuests.putGuestRoom(name, numberRoom, dateChange, dateOut);
	}

	public void guestOut(int idGuest) {
		this.serviceGuests.guestOut(idGuest);
	}

	/*public void saveGuest(String filePath) {
		this.serviceGuests.saveGuest(filePath);

	}*/

	public int amountGuest() {
		return this.serviceGuests.amountGuest();
	}

	// Service Room
	public List<Room> getRoomsList() {
		return this.serviceRooms.getRoomsList();
	}

	public List<Room> allFreeRoom(Date date) {

		return this.serviceRooms.allFreeRoom(date);
	}
	
	public List<Guest> historyGuestRoom(Room room, int amountGuest){
		return this.serviceRooms.historyGuest(room, amountGuest);
	}

	public Guest[] threeLostGuestRoom(int numderRoom) {

		return this.serviceRooms.threeLostGuest(numderRoom);
	}

	public Room detailRoom(int numberRoom) {

		return this.serviceRooms.detailRoom(numberRoom);
	}

	public void repairsRoom(int numberRoom) {
		this.serviceRooms.repairsRoom(numberRoom);
	}

	public void maintainedRoom(int numberRoom) {
		this.serviceRooms.maintainedRoom(numberRoom);
	}

	public String priceNumber(int numberRoom) {

		return this.serviceRooms.priceNumber(numberRoom);
	}

	public double paymentGuestRoom(int idGuest) {

		return this.serviceRooms.paymentGuest(idGuest);
	}

	public void setPriceRoom(int numberRoom, double price) {
		this.serviceRooms.setPrice(numberRoom, price);
	}

	public int amountFreeRoom() {
		return this.serviceRooms.amountFreeRoom();
	}

	public List<Room> sortByPriceRoom() {

		return this.serviceRooms.sortByPrice();
	}

	public List<Room> sortByStarsRoom() {

		return this.serviceRooms.sortByStars();
	}

	public List<Room> sortByCapacityRoom() {
		return this.serviceRooms.sortByCapacity();
	}

	
	// Service option

	public List<Option> sortByNameOption() {

		return this.serviceOptions.sortByName();
	}

	public List<Option> getOptionsList() {
		return this.serviceOptions.getOptionsList();
	}

	public List<Option> sortByPriceOption() {

		return this.serviceOptions.sortByPrice();
	}

	public void addOption(String name, double price) {
		this.serviceOptions.addOption(name, price);
	}

	public void setPriceOption(int idOption, double price) {
		this.serviceOptions.setPrice(idOption, price);
		
	}
	
	public void updatePriceRoom(Room room, double price){
		this.serviceRooms.updatePriceRoom(room, price);
	}
	

	public void saverOption(String path) {
		try {

			this.serviceOptions.saverOption(path);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saverGuest(String path) {
		try {

			this.serviceGuests.saverGuest(path);;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void saverRoom(String path) {
		try {

			this.serviceRooms.saverRoom(path);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saverOrder(String path) {
		try {

			this.serviceOrder.saverOrder(path);;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Order Service

	public List<Option> optionGuestOrder(int idGuest) {
		return this.serviceOrder.optionGuest(idGuest);
	}

	public GuestsService getServiceGuests() {
		return serviceGuests;
	}

	public void setServiceGuests(GuestsService serviceGuests) {
		this.serviceGuests = serviceGuests;
	}

	public RoomsService getServiceRooms() {
		return serviceRooms;
	}

	public void setServiceRooms(RoomsService serviceRooms) {
		this.serviceRooms = serviceRooms;
	}

	public OptionsService getServiceOptions() {
		return serviceOptions;
	}

	public void setServiceOptions(OptionsService serviceOptions) {
		this.serviceOptions = serviceOptions;
	}

	public OrderService getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(OrderService serviceOrder) {
		this.serviceOrder = serviceOrder;
	}
	public Room cloneRoom(int numberRoom){
		return this.serviceRooms.roomClone(numberRoom);
	}
}
