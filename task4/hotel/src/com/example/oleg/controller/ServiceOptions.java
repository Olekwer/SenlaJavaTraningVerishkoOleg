package com.example.oleg.controller;

import java.util.List;

import com.example.oleg.model.Option;

public class ServiceOptions {
	private List<Option>optionsList;

	public ServiceOptions(List<Option>optionsList){
		this.optionsList=optionsList;
	}
	
	public List<Option> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<Option> optionsList) {
		this.optionsList = optionsList;
	}

}
