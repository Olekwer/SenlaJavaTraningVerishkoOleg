package oleg.org;

public class Flighte {
	private int number;
	private int numberSeats;
	private int freeSeats;
	private Passenger[] passengers;
	private Status status;
	
	public Flighte(int number, int numberSeats){
		this.number=number;
		this.numberSeats=numberSeats;
		this.freeSeats=numberSeats;
		this.passengers= new Passenger[this.numberSeats];
		this.setStatus(Status.Ready);
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumberSeats() {
		return numberSeats;
	}
	public void setNumberSeats(int numberSeats) {
		this.numberSeats = numberSeats;
	}
	public Passenger[] getPassengers() {
		return passengers;
	}
	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}	


	public int getFreeSeats() {
		return freeSeats;
	}

	public void setFreeSeats(int freeSeats) {
		this.freeSeats = freeSeats;
	}
}
