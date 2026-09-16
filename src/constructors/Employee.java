package constructors;

public class Employee {

	public Employee (int basicSalary, int bonus) {
		int total_salary = basicSalary + bonus;
		System.out.println(total_salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(20000, 2000);
	}
	
}
