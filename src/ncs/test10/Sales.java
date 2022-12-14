package ncs.test10;

public class Sales extends Employee implements Bonus {

	public Sales() {

	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return 0.13 * getSalary();
	}

	@Override
	public void incentive(int pay) {
		 super.setSalary(getSalary() + (int)(1.2 * pay));
	}
	
}
