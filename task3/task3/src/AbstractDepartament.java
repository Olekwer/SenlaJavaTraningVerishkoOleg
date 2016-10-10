
public abstract class AbstractDepartament {
	private Employ[] employs = new Employ[4];

	public void addEmployee(Employ employ) {
		boolean bols = false;
		for (int i = 0; i < this.getEmploys().length; i++) {
			if (this.getEmploys()[i] == null) {
				this.getEmploys()[i] = employ;
				bols = true;
				break;
			}

		}
		if (!bols) {
			System.out.println("Отдел укомплектован");
		}

	}

	public Employ[] getEmploys() {
		return employs;
	}

	public void setEmploys(Employ[] employs) {
		this.employs = employs;
	}
}
