package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.oleg.base.DateBase;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;

public class ServiceOrder {

	private List<Option> optionsList;
	private List<Guest> guestsList;
	private List<Order> ordersList;

	public ServiceOrder(DateBase dateBase) {
		this.optionsList = dateBase.getOptionsList();
		this.guestsList = dateBase.getGuestsList();
		this.ordersList = dateBase.getOrderList();
	}

	public List<Option> optionGuest(int idGuest) {
		Guest guest = null;
		int optionId = 0;
		List<Option> optionList = new ArrayList<Option>();
		for (int i = 0; i < this.guestsList.size(); i++) {
			if (this.guestsList.get(i).getId() == idGuest) {
				guest = this.guestsList.get(i);
				break;
			}
		}

		for (int i = 0; i < this.ordersList.size(); i++) {
			if ((guest.getId() == this.ordersList.get(i).getGuest().getId())) {
				optionId = this.ordersList.get(i).getOption().getId();
				for (int j = 0; j < this.optionsList.size(); j++) {
					if (optionId == this.optionsList.get(j).getId()) {
						Option option = this.optionsList.get(j);
						option.setDateExecut(this.ordersList.get(i).getOption().getDateExecut());
						optionList.add(option);
						break;
					}
				}
			}
		}

		return optionList;
	}

}
