public class Identification {
	
	private String firstname;
	private String lastname;
	private int year;
	private int month;
	private int day;
	private int id;
	
	public Identification(int id, String firstname,String lastname, int year, int month, int day){
		
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.year=year;
		this.month=month;
		this.day=day;
		System.out.println(getClass());
	}
	
	public Identification(){
		System.out.println(getClass());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getDay() {
		return day;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
