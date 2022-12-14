package java012_api;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * 정상적으로 주민번호가 입력이 되었으면 true을 반환하고 아니면
 * false를 반환하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 851306-2689540 승인이 되었습니다.
 * 750625-16843 다시 입력하세요.
 */
public class Java127_RegEx {

	public static void main(String[] args) {
		System.out.print("851306-2689540");
		display(process("851306-2689540"));
		
		System.out.print("750625-16843");
		display(process("750625-16843"));
	}
	
	public static boolean process(String sn) {
		//여기를 구현하세요.
//		Pattern pn = Pattern.compile("(\\d{6})-(\\d{7})");
//		Matcher mc = pn.matcher(sn);
////		Matcher mc = Pattern.compile("([\\d]{6})-([\\d]{7})").matcher(sn);
//		return mc.find();
		return sn.matches("\\d{6}-\\d{7}");
	}
	
	public static void display(boolean res) {
		if(res) System.out.println(" 승인이 되었습니다.");
		else System.out.println(" 다시 입력하세요.");
	}
}
