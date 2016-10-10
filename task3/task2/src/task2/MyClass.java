package task2;

public class MyClass {

	private int mass[];

	public MyClass() {
		this.mass = new int[3];
		generator();
	}

	public int[] getMass() {
		return mass;
	}

	public void setMass(int[] mass) {
		this.mass = mass;
	}

	private void generator() {
		for (int i = 0; i < 3; i++) {
			int res = 0;
			while (true) {
				res = new java.util.Random().nextInt(999);
				if (res > 99) {
					this.mass[i] = res;
					break;
				}
			}
		}
	}
	
	public void vyvod(){
		String str=this.mass[0]+""+this.mass[1];
		int i=Integer.parseInt(str);
		System.out.println(i+" - "+mass[2]+"="+(i-mass[2]));
	}

}
