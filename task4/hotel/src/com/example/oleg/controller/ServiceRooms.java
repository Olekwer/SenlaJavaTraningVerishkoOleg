package com.example.oleg.controller;

import java.util.List;

import com.example.oleg.model.Room;

public class ServiceRooms {
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
	

}
