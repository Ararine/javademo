package java015_exception;

public class Java156_exception {
	//예외처리3 중복 예외처리
	public static void main(String[] args) {
		String data1 = "a";
		String data2 = "0";
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x/y;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());	//예외 처리에서 상위조상이 위에 나올 경우 중복처리로 인해 오류가 발생한다. 따라서 가장 최하위로 내려준다.
		}
		
	}//end main()
	
}//end class
