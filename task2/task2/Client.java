import java.util.*;

public class Client {
	private Identification identification;
	private Account account;
	private ArrayList<Payment> payments;
	public Client(){
		payments=new ArrayList<Payment>();
		System.out.println(getClass());
	}
	
	public Identification getIdentification() {
		return identification;
	}
	
	public void setIdentification(Identification identification) {
		this.identification = identification;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	public ArrayList<Payment> getPayments() {
		return payments;
	}
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}
	public void createAccount(Account account){
		this.account=account;
		
		
	}
}
