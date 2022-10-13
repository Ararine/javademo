package java008_static_access.part01;

public class StaticEx {
	int x = 5; //일반적으로 값을 지정할 때는 생성자를 통해서 지정한다.
	static int y = 10; //static이 붙게 되면 heap area 가 아닌 method area 에 메모리가 생성된다.
	
	public StaticEx() {
		
	}
	
	public String toString() {
		return String.format("x=%2d y=%2d\n", x, y);
	}
}
