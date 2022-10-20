package java014_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 */
public class Java150_Calendar {
	//Calendar class 를 이용한 지정일 구하기
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;
//		cal.set(2016, 1, 1);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		
		//2월의 마지막일
		int date = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.toString());
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
//		String daY= "";
		char daY= ' ';
		switch(day) {
		case 1 : daY ='일'; break;
		case 2 : daY ='월'; break;
		case 3 : daY ='화'; break;
		case 4 : daY ='수'; break;
		case 5 : daY ='목'; break;
		case 6 : daY ='금'; break;
		case 7 : daY ='토';
		}

		System.out.printf("%d-%d-%d %s요일\n", year, month, date, daY);
	}
}
