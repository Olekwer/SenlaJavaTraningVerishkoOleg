
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICompany company = new ItCompany();

		Employ vitia = new Employ("Viktor");
		Employ tolik = new Employ("Tolik");
		Employ lena = new Employ("Lena");
		Employ vika = new Employ("Vika");

		Employ vsia = new Employ("Vasia");
		Employ katia = new Employ("Kati");

		Employ anna = new Employ("Anna");
		Employ vova = new Employ("Vova");

		Employ rita = new Employ("Rita");
		Employ gena = new Employ("Gena");
		Employ lika = new Employ("Lika");

		// add backend
		company.getDepertaments()[0].addEmployee(rita);
		company.getDepertaments()[0].addEmployee(gena);
		company.getDepertaments()[0].addEmployee(lika);
		// add design
		company.getDepertaments()[1].addEmployee(vsia);
		company.getDepertaments()[1].addEmployee(katia);

		// add frontend
		company.getDepertaments()[2].addEmployee(vitia);
		company.getDepertaments()[2].addEmployee(tolik);
		company.getDepertaments()[2].addEmployee(lena);
		company.getDepertaments()[2].addEmployee(vika);

		// add testing
		company.getDepertaments()[3].addEmployee(anna);
		company.getDepertaments()[3].addEmployee(vova);

		// add salary

		vitia.addSalary(new Salary(Month.April, 156));
		tolik.addSalary(new Salary(Month.April, 133));
		lena.addSalary(new Salary(Month.April, 124));
		vika.addSalary(new Salary(Month.April, 176));
		lika.addSalary(new Salary(Month.December, 1000));
		lika.addSalary(new Salary(Month.December, 1000));
		vitia.addSalary(new Salary(Month.May, 156));
		rita.addSalary(new Salary(Month.September, 1234));
		tolik.addSalary(new Salary(Month.September, 698));
		anna.addSalary(new Salary(Month.September, 999));
		katia.addSalary(new Salary(Month.September, 1222));
		
		System.out.println(Month.April + " " + company.vychPoluchku(Month.April));
		System.out.println(Month.May + " " + company.vychPoluchku(Month.May));
		System.out.println(Month.December + " " + company.vychPoluchku(Month.December));
		System.out.println(Month.January + " " + company.vychPoluchku(Month.January));
		System.out.println(Month.September+" "+company.vychPoluchku(Month.September));

	}

}
