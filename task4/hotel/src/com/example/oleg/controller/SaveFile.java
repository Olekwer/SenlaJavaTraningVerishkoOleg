package com.example.oleg.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;

public class SaveFile {
	private final String PATTERN = "dd.MM.yyyy";
	private final String SPLIT = ";";
	private String path;

	public SaveFile(String path) {
		this.path = path;
	}

	public void saveGuest(List<Guest> lists) {
		TextFileWorker textFileWorker = new TextFileWorker(this.path);
		String[] mass = new String[lists.size()];
		for (int i = 0; i < lists.size(); i++) {
			Guest guest = lists.get(i);
			int id = guest.getId();
			String name = guest.getName();
			int numberRoom = guest.getNumberRoom();
			SimpleDateFormat format = new SimpleDateFormat(PATTERN);
			String dChange = format.format(guest.getDateChange());
			String dOut = format.format(guest.getDateOut());
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(id).append(SPLIT).append(name).append(SPLIT).append(numberRoom).append(SPLIT)
					.append(dChange).append(SPLIT).append(dOut);
			mass[i] = stringBuffer.toString();
		}
		textFileWorker.writeToFile(mass);

	}
	
	public void saveOption(List<Option>lists){
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] mass = new String[lists.size()];
		for (int i = 0; i < lists.size(); i++) {
			Option option = lists.get(i);
			int id = option.getId();
			String name = option.getName();
			double price = option.getPrice();
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(id).append(SPLIT).append(name).append(SPLIT).append(price);
			mass[i] = stringBuffer.toString();
		}
		textFileWorker.writeToFile(mass);
	}
}
