package com.example.oleg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.compare.option.CompareOptionsName;
import com.example.oleg.model.Option;

public class ServiceOptions {
	private List<Option> optionsList;
	private final String SPLIT=";";

	public ServiceOptions(List<Option> optionsList) {
		this.optionsList = optionsList;
	}

	public List<Option> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<Option> optionsList) {
		this.optionsList = optionsList;
	}

	public List<Option> sortByName() {
		List<Option> opList = new ArrayList<Option>(this.optionsList);
		Collections.sort(opList, new CompareOptionsName());
		return opList;
	}

	public List<Option> sortByPrice() {
		List<Option> opList = new ArrayList<Option>(this.optionsList);
		Collections.sort(opList, new CompareOptionsName());
		return opList;
	}

	public void addOption(String name, double price) {
		int id=optionsList.size()+1;
		Option option=new Option(id, name, price);
		this.optionsList.add(option);
	}
	
	public void saveOption(String path){
		TextFileWorker textFileWorker=new TextFileWorker(path);
		String[] mass=new String[this.optionsList.size()];
		for(int i=0;i<this.optionsList.size();i++){
			Option option=this.optionsList.get(i);
			int id=option.getId();
			String name=option.getName();
			double price=option.getPrice();
			StringBuffer stringBuffer=new StringBuffer();
			stringBuffer.append(id).append(SPLIT).append(name).append(SPLIT).append(price);
			mass[i]=stringBuffer.toString();
		}
		textFileWorker.writeToFile(mass);
	}

}
