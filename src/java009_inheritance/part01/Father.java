package java009_inheritance.part01;

public class Father /*extends Object*/{ //내용에 아무것도 들어있지 않을 때 Object를 상속 받는다.
	int a = 3;
	private int c = 10; //private은 상속되지 않는다.
	public Father() { //생성자는 상속되지 않는다.
		System.out.println("Father");
	}
	
	void display() {
		System.out.println("a=" + a);
	}
}
