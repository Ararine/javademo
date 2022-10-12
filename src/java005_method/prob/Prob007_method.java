package java005_method.prob;
/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */

public class Prob007_method {

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 16, 11, 31};

		int[] result1 = sort(arr, "desc");
		int[] result2 = sort(arr, "asc");
		System.out.println("내림 차순 결과");
//		System.out.printf("%d");
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("오름 차순 결과");
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		int[] group = new int[array.length];
		for(int i = 0 ; i < group.length ; i++) {
			group[i] = array[0];
		}
		if(orderby.equals("desc")) {			
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array.length ; j++) {
				if (i == 0) {
					if(group[i] < array[j]) group[i] = array[j];
				}else if (i < array.length-1 && group[i] < group[i-1]) {
					if(group[i-1] > array[j] && group[i] < array[j]) group[i] = array[j];
				}else {
					if(group[i] > array[j]) group[i] = array[j];
				}
			}
		}
		}
		
		if(orderby.equals("asc")) {
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array.length ; j++) {
				if (i == 0) {
					if(group[i] > array[j]) group[i] = array[j];
				}else if (i < array.length-1 && group[i] > group[i-1]) {
					if(group[i-1] < array[j] && group[i] > array[j]) group[i] = array[j];
				}else {
					if(group[i] < array[j]) group[i] = array[j];
				}
			}
		}
		}
		return group;
	}//end sort( )
}