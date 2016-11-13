package com.example.oleg.compare.option;

import java.util.Comparator;

import com.example.oleg.model.Option;

public class CompareOptionsPrice implements Comparator<Option> {

	public int compare(Option arg0, Option arg1) {
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
