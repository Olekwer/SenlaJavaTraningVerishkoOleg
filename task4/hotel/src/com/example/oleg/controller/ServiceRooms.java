package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.example.oleg.compare.guest.CompareGuestDateOut;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;

public class ServiceRooms {
	private final int THREE=3;
	private List<Room>roomsList;

	public ServiceRooms(List<Room>roomsList){
		this.setRoomsList(roomsList);
	}

	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}
	
	public List<Room>allFreeRoom(Date date){
		List<Room> list=new ArrayList<Room>();
		for (int i = 0; i < this.roomsList.size(); i++) {
			if(this.roomsList.get(i).getGuest().size()==0){		
					list.add(this.roomsList.get(i));
					continue;
				}
			
			for (int j = 0; j < this.roomsList.get(i).getGuest().size(); j++) {
				Guest guest=this.roomsList.get(i).getGuest().get(j);
				long d=date.getTime();
				long d1=guest.getDateChange().getTime();
				long d2=guest.getDateOut().getTime();
				if(!((d>d1)&&(d<d2))){
					list.add(this.roomsList.get(i));
				}
			}
		}			
		return list;
	}

	public Guest[] threeLostGuest(int numderRoom){
		
		List<Guest>guests=new ArrayList<Guest>(this.roomsList.get(numderRoom+1).getGuest());
		Collections.sort(guests, new CompareGuestDateOut());
		Guest[] guestArr=new Guest[THREE];
		guestArr[0]=guests.get(guests.size()-1);
		guestArr[1]=guests.get(guests.size()-2);
		//guestArr[2]=guests.get(guests.size()-3);
		
		return guestArr;
	}
}
