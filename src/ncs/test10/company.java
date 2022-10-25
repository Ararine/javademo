package ncs.test10;

public class company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		System.out.println("name \t department \t salary");
		System.out.println("---------------------------------");
		for(int i=0; i<employees.length; i++)
		System.out.printf("%-8s %-10s \t %d\n", employees[i].getName(), 
				employees[i].getDepartment(), employees[i].getSalary());
		
		System.out.println();
		
		System.out.println("인센티브 100 지급");
		System.out.println("name \t department \t salary \t tax");
		System.out.println("-------------------------------------------");
		
		Secretary sct = (Secretary)employees[0];
		sct.incentive(100);
		Sales sales = (Sales)employees[1];
		sales.incentive(100);
		System.out.printf("%-8s %-10s \t %d \t\t %.1f\n", sct.getName(), sct.getDepartment(), sct.getSalary(), sct.tax());
		System.out.printf("%-8s %-10s \t %d \t\t %.1f\n", sales.getName(), sales.getDepartment(), sales.getSalary(), sales.tax());
	}
}
