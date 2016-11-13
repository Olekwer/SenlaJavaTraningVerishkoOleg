package com.example.oleg.compare.room;

import java.util.Comparator;

import com.example.oleg.model.Room;

public class CompareRoomCapacity implements Comparator<Room> {

	public int compare(Room arg0, Room arg1) {
		int capacity1 = arg0.getCapacity();
		int capacity2 = arg1.getCapacity();
		if (capacity1 > capacity2) {
			return 1;
		} else if (capacity1 < capacity2) {
			return -1;
		} else {
			return 0;
		}
	}

}