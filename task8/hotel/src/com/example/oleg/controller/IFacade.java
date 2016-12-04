package com.example.oleg.controller;

import java.util.Date;
import java.util.List;

import com.example.oleg.base.DataBase;
import com.example.oleg.controller.Facade;
import com.example.oleg.controller.GuestsService;
import com.example.oleg.controller.OptionsService;
import com.example.oleg.controller.OrderService;
import com.example.oleg.controller.RoomsService;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;

public interface IFacade {
	 void init();
	 List<Guest> sortedByNameGuest();
	 List<Guest> getGuestsList();
	 List<Guest> sortedByDateOutGuest();
	 void putGuestRoom(String name, Integer numberRoom, Date dateChange, Date dateOut);
	 void guestOut(Integer idGuest);
	 int amountGuest();
	 List<Room> getRoomsList();
	 List<Room> allFreeRoom(Date date);
	 List<Guest> historyGuestRoom(Room room, Integer amountGuest);
	 Guest[] threeLostGuestRoom(Integer numderRoom);
	 Room detailRoom(Integer numberRoom);
	 void repairsRoom(Integer numberRoom);
	 void maintainedRoom(Integer numberRoom);
	 String priceNumber(Integer numberRoom);
	 double paymentGuestRoom(Integer idGuest);
	 void setPriceRoom(Integer numberRoom, Double price);
	 int amountFreeRoom();
	 List<Room> sortByPriceRoom();
	 List<Room> sortByStarsRoom();
	 List<Room> sortByCapacityRoom();
	 List<Option> sortByNameOption();
	 List<Option> getOptionsList();
	 List<Option> sortByPriceOption();
	 void addOption(String name, Double price);
	 void setPriceOption(Integer idOption, Double price);
	 void updatePriceRoom(Room room, Double price);
	 void saverOption(String path);
	 void saverGuest(String path);
	 void saverRoom(String path);
	 void saverOrder(String path);
	 List<Option> optionGuestOrder(Integer idGuest);
	 GuestsService getServiceGuests() ;
	 void setServiceGuests(GuestsService serviceGuests);
	 RoomsService getServiceRooms() ;
	 void setServiceRooms(RoomsService serviceRooms);
	 OptionsService getServiceOptions();
	 void setServiceOptions(OptionsService serviceOptions);
	 OrderService getServiceOrder();
	 void setServiceOrder(OrderService serviceOrder);
	 Room cloneRoom(Integer numberRoom);
	 void importCsvRoom(String path);
	 void exportCsvRoom(String path);
}
