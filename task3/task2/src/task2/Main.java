package task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass=new MyClass();
		for(int i=0;i<myClass.getMass().length;i++){
			System.out.println(myClass.getMass()[i]);
		}
		myClass.vyvod();
	}

}
