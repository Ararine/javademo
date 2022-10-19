package java013_api;

import static java.lang.Math.*;

public class Java135_Math {
	//Math.random() - 난수처리
	
	public static void main(String[] args) {
		//임의값 0.0 <= x < 1.0
		double ran = random();
		System.out.println(ran);
		
		//0.0 <= x * 10 < 10.00
		ran = ran * 10;
		System.out.println(ran);

		//소수점 이하는 버림(0 ~ 9 을 리턴)
		int num = (int)floor(ran); //floor : 버림, round : 반올림, ceil : 올림
		System.out.println(num);
		
		//1부터 10까지
		num = num + 1;
		System.out.println(num);
		
		System.out.println("=============================");
		
		System.out.println(((int)(floor(random()*10))) + 1);
		
	}//end main()
	
}//end class
