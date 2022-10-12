package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개 이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 	  [기본생성자]
 * 	  - 클래스의 접근제어자(modifier)하고 같고 파라미터가 없는 구조이다.
 * 		public HandPhone() {}
 * 	  - 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
 */
public class HandPhone {

	//멤버변수
	String name;
	String number;
	
	//기본 생성자
	//public HandPhone() {} 
	//생성자를 하나라도 정의할 경우 생성자를 자동 생성하지 않는다.
	//모든 클래스는 하나 이상의 생성자를 가지고 있다.
	
	HandPhone() {} 
	
	HandPhone(String name) { 
		this.name = name; 
	}
	
	//this : 1. 메모리에서 자기 자신을 호출할 때
	// 		 2. 멤버변수와 매개변수가 같을 때
	//       3. 생성자 안에서 생성자를 호출할 때
	
//	HandPhone(String number) { //매개변수의 개수가 다르거나 타입이 다를 때 오버로딩이 가능하다.
//		this.number = number; //위에 것과 메소드명과 데이터타입이 같기 때문에 오류가 발생한다.
//	}
	
	HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
