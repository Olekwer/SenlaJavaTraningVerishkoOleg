package com.example.oleg.controller;

import com.example.oleg.base.DateBase;

public class Facade {
	private ServiceGuests serviceGuests;
	private ServiceRooms serviceRooms;
	private ServiceOptions serviceOptions;
	private ServiceOrder serviceOrder;

	public Facade(DateBase dateBase) {
		this.serviceGuests = new ServiceGuests(dateBase);
		this.serviceRooms = new ServiceRooms(dateBase);
		this.serviceOptions = new ServiceOptions(dateBase);
		this.setServiceOrder(new ServiceOrder(dateBase));
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

	public ServiceOrder getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(ServiceOrder serviceOrder) {
		this.serviceOrder = serviceOrder;
	}
}
