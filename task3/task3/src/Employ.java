
public class Employ {
	private String name;

	private Salary[] salaries = new Salary[12];

	public Employ() {

	}

	public Employ(String name) {
		this.name = name;
	}

	public Salary[] getSalaries() {
		return salaries;
	}

	public void setSalaries(Salary[] salaries) {
		this.salaries = salaries;
	}

	public void addSalary(Salary salary) {
		if (!isSalary(salary)) {
			for (int i = 0; i < salaries.length; i++) {
				if (salaries[i] == null) {
					salaries[i] = salary;
					break;
				}
			}
		} else {
			salaryReturn(salary);
		}
	}

	private boolean isSalary(Salary salary) {
		boolean bool = false;
		for (int i = 0; i < salaries.length; i++) {
			if (salaries[i] == null)
				continue;
			if (salaries[i].getMonth() == salary.getMonth()) {
				bool = true;
				break;
			}
		}

		return bool;
	}

	private void salaryReturn(Salary salary) {
		for (int i = 0; i < salaries.length; i++) {
			if (salaries[i].getMonth() == salary.getMonth()) {
				salaries[i] = salary;
				break;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
