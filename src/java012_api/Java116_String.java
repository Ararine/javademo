package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		String sn = "java"; 
		String sg = "java"; //미리 생성이 되어 있으면 그 값을 가리킨다.
		
		String st = new String("java"); //값을 생성한다.
		String ss = new String("java");
		
		//주소비교
		System.out.printf("sn==sg:%b\n", sn==sg); //true
		System.out.printf("st==ss:%b\n", st==ss); //false
		
		//메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); //true
		System.out.printf("st.equals(ss):%b\n", st.equals(ss)); //true
//		st.equalsIgnoreCase(ss) : 대소문자 비교 안함
//		st.equals(st) : 대소문자 구분함
		
		//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
		
	}
}
