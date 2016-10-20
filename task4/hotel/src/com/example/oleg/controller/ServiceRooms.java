package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.example.oleg.compare.guest.CompareGuestDateOut;
import com.example.oleg.compare.room.CompareRoomCapacity;
import com.example.oleg.compare.room.CompareRoomPrice;
import com.example.oleg.compare.room.CompareRoomStars;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;
import com.example.oleg.model.StatusRoom;

public class ServiceRooms {
	private final int THREE = 3;
	private final String PRICE=" price ";
	private List<Room> roomsList;

	public ServiceRooms(List<Room> roomsList) {
		this.setRoomsList(roomsList);
	}

	public List<Room> getRoomsList() {
		return roomsList;
	}

	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}

	public List<Room> allFreeRoom(Date date) {
		List<Room> list = new ArrayList<Room>();
		for (int i = 0; i < this.roomsList.size(); i++) {
			if (this.roomsList.get(i).getGuest().size() == 0) {
				list.add(this.roomsList.get(i));
				continue;
			}

			for (int j = 0; j < this.roomsList.get(i).getGuest().size(); j++) {
				Guest guest = this.roomsList.get(i).getGuest().get(j);
				long d = date.getTime();
				long d1 = guest.getDateChange().getTime();
				long d2 = guest.getDateOut().getTime();
				if (!((d > d1) && (d < d2))) {
					list.add(this.roomsList.get(i));
				}
			}
		}
		return list;
	}

	public Guest[] threeLostGuest(int numderRoom) {

		List<Guest> guests = new ArrayList<Guest>(this.roomsList.get(numderRoom + 1).getGuest());
		Collections.sort(guests, new CompareGuestDateOut());
		Guest[] guestArr = new Guest[THREE];
		guestArr[0] = guests.get(guests.size() - 1);
		guestArr[1] = guests.get(guests.size() - 2);
		// guestArr[2]=guests.get(guests.size()-3);

		return guestArr;
	}

	public Room detailRoom(int numberRoom) {

		Room room = this.roomsList.get(numberRoom-1);
		return room;
	}

	public void repairsRoom(int numberRoom) {
		Room room = this.roomsList.get(numberRoom - 1);
		room.setStatusRoom(StatusRoom.repairs);
	}

	public void maintainedRoom(int numberRoom) {
		Room room = this.roomsList.get(numberRoom - 1);
		room.setStatusRoom(StatusRoom.maintained);
	}
	
	public String priceNumber(int numberRoom){
		
		double p=this.roomsList.get(numberRoom-1).getPrice();
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(this.roomsList.get(numberRoom+1).getNumber()).append(PRICE).append(p);
		return stringBuffer.toString();
	}
	
	public double paymentGuest(int idGuest){
		Guest guest=null;
		double price=0;
		for(int i=0;i<this.roomsList.size();i++){
			int k=0;
			if(this.roomsList.get(i).getGuest().size()==0){
				continue;
			}
			for(int j=0;j<this.roomsList.get(i).getGuest().size();j++){
				if(this.roomsList.get(i).getGuest().get(j).getId()==idGuest){
					guest=this.roomsList.get(i).getGuest().get(j);
					price=this.roomsList.get(i).getPrice();
					k++;
					break;
				}
			}
			if(k==1){
				break;
			}
		}
		
		long d=guest.getDateOut().getTime()-guest.getDateChange().getTime();
		int days=(int) (d/(24*60*60*100));
		double res=days*price;
		return res;
	}
	
	public void setPrice(int numberRoom, double price){
		Room room=this.roomsList.get(numberRoom-1);
		room.setPrice(price);
	}
	public int amountFreeRoom(){
		int n=allFreeRoom(new Date()).size();
		return n;
	}
	public List<Room> sortByPrice(){
		List<Room> list=new ArrayList<Room>(this.roomsList);
		Collections.sort(list,new CompareRoomPrice());
		return list;
	}
	public List<Room> sortByStars(){
		List<Room> list=new ArrayList<Room>(this.roomsList);
		Collections.sort(list,new CompareRoomStars());
		return list;
	}
	public List<Room> sortByCapacity(){
		List<Room> list=new ArrayList<Room>(this.roomsList);
		Collections.sort(list,new CompareRoomCapacity());
		return list;
	}
}
