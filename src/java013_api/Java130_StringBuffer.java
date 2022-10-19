package java013_api;

public class Java130_StringBuffer { 
	//StringBuffer에서 사용하는 메소드 && 데이터타입 변환 - StringBuffer => String => char[] || char[] => String => StringBuffer

	public static void main(String[] args) { 
		StringBuffer sb = new StringBuffer("java test");
		
		//4인덱스에 ",jsp" 문자열을 삽입 //삽입은 중간 //추가는 끝에
		sb.insert(4, ",jsp"); //insert(index, String)
		System.out.println(sb); //java,jsp test
		
		System.out.println();
		
		//4인덱스부터 8인덱스미만 사이의 문자열을 삭제
		sb.delete(4,  8); //delete(start index, end index)
		System.out.println(sb); //java test
		
		System.out.println();
		
		//마지막에 문자열을 추가
		sb.append(" start"); //append(String)
		System.out.println(sb); //java test start
		
		System.out.println();
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); //trats tset avaj
		
		System.out.println();
		
		//String => StringBuffer => String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data); //String => StringBuffer
		sf.reverse();
		System.out.println(sf); //mro sitabym
		System.out.println(data); //mybatis orm
		String re =	sf.toString(); //StringBuffer => String
		System.out.println(re); //mro sitabym
		
		System.out.println();
		
		//char[] => String => StringBuffer
		char[] arr = {'k','o','r','e','a'};
		//방법1
		String sp = String.valueOf(arr); //char[] => String
		StringBuffer se = new StringBuffer(sp); //String => StringBuffer
//		StringBuffer sr = new StringBuffer();
//		sr.append(sp);
		se.reverse();
		System.out.println(se); //aerok
		
		System.out.println();
		
		//방법2
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse()); //aerok - 한번에
		
		System.out.println();
		
		//StringBuffer => String => char[]
		//방법1
		String st = se.toString(); // StringBuffer => String
		char[] val = st.toCharArray(); //String => char[]
		System.out.println(val); //aerok
		
		System.out.println();
		
		//방법2
		System.out.println(se.toString().toCharArray()); //aerok - 한번에
		
		System.out.println();
		
	}//end main()
	
}//end class
