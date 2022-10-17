package java011_casting.prob.part03;
/*
 * [데이타]
 * 이름       부서     구분              급여             수당         근무일         일당
 * 홍길동    영업부   정직원             450000            1000
 * 갑동이    기획부   계약직                                          20           10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */

class Employee {
	String name;
	String dept;
	String posi;
	
	public Employee() {
		
	}

	public Employee(String name, String dept, String posi) {
		super();
		this.name = name;
		this.dept = dept;
		this.posi = posi;
	}
	
	public String toString() {
		return String.format("%-6s %s %6s\n", name, dept, posi);
	}
	
	public int totalSalary() {
		return 0;
	}
	
	public void prn() {
		System.out.printf("%s 총급여 %d\n", name, totalSalary());
	}
}

class FullTime extends Employee{
	int salary;
	int bonus;
	
	public FullTime() {
		
	}
	
	public FullTime(int salary) {
		this.salary = salary;
	}
	
	public FullTime(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public FullTime(String name, String dept, String posi, int salary, int bonus) {
		super(name, dept, posi);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	@Override
	public int totalSalary() {
		return salary + bonus;
	}
	
	@Override
	public String toString() {

		return String.format("%-6s %s %6s %8d %6d %8c %8c\n", name, dept, posi, salary, bonus, ' ', ' ');
	}
	
}

class PartTime extends Employee{
	int day;
	int price;
	
	public PartTime() {
		
	}
	
	public PartTime(String name, String dept, String posi, int day, int price) {
		super(name, dept, posi);
		this.day = day;
		this.price = price;
	}
	
	@Override
	public int totalSalary() {
		return day * price;
	}
	
	@Override
		public String toString() {

			return String.format("%-6s %s %6s %8c %7c %6d %8d\n", name, dept, posi, ' ', ' ', day, price);
		}
	
}

public class Prob003_binding {

	public static void main(String[] args) {
		Employee[] ep = new Employee[] { new FullTime("홍길동", "영업부","정직원", 450000, 1000), new PartTime("갑동이", "기획부", "계약직", 20, 10000)};
		System.out.printf("이름\t 부서\t 구분\t 급여\t 수당\t 근무일\t 일당\t \n");
		for(int i=0; i<ep.length; i++) {
			System.out.print(ep[i].toString());
		}
		
		System.out.println();
		
		for(int i=0; i<ep.length; i++) {
			ep[i].prn();
		}
	}//end main()

}//end class
