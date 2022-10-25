package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Java205_forEach {
	//forEach 값을 출력한다. Consumer와 같이 사용된다.
	public static void main(String[] args) {
		Integer[] it = new Integer[] {3, 5, 2, 4, 7};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());
		
		//aList.forEach( x -> System.out.println(x) );
		
		//aList.forEach((Integer x) -> System.out.println(x) );
		
		Consumer<Integer> con = x -> System.out.println(x);
		aList.forEach(con);
	}
}
