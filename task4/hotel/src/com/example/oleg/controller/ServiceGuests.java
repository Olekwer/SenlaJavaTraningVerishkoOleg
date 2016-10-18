package com.example.oleg.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.compare.guest.CompareGuestName;
import com.example.oleg.model.Guest;

public class ServiceGuests {
	private final String SPLIT=";";
	private final String PATTERN="dd.MM.yyyy";
	private List<Guest> guestsList;

	public ServiceGuests(List<Guest> guests) {
		this.setGuestsList(guests);
	}

	public List<Guest> getGuestsList() {
		return guestsList;
	}

	public void setGuestsList(List<Guest> guestsList) {
		this.guestsList = guestsList;
	}
	
	public List<Guest> sortedByName(){
		ArrayList<Guest> sortList=new ArrayList<Guest>(this.guestsList);
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}
	public List<Guest> sortedByDateOut(){
		ArrayList<Guest> sortList=new ArrayList<Guest>(this.guestsList);
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}
	
	public void putGuestRoom(String name, int numberRoom, Date dateChange, Date dateOut){
		int id=this.guestsList.size()+1;
		Guest guest= new Guest(id, name, numberRoom, dateChange, dateOut);
		this.guestsList.add(guest);
	}
	public void saveGuest(String filePath){
		TextFileWorker textFileWorker=new TextFileWorker(filePath);
		String[] mass=new String[this.guestsList.size()];
		for(int i=0;i<this.guestsList.size();i++){
			Guest guest=this.guestsList.get(i);
			int id=guest.getId();
			String name=guest.getName();
			int numberRoom=guest.getNumberRoom();
			SimpleDateFormat format=new SimpleDateFormat(PATTERN);
			String dChange=format.format(guest.getDateChange());
			String dOut=format.format(guest.getDateOut());
			StringBuffer stringBuffer=new StringBuffer();
			stringBuffer.append(id+SPLIT).append(name+SPLIT).append(numberRoom+SPLIT).append(dChange+SPLIT).append(dOut+SPLIT).append("[ ]");
			mass[i]=stringBuffer.toString();
		}
		textFileWorker.writeToFile(mass);
	}
	
}
