package java001_basic;

public class Java008_operators {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		
		//연산자 양쪽 중 하나라도 문자열이 존재할 경우 결과값은 문자열로 나온다.
		System.out.println(a + b); //7 - 산술연산자
		System.out.println(a + "는(은) 삼입니다."); //3는(은) 삼입니다. - 문자열 연결
		System.out.println("a=" + a); //a=3 - 문자열 연결
		System.out.println("결과=" + a + b); //결과=34 연산자 진행은 왼쪽에서 오른쪽으로
		System.out.println("결과=" + (a + b)); //결과=7
	}
}
