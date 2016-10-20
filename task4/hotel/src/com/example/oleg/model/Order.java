package com.example.oleg.model;

import java.util.Date;

public class Order {
	private int idGuest;
	private int idOption;
	private Date dateOption;
	public int getIdGuest() {
		return idGuest;
	}
	public void setIdGuest(int idGuest) {
		this.idGuest = idGuest;
	}
	public int getIdOption() {
		return idOption;
	}
	public void setIdOption(int idOption) {
		this.idOption = idOption;
	}
	public Date getDateOption() {
		return dateOption;
	}
	public void setDateOption(Date dateOption) {
		this.dateOption = dateOption;
	}

}
