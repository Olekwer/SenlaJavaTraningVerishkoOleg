package oleg.org;
public class Main {

	public static void main(String[] args) {
		
		Aeroport aeroport=new Aeroport("Minsk", 4);
		
	
		
		FlightService f1=new FlightService(aeroport, new Flighte(0, 171));
		FlightService f2=new FlightService(aeroport, new Flighte(1, 100));
		
		f1.addFligtAeroport();
		f1.addPassengerFlight(new Passenger("ads", "ads"));
		f1.addPassengerFlight(new Passenger("sdffa", "czxxzv"));
		f1.addPassengerFlight(new Passenger("asdxzcc", "nbnvoy"));
		f1.removePassengerFlight(0);
		f1.canceFlighte();
		
		f2.addFligtAeroport();
		aeroport.infoFlightes();

		f2.addPassengerFlight(new Passenger("zxzc", "qertytyu"));
		
		aeroport.infoFlightes();
		
	}

}
