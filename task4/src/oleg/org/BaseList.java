package oleg.org;

import java.util.ArrayList;

import com.danco.training.TextFileWorker;

public class BaseList {
	private ArrayList<Guest> guests;
	private ArrayList<Room> rooms;
	private ArrayList<Service> services;
	private ArrayList<User> users;
	private final String USER_PATH="E:/hotel/user.txt";
	private final String ROOM_PATH="E:/hotel/room.txt";
	private final String GOEST_PATH="E:/hotel/goest.txt";

	
	
	public BaseList() {
		createUserList();
		createRoomList();
		createGuestList();

	}

	private void createUserList() {
		TextFileWorker textFileWorker = new TextFileWorker(USER_PATH);
		String[] usersarr = textFileWorker.readFromFile();
		this.users = new ArrayList<User>();
		for (int i = 0; i < usersarr.length; i++) {
			String[] tmp = usersarr[i].split(";");
			this.users.add(new User(Integer.parseInt(tmp[0]), tmp[1]));
		}
	}

	private void createRoomList() {
		TextFileWorker textFileWorker = new TextFileWorker(ROOM_PATH);
		String[] roomarr = textFileWorker.readFromFile();
		this.rooms = new ArrayList<Room>();
		for (int i = 0; i < roomarr.length; i++) {
			String[] tmp = roomarr[i].split(";");
			this.rooms.add(new Room(Integer.parseInt(tmp[0]), Double.parseDouble(tmp[1]), Integer.parseInt(tmp[2]),
					Integer.parseInt(tmp[3])));
		}
	}

	private void createGuestList() {
		TextFileWorker textFileWorker = new TextFileWorker(GOEST_PATH);
		String[] goestsarr = textFileWorker.readFromFile();
		this.guests = new ArrayList<Guest>();
		for (int i = 0; i < goestsarr.length; i++) {
			String[] tmp = goestsarr[i].split(";");
			int userId = Integer.parseInt(tmp[0]);
			int numberRoom = Integer.parseInt(tmp[1]);			
			Room room = takeRoom(numberRoom);			
			int id = takeUser(userId).getId();
			String name = takeUser(userId).getName();
			String dateArrival = tmp[2];
			String dateDeparture = tmp[3];
			Guest guest=new Guest(id, name, room, dateArrival, dateDeparture);
			this.guests.add(guest);
		}

	}

	private User takeUser(int userId) {
		User user = null;
		for (int y = 0; y < this.users.size(); y++) {
			if (userId == this.users.get(y).getId()) {
				user = this.users.get(y);
				break;
			}
		}
		return user;
	}

	private Room takeRoom(int numberRoom) {
		Room room = null;

		for (int y = 0; y < this.rooms.size(); y++) {
			if (numberRoom == this.rooms.get(y).getNumber()) {
				room = this.rooms.get(y);
				break;
			}
		}

		return room;

	}

	public ArrayList<Guest> getGuests() {
		return guests;
	}

	public void setGuests(ArrayList<Guest> guests) {
		this.guests = guests;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}
}
