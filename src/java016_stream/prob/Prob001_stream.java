package java016_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.StringTokenizer;



/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java016_stream/prob/score.txt");
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile(file, "r");
			String str = "";
			long size = raf.length();
			while(raf.getFilePointer() != raf.length()) {
				str += raf.readLine() + ' ';
				raf.getFilePointer();
			}
			System.out.println(str);
			
			String[] array = str.split(" ");
			String[] array1 = array[0].split("[:/]"); //kim
			String[] array2 = array[1].split("[:/]"); //hong
			String[] array3 = array[2].split("[:/]"); //park
			
			System.out.printf("%s의 점수 통합 : %d\n", array1[0], sum(array1));
			System.out.printf("%s의 점수 통합 : %d\n", array2[0], sum(array2));
			System.out.printf("%s의 점수 통합 : %d\n", array3[0], sum(array3));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end main()

	public static int sum(String[] arr) {
		return Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
	}
}//end class











