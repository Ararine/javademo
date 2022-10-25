package ncs.test09;

abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
	
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		int fS = this.fuelSize + fuel;
		System.out.printf("%s \t\t %d\n", planeName, fS);
	}
	
	public void flight(int distance) {
		int fS = getFuelSize() - 0 * distance;
		System.out.printf("%s \t\t %d\n", getPlaneName(), fS);

	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
	
}
