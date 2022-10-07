package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		
		int[] data1 = new int[3]; //0 기본값
		long[] data2 = new long[3]; //0L
		float[] data3 = new float[3]; //0.0F
		double[] data4 = new double[3]; //0.0
		char[] data5 = new char[3]; //\u0000
		boolean[] data6 = new boolean[3]; //false
		String[] data7 = new String[3]; //null
		
		//배열에 값이 없이 크기만 지정되었을 때
		
		//int 와 long 은 출력값이 같다. ex)0
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("data1[%d]=%d\n", i, data1[i]);
		}
		
		for(int i = 0; i < data2.length; i++) {
			System.out.printf("data2[%d]=%d\n", i, data2[i]);
		}
		
		
		//float 과 double 은 출력값이 같다. ex)0.0
		for(int i = 0; i < data3.length; i++) {
			System.out.printf("data3[%d]=%.1f\n", i, data3[i]); //%n.mf : n:총 자리수 m:소숫점 자리수
		}
		
		for(int i = 0; i < data4.length; i++) {
			System.out.printf("data4[%d]=%.1f\n", i, data4[i]);
		}
		
		//char 는 출력값이 공백이다.
		for(int i = 0; i < data5.length; i++) {
			System.out.printf("data5[%d]=%c\n", i, data5[i]);
			System.out.println(data5[i]); //공백
		}
		
		//boolean 은 출력값이 false이다.
		for(int i = 0; i < data6.length; i++) {
			System.out.printf("data6[%d]=%b\n", i, data6[i]);
			System.out.println(data6[i]); //false
		}
		
		//String 은 출력값이 null이다.
		for(int i = 0; i < data7.length; i++) {
			System.out.printf("data7[%d]=%s\n", i, data7[i]);
			System.out.println(data7[i]); //null
		}
		
		System.out.println("======================");
		char a = ' ';
		char b = '\u0020'; //공백
		char c = '\u0000';
		char d = 0; //숫자
		
		System.out.println(a==b); //true
		System.out.println(c==d); //true
		
	} //end main()
} //end class
