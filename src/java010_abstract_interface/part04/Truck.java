package java010_abstract_interface.part04;

public class Truck implements CarRun{ //인터페이스 추상메소드 개수에 맞춰 오버라이딩을 해줘야 한다. 하지 않으면 추상클래스가 된다.
	
	public Truck() {};

	@Override
	public void prn() {
		System.out.println("prn");
	}
	
}
