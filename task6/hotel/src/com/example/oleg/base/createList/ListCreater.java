package com.example.oleg.base.createList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.example.oleg.base.DataBase;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Order;
import com.example.oleg.model.Room;

public class ListCreater {
	private Logger log = Logger.getLogger(DataBase.class);

	public List<Room> creteRoom(String path) throws FileNotFoundException, IOException {
		List<Room> roomList = new ArrayList<Room>();
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(path));
		try {
			roomList = (ArrayList<Room>) istream.readObject();
		} catch (ClassNotFoundException e) {
			log.info(e);
		} finally {
			istream.close();
		}
		return roomList;
	}

	@SuppressWarnings("unchecked")
	public List<Guest> createGuest(String path) throws ParseException, FileNotFoundException, IOException {

		List<Guest> lisyguest = new ArrayList<Guest>();
		@SuppressWarnings("resource")
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(path));
		try {
			lisyguest = (ArrayList<Guest>) istream.readObject();
		} catch (ClassNotFoundException e) {
			log.info(e);
		} finally {
			istream.close();
		}

		return lisyguest;
	}

	@SuppressWarnings("unchecked")
	public List<Option> createOption(String path) throws ParseException, FileNotFoundException, IOException {

		List<Option> lisyoption = new ArrayList<Option>();
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(path));
		try {
			lisyoption = (ArrayList<Option>) istream.readObject();
		} catch (ClassNotFoundException e) {
			log.info(e);
		} finally {
			istream.close();
		}
		return lisyoption;
	}

	@SuppressWarnings("unchecked")
	public List<Order> createOrder(String path) throws ParseException, FileNotFoundException, IOException {

		List<Order> listorder = new ArrayList<Order>();
		@SuppressWarnings("resource")
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(path));
		try {
			listorder = (ArrayList<Order>) istream.readObject();
		} catch (ClassNotFoundException e) {
			log.info(e);
		} finally {
			istream.close();
		}

		return listorder;
	}
}
