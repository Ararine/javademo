package java013_api;

import static java.lang.Math.*;
/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 * ex) 0.5689..... => 5.7
 */
public class Java136_Math {
	//prob : Math.random()

	public static void main(String[] args) {
//		double ran = random();
//		System.out.println(ran);
//		ran *= 10;
//		System.out.printf("%.1f\n", ran);
		
		double nan = random();
		System.out.println(nan);
		nan *= 100;
		System.out.println(nan);
		
//		round(10.5F); // float 값을 넣으면 int로 리턴
//		round(10.5); // double 값을 넣으면 long으로 리턴
		
		long data = round(nan);
		System.out.println(data);
		
		double num = (double)data/10;
		System.out.println(num);
		
		System.out.println("===============================");
		
		double res = random();
		System.out.println(res);
		System.out.println((double)(round(res*100)) / 10);
	}//end main()

}//end class
