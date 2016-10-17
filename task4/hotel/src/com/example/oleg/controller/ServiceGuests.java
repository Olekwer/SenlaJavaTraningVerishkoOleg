package com.example.oleg.controller;

import java.util.List;

import com.example.oleg.model.Guest;

public class ServiceGuests {
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

}
