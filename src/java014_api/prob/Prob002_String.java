package java014_api.prob;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		String st = merge(args);
		String cvt = convert(st);
		String rvs = reverse(st);
		
		System.out.println("source : " + st);
		System.out.println("convert: " + cvt);
		System.out.println("length: " + st.length());
		System.out.println("reverse : " + rvs);
		
	}//end main()
	
	public static String merge(String[] args) {
		String str = "";
		for(int i=0; i<args.length; i++) {
			str += args[i];
			if(i == args.length-1) break;
			else str += ' ';
		}
		return str;
	}//end merge()
	
	public static String convert(String str) {
		String res = "";
		for(int i=0; i<str.length(); i++) {
			char ca = str.charAt(i);
			if(ca >= 'a' && ca <= 'z') res += (char)(ca-32);
			else if(ca >= 'A' && ca <= 'Z' ) res += (char)(ca+32);
			else res += ca;
		}
		
		return res;
	}
	
	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		String res = sb.reverse().toString();
		return res;
	}
	
}// end class

