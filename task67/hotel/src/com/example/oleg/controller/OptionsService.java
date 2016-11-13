package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;


import com.example.oleg.base.DataBase;
import com.example.oleg.compare.option.CompareOptionsName;
import com.example.oleg.model.Option;

public class OptionsService {
	private DataBase dateBase;
	private static Logger log= Logger.getLogger(OptionsService.class.getName());

	public OptionsService(DataBase dateBase) {
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
		try{
			int id = getOptionsList().size() + 1;
			Option option = new Option(id, name, price);
			this.getOptionsList().add(option);
		}
		catch (Exception e) {
			// TODO: handle exception
			log.info(e);

		}
		
	}

	public void setPrice(int idOption, double price) {
		try{
			Option option = this.getOptionsList().get(idOption - 1);
		option.setPrice(price);
		}
		catch (Exception e) {
			// TODO: handle exception
			log.info(e);

		}
		
	}

	/*public void saveOption(String path) {
		FileSaver saveFile = new FileSaver(path);
		saveFile.saveOption(this.dateBase.getOptionsList());
	}*/
	public void saverOption(String path) throws FileNotFoundException, IOException {
		FileSaver saveFile = new FileSaver(path);
		saveFile.sever(this.dateBase.getOptionsList());
	}

}
