package java009_inheritance.part03;

public class Java094_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst();
		System.out.printf("x=%d, y=%d\n", sc.x, sc.y); //x의 값이 10이 아닌 50이 출력되는 이유 : 데이터타입이 SubConst이기 때문에 SubConst에서 먼저 찾아서 출력을 하기 때문
	}
}
