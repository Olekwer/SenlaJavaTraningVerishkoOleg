
public class Payment {
	
	private String name;
	private String status;
	private Client client;
	private double summa;
	private int numberAccount;
	
	public Payment() {
		System.out.println(getClass());
	}
	public Payment(String name, Client client, double summa, int numberAccount){
		this.name=name;
		this.client=client;
		this.summa=summa;
		this.numberAccount=numberAccount;
		System.out.println(getClass());

	}
	
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public double getSumma() {
		return summa;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void setSumma(double summa) {
		this.summa = summa;
	}
	public int getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	public void run(){		
		client.getAccount().negativeSumma(this.summa);
		client.getPayments().add(this);
		this.status="Payment success";
		System.out.println(this.status);
	}
	public void cancel(){
		this.name=null;
		this.client=null;
		this.summa=0;
		this.numberAccount=0;
		this.status="Payment cancel";
		System.out.println(this.status);
	}
}
