package java003_statements;

/*
 * do{
 * 		반복 수행 문장;
 * }while(조건식);
 */
public class Java036_do_while {

	public static void main(String[] args) {
		
		char chk = 'y';
		do { 
			System.out.println("주문하시겠습니까?(y/n)");
		}while(chk == 'n');
		
	}
}
