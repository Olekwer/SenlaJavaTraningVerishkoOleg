package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.oleg.base.DateBase;
import com.example.oleg.compare.option.CompareOptionsName;
import com.example.oleg.model.Option;

public class ServiceOptions {
	private DateBase dateBase;

	public ServiceOptions(DateBase dateBase) {
		this.dateBase = dateBase;
	}

	public List<Option> getOptionsList() {
		return this.dateBase.getOptionsList();
	}

	public void setOptionsList(List<Option> optionsList) {
		this.dateBase.setOptionsList(optionsList);
	}

	public List<Option> sortByName() {
		List<Option> opList = new ArrayList<Option>(this.getOptionsList());
		Collections.sort(opList, new CompareOptionsName());
		return opList;
	}

	public List<Option> sortByPrice() {
		List<Option> opList = new ArrayList<Option>(this.getOptionsList());
		Collections.sort(opList, new CompareOptionsName());
		return opList;
	}

	public void addOption(String name, double price) {
		int id = getOptionsList().size() + 1;
		Option option = new Option(id, name, price);
		this.getOptionsList().add(option);
	}

	public void setPrice(int idOption, double price) {
		Option option = this.getOptionsList().get(idOption - 1);
		option.setPrice(price);
	}

	public void saveOption(String path) {
		SaveFile saveFile = new SaveFile(path);
		saveFile.saveOption(this.dateBase.getOptionsList());
	}

}
