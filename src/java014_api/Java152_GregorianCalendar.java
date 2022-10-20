package java014_api;

import java.util.GregorianCalendar;

public class Java152_GregorianCalendar {
	//GregorianCalendar 윤년 확인
	public static void main(String[] args) {
		int year = 2022;
		GregorianCalendar gre = new GregorianCalendar();
		System.out.println(gre.toString());
		
		if(gre.isLeapYear(year)) //윤년 확인
			System.out.println(year + "년도는 윤년입니다.");
		else
			System.out.println(year + "년도는 평년입니다.");
	}
}
