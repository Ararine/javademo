package java012_api.prob;

/*
 * 정규화 표현식(Regular Expression)
 * 1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 * 		찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
 * 		작성한 문자열을 말한다.
 */
public class Java124_RegEx {
	public static void main(String[] args) {
		
		String sn = "java korea";
		String sg = "";
		
		//a 또는 r이면 '_'로 변경
		
		for(int i=0; i<sn.length(); i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r') sg += "_";
			else sg += data;
		}
		System.out.println(sg); //j_v_ ko_e_
		
		System.out.println("Regular Expression을 이용한 문자 변경");
		//[]대괄호는 or를 의미한다.
		//sn변수에 저장된 문자열에서 a이거나 r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]", "_"));
		
		
	}


}
