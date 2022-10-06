package java001_basic;

public class Java005_print {
	public static void main(String[] args) {
		
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5; //정수는 int 타입
		long lNum = 6L; //L 또는 l 을 넣어주면 데이터 타입이 long 이라는 것을 알려줌
		float fNum = 2.5F; //F 또는 f 을 넣어줘도 된다.
		double dNum = 7.4; //실수는 double 타입
		char cData = 'a'; //오직 한 문자만 가능
		boolean eNum = true; // true or false
		String sData = "java"; //" " : 문자열 , ' ' : 문자
		
		System.out.println(bNum + "," + sNum); //2,4
		
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값...)
		 * 출력기호
		 * %d : 정수 (byte, short, int, long)
		 * %f : 실수 (float, double)
		 * %b : 논리 (boolean)
		 * %c : 문자 (char)
		 * %s : 문자열 (String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 * 
		 * 출력형식과 출력값이 같아야 하고 출력 개수 또한 동일해야한다.
		 */
		
		System.out.printf("%d %d %d %d %f %f %b %c %s\n", bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData); // 2 4 5 6 2.500000 7.400000 true a java
		
		System.out.printf("%d %% %d = %d\n", 5,2, (5%2)); //5 % 2 = 1
		
		System.out.print("java");
		System.out.print("program"); //javaprogram
		System.out.println();
		System.out.println("jsp"); //jsp
		System.out.println("test"); //test

	}
}
