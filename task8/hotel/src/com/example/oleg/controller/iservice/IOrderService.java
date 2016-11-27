package com.example.oleg.controller.iservice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.example.oleg.base.DataBase;

import com.example.oleg.model.Option;

public interface IOrderService {
	public void setDateBase(DataBase dateBase);
	public List<Option> optionGuest(int idGuest);
	public void saverOrder(String path) throws FileNotFoundException, IOException;
}
