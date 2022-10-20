package java015_exception;

/*
 * throws
 * 1. 예외처리를 메소드를 호출한 다른 메소드에서 하도록 전달하는 기능이다.
 * 2. 사용목적: 예외가 발생된 메소드와 이를 호출하는 메소드 양쪽에서 예외처리를 해주는 경우에 사용한다.
 * 3. java.io, java.net 패키지에 많이 선언 되어 있다.
 */
public class Java159_exception {
	//throws 예외처리가 여러 곳에서 일어날 경우 한 곳에서 처리될 수 있도록 던지는 기능
	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x,y);
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}
	}//end main()
	
	public static void process(int x, int y) throws ArithmeticException{
//		try {
//			
		int res = x/y;
		System.out.println(res);
//		}catch(ArithmeticException ex) {
//			System.out.println(ex.toString());
//		}
	}//end process()
	
}//end class
