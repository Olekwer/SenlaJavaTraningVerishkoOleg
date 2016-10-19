package com.example.oleg.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private int number;
	private double price;
	private int capacity;
	private int stars;
	private StatusRoom statusRoom;
	private List<Guest> guest;
	public Room(int number, double price,int capacity,int stars){
		this.number=number;
		this.price=price;
		this.capacity=capacity;
		this.stars=stars;
		this.guest= new ArrayList<Guest>();
		this.setStatusRoom(StatusRoom.repairs);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public List<Guest> getGuest() {
		return guest;
	}
	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}
	public String toString(){
		String s=this.number+" "+this.price+" "+this.capacity+" "+this.stars;
		return s;
	}
	public StatusRoom getStatusRoom() {
		return statusRoom;
	}
	public void setStatusRoom(StatusRoom statusRoom) {
		this.statusRoom = statusRoom;
	}

}
