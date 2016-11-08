package com.example.oleg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int numberRoom;
	private Date dateChange;
	private Date dateOut;
	private transient List<Option> optionsList;

	public Guest(int id, String name, int numberRoom, Date dateChange, Date dateOut) {
		this.id = id;
		this.name = name;
		this.setNumberRoom(numberRoom);
		this.dateChange = dateChange;
		this.dateOut = dateOut;
	}

	public Guest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateChange() {
		return dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public List<Option> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<Option> optionsList) {
		this.optionsList = optionsList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String toString() {

		String s = this.name + " " + this.numberRoom + " " + this.dateChange + " " + this.dateOut;

		return s;

	}
}
