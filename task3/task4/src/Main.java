
public class Main {

	public static void main(String[] args) {
		
		Aeroport aeroport=new Aeroport("Minsk", 4);
		
		System.out.println(aeroport.getFlights().length);

		IFlight f1=new Flight(1, 4);
		
		IFlight f2=new Flight(0, 6);
		
		IFlight f3=new Flight(2, 5);

		aeroport.addFlight(f1);
		aeroport.addFlight(f2);
		aeroport.addFlight(f3);
		f1.addPassenger(new Passenger("a", "s"));
		f2.addPassenger(new Passenger("a", "s"));
		f3.addPassenger(new Passenger("g", "zx"));
		aeroport.info();
		f2=f2.cancel(aeroport);
		f3=f3.late(aeroport);
		aeroport.info();
		
	}

}
