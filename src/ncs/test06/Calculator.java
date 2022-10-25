package ncs.test06;

import java.util.Scanner;

public class Calculator {
	public double getSum(int data) throws InvalidException{
		double sum = 0;
//		try {
//			if(data < 2 || data >5) {
//				throw new InvalidException("입력 값에 오류가 있습니다.");
//			}else {
//				for(int i=1; i<=data; i++) {
//					sum += i;
//				}
//			}
//			return sum;
//		} catch (InvalidException ex) {
//			System.out.println(ex.getMessage());
//		}
		for(int i=1; i<=data; i++) {
			sum += i;
		}
		return sum;
	}
}
