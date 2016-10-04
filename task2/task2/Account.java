public class Account {
	private int number;
	private double summa;
	
	public Account() {
		System.out.println(getClass());
	}
	public Account(int number, double summa) {
		this.number=number;
		this.summa=summa;
		System.out.println(getClass());
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSumma() {
		return summa;
	}
	public void setSumma(double summa) {
		this.summa = summa;
	}
	public void addSumma(double summa){
		this.summa+=summa;
		System.out.println("Сумма добавлена");
	}
	public void negativeSumma(double summa){
		this.summa-=summa;
		System.out.println("Сумма минусована");
	}
}
