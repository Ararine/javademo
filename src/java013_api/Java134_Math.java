package java013_api;

import static java.lang.Math.E;
import static java.lang.Math.min;
import static java.lang.Math.*;

public class Java134_Math {
	//Math class와 메소드
	
	public static void main(String[] args) {
		/*
		 * 클래스에서 static 키워드가 선언된 멤버변수, 메소드를 호출할 때
		 * import static을 선언하면 클래스명 없이 멤버변수, 메소드를 호출할 수 있다.
		 */
		
		System.out.println(Math.PI); //3.141592653589793 //final이 선언된 멤버변수는 대문자로 표현
		System.out.println(Math.max(10, 20)); //20
		System.out.println(E); //2.718281828459045
		System.out.println(min(10, 20)); //import를 할 경우 Math 클래스명을 생략할 수 있다.
		System.out.println(sqrt(25)); //sqrt : 제곱근
		System.out.println(pow(2,3)); //pow : 거듭제곱(2의 3승)
		
	}//end main()
}//end class
