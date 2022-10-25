package java018_collection;

import java.util.ArrayList;

public class Java203_Sort {
	//Sort 활용 - 이름 오름차순, 나이 내림차순
	public static void main(String[] args) {
		ArrayList<Person> ps = new ArrayList<Person>();
		ps.add(new Person("홍길동", 40));
		ps.add(new Person("가비", 20));
		ps.add(new Person("가비", 30));
		ps.add(new Person("나비", 15));
		
		prnDisplay(ps);
		sortDisplay(ps);
	}//end main()
	
	public static void prnDisplay(ArrayList<Person> aList) {
		for(Person ps : aList)
			System.out.printf("%s %d\n", ps.getName(), ps.getAge());
	}//end prnDisplay()
	
	public static void sortDisplay(ArrayList<Person> aList) {
		System.out.println("===Sort===");
		aList.sort(new Person());
		prnDisplay(aList);
	}
	
}//end class
