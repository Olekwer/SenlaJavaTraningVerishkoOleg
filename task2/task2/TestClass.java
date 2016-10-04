
public class TestClass {
	public TestClass() {
		System.out.println(getClass());
		Identification vasiaKirov=new Identification(1,"Vasia","Kirov",1974,10,1);
		Client clientOne=new Client();
		clientOne.setIdentification(vasiaKirov);
		Account accauntOne=new Account(1,12);
		clientOne.createAccount(accauntOne);			
		Payment payment =new Payment("Leaner",clientOne,4,1131348);
		clientOne.getAccount().addSumma(14.4);
		payment.run();
		System.out.println(clientOne.getAccount().getSumma());
		System.out.println(clientOne.getPayments());
	}
}
