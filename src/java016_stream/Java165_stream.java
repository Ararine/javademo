package java016_stream;

import java.util.Scanner;

/*
 * [순번 이름 평균]입력
 * 
 * 순번:10
 * 이름:홍길동
 * 평균:9.5
 */
public class Java165_stream {
	//Scanner 클래스를 사용하여 입력
	public static void main(String[] args) {
		System.out.println("[순번  이름  평균]입력: ");
		Scanner sc =new Scanner(System.in);
		int num; //순번
		String name; //이름
		double avg; //평균
		System.out.printf("순번:");
		num = sc.nextInt();
		System.out.printf("순번:%d\n", num);
		System.out.printf("이름:");
		name = sc.next();
		System.out.printf("이름:%s\n", name);
		System.out.printf("평균:");
		avg = sc.nextDouble();
		System.out.printf("평균:%.1f\n", avg);
		System.out.printf("%d %s %.1f\n", num, name, avg);
		
		sc.close();
		
	}
}
