package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane ap = new Airplane("L747", 1000);
		Carpoplane cp = new Carpoplane("C40", 1000);
		System.out.println("Plane \t\t fuelsize");
		System.out.println("---------------------------");
		System.out.printf("%s \t\t %s\n", ap.getPlaneName(), ap.getFuelSize());
		System.out.printf("%s \t\t %s\n", cp.getPlaneName(), cp.getFuelSize());
		System.out.println("100 운항");
		System.out.println("Plane \t\t fuelsize");
		System.out.println("---------------------------");
		ap.flight(100);
		cp.flight(100);
		System.out.println("200 주유");
		System.out.println("Plane \t\t fuelsize");
		System.out.println("---------------------------");
		ap.refuel(200);
		cp.refuel(200);
	}
}
