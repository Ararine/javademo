package java001_basic;

public class Java015_operators {
	public static void main(String[] args) {
		
		int x = 3;
		int res = 0;
		res = 3 + 2;
		
		System.out.println(res); //5
		
		// x = x + 1;
		x += 1;
		System.out.printf("x=%d\n", x); //x=4
		
		// x = x - 1;
		x -= 1; //좀 더 빠르게 저장이 된다. 저장될 위치를 먼저 알 수 있기 때문
		System.out.printf("x=%d\n", x); //x=3
		
		x *= 1;
		System.out.printf("x=%d\n", x); //x=3
		
	} //end main
} //end class
