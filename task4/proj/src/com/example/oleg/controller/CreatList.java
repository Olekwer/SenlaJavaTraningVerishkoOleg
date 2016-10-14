package com.example.oleg.controller;

public class CreatList {
	private Lists guests;
	private Lists rooms;
	private Lists services;

	public CreatList() {
		guests = new GuestList();
		rooms = new RoomList();
		services = new ServeceList();
	}

	public void creatGoests() {
		guests.creat();
	}

	public void creatRooms() {
		rooms.creat();
	}

	public void creatServices() {
		services.creat();
	}
}
