package java013_api;

import java.util.Random;

public class Java138_Random {
	//난수를 발생시키는 다른 방법 Random과 그 메소드
	public static void main(String[] args) {
		Random ran = new Random();
		double r1 = ran.nextDouble(); //nextDouble() : Math.random() 과 동일
		System.out.println(r1);
		
		int r2 = ran.nextInt(); //nextInt() : 십진수의 난수를 발생
		System.out.println(r2);
		
		int r3 = ran.nextInt(10); //nextInt(10) : 0부터 10미만
		System.out.println(r3);
		
		//1부터 ~ 10까지
		System.out.println(r3+1);
	}//end main()
}//end class
