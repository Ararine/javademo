package java014_api.prob;

/*
 * 
 * 1 년도와 월을 입력받는다.
 * 2 process()메소드에서 달력에 표현해줄 값을 구해서 배열에 저장한
 *   다음 반환한다.
 * 3 prn()메소드에서 아래와 같이 출력한다.
 * 
 * 4 출력결과
 2012년도 5월
 일    월      화       수      목      금    토
 			1     2     3     4    5
 6     7     8     9    10    11   12
 13    14    15    16    17    18   19
 20    21    22    23    24    25   26
 27    28    29    30    31          

 4 문제해결
 * getActualMaximum(Calendar.DATE); //각 달의 마지막일
 * set(year,month,1) //Calendar객체에 새로운 날짜 설정
 * get(Calendar.DAY_OF_WEEK); //요일 출력  일요일=1, 토요일=7
 */
import java.util.Calendar;
import java.util.Scanner;

public class Prob004_Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력: ");
		int year = sc.nextInt();
		System.out.print("월입력: ");
		int month = sc.nextInt();
		prn(process(year, month), year, month);
	}// end main()

	public static int[][] process(int year, int month) {
		int[][] data = new int[6][7];
		Calendar sDay = Calendar.getInstance();
		sDay.set(year, month-1, 1);
//		System.out.println(sDay);
		int eventDay = sDay.get(Calendar.DAY_OF_WEEK);
//		int maxDate = sDay.getActualMaximum(Calendar.DATE);
//		System.out.println(maxDate);		
//		System.out.println(eventDay);
		int cnt = 0;
		end:
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				if(i == 0 ) {
					if(j == eventDay-1) {
						cnt = 1;
						data[i][j] = cnt;
						cnt++;

					}else if(j > eventDay-1){
						data[i][j] =cnt;
						cnt++;
					}
				}else {
					data[i][j] =cnt;
					cnt++;
				}
//				System.out.printf("%4d", data[i][j]);
				if(cnt > sDay.getActualMaximum(Calendar.DATE)) break end;
			}
//			System.out.println();
		}
		
		return data; 
	}

	public static void prn(int arr[][], int year, int month) {
		System.out.printf("%10d년도  %6d월\n", year, month);

		System.out.println("  일    월    화    수    목    금    토");
		
//		char[][] array = new char[arr.length][7];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				if(arr[i][j] == 0 ) array[i][j] = ' ';
//				else array[i][j] = (char)arr[i][j];
//			}
//		}
//		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				System.out.printf("%5c", array[i][j]);
//			}
//			System.out.println();
//		}
		

	}// end prn()

}// end class
