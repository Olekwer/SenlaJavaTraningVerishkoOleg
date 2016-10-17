package com.example.oleg.controller;

import java.text.ParseException;
import java.util.List;

import com.example.oleg.model.Room;

public class ServiceGuestList  {
	
	
	private List<Room> rooms;
	private GuestList guestLIst;

	public ServiceGuestList() throws ParseException{
		GuestList g = new GuestList();
		g.creat();
		this.setGuestLIst(g);
	}

	public void allGuest() {
		for (int i = 0; i < this.guestLIst.getList().size(); i++) {
			System.out.println(this.guestLIst.getList().get(i).toString());
		}
	}
	
	public double getPaymentAmount(int id){
		
		
		
		return 0;		
	}
	
	public GuestList getGuestLIst() {
		return guestLIst;
	}

	public void setGuestLIst(GuestList guestLIst) {
		this.guestLIst = guestLIst;
	}


}
