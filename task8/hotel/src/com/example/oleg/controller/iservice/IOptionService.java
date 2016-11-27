package com.example.oleg.controller.iservice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import com.example.oleg.base.DataBase;
import com.example.oleg.model.Option;

public interface IOptionService  {
	public void setDateBase(DataBase dateBase);

	public List<Option> getOptionsList();

	public void setOptionsList(List<Option> optionsList);

	public List<Option> sortByName();

	public List<Option> sortByPrice();

	public void addOption(String name, double price);

	public void setPrice(int idOption, double price);

	public void saverOption(String path) throws FileNotFoundException, IOException;
}
