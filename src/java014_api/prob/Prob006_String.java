package java014_api.prob;

import java.util.Scanner;

/*
 * [실행결과]
 * 97에서 122까지정수 입력:122
 * z
 */
public class Prob006_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("97에서 122까지정수 입력:");
		int x=sc.nextInt();

		System.out.printf("%s\n", result(toChar(x)));  
	}
	
	public static char toChar(int x){
		Scanner scan = new Scanner(System.in);
		while(true) {
			if(x < 97 || x>123)
			System.out.println("x는 97이상 122이하입니다.");
			else break;
			x = scan.nextInt();
		}
		return (char)x; 
	}
	
	public  static String result(char data){
	Character ch = Character.valueOf(data);
	
		return ch.toString();
	}	
}









