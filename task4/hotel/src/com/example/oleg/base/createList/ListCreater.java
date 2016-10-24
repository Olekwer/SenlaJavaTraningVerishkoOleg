package com.example.oleg.base.createList;

import java.text.ParseException;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.example.oleg.base.parser.TextParser;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;
import com.example.oleg.model.Room;

public class ListCreater {
	public List<Room> creteRoom(String path) {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] rooms = textFileWorker.readFromFile();

		TextParser textParser = new TextParser();
		List<Room> roomList = textParser.createRoomList(rooms);

		return roomList;
	}

	public List<Guest> createGuest(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] guests = textFileWorker.readFromFile();
		List<Guest> list;
		TextParser textParser = new TextParser();
		list = textParser.createGuestList(guests);
		return list;
	}

	public List<Option> createOption(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] options = textFileWorker.readFromFile();
		TextParser textParser = new TextParser();
		List<Option> list = textParser.createOptionList(options);

		return list;
	}

	public List<Order> createOrder(String path) throws ParseException {
		TextFileWorker textFileWorker = new TextFileWorker(path);
		String[] orders = textFileWorker.readFromFile();
		TextParser textParser = new TextParser();
		List<Order> list = textParser.createOrderList(orders);

		return list;
	}
}
