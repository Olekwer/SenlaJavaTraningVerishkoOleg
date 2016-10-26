package com.example.oleg.base;

import java.text.ParseException;
import java.util.List;

import com.example.oleg.base.createList.ListCreater;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;
import com.example.oleg.model.Room;

public class DataBase {
	private List<Room> roomsList;
	private List<Guest> guestsList;
	private List<Option> optionsList;
	private List<Order> orderList;

	public DataBase(String path1, String path2, String path3, String path4) throws ParseException {

		this.roomsList = new ListCreater().creteRoom(path1);
		this.guestsList = new ListCreater().createGuest(path2);
		this.optionsList = new ListCreater().createOption(path3);
		this.orderList = new ListCreater().createOrder(path4);
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
	// 2,3

	private void guestAddRoom() {
		for (int i = 0; i < this.guestsList.size(); i++) {
			Guest guest = this.guestsList.get(i);
			this.roomsList.get(guest.getNumberRoom()).getGuest().add(guest);
		}
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
