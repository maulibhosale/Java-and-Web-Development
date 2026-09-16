package constructors;

public class EmployeeVariable {

	public EmployeeVariable(String name, int salary) {
		System.out.println("Employee name: " + name + " Salary: " + salary);
	}
	
	public static void main(String[] args) {
		EmployeeVariable e = new EmployeeVariable("Roy", 70000);
	}
	
}
