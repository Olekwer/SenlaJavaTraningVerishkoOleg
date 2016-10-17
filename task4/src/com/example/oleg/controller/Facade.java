package com.example.oleg.controller;

import java.text.ParseException;

public class Facade {
	private ServiceRoomList serviceRoomList;
	private ServeceServiceList serveceServiceList;
	private ServiceGuestList serviceGuestList;
	private ServiceGuestRoom guestRoom;

	public Facade() throws ParseException {
		this.setServiceRoomList(new ServiceRoomList());
		this.serveceServiceList =new ServeceServiceList();
		this.serviceGuestList=new ServiceGuestList();
		this.setGuestRoom(new ServiceGuestRoom(this.serviceRoomList.getRoomLIst().getList(),this.serviceGuestList.getGuestLIst().getList()));
	}

	public ServiceRoomList getServiceRoomList() {
		return serviceRoomList;
	}

	public void setServiceRoomList(ServiceRoomList serviceRoomList) {
		this.serviceRoomList = serviceRoomList;
	}

	public ServeceServiceList getServeceServiceList() {
		return serveceServiceList;
	}

	public void setServeceServiceList(ServeceServiceList serveceServiceList) {
		this.serveceServiceList = serveceServiceList;
	}

	public ServiceGuestList getServiceGuestList() {
		return serviceGuestList;
	}

	public void setServiceGuestList(ServiceGuestList serviceGuestList) {
		this.serviceGuestList = serviceGuestList;
	}

	public ServiceGuestRoom getGuestRoom() {
		return guestRoom;
	}

	public void setGuestRoom(ServiceGuestRoom guestRoom) {
		this.guestRoom = guestRoom;
	}

}
