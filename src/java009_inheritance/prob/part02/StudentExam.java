package java009_inheritance.prob.part02;

public class StudentExam extends Human{
	String number;
	
	public StudentExam() {
		
	}
	
	public StudentExam(String name, int age, int height, int weight, String number) {
		super(name, age, height, weight);
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t %d\t %d\t %d\t %s", name, age, height, weight, number);
	}
}
