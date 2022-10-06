package java002_statements;

/*
 * 제어문(control statement) : 문장의 흐름을 제어해주는 기능이다.
 * 1. 종류
 *    조건문 : if ~ else, switch ~ case
 *    반복문 : for, while, do ~ while
 *    기타 : break, continue, label(임의 이름)
 *    
 *    if(조건식){
 *    	조건식이 참일때 수행 문장;
 *    	}else{
 *    	조건식이 거짓일때 수행 문장;
 *    	}
 */

public class Java016_if {
	
	public static void main(String[] args) {
		
		int num = 3;
//		if(num % 2 == 0) {
//			System.out.printf("%d는 짝수입니다.\n", num);
//		}else {
//			System.out.printf("%d는 홀수입니다.\n", num);
//		}
		
		//javascript 처럼 실행문이 한줄일 때는 {} 생략이 가능하다.
		if(num % 2 == 0) System.out.printf("%d는 짝수입니다.\n", num);
		else System.out.printf("%d는 홀수입니다.\n", num);
	}
}
