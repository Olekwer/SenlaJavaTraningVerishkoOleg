package com.example.oleg.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;

public class GuestList implements Lists {
	private final String PATH="e:/1/guest.txt";
	private List<Guest> guest;
	
	public void creat() throws ParseException {
		TextFileWorker textFileWorker=new TextFileWorker(PATH);
		guest= new ArrayList<Guest>();
		String[] arr=textFileWorker.readFromFile();
		for(int i=0;i<arr.length;i++){
			String[]mass=arr[i].split(";");
			Guest guest=new Guest();
			int id= Integer.parseInt(mass[0]);
			String name=mass[1];
			int numberRoom=Integer.parseInt(mass[2]);
			String date1=mass[3];
			String date2=mass[4];
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			Date dateCheck=format.parse(date1);
			Date dateOut=format.parse(date2);
			guest.setId(id);
			guest.setName(name);
			guest.setNumberRoom(numberRoom);;
			guest.setDateCheck(dateCheck);
			guest.setDateOut(dateOut);
			this.guest.add(guest);
		}

	}
	public List<Guest> getList() {
		return this.guest;
	}
	public List<Guest> getGuest() {
		return guest;
	}
	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}
}
