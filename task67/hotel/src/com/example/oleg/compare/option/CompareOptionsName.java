package com.example.oleg.compare.option;

import java.util.Comparator;

import com.example.oleg.model.Option;

public class CompareOptionsName implements Comparator<Option> {

	public int compare(Option arg0, Option arg1) {
		String str1 = arg0.getName();
		String str2 = arg1.getName();
		return str1.compareTo(str2);
	}

}
