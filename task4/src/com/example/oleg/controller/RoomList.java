package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;
import com.example.oleg.model.StatusRoom;

public class RoomList implements Lists {
	private final String PATH="E:/1/goest.txt";
	private List<Room> rooms;

	public void creat() {
		rooms=new ArrayList<Room>();
		for (int i = 0; i < 20; i++) {
			int number = i + 1;
			double price = Math.floor(Math.random() * 1000);
			int stars = (int) (Math.floor(Math.random() * 5) + 1);
			int capacity = (int) (Math.floor(Math.random() * 8) + 1);
			StatusRoom statusRoom=StatusRoom.repairs;
			Room room = new Room(number, price, capacity, stars,statusRoom);					
			rooms.add(room);
		}

	}

	public List<Room> getList() {
		return this.rooms;
	}
	

	


}
