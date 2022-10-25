package ncs.test09;

public class Airplane extends Plane {
	public Airplane() {

	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int fS = getFuelSize() - 3 * distance;
		System.out.printf("%s \t\t %d\n", getPlaneName(), fS);
	}
	
//	public int setFuelSizeA(int distance) {
//		int fS = getFuelSize() - 3 * distance;
//		return fS;
//	}
	
	
}
