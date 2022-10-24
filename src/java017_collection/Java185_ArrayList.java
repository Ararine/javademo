package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {
	//ArrayList 메소드
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
		
	}//end main()
	
	public static void prnDisplay(ArrayList<String> aList) {
		//aList매개변수의 요소에서 'J' or 'j'가 포함되어 있는 요소만
		//출력하는 프로그램을 구현하세요.
//		for(int i=0; i<aList.size(); i++) {
//			if(aList.get(i).matches("j") || aList.get(i).matches("J")) {
//				System.out.println(aList.get(i));
//			}
//		}
		for(String sn : aList) {
			if(sn.toLowerCase().contains("j")) //contains() : String 메소드
				System.out.println(sn);
		}
		
	}//end prnDisplay()
	
	
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp")); //요소 단위 //Array 메소드
	}
}//end class
