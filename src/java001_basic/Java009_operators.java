package java001_basic;

public class Java009_operators {
	public static void main(String[] args) {
		int x = 3;
		
		//전위 연산자
		++x ; //x = x + 1, x+=1 - 증가연산자
		System.out.println(x); //4
		
		--x ; // 감소연산자
		System.out.println(x); //3
		
		int y = 5;
		
		//후위 연산자
		y++;
		System.out.println(y); //6
		
		y--;
		System.out.println(y); //5
		
		//리터널은 증감연산자를 사용할 수 없다.
		//10++;
		
		//상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4; //상수선언 final, 변수는 모두 대문자로
		//상수는 증감연산자를 사용할 수 없다.
		//NUM++;
		
		
	}
}
