package java013_api;

//ctrl + shift + O
import java.util.StringTokenizer;

public class Java132_StringTokenizer { 
	//StringTokenizer의 개념과 StringTokenizer에서 사용되는 메소드

	public static void main(String[] args) { 
		//StringTokenizer("문자열", "구분자")
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다.
		//StringTokenizer st = new StringTokenizer("java,jsp", ",");
		
		StringTokenizer st = new StringTokenizer("java jsp"); //나눠준 문자열을 토큰이라 부른다.
//		System.out.println(st.countTokens()); //2 //countTokens() : 토큰 개수
		//가져오는 방법1
//		System.out.println(st.nextToken()); //java //nextToken() :토큰을 가져온다.
//		System.out.println(st.countTokens()); //1
//		System.out.println(st.nextToken()); //jsp
//		System.out.println(st.countTokens()); //0
//		System.out.println(st.nextToken()); //Exception in thread "main" java.util.NoSuchElementException
		
		//가져오는 방법2
//		int count = st.countTokens();
////		for(int i=0; i<st.countTokens(); i++ ) { //countTokens()의 경우 nextToken()을 할 경우 개수가 줄기 때문에 전부다 출력이 안됨
////			System.out.println(st.nextToken());
////		}
//		
//		for(int i=0; i<count; i++ ) {
//			System.out.println(st.nextToken());
//		}
		
		//가져오는 방법3
		//hasMoreTokens : 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}//end main()
	
}//end class
