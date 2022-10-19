package java013_api;

public class Java145_Wrapper {
	//Wrapper class 문자열의 메소드
	public static void main(String[] args) {
		char data = 'a';
		
		System.out.println(Character.toUpperCase(data)); //toUpperCase : 대문자변환
		System.out.println(Character.toLowerCase(data)); //toLowerCase : 소문자변환
		System.out.println(Character.isUpperCase(data)); //isUpperCase : 대문자이면 true 아니면 false
		System.out.println(Character.isLowerCase(data)); //isLowerCase : 소문자이면 true 아니면 false
		System.out.println(Character.isAlphabetic(data)); //isAlphabetic : 영어이면 true 아니면 false
		System.out.println(Character.isDigit(data)); //isDigit : 숫자이면 true 아니면 false
		System.out.println(Character.toString(data));
		
	}//end main()
	
}//end class
