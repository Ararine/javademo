package java017_collection;

import java.util.Vector;

public class Java182_Vector {
	//Vector class - add()// append, insert//,trimToSize(), capacity(), size();
	public static void main(String[] args) {
		//Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java")); //append
		v.add(new String("Jsp")); //append
		v.add(1, new String("spring")); //insert
		
		for(int i=0; i<v.size(); i++ ) {
			System.out.printf("v[%d]=%s\n", i, v.get(i));
		}
		
		//요소가 저장되어 있지 않은 메모리 제거
		v.trimToSize();
		
		System.out.println("용량크기 : " + v.capacity()); //capacity() : 용량크기
		System.out.println("요소개수 : " + v.size()); //size() : 요수개수
	}//end main()
	
}//end class
