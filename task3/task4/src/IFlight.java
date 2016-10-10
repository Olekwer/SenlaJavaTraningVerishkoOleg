
public abstract class IFlight {
	private int number;
	private int numberSeats;
	private Passenger[] passengers;

	public abstract String getSTATUS();

	public abstract void addPassenger(Passenger passenger);

	public abstract void delPassenger(Passenger passenger);


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

	public int free() {
		int res = 0;

		for (int i = 0; i < this.passengers.length; i++) {
			if (this.passengers[i] == null) {
				res = res + 1;
			}
		}

		return res;
	}

	public IFlight cancel(Aeroport aeroport) {

		IFlight temp = this;
		IFlight flight = new FlightCancel();
		flight.setNumber(temp.getNumber());
		flight.setNumberSeats(temp.getNumberSeats());
		flight.setPassengers(temp.getPassengers());
		aeroport.getFlights()[flight.getNumber()] = flight;

		System.out.println(flight.getSTATUS());

		return new FlightCancel();
	}
	
	public IFlight late(Aeroport aeroport) {

		IFlight temp = this;
		IFlight flight = new FlightLate();
		flight.setNumber(temp.getNumber());
		flight.setNumberSeats(temp.getNumberSeats());
		flight.setPassengers(temp.getPassengers());
		aeroport.getFlights()[flight.getNumber()] = flight;
		
		System.out.println(flight.getSTATUS());

		return new FlightLate();
	}

}
