
public class Salary {
	private double summa;
	private Month month;
	
	public Salary(Month month, double summa){
		this.month=month;
		this.summa=summa;
	}
	
	public double getSumma() {
		return summa;
	}
	
	public void setSumma(double summa) {
		this.summa = summa;
	}
	
	public Month getMonth() {
		return month;
	}
	
	public void setMonth(Month month) {
		this.month = month;
	}
}
