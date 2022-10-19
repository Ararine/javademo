package java013_api;

/*
 * java.lang.String: immutalbe(불변)
 * java.lang.StringBuffer: mutable(가변), 동기화
 * java.lang.StringBuilder: mutable(가변), 비동기화
 * 
 * 		StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */
public class Java129_StringBuffer { 
	//String - 불변 VS StringBuffer - 가변

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp"); //변경된 값을 리턴
		System.out.println("ss:" + ss); //ss:jsp test jsp
		System.out.println("sg:" + sg); //sg:java test java
		System.out.println(ss==sg); //false
		System.out.println(sg.toString());
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(0, 6, "framework"); //replace(start index, end index, String)
		System.out.println("sb:" + sb); //sb:framework test
		System.out.println("su:" + su); //su:framework test
		System.out.println(sb==su); //true
		System.out.println(sb.equals(su)); //true
		System.out.println(sb.toString());
	}//end main()
	
}//end class
