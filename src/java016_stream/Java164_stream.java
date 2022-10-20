package java016_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java164_stream {
	//Scanner 와 다른 스트림 비교
	public static void main(String[] args) {
//		//바이트 스트림
//		InputStream is = System.in;
//		
//		//바이트 스트림과 문자 스트림 연결
//		InputStreamReader ir = new InputStreamReader(is);
//		
//		//문자 스트림
//		BufferedReader br = new BufferedReader(ir);
		
		Scanner sc = new Scanner(System.in); //입력에 관해선 Scanner 를 쓰면 좋다.
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		System.out.print("y:");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		sc.close(); //Scanner 클래스를 이용하게 되면 예외처리 없이 연결 종료할 수 있다.
	}//end main()
	
}//end class
