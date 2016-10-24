package com.example.oleg.controller;

import com.example.oleg.base.DataBase;

public class Facade {
	private GuestsService serviceGuests;
	private RoomsService serviceRooms;
	private OptionsService serviceOptions;
	private OrderService serviceOrder;

	public Facade(DataBase dataBase) {
		this.serviceGuests = new GuestsService(dataBase);
		this.serviceRooms = new RoomsService(dataBase);
		this.serviceOptions = new OptionsService(dataBase);
		this.setServiceOrder(new OrderService(dataBase));
	}

	public GuestsService getServiceGuests() {
		return serviceGuests;
	}

	public void setServiceGuests(GuestsService serviceGuests) {
		this.serviceGuests = serviceGuests;
	}

	public RoomsService getServiceRooms() {
		return serviceRooms;
	}

	public void setServiceRooms(RoomsService serviceRooms) {
		this.serviceRooms = serviceRooms;
	}

	public OptionsService getServiceOptions() {
		return serviceOptions;
	}

	public void setServiceOptions(OptionsService serviceOptions) {
		this.serviceOptions = serviceOptions;
	}

	public OrderService getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(OrderService serviceOrder) {
		this.serviceOrder = serviceOrder;
	}
}
