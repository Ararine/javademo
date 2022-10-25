package java013_api;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서 연봉 평가:");
		String line = sc.nextLine();
		System.out.println(line);
		
		String[] arr = line.split("\\s{1,}");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s", i, arr[i]);
		}
		
	}
}
