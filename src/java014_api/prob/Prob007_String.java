package java014_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data)); 
	}// end main()

	public static char[] process(String data) {

		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int numUp = 0;
		int numLo = 0;
		int num = 0;
		String array = arr.toString();
		for(int i=0; i<array.length(); i++) {
			String conv = Character.valueOf(array.charAt(i)).toString();
			if(conv.matches("[a-z]")) numLo++;
			else if(conv.matches("[A-Z]")) numUp++;
			else if(conv.matches("[0-9]")) num++;
		}
		System.out.printf("영어 소문자 개수:%d\n영어 대문자 개수:%d\n숫자 개수:%d\n", numLo, numUp, num);
		
		
	}// end display()

}// end class
