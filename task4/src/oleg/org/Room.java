package oleg.org;

public class Room {
	private int number;
	private double price;
	private int capacity;
	private int starship;
	private final String NUMBER_ROOM = "number room: ";
	private final String PRICE_ROOM = "price room";
	private final String CAPCITY_ROOM = "capacity room: ";
	private final String STARSHIP_ROOM = "starship room: ";

	public Room(int number, double price, int capacity, int starship) {
		this.number = number;
		this.price = price;
		this.capacity = capacity;
		this.starship = starship;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getStarship() {
		return starship;
	}

	public void setStarship(int starship) {
		this.starship = starship;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(NUMBER_ROOM).append(number).append(PRICE_ROOM).append(price).append(CAPCITY_ROOM)
				.append(capacity).append(STARSHIP_ROOM).append(starship);
		return stringBuffer.toString();
	}

}
