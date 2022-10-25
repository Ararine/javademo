package ncs.test09;

public class Carpoplane extends Plane{
	public Carpoplane() {
	
	}
	
	public Carpoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int fS = getFuelSize() - 5 * distance;
		super.setFuelSize(fS);
		System.out.printf("%s \t\t %d\n", getPlaneName(), fS);
	}
}
