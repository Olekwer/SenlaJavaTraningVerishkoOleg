package com.example.oleg.controller;

import com.example.oleg.model.Room;

public class Parser {
	
	
	private static final String SPLIT = ";";

	public String roomParsing(Room room){
		int id=room.getId();
		int number=room.getNumber();
		double price=room.getPrice();
		int capacity=room.getCapacity();
		int stars=room.getStars();
		StringBuffer stringBuffer= new StringBuffer();
		stringBuffer.append(id).append(SPLIT).append(number).append(SPLIT).append(price).append(SPLIT).append(capacity).append(SPLIT).append(stars);
		return stringBuffer.toString();
		
	}
	public Room stringToRoom(String str){
		String[] strsMass=str.split(SPLIT);
		int id=Integer.parseInt(strsMass[0]);
		int number=Integer.parseInt(strsMass[1]);
		double price=Double.parseDouble(strsMass[2]);
		int capacity=Integer.parseInt(strsMass[3]);
		int stars=Integer.parseInt(strsMass[4]);
		Room room =new Room(number, price, capacity, stars);
		room.setId(id);
		return room;		
	}
}
