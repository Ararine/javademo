package ncs.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random ran = new Random();
		System.out.print("정렬전 : ");
		for(int i=0; i<10; i++ ) {
			list.add(ran.nextInt(100)+1);
			System.out.printf("%4d", list.get(i));
		}
		System.out.println();
		

		ArrayList<Integer> aList = new ArrayList<Integer>(list);
		aList.sort(new Decending());
		
		display(aList);
	}
	
	public static void display(ArrayList<Integer> list) {
		System.out.print("정렬후 : ");
		for(int i=0; i<list.size(); i++ ) {
			System.out.printf("%4d", list.get(i));
		}
	}
}
