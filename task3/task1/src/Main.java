
public class Main {

	public static void main(String[] args) {
		String text="fhg hgv         hhghjgvnbvb                   jh";
		MyClass myClass=new MyClass(text);
		myClass.textArray();
		for(int i=0;i<myClass.getResult().length;i++){
			System.out.println(myClass.getResult()[i]);
		}
		
	}

}
