package java013_api;

import java.util.Scanner;

/*
 * 단입력: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료:n, 계속:아무키)
 * 프로그램종료
 */
public class Java143_Scanner {
	//prob : Scanner를 이용한 구구단 프로그램 만들기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("단입력:");
//		String next = sc.next();
//		System.out.println(next);
//		
//		int num = (int)(next.charAt(0));
//		boolean chk = !(next == "n") ? true : false;
//		do{
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d X %d = %d\n", num, i, num*i);
//				if(i == 9) System.out.println("계속하시겠습니까?(종료:n, 계속:아무키)\n");
//			}
//		}while(chk);
		while(true) {
			System.out.print("단 입력:");
			int dan = sc.nextInt();
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			
			System.out.println("계속하시겠습니까?(종료:n, 계속:아무키):");
			String chk = sc.next(); // deep 복사가 일어난다.
			if(chk.equals("n")) {
//			if(chk == "n") { //주소값이 다르기 때문에 안에 값은 false가 나온다.
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
