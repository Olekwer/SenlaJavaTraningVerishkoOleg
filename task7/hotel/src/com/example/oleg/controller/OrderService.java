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


	private DataBase dataBase;
	public OrderService(DataBase datBase) {
		this.dataBase=datBase;

	}

	public List<Option> optionGuest(int idGuest) {
		Guest guest = null;
		int optionId = 0;
		List<Option> optionList = new ArrayList<Option>();
		for (int i = 0; i < this.dataBase.getGuestsList().size(); i++) {
			if (this.dataBase.getGuestsList().get(i).getId() == idGuest) {
				guest = this.dataBase.getGuestsList().get(i);
				break;
			}
		}

		for (int i = 0; i < this.dataBase.getOrderList().size(); i++) {
			if ((guest.getId() == this.dataBase.getOrderList().get(i).getGuest().getId())) {
				optionId = this.dataBase.getOrderList().get(i).getOption().getId();
				for (int j = 0; j < this.dataBase.getOrderList().size(); j++) {
					if (optionId == this.dataBase.getOptionsList().get(j).getId()) {
						Option option = this.dataBase.getOptionsList().get(j);
						option.setDateExecut(this.dataBase.getOrderList().get(i).getOption().getDateExecut());
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
