package com.example.oleg.compare.guest;

import java.util.Comparator;

import com.example.oleg.model.Guest;

public class CompareGuestDateOut implements Comparator<Guest> {

	public int compare(Guest o1, Guest o2) {
		long d1 = o1.getDateOut().getTime();
		long d2 = o1.getDateOut().getTime();
		if (d1 > d2) {
			return 1;
		} else if (d2 > d1) {
			return -1;
		} else {
			return 0;
		}
	}

}