
public class Flight extends IFlight {
	private final String STATUS = "√отов";
	
	public Flight(int number, int numberSeats){
		this.setNumber(number);
		this.setPassengers(new Passenger[numberSeats]);
	}

	public String getSTATUS() {
		return STATUS;
	}
	

	public void addPassenger(Passenger passenger) {
		boolean bol=false;
		for (int i = 0; i < this.getPassengers().length; i++) {
			if (this.getPassengers()[i] == null) {
				bol=true;
				this.getPassengers()[i] = passenger;
				break;
			} 
		}
		if(!bol){
			System.out.println("все места зан€ты");
		}
	}
	
	public void delPassenger(Passenger passenger) {
		boolean bol=false;
		for (int i = 0; i < this.getNumberSeats(); i++) {
			if (this.getPassengers()[i] == passenger) {
				bol=true;
				this.getPassengers()[i] = null;
				break;
			}
		}
		if(!bol){
			System.out.println("нет такого человека");
		}
	}
	


	
	

}
