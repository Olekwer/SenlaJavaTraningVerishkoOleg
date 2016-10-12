package oleg.org;

public class Guest extends User {
	private Room room;
	private String dateArrival;
	private String dateDeparture;

	public Guest(int id, String name, Room room, String dateArrival, String dateDeparture) {
		super(id, name);
		this.room = room;
		this.dateArrival = dateArrival;
		this.dateDeparture = dateDeparture;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(String dateArrival) {
		this.dateArrival = dateArrival;
	}

	public String getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(String dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(this.getName()).append(" ").append(this.room.getNumber()).append(" ")
				.append(this.dateArrival).append(" ").append(this.dateDeparture);
		return stringBuffer.toString();
	}
}
