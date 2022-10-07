package java004_array;

/*
 * num 배열에 저장된 요소의 합계를 구하는 프로그램 구현
 */
public class Java039_array {

	public static void main(String[] args) {
		
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
//		sum = sum + num[0]; // sum = 0 + 22
//		sum = sum + num[1]; // sum = 22 + 3
//		sum = sum + num[2]; // sum = 25 + 8
//		sum = sum + num[3]; // sum = 33 + 12
//		System.out.printf("sum = %d", sum); //sum = 45
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i]; //sum = sum + num[i];
		}
		System.out.printf("합계 : %d", sum); //합계 : 45
		
	}//end main()
}//end class
