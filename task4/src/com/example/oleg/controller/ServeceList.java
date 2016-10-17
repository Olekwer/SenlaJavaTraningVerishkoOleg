package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.oleg.model.Service;

public class ServeceList implements Lists {

	private List<Service> servicesList;

	public void creat() {
		servicesList = new ArrayList<Service>();
		for (int i = 0; i < 5; i++) {
			Service service = new Service();
			int id = i + 1;
			String name = "service" + i;
			double price = Math.floor(Math.random() * 1000);
			service.setId(id);
			service.setName(name);
			service.setPrice(price);
			servicesList.add(service);
		}
	}

	public List<Service> getList() {
		return this.servicesList;
	}
}
