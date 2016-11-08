/*package com.example.oleg.base.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;
import com.example.oleg.model.Room;

public class TextParser {
	private final SimpleDateFormat FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	private final String SPLIT = ";";

	public TextParser() {

	}

	public List<Room> createRoomList(String[] str) {
		ArrayList<Room> list = new ArrayList<Room>();
		for (int i = 0; i < str.length; i++) {
			String[] roomStr = str[i].split(SPLIT);
			int number = Integer.parseInt(roomStr[0]);
			double price = Double.parseDouble(roomStr[1]);
			int capacity = Integer.parseInt(roomStr[2]);
			int stars = Integer.parseInt(roomStr[3]);
			Room room = new Room(number, price, capacity, stars);
			list.add(room);
		}

		return list;
	}

	public List<Guest> createGuestList(String[] str) throws ParseException {
		ArrayList<Guest> list = new ArrayList<Guest>();

		for (int i = 0; i < str.length; i++) {
			String[] guestStr = str[i].split(SPLIT);
			int id = Integer.parseInt(guestStr[0]);
			String name = guestStr[1];
			int numberRoom = Integer.parseInt(guestStr[2]);
			Date dateChange = FORMAT.parse(guestStr[3]);
			Date dateOut = FORMAT.parse(guestStr[4]);
			Guest guest = new Guest(id, name, numberRoom, dateChange, dateOut);
			list.add(guest);
		}
		return list;

	}

	public List<Option> createOptionList(String[] str) {

		ArrayList<Option> list = new ArrayList<Option>();
		for (int i = 0; i < str.length; i++) {
			String[] optionStr = str[i].split(SPLIT);
			int id = Integer.parseInt(optionStr[0]);
			String name = optionStr[1];
			double price = Double.parseDouble(optionStr[2]);
			Option option = new Option(id, name, price);
			list.add(option);
		}
		return list;
	}

	public List<Order> createOrderList(String[] str) throws ParseException {
		ArrayList<Order> list = new ArrayList<Order>();

		for (int i = 0; i < str.length; i++) {
			String[] orderStr = str[i].split(SPLIT);
			int idOption = Integer.parseInt(orderStr[0]);
			int idGuest = Integer.parseInt(orderStr[1]);
			Date date = FORMAT.parse(orderStr[2]);
			Order order = new Order();
			Guest guest = new Guest();
			Option option = new Option();
			guest.setId(idGuest);
			option.setId(idOption);
			option.setDateExecut(date);
			order.setGuest(guest);
			order.setOption(option);
			order.setDateOption(date);

			list.add(order);
		}

		return list;
	}

}
*/