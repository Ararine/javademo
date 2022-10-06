package java001_basic;

public class Java004_casting {
	/*
	 * Ctrl + SpaceBar : 자동완성 
	 * Ctrl + / : 한 라인 주석 설정 및 해제 
	 * Ctrl + Shift + / : 여러 라인 주석 설정 
	 * Ctrl + Shift + \ : 여러 라인 주석 해제 
	 * Ctrl + Shift + F : 자동정렬 (Widow - Preferences - General - Keys - Ctrl + Shift + F 을 Ctrl + F 로 변경)
	 */
	public static void main(String[] args) {

		byte bNum = 2;
		short sNUm = 4;
		int xNum = 5; //정수는 int 타입
		long lNum = 6L; //L 또는 l 을 넣어주면 데이터 타입이 long 이라는 것을 알려줌
		float fNum = 2.5F; //F 또는 f 을 넣어줘도 된다.
		double dNum = 7.4; //실수는 double 타입
		char cData = 'a'; //오직 한 문자만 가능
		boolean eNum = true; // true or false
		
		// 1byte = -128 ~ +127
		
		System.out.println(lNum); //6
		System.out.println(fNum); //2.5
		
		//형변환 ( casting )
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
		//명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
		long gNum = 6; // int => long : 자동 형변환 , 묵시적 형변환
		System.out.println(gNum); //6
		
		float tNum =(float) 2.5; // double => float : 명시적 형변환 
		System.out.println(tNum); //2.5
		
		//데이터 손실이 발생되는 경우
		byte data =(byte) 128;
		System.out.println(data); //-128
		
 } //end main()
}//end class
