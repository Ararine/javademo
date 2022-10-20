package java015_exception;

public class Java154_exception {
	//예외처리 ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		process(num);
		try { //실행이 되는 곳에 예외 처리를 한다.
		display(num);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}

	}//end main()
	
	public static void display(int[] num) throws ArrayIndexOutOfBoundsException{ //throws로 예외를 직접처리하지 않고 실행되는 곳에서 처리되게끔 넘겨주는 역할을 한다.
		System.out.println(num[5]);
	}
	
	public static void process(int[] num) {
		try {
			//예외 발생 가능 구문
		System.out.println(num[4]);
		        //예외구문                      변수
		}catch(ArrayIndexOutOfBoundsException ex) { //예외가 발생이 되었을 때 처리된다.
			System.out.println(ex.getMessage()); //예외 발생 구문을 출력한다.
//			System.out.println(ex.toString());
//			ex.printStackTrace();
		}finally {
			System.out.println("program end");
		}
	}//end process()
	
}//end class
