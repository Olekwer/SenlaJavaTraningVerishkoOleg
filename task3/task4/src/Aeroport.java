
public class Aeroport {
	private String name;
	private int kol;
	private IFlight[] flights;

	public Aeroport(String name, int kol) {
		this.setName(name);
		this.setKol(kol);
		this.setFlights(new IFlight[kol]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKol() {
		return kol;
	}

	public void setKol(int kol) {
		this.kol = kol;
	}

	public IFlight[] getFlights() {
		return flights;
	}

	public void setFlights(IFlight[] flights) {
		this.flights = flights;
	}

	public void addFlight(IFlight flight) {
		if (flight.getClass().getName().equals("Flight")) {
			if ((flight.getNumber() > this.getKol()) || (flight.getNumber() < 0)) {
				this.getFlights()[this.getFlights().length] = flight;
			} else {
				this.getFlights()[flight.getNumber()] = flight;
			}
		} else {
			System.out.println("Рейс недействителен");
		}
	}

	public void info() {

		for (int i = 0; i < this.flights.length; i++) {
			if (this.flights[i] == null)
				continue;
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("Номер рейса: ").append(this.flights[i].getNumber()).append(", состояние: ")
					.append(this.flights[i].getSTATUS()).append(", количество свободных мест: ").append(this.flights[i].free());
			System.out.println(stringBuffer.toString());
		}
	}

}
