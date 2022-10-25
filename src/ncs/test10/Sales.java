package ncs.test10;

public class Sales extends Employee implements Bonus {

	public Sales() {

	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return super.tax();
	}

	@Override
	public void incentive(int pay) {

	}
}
