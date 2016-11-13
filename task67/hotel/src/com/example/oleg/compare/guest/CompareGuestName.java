package com.example.oleg.compare.guest;

import java.util.Comparator;

import com.example.oleg.model.Guest;

public class CompareGuestName implements Comparator<Guest> {
	public int compare(Guest o1, Guest o2) {
		String str1 = o1.getName();
		String str2 = o2.getName();
		return str1.compareTo(str2);

	}
}
