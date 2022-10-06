package java001_basic;

public class Java013_operators {
	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int c = 7;

		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		boolean res = (++a > b) && (++b < c);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res); // a=4, b=5, c=7, res=false

		int x = 4;
		int y = 8;
		int z = 10;

		// ||연산자의 좌변이 true이면 우변은 수행하지 않는다.
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x, y, z, res); // x=4, y=9, z=10, res=true

		int k = 1;
		int m = 2;
		int n = 3;

		// 우선순위 : &&, ||
		res = k == 2 && m == 2 || n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res); // k=1, m=2, n=3, res=true

		k = 1;
		m = 2;
		n = 3;

		res = --k == 2 || m-- == 3 && n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res); // k=0, m=1, n=3, res=false
	}
}
