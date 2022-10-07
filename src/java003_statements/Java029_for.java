package java003_statements;

public class Java029_for {

	public static void main(String[] args) {

		int odd = 0; //홀수
		int even = 0; //짝수
		
		for (int i = 1; i <= 10; i++) {
			// i변수의 값이 홀수이면                      // i변수의 값이 짝수이면
			if(i % 2 != 0) {						// if( i % 2 == 0) {
				odd += i;							// 	even += i;
			}else {									// }else {
				even += i;							//  0dd += i;
			}										// }
		}

		System.out.printf("홀수누적 : %d\n짝수누적 : %d\n", odd, even);
	}

}