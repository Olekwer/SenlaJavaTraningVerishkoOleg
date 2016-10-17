package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.compare.room.CompareRoomCapacity;
import com.example.oleg.compare.room.CompareRoomPrice;
import com.example.oleg.compare.room.CompareRoomStars;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Room;
import com.example.oleg.model.StatusRoom;

public class ServiceRoomList {
	private RoomList roomLIst;
	private List<Room> freeRooms;
	private final String PATH = "E:/1/goest.txt";

	public ServiceRoomList() {
		RoomList r = new RoomList();
		r.creat();
		this.roomLIst = r;
	}

	public void allRoom() {
		for (int i = 0; i < this.roomLIst.getList().size(); i++) {
			System.out.println(this.roomLIst.getList().get(i).toString());
		}
	}

	public String roomDetail(int i) {
		String s = this.roomLIst.getList().get(i - 1).toString();
		return s;
	}

	public void insertStatusRoom(int index, StatusRoom statusRoom) {
		this.roomLIst.getList().get(index - 1).setStatusRoom(statusRoom);
	}

	public void sortedByPrice() {
		Collections.sort(this.roomLIst.getList(), new CompareRoomPrice());
	}

	public void sorterByStars() {
		Collections.sort(this.roomLIst.getList(), new CompareRoomStars());
	}

	public void sorterByCapacity() {
		Collections.sort(this.roomLIst.getList(), new CompareRoomCapacity());
	}

	public RoomList getRoomLIst() {
		return roomLIst;
	}

	private void freeRoom() {
		this.freeRooms = new ArrayList<Room>();
		for (int i = 0; i < this.roomLIst.getList().size(); i++) {
			if (this.roomLIst.getList().get(i).getGuestList().size() == 0) {
				this.freeRooms.add(this.roomLIst.getList().get(i));
				continue;
			}

			for (int j = 0; j < this.roomLIst.getList().get(i).getGuestList().size(); j++) {
				Guest guest = this.roomLIst.getList().get(i).getGuestList().get(j);
				Date d1 = new Date();
				Date d2 = guest.getDateCheck();
				Date d3 = guest.getDateOut();
				if ((d1.getTime() > d2.getTime()) && (d1.getTime() < d3.getTime())) {
					continue;
				} else {
					this.freeRooms.add(this.roomLIst.getList().get(i));
				}
			}
		}
	}

	public List<Room> getFreeRooms() {
		freeRoom();
		return freeRooms;
	}
}
