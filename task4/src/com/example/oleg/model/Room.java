package com.example.oleg.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private int number;
	private double price;
	private int capacity;
	private int stars;
	private StatusRoom statusRoom;
	private Guest[] guest;
	private Guest[] lastThreeGuest = new Guest[3];
	private List<Guest> guestList;

	public Room(int number, double price, int capacity, int stars, StatusRoom statusRoom) {
		this.number = number;
		this.price = price;
		this.capacity = capacity;
		this.stars = stars;
		this.statusRoom = statusRoom;
		this.setGuest(new Guest[capacity]);
		this.guestList= new ArrayList<Guest>();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public StatusRoom getStatusRoom() {
		return statusRoom;
	}

	public void setStatusRoom(StatusRoom statusRoom) {
		this.statusRoom = statusRoom;
	}

	public String toString() {
		String s = this.getNumber() + " " + this.getPrice() + " " + this.getStars() + " "+this.getCapacity()+" " + this.getStatusRoom();
		return s;
	}

	public Guest[] getGuest() {
		return guest;
	}

	public void setGuest(Guest[] guest) {
		this.guest = guest;
	}

	public Guest[] getLastThreeGuest() {
		return lastThreeGuest;
	}

	public void setLastThreeGuest(Guest[] lastThreeGuest) {
		this.lastThreeGuest = lastThreeGuest;
	}

	public List<Guest> getGuestList() {
		return guestList;
	}

	public void setGuestList(List<Guest> guestList) {
		this.guestList = guestList;
	}
}
