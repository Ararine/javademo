package java004_array;

/*
 * [출력결과]
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 */
public class Java048_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j <num[i].length; j++) {
//				if(i%2 == 0) System.out.printf("%4d", num[i][j]);
//			}
//			for(int k = num[i].length-1; k >= 0; k--) {
//				if(i%2 == 1)System.out.printf("%4d",num[i][k]);
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j <num[i].length; j++) {
				if(i%2 == 1) System.out.printf("%4d", num[i][num[i].length-1-j]); //num[i][num[i].length-1-j] == num[i][4-j]
				else System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}
	}// end main()
}// end class
