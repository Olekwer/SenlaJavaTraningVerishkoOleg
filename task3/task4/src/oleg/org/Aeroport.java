package oleg.org;

public class Aeroport {
	private final String NUMBER_FLIGHT = " Number flight: ";
	private final String STATUS_FLIGHT = " Status flight: ";
	private final String FREE_SEATS = " free seats: ";
	private String name;
	private int kol;
	private Flighte[] flightes;

	public Aeroport(String name, int kol) {
		this.setName(name);
		this.setKol(kol);
		this.setFlightes(new Flighte[kol]);
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

	public void infoFlightes() {		
		
		
		for (int i = 0; i < this.flightes.length; i++) {
			
			if (this.flightes[i] == null)
				continue;

			StringBuffer stringBuffer = new StringBuffer();
			int freeSeats=this.flightes[i].getFreeSeats();
			
			stringBuffer.append(NUMBER_FLIGHT).append(this.flightes[i].getNumber()).append(STATUS_FLIGHT)
					.append(this.flightes[i].getStatus()).append(FREE_SEATS).append(freeSeats);
			System.out.println(stringBuffer.toString());
		}
	}

	public Flighte[] getFlightes() {
		return flightes;
	}

	public void setFlightes(Flighte[] flightes) {
		this.flightes = flightes;
	}

}
