package java010_abstract_interface.part07;

public class FinalTest {

	final int CODE = 1; //class 내에서 final이 선언 변수는 초기값을 할당해야 하고 모두 대문자로 표기한다.
	
	public FinalTest() {
		
	}
	
	void display() {
		System.out.println("display");
	}
	
	final void process() {
		System.out.println("process");
	}
}
