package java003_statements;

/*
 * 반복문에서 특정 위치로 이동(continue)를 하거나 빠져나올 때(break)
 * 반복문에서 label을 선언하고 호출하면 된다.
 */

public class Java033_for {

	public static void main(String[] args) {
		
		move: //label 선언
		for( int k = 1; k < 5; k++ ) {
			go: //label 선언
			for( int i = 1; i <= 3; i++) {
				for( int j = 1; j <= 2; j++) {
					if(j %2 != 0) {
//					break move;
//					continue move;
					break go;
//					continue go;
//					continue;
//					break;
					}
					System.out.println("j = " + j);
				}
				System.out.printf("i=%d\n", i);
			}
			System.out.println("kkk");
		}
		System.out.println("program end");
	}
}
