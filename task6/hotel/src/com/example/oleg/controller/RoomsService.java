package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

import com.example.oleg.base.DataBase;
import com.example.oleg.compare.guest.CompareGuestDateOut;
import com.example.oleg.compare.room.CompareRoomCapacity;
import com.example.oleg.compare.room.CompareRoomPrice;
import com.example.oleg.compare.room.CompareRoomStars;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;
import com.example.oleg.model.StatusRoom;
import com.example.oleg.prop.PropHolder;

public class RoomsService {
	private static final String NONONO = "нельзя";
	private final int THREE = 3;
	private final String PRICE = " price ";
	private DataBase dateBase;
	private Logger log = Logger.getLogger(RoomsService.class.getName());

	public RoomsService(DataBase dateBase) {
		this.dateBase = dateBase;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.dateBase.setRoomsList(roomsList);
	}

	public List<Room> getRoomsList() {
		return this.dateBase.getRoomsList();
	}

	public List<Room> allFreeRoom(Date date) {
		List<Room> list = new ArrayList<Room>();
		List<Room> rlist = new ArrayList<Room>(dateBase.getRoomsList());

		for (int i = 0; i < dateBase.getGuestsList().size(); i++) {
			Guest guest = dateBase.getGuestsList().get(i);
			int number = guest.getNumberRoom();
			for (int j = 0; j < rlist.size(); j++) {
				if (rlist.get(j).getNumber() == number) {
					long d = date.getTime();
					long d1 = guest.getDateChange().getTime();
					long d2 = guest.getDateOut().getTime();
					if (!((d > d1) && (d < d2))) {
						list.add(rlist.get(j));
					}
				}
			}
		}

		for (int i = 0; i < rlist.size(); i++) {
			Room r = dateBase.getRoomsList().get(i);
			for (int k = 0; k < dateBase.getGuestsList().size(); k++) {
				Guest guest = dateBase.getGuestsList().get(i);
				int number = guest.getNumberRoom();

				if (r.getNumber() == number) {
					r.getGuest().add(guest);
				}

			}
		}

		/*
		 * for (int i = 0; i < this.getRoomsList().size(); i++) { if
		 * (this.getRoomsList().get(i).getGuest().size() == 0) {
		 * list.add(this.getRoomsList().get(i)); continue; }
		 * 
		 * for (int j = 0; j < this.getRoomsList().get(i).getGuest().size();
		 * j++) { Guest guest = this.getRoomsList().get(i).getGuest().get(j);
		 * long d = date.getTime(); long d1 = guest.getDateChange().getTime();
		 * long d2 = guest.getDateOut().getTime(); if (!((d > d1) && (d < d2)))
		 * { list.add(this.getRoomsList().get(i)); } } }
		 */
		return list;
	}

	public Guest[] threeLostGuest(int numderRoom) {

		List<Guest> guests = new ArrayList<Guest>(this.getRoomsList().get(numderRoom + 1).getGuest());
		Collections.sort(guests, new CompareGuestDateOut());
		Guest[] guestArr = new Guest[THREE];
		try {
			guestArr[0] = guests.get(guests.size() - 1);
			guestArr[1] = guests.get(guests.size() - 2);
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e);

		}

		// guestArr[2]=guests.get(guests.size()-3);

