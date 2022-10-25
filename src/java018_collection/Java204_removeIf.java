package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java204_removeIf {
	//removeIf - 조건에 맞는 값을 제거한다. Predicate와 같이 사용된다.
	public static void main(String[] args) {
		Integer[] it = new Integer[] {3, 5, 2, 4, 7};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());
		
		//argument를 받아 true 값으로 반환되는 요소만 삭제
//		Predicate<Integer> p = x->x%2==0; //람다시
//		aList.removeIf(p);
		
		aList.removeIf(x -> x%2==0); //조건에 맞는 값을 제거시킨다. ()안의 값은 Predicate
		
		System.out.println(aList.toString());
	}//end main()
}//end class
