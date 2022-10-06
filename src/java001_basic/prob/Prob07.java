package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
//		int money = 7777;
//		int mok=money/500;	
//		System.out.printf("500원: %d개\n", mok);
//		money %= 500;
//		int mbk=money/100;
//		System.out.printf("100원: %d개\n", mbk);
//		money %= 100;
//		int mosk = money/50;
//		System.out.printf("50원: %d개\n", mosk);
//		money %= 50;
//		int msk = money/10;
//		System.out.printf("10원: %d개\n", msk);
//		money %= 10;
//		int mik = money;
//		System.out.printf("1원: %d개", mik);
//		
		int money = 7777;
		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;
		int e = 1;
		
		int mok=money/a;	
		System.out.printf("%d원: %d개\n", a, mok);
		money %= a;
		mok=money/b;
		System.out.printf("%d원: %d개\n", b, mok);
		money %= b;
		mok = money/c;
		System.out.printf("%d원: %d개\n", c, mok);
		money %= c;
		mok = money/d;
		System.out.printf("%d원: %d개\n", d, mok);
		money %= d;
		mok = money;
		System.out.printf("%d원: %d개\n", e, mok);
		
		
		

		
				
	}//end main()

}//end class


