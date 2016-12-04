package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.example.oleg.base.DataBase;
import com.example.oleg.controller.iservice.IGuestService;
import com.example.oleg.controller.iservice.IOptionService;
import com.example.oleg.controller.iservice.IOrderService;
import com.example.oleg.controller.iservice.IRoomSrvice;
import com.example.oleg.di.DI;

import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public class Facade implements IFacade {

	private static IFacade facade;

	private IGuestService serviceGuests;

	private RoomsService serviceRooms;

	private OptionsService serviceOptions;

	private OrderService serviceOrder;
	private static Logger log = Logger.getLogger(Facade.class.getName());

	public Facade() {

	}

	public static Facade getFacade() {
		if (facade == null) {
			// DI di=new DI();
			try {
				facade = (IFacade) DI.inject(IFacade.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (Facade) facade;
	}

	public void init() {
		// System.out.println("as");
		try {
			DataBase dataBase = new DataBase();
			this.serviceGuests = (IGuestService) DI.inject(IGuestService.class);
			this.serviceGuests.setDateBase(dataBase);
			this.serviceRooms = (RoomsService) DI.inject(IRoomSrvice.class);
			this.serviceRooms.setDateBase(dataBase);
			this.serviceOptions = (OptionsService) DI.inject(IOptionService.class);
			this.serviceOptions.setDateBase(dataBase);
			this.serviceOrder = (OrderService) DI.inject(IOrderService.class);
			this.serviceOrder.setDateBase(dataBase);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public void putGuestRoom(String name, Integer numberRoom, Date dateChange, Date dateOut) {
		this.serviceGuests.putGuestRoom(name, numberRoom, dateChange, dateOut);
	}

	public void guestOut(Integer idGuest) {
		this.serviceGuests.guestOut(idGuest);
	}

	/*
	 * public void saveGuest(String filePath) {
	 * this.serviceGuests.saveGuest(filePath);
	 * 
	 * }
	 */

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

	public List<Guest> historyGuestRoom(Room room, Integer amountGuest) {
		return this.serviceRooms.historyGuest(room, amountGuest);
	}

	public Guest[] threeLostGuestRoom(Integer numderRoom) {

		return this.serviceRooms.threeLostGuest(numderRoom);
	}

	public Room detailRoom(Integer numberRoom) {

		return this.serviceRooms.detailRoom(numberRoom);
	}

	public void repairsRoom(Integer numberRoom) {
		this.serviceRooms.repairsRoom(numberRoom);
	}

	public void maintainedRoom(Integer numberRoom) {
		this.serviceRooms.maintainedRoom(numberRoom);
	}

	public String priceNumber(Integer numberRoom) {

		return this.serviceRooms.priceNumber(numberRoom);
	}

	public double paymentGuestRoom(Integer idGuest) {

		return this.serviceRooms.paymentGuest(idGuest);
	}

	public void setPriceRoom(Integer numberRoom, Double price) {
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

	public void addOption(String name, Double price) {
		this.serviceOptions.addOption(name, price);
	}

	public void setPriceOption(Integer idOption, Double price) {
		this.serviceOptions.setPrice(idOption, price);

	}

	public void updatePriceRoom(Room room, Double price) {
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

			this.serviceGuests.saverGuest(path);
			;

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

			this.serviceOrder.saverOrder(path);
			;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Order Service

	public List<Option> optionGuestOrder(Integer idGuest) {
		return this.serviceOrder.optionGuest(idGuest);
	}

	public GuestsService getServiceGuests() {
		return (GuestsService) serviceGuests;
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

	public Room cloneRoom(Integer numberRoom) {
		return this.serviceRooms.roomClone(numberRoom);
	}

	public void importCsvRoom(String path) {
		try {
			this.serviceRooms.importCsv(path);
		} catch (IOException e) {
			log.info(e);
		}
	}

	public void exportCsvRoom(String path) {
		this.serviceRooms.exportCSV(path);
	}
}
