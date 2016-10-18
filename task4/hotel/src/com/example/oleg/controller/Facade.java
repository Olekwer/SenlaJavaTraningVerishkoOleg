package com.example.oleg.controller;

import com.example.oleg.base.DateBase;

public class Facade {
	private ServiceGuests serviceGuests;
	private ServiceRooms serviceRooms;
	private ServiceOptions serviceOptions;

	public Facade(DateBase dateBase) {
		this.serviceGuests = new ServiceGuests(dateBase.getGuestsList());
		this.serviceRooms = new ServiceRooms(dateBase.getRoomsList());
		this.serviceOptions = new ServiceOptions(dateBase.getOptionsList());
	}

	public ServiceGuests getServiceGuests() {
		return serviceGuests;
	}

	public void setServiceGuests(ServiceGuests serviceGuests) {
		this.serviceGuests = serviceGuests;
	}

	public ServiceRooms getServiceRooms() {
		return serviceRooms;
	}

	public void setServiceRooms(ServiceRooms serviceRooms) {
		this.serviceRooms = serviceRooms;
	}

	public ServiceOptions getServiceOptions() {
		return serviceOptions;
	}

	public void setServiceOptions(ServiceOptions serviceOptions) {
		this.serviceOptions = serviceOptions;
	}
}
