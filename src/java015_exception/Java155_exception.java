package java015_exception;

public class Java155_exception {
	//예외처리2 NullPointerException
	public static void main(String[] args) {
		StringBuffer sb = null;
		
		try {			
		sb.reverse();
		}catch(NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		}finally {
			System.out.println("program end");
		}
	}
}
