package java013_api;

/*
 * sn 변수에 저장된 문자열중에서 숫자개수를 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 숫자개수:3
 */
public class Java146_Wrapper {
	//prob - Wrapper Character class
	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		//방법1
//		for(int i=0 ; i<sn.length(); i++ ) {
//			char data = sn.charAt(i);
//			if(Character.isDigit(data)) cnt++;
//		}
		
		//방법2 - 개선된 for문
		char[] line = sn.toCharArray();
		for(char data : line) {
			if(Character.isDigit(data)) cnt ++;
		}
		
		System.out.println("숫자개수:" + cnt);
		
	}//end main()
}//end class
