package com.example.oleg.base;


import java.util.List;
import org.apache.log4j.Logger;

import com.example.oleg.base.createList.ListCreater;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;
import com.example.oleg.model.Room;

public class DataBase {
	private Logger log = Logger.getLogger(DataBase.class);
	private List<Room> roomsList;
	private List<Guest> guestsList;
	private List<Option> optionsList;
	private List<Order> orderList;

	public DataBase(String path1, String path2, String path3, String path4) {

		try {
			String path11="room.txt";
			String path21="guest.txt";
			String path31="option.txt";
			String path41="order.txt";
			this.roomsList = new ListCreater().creteRoom(path11);
			this.guestsList = new ListCreater().createGuest(path21);
			this.optionsList = new ListCreater().createOption(path31);
			this.orderList = new ListCreater().createOrder(path41);
		} catch (Exception e) {
			log.info(e);

		}

		// guestAddRoom();
	}
	public DataBase(){
		try {
			String path11="room.txt";
			String path21="guest.txt";
			String path31="option.txt";
			String path41="order.txt";
			this.roomsList = new ListCreater().creteRoom(path11);
			this.guestsList = new ListCreater().createGuest(path21);
			this.optionsList = new ListCreater().createOption(path31);
			this.orderList = new ListCreater().createOrder(path41);
		} catch (Exception e) {
			log.info(e);

		}
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

	/*
	 * private void guestAddRoom() { System.out.println("++++++++++++"); Guest
	 * guest=this.guestsList.get(2); System.out.println(guest);
	 * System.out.println(this.roomsList.get(guest.getNumberRoom()-1));
	 * System.out.println("++++++++++++"); sfor (int i = 0; i <
	 * this.guestsList.size(); i++) { Guest guest = this.guestsList.get(i);
	 * this.roomsList.get(guest.getNumberRoom()).getGuest().add(guest); } }
	 */

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
