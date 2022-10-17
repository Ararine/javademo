package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; //public static final carCount = 5; 내부적으로 옆과 같이 표기됨
//	public CarRun() {} // 생성자를 가질 수 없다.
//	static {System.out.println("CarRun");} //static block을 사용할 수 없다.
	void prn(); //abstract public
//	void display() {}
	class Sun{ //public static class Sun{ }
		public Sun() {
			System.out.println("Sun Constructor");
		}
	} //인터페이스 안에 클래스 정의가 가능하다. 접근은 인터페이스를 통해 할 수 있다.
}
