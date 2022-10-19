package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer { 
	//StringTokenizer의 문자열 구분 VS String의 문자열 구분

	public static void main(String[] args) { 
		StringTokenizer st = new StringTokenizer("java,/jsp,spring", ",/"); //StringTokenizer(String, 제거요소 - or로 적용됨)
		System.out.println(st.countTokens()); //3 //구분자가 중복되면 무시함
		while(st.hasMoreTokens())
		System.out.println(st.nextToken()); //java	jsp	spring
		
		System.out.println("======================================");
		
		String[] data = new String("java,/jsp,spring").split("[,/]");
		System.out.println(data.length); //4 //구분자 개수만큼 무조건 나눠줌
		for(int i=0; i<data.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data[i]); //data[0]=java	data[1]= 	data[2]=jsp		data[3]=spring
		}
	}
}
