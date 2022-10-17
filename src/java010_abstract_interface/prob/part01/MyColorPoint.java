package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint {
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	protected void move(int x, int y) {
		super.x = x;
		super.y = y;
	}

	@Override
	protected void reverse() {
		int temp = super.x;
		super.x = super.y;
		super.y = temp;
	}
	
	@Override
	protected void show() {
		System.out.printf("%d,%d,%s\n", x, y, color);
	}
	
	
}
