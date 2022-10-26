package java020_thread.part06;

import java.util.Scanner;

public class Bank implements Runnable{
	private long depositMoney = 100000; //은행잔고
	private long balance ; //찾을 금액
	private Scanner sc = new Scanner(System.in); //찾을 금액 입력
	
	@Override
	synchronized public void run() /*throws NumberFormatException*/{ //overriding 한 메소드에는 예외를 넘겨주는 처리를 해주면 나중에 오류가 발생한다.
		System.out.printf("%s 지점 입장\n", Thread.currentThread().getName());
		try {
			System.out.print("출금 금액 입력:");
			balance = sc.nextLong();
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}
		withDraw();
	}//end run()
	
	//잔액 계산
	public void withDraw() {
		if(depositMoney >= balance) {
			depositMoney -= balance;
			System.out.printf("남은금액은 : %d원 입니다.\n", depositMoney);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}//end withDraw()
}//end class