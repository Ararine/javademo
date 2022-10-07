package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;

		// 여기를 구현하시오.
//		data[0][0] = 1;
//		data[0][1] = 2;
//		data[0][2] = 3;
//		data[0][3] = 6;
//		data[1][0] = 4;
//		data[1][1] = 5;
//		data[1][2] = 6;
//		data[1][3] = 15;
//		data[2][0] = 7;
//		data[2][1] = 8;
//		data[2][2] = 9;
//		data[2][3] = 24;
//		data[3][0] = 12;
//		data[3][1] = 15;
//		data[3][2] = 18;
//		data[3][3] = 45;
//		
//		for(int i = 0; i <data.length; i++) {
//			int sumR = 0;
//			int sumC = 0;
//			for(int j = 0; j < data[i].length; j++) {
//				sumR += data[i][j];
//				sumC += data[j][i];
//			}
//			System.out.printf("index가 %d인 행의 합 : %d\n", i, sumR);
//			System.out.printf("index가 %d인 열의 합 : %d\n", i, sumC);
//			System.out.printf("\n");
//		}
		int i = 0;
		int j = 0;
		for ( i = 0; i < 4; i++) {
			data[i][3] = 0;
			for (j = 0; j < 4; j++) {
				data[i][j] = cnt;
				if(i == 3 || j == 3) {
					data[i][3] = data[i][j];
				}
				cnt++;
				System.out.printf("%4d", data[i][j]);
				
			}
			System.out.println();
		}

	}// end main()

}// end class
