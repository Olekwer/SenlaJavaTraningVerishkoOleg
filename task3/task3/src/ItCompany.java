
public class ItCompany implements ICompany {
	private AbstractDepartament[] depertaments = new AbstractDepartament[4];

	public ItCompany() {
		this.createDepertament();

	}

	private void createDepertament() {
		AbstractDepartament backend = new Backend();
		AbstractDepartament design = new Design();
		AbstractDepartament frontend = new Frontend();
		AbstractDepartament testing = new Testing();

		this.getDepertaments()[0] = backend;
		this.getDepertaments()[1] = design;
		this.getDepertaments()[2] = frontend;
		this.getDepertaments()[3] = testing;
	}

	@Override
	public double vychPoluchku(Month month) {
		double result = 0;

		for (int i = 0; i < depertaments.length; i++) {
			result = result + poluckaDep(i, month);
		}

		return result;

	}

	private double poluckaDep(int n, Month month) {
		double result = 0;

		for (int i = 0; i < depertaments[n].getEmploys().length; i++) {
			Employ employ = depertaments[n].getEmploys()[i];
			if (employ == null)
				continue;
			for (int j = 0; j < employ.getSalaries().length; j++) {
				if (employ.getSalaries()[j] == null)
					continue;
				if (employ.getSalaries()[j].getMonth() == month) {
					result = result + employ.getSalaries()[j].getSumma();
					break;
				}
			}
		}

		return result;
	}

	public AbstractDepartament[] getDepertaments() {
		return depertaments;
	}

	public void setDepertaments(AbstractDepartament[] depertaments) {
		this.depertaments = depertaments;
	}

}
