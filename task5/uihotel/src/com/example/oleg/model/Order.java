package com.example.oleg.model;

import java.util.Date;

public class Order {

	private Guest guest;
	private Option option;
	private Date dateOption;

	public Date getDateOption() {
		return dateOption;
	}

	public void setDateOption(Date dateOption) {
		this.dateOption = dateOption;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

}
