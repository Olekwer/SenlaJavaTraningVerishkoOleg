package com.example.oleg.model;

import java.io.Serializable;
import java.util.Date;

public class Option implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	private Date dateExecut;
	private Guest guest;

	public Option(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Option() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateExecut() {
		return dateExecut;
	}

	public void setDateExecut(Date dateExecut) {
		this.dateExecut = dateExecut;
	}

	public String toString() {
		String s = this.name + " " + this.price;
		return s;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}
}
