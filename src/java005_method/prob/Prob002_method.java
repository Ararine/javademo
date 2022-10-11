package java005_method.prob;

/*
 *  int[] num=new int[]{2,3,5,};
 	num.length; //배열의 크기
 
 	String st="java";
 	st.length( ); //문자열 길이
 */

/* 
 *  [출력결과]
 * 	 35276은 숫자입니다.
 * 	 2_8a은 문자입니다.
 */


public class Prob002_method {
	public static void main(String[] args) {
		System.out.print("35276은 ");
		prnDisplay(numCheck("35276"));

		System.out.print("2_8a은 ");
		prnDisplay(numCheck("2_8a"));
	}// end main()

	public static boolean numCheck(String data) { 
		// 35276
		// data값이 숫자면 true 아니면 false을 반환하는 로직 구현
		// char num=data.charAt(0);
		 //if(num>='0' && num<='9')
//		char[] num = new char[data.length()];
//		for(int i = 0; i < data.length(); i++) {
//			num[i] = data.charAt(i);
//		}
//		
//		boolean chk = false;
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] >= '0' && num[i] <= '9') chk = true;
//			else {
//				chk = false;
//				break;
//			}
//		}
//		return chk;
		boolean chk = false;
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) >= 0 && data.charAt(i) <= 9) chk = true;
			else {
				chk = false;
				break;
			}
		}
		return chk;
	}// end numCheck()

	public static void prnDisplay(boolean chk) {
		// chk값이 true이면 "숫자입니다."
		// chk값이 false이면 "문자입니다." 로 출력하는 로직구현
		if(chk) System.out.printf("숫자입니다.\n");
		else System.out.printf("문자입니다.\n");
	}// end prnDisplay()

}// end class











