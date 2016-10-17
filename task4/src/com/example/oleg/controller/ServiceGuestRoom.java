package com.example.oleg.controller;

import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;

public class ServiceGuestRoom {
	private List<Guest> guestList;
	private List<Room> roomList;
	private final String PATH="e:/1/guest.txt";

	public ServiceGuestRoom(List<Room> roomList, List<Guest> guestList) {
		this.roomList = roomList;
		this.guestList = guestList;
		addGustsRooms();
	}

	public void addGustsRooms() {
		for(int i=0;i<this.guestList.size();i++){
			Guest guest=this.guestList.get(i);
			this.roomList.get(guest.getNumberRoom()).getGuestList().add(guest);
		}
	}
	
	public void paymentAmount(int id){
		
	}
	
	public void guestInRoom(String name, int number, Date d1, Date d2){
		TextFileWorker textFileWorker=new TextFileWorker(PATH);
		int max=0;
		for(int i=0;i<this.guestList.size();i++){
			if(max<this.guestList.get(i).getId()){
				max=this.guestList.get(i).getId();
			}
		}
		int id=max+1;
		Guest guest=new Guest();
		guest.setId(id);
		guest.setName(name);
		guest.setNumberRoom(number);
		guest.setDateCheck(d1);
		guest.setDateOut(d2);
		StringBuffer stringBuffer=new StringBuffer();
		
	}

}
