package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.oleg.model.Service;

public class ServeceList implements Lists {
	
	private List<Service> servicesList;
	
	public void creat() {
		servicesList=new ArrayList<Service>();
		for (int i = 0; i < 5; i++) {
			
		}
	}
	public List<Service> getList() {
		return this.servicesList;
	}
}
