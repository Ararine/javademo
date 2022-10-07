package java003_statements;

public class Java035_while {

	public static void main(String[] args) {
		
		//무한루프로 돌리기 - 반복적으로 실행해야 할 경우
		
		int cnt = 1;
		while(true) {
			System.out.println(cnt++);
			if(cnt == 6) break;
		}
	}//end main()
}//end class
