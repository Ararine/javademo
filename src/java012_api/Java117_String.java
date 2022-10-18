package java012_api;

public class Java117_String {
	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이:" + str.length()); //문자열 길이:14
		System.out.println("대문자: " +str.toUpperCase()); //대문자: KOREA,JSP,JAVA
		System.out.println("소문자: " +str.toLowerCase()); //소문자: korea,jsp,java
		System.out.println("문자: " +str.charAt(0)); //문자: K
		System.out.println("인덱스: " +str.indexOf('a')); //인덱스: 4 앞에서부터 찾기
		System.out.println("인덱스: " +str.indexOf(97)); //인덱스: 4 //유니코드
		System.out.println("인덱스: " +str.lastIndexOf('a')); //인덱스: 13 뒤에서부터 찾기
		//5인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위: " +str.substring(5)); //범위: ,jsp,java 입력범위부터 끝까지
		//2인덱스부터 8미만까지 문자열 리턴
		System.out.println("범위: " +str.substring(2,8)); //범위: REa,js 입력범위 사이값
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i ,arr[i]);
			//arr[0]=KoREa	arr[1]=jsp	arr[2]=java
		}
		
		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n", x, y, x+y); //10+20=30
		
		//String <- int
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s+%s=%s\n", s1, s2, s1+s2); //10+20=1020
		
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.println(s3); //123
	}
}