		return guestArr;
	}

	public Room detailRoom(int numberRoom) {

		Room room = null;
		for (int i = 0; i < this.dateBase.getRoomsList().size(); i++) {
			if (this.dateBase.getRoomsList().get(i).getNumber() == numberRoom) {
				room = this.dateBase.getRoomsList().get(i);
				break;
			}
		}
		return room;
	}

	public void repairsRoom(int numberRoom) {
		PropHolder propHolder = PropHolder.holder();
		if (propHolder.satusOn()) {

			try {
				Room room = this.getRoomsList().get(numberRoom - 1);
				room.setStatusRoom(StatusRoom.REPAIRS);
			} catch (Exception e) {
				// TODO: handle exception
				log.info(e);

			}
		} else {
			log.info(NONONO);
		}

	}

	public void maintainedRoom(int numberRoom) {
		PropHolder propHolder = PropHolder.holder();
		if (propHolder.satusOn()) {
			try {
				Room room = this.getRoomsList().get(numberRoom - 1);
				room.setStatusRoom(StatusRoom.MAINTAINED);
			} catch (Exception e) {
				// TODO: handle exception
				log.info(e);

			}
		} else {
			log.info(NONONO);
		}

	}

	public String priceNumber(int numberRoom) {

		double p = this.getRoomsList().get(numberRoom - 1).getPrice();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(this.getRoomsList().get(numberRoom + 1).getNumber()).append(PRICE).append(p);
		return stringBuffer.toString();
	}

	public double paymentGuest(int idGuest) {
		Guest guest = null;
		double price = 0;
		for (int i = 0; i < this.getRoomsList().size(); i++) {
			int k = 0;
			if (this.getRoomsList().get(i).getGuest().size() == 0) {
				continue;
			}
			for (int j = 0; j < this.getRoomsList().get(i).getGuest().size(); j++) {
				if (this.getRoomsList().get(i).getGuest().get(j).getId() == idGuest) {
					guest = this.getRoomsList().get(i).getGuest().get(j);
					price = this.getRoomsList().get(i).getPrice();
					k++;
					break;
				}
			}
			if (k == 1) {
				break;
			}
		}

		long d = guest.getDateOut().getTime() - guest.getDateChange().getTime();
		int days = (int) (d / (24 * 60 * 60 * 100));
		double res = days * price;
		return res;
	}

	public List<Guest> historyGuest(Room room, int amountGuest) {
		PropHolder propHolder = PropHolder.holder();
		amountGuest=propHolder.amountHistory();
		List<Guest> list = new ArrayList<Guest>();
		int number = room.getNumber();
		for (int i = 0; i < this.dateBase.getGuestsList().size(); i++) {
			if (this.dateBase.getGuestsList().get(i).getNumberRoom() == number) {
				list.add(this.dateBase.getGuestsList().get(i));
			}
		}

		Collections.sort(list, new CompareGuestDateOut());
		List<Guest> results = new ArrayList<Guest>();
		if (list.size() < amountGuest) {
			amountGuest = list.size();
		}
		// if(list.size())
		for (int i = list.size() - 1; i > -1; i--) {
			results.add(list.get(i));
			if (results.size() == amountGuest) {
				break;
			}
		}

		return results;
	}

	public void setPrice(int numberRoom, double price) {
		Room room = this.getRoomsList().get(numberRoom - 1);
		room.setPrice(price);
	}

	public int amountFreeRoom() {
		int n = allFreeRoom(new Date()).size();
		return n;
	}

	public List<Room> sortByPrice() {
		List<Room> list = new ArrayList<Room>(this.getRoomsList());
		Collections.sort(list, new CompareRoomPrice());
		return list;
	}

	public List<Room> sortByStars() {
		List<Room> list = new ArrayList<Room>(this.getRoomsList());
		Collections.sort(list, new CompareRoomStars());
		return list;
	}

	public List<Room> sortByCapacity() {
		List<Room> list = new ArrayList<Room>(this.getRoomsList());
		Collections.sort(list, new CompareRoomCapacity());
		return list;
	}

	public void saverRoom(String path) throws FileNotFoundException, IOException {
		FileSaver saveFile = new FileSaver(path);
		saveFile.sever(this.dateBase.getRoomsList());
	}

	// клонирование объекта. Объекту присваиваем уникальный id
	public Room roomClone(int numberRoom) {
		Room room = null;
		Room clone = null;
		for (int i = 0; i < this.dateBase.getRoomsList().size(); i++) {
			if (this.dateBase.getRoomsList().get(i).getNumber() == numberRoom) {
				room = this.dateBase.getRoomsList().get(i);
				break;
			}
		}
		try {
			clone = room.clone();
			int max = this.dateBase.getRoomsList().get(0).getId();
			for (int i = 0; i < this.dateBase.getRoomsList().size(); i++) {
				if (this.dateBase.getRoomsList().get(i).getId() > max) {
					max = this.dateBase.getRoomsList().get(i).getId();
				}
			}
			clone.setId(max + 1);
			this.dateBase.getRoomsList().add(clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	public void updatePriceRoom(Room room, double price) {
		room.setPrice(price);
	}
	
	public void importCSV(String path){
		ArrayList<Room> roomsList=new ArrayList<Room>(dateBase.getRoomsList());
		try {
			FileOutputStream outputStream=new FileOutputStream(path);
			for (int i = 0; i < roomsList.size(); i++) {
				Room room=roomsList.get(i);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			log.info(e);
		}
		
	}
}
