package ncs.test03;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class DateTest {

	public static void main(String[] args) {
		int year = 1987;
		int month = 5;
		int date = 27;
		GregorianCalendar birthDate = new GregorianCalendar();
		birthDate.set(year, month-1, date);
		GregorianCalendar todayDate = new GregorianCalendar();
		todayDate.set(2016, 4, 18);
		int age = 2016 - year;
		int day = birthDate.get(Calendar.DAY_OF_WEEK);
		String birthDateDay = "";
		switch(day) {
		case 1 : birthDateDay = "일요일"; break;
		case 2 : birthDateDay = "월요일"; break;
		case 3 : birthDateDay = "화요일"; break;
		case 4 : birthDateDay = "수요일"; break;
		case 5 : birthDateDay = "목요일"; break;
		case 6 : birthDateDay = "금요일"; break;
		case 7 : birthDateDay = "토요일";
		}
		System.out.printf("생일 : %d년 %d월 %d일 %s\n", birthDate.get(Calendar.YEAR), 
				birthDate.get(Calendar.MONTH)+1, birthDate.get(Calendar.DATE), birthDateDay);
		System.out.printf("현재 : %d년 %d월 %d일\n", todayDate.get(Calendar.YEAR), 
				todayDate.get(Calendar.MONTH), todayDate.get(Calendar.DATE));
		System.out.println("나이 : " + age + " 세");
		
		
		
	}
}
