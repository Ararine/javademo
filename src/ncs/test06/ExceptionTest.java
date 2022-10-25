package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		Scanner scn = new Scanner(System.in);
		System.out.println("2부터 5까지의 정수를 입력하시오");
		int data = scn.nextInt();
		try {
			if(data <2 || data >5)
				System.out.println("입력 값에 오류가 있습니다.");
			else System.out.println(cc.getSum(data));
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
