package java009_inheritance.part03;

public class SubConst extends SuperConst{
	int x = 50;
	public SubConst() {
		super(10, 40); //부모 생성자의 매개변수를 맞춰야 한다.
	}

}
