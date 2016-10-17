package com.example.oleg.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;

public class ServiceGuestRoom {
	private List<Guest> guestList;
	private List<Room> roomList;
	private final String PATH="file/1.txt";

	public ServiceGuestRoom(List<Room> roomList, List<Guest> guestList) {
		this.roomList = roomList;
		this.guestList = guestList;
		addGustsRooms();
	}

	private void addGustsRooms() {
		for(int i=0;i<this.guestList.size();i++){
			Guest guest=this.guestList.get(i);
			this.roomList.get(guest.getNumberRoom()).getGuestList().add(guest);
		}
	}
	
	public void paymentAmount(int id){
		Guest guest = null;
		double price=0;
		for(int i=0;i<this.guestList.size();i++){
			if(this.guestList.get(i).getId()==id){
				guest=this.guestList.get(i);
				break;
			}
		}
		System.out.println(guest);
		int y=0;
		for(int i=0;i<this.roomList.size();i++){
			if(this.roomList.get(i).getNumber()==guest.getNumberRoom()){
				price=this.roomList.get(i).getPrice();
				break;
			}
		}
		double cost=price*guestDaysInRoom(guest);
		System.out.println(cost);
	}
	
	private int guestDaysInRoom(Guest guest){
		
		//SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date d1=guest.getDateCheck();
		Date d2=guest.getDateOut();
		long dd1=d1.getTime();
		long dd2=d2.getTime();
		int res=(int) ((dd2-dd1)/(24*60*60*1000));
		return res;
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
