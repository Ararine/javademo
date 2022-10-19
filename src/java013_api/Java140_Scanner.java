package java013_api;

import java.util.Scanner;

public class Java140_Scanner {
	//Scanner class 와 그 메소드
	
	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어보기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in); //System.in : inputStream - console
		//입출력과 관련된 것을 Stream 이라고 한다.
		
		System.out.print("이름:");
		
		//next(), nextLine() 메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter를 하면
		//next(), nextLine() 메소드를 읽는다.
//		String name = sc.next(); //next() : 대기상태로 있다가 입력값을 받으면 해당 변수에 값을 넣어준다. , 공백을 기준으로 하나만 인식한다.
		String name = sc.nextLine(); //nextLine() : 한 라인을 인식한다.
	
		System.out.println(name);
	}//end main()
	
}//end class
