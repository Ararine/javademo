package java009_inheritance.part04;

public class Sun extends Parent{
	String dept;
	
	public Sun() {
		
	}
	
	public Sun(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String toString() {
		return String.format("%s %d %s", name, age, dept);
	}
}
