package com.example.oleg.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Guest {
	private int id;
	private String name;
	private Date dateCheck;
	private Date dateOut;
	private int numberRoom;
	private double paymentAmount;
	private List<Service> services;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCheck() {
		return this.dateCheck;
	}

	public void setDateCheck(Date date) {
		this.dateCheck = date;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String toString() {
		StringBuffer stringBuffer=new StringBuffer();
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		String day1=df.format(this.dateCheck);
		String day2=df.format(this.dateOut);
		stringBuffer.append(this.name).append(" " ).append(this.numberRoom).append(day1).append("-").append(day2);
		return stringBuffer.toString();

	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
}
