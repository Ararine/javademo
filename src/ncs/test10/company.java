package ncs.test10;

public class company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		System.out.println("name \t department \t salary");
		System.out.println("---------------------------------");
		for(int i=0; i<employees.length; i++)
		System.out.printf("%s \t %s \t %d\n", employees[i].getName(), 
				employees[i].getDepartment(), employees[i].getSalary());
		
		

		
	}
}
