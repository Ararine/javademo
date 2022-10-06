package java002_statements;

public class Java022_switch {
//	static int num; //member variable - javascript 에서는 전역변수
	public static void main(String[] args) {
		//void 리턴값이 없다는 것을 말해줌
		
		
		//30 : 4, 6, 9, 11
		//31 : 1, 3, 5, 7, 8, 10, 12
		//28 or 29 : 2
		
		int year = 2022; //년도
		int month = 10; //월
		int lastDay  ; // 마지막일 - 지역변수는 기본값이 제공되지 않아서 변수값을 설정하지 않으면 오류가 발생한다. 따라서 임의의 값을 넣어준다.
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//num cannot be resolved to a variable
		//if 문 과는 관련이 없이 switch 문에 범위가 모두 포함된다면 지역변수의 기본값을 설정하지 않아도 된다.
		if( !(month >=1 && month <= 12) ) {
			System.out.println("1월 ~ 12월만 가능합니다.");
			return; // 강제적으로 main() 를 빠져나올 때 쓴다. void 이기 때문에 그냥 return 아니라면 return 0;
		}
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30; break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: lastDay = 31; break;
		default: 
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				lastDay = 29; //윤년
			}else {
				lastDay = 28; //평년
			}
		}
		
		System.out.printf("%d년도 %d월의 마지막일은 %d입니다.\n", year, month, lastDay);
		
	}//end main()
}//end class
