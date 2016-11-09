package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
import java.util.logging.Level;
import java.util.logging.Logger;
=======
import org.apache.log4j.Logger;
>>>>>>> task6new

import com.example.oleg.base.DataBase;
import com.example.oleg.compare.guest.CompareGuestName;
import com.example.oleg.model.Guest;

public class GuestsService {

	private DataBase dateBase;
<<<<<<< HEAD
	private static Logger log;
=======
	private Logger log= Logger.getLogger(GuestsService.class.getName());
>>>>>>> task6new
	public GuestsService(DataBase dateBase) {
		this.dateBase = dateBase;
	}

	public List<Guest> getGuestsList() {
		return dateBase.getGuestsList();
	}

	public void setGuestsList(List<Guest> guestsList) {
		this.dateBase.setGuestsList(guestsList);
	}

	public List<Guest> sortedByName() {
		ArrayList<Guest> sortList = new ArrayList<Guest>(this.dateBase.getGuestsList());
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}

	public List<Guest> sortedByDateOut() {
		ArrayList<Guest> sortList = new ArrayList<Guest>(this.dateBase.getGuestsList());
		Collections.sort(sortList, new CompareGuestName());
		return sortList;
	}

	public void putGuestRoom(String name, int numberRoom, Date dateChange, Date dateOut) {
		try{
			int id = this.dateBase.getGuestsList().size() + 1;
			Guest guest = new Guest(id, name, numberRoom, dateChange, dateOut);
			this.dateBase.getGuestsList().add(guest);
		}
		catch (Exception e) {
			// TODO: handle exception
<<<<<<< HEAD
			log.log(Level.SEVERE, "Exception: ", e);
=======
			log.info(e);
>>>>>>> task6new
		}
		
	}

	public void guestOut(int idGuest) {
		try{
			this.dateBase.getGuestsList().remove(idGuest);
		}
		catch (Exception e) {
			// TODO: handle exception
<<<<<<< HEAD
			log.log(Level.SEVERE, "Exception: ", e);
=======
			log.info(e);
>>>>>>> task6new

		}
		
	}

	/*public void saveGuest(String filePath) {
		try{
			FileSaver saveFile = new FileSaver(filePath);
		saveFile.saveGuest(this.dateBase.getGuestsList());
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
*/
	public int amountGuest() {
		return this.dateBase.getGuestsList().size();
	}
	
	public void saverGuest(String path) throws FileNotFoundException, IOException {
		FileSaver saveFile = new FileSaver(path);
		saveFile.sever(this.dateBase.getGuestsList());
	}
	
}
