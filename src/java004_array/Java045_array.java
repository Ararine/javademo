package java004_array;

/*[데이터]
 * 홍길동  90 85 40
 * 이영희 100 35 75
 * 
 * [출력결과]
 * 홍길동  90 85 40 215 71.7
 * 이영희 100 35 75 210 70.0
 */

public class Java045_array {

	public static void main(String[] args) {
		String[] name = {"홍길동", "이영희"}; // String[] name = new String[]{"홍길동", "이영희"}
		int[][] jumsu = {{90, 85, 40}, {100, 35, 75}}; //int[][] jumsu = new int[]{{90, 85, 40}, {100, 35, 75}};
		
		
		/*
		int sum1 = 0; //길동이 점수 합
		int sum2 = 0; //영희 점수 합
		double avg1 = (double)sum1/3; //길동이 점수 평균
		double avg2 = (double)sum2/3; //영희 점수 평균
//		for(int i = 0; i < 3; i++) {
//			sum1 += jumsu[0][i];
//		}
//		for(int i = 0; i < 3; i++) {
//			sum2 += jumsu[1][i];
//		}
		
		for(int i = 0; i <= jumsu.length; i++) {
			for(int j = 0; j < jumsu[i].length; j++) {
				if(i == 0) sum1 += jumsu[i][j];
				if(i == 1) sum2 += jumsu[i][j];
			}
			System.out.println();
		}
		
//		System.out.printf("%s  %d %d %d %d %.1f", name[0], jumsu[0][0], jumsu[0][1], jumsu[0][2], sum1, avg1);
//		System.out.println();
//		System.out.printf("%s %d %d %d %d %.1f", name[1], jumsu[1][0], jumsu[1][1], jumsu[1][2], sum2, avg2);
		*/
		
		int sum = 0;
		for (int index=0; index<name.length; index++) {
			System.out.printf("%8s", name[index]);
			
			sum = 0;
			for(int col=0; col<3; col++) {
				System.out.printf("%4d", jumsu[index][col]);
				sum += jumsu[index][col];
			}
			
//			System.out.printf("%6d %6.1f\n", sum, (double)sum/jumsu[index].length);
//			System.out.printf("%6d %6.1f\n", sum, sum/3.0);
			System.out.printf("%6d %6.1f\n", sum, (double)sum/3);
		}
	}
}
