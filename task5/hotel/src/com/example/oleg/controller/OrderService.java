package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.oleg.base.DataBase;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;

public class OrderService {

	private List<Option> optionsList;
	private List<Guest> guestsList;
	private List<Order> ordersList;
	private DataBase dataBase;
	public OrderService(DataBase datBase) {
		this.dataBase=datBase;
		this.optionsList = datBase.getOptionsList();
		this.guestsList = datBase.getGuestsList();
		this.ordersList = datBase.getOrderList();
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
	public void saverOrder(String path) throws FileNotFoundException, IOException {
		FileSaver saveFile = new FileSaver(path);
		saveFile.sever(this.dataBase.getOrderList());
	}

}
