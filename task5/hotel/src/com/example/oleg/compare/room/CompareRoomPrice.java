package com.example.oleg.compare.room;

import java.util.Comparator;

import com.example.oleg.model.Room;

public class CompareRoomPrice implements Comparator<Room> {

	@Override
	public int compare(Room arg0, Room arg1) {

		double price1 = arg0.getPrice();
		double price2 = arg1.getPrice();
		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}

	}

}
