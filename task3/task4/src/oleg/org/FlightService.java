package oleg.org;

public class FlightService {
	private final String NO_SEATS = "No of seats";
	private final String ERROR = "No";
	private Aeroport aeroport;
	private Flighte flighte;

	public FlightService(Aeroport aeroport, Flighte flighte) {
		this.aeroport = aeroport;
		this.flighte = flighte;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Flighte getFlighte() {
		return flighte;
	}

	public void setFlight(Flighte flighte) {
		this.flighte = flighte;
	}

	public void addPassengerFlight(Passenger passenger) {

		boolean bol = false;
		for (int i = 0; i < this.flighte.getPassengers().length; i++) {
			if (this.flighte.getPassengers()[i] == null) {
				bol = true;
				this.flighte.getPassengers()[i] = passenger;
				passenger.setId(i);
				this.flighte.setFreeSeats(this.flighte.getFreeSeats()-1);
				break;
			}
		}
		if (!bol) {
			System.out.println(NO_SEATS);
		}

	}

	public void removePassengerFlight(int id) {
		boolean bol = false;
		for (int i = 0; i < this.flighte.getPassengers().length; i++) {
			if (this.flighte.getPassengers()[i].getId()==id) {
				bol = true;
				this.flighte.getPassengers()[i] = null;
				this.flighte.setFreeSeats(this.flighte.getFreeSeats()+1);
				break;
			}
		}
		if (!bol) {
			System.out.println(ERROR);
		}
	}

	public void addFligtAeroport() {
		if (!isFlight()) {

		} else {
			if (isFullAeroport()) {
				if (this.flighte.getNumber() > this.aeroport.getFlightes().length) {
					this.flighte
							.setNumber(this.aeroport.getFlightes().length - 1);
				}
				this.aeroport.getFlightes()[this.flighte.getNumber()] = this.flighte;
			}
		}
	}

	private boolean isFlight() {
		boolean bol = true;

		if (this.flighte.getStatus() != Status.Ready) {
			bol = false;
		}

		return bol;
	}

	private boolean isFullAeroport() {
		boolean bol = false;

		for (int i = 0; i < this.aeroport.getFlightes().length; i++) {
			if (this.aeroport.getFlightes()[i] == null) {
				bol = true;
			}
		}

		return bol;
	}

	public int freeSeatsFlight() {
		int t = 0;
		for (int i = 0; i < this.flighte.getPassengers().length; i++) {
			if (this.flighte.getPassengers()[i] == null) {
				t++;
			}
		}
		return t;
	}

	public void canceFlighte() {
		this.flighte.setStatus(Status.Cancel);
	}

	public void lateFlighte() {
		this.flighte.setStatus(Status.Late);
	}

	public String getNO_SEATS() {
		return NO_SEATS;
	}

	public String getERROR() {
		return ERROR;
	}
}
