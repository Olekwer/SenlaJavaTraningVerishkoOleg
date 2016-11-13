package com.example.oleg.compare.room;

import java.util.Comparator;

import com.example.oleg.model.Room;

public class CompareRoomStars implements Comparator<Room> {

	public int compare(Room o1, Room o2) {

		int stars1 = o1.getStars();
		int stars2 = o2.getStars();
		if (stars1 > stars2) {
			return 1;
		} else if (stars1 < stars2) {
			return -1;
		} else {
			return 0;
		}

	}

}
