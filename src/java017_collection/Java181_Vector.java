package java017_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 */
public class Java181_Vector {
	//불변 배열 VS 가변 배열
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("이영희", 25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("==========================");
		//불변 배열
		Person[] ps = new Person[2];
		ps[0] = new Person("홍길동", 30);
		ps[1] = new Person("이영희", 25);
		for(Person pn : ps)
			System.out.println(pn.toString());
		
		
		System.out.println("==========================");
		//가변 배열
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("이영희", 25));
		for(Person pn : vt) {
			System.out.println(pn.toString());
		}
	}

}
