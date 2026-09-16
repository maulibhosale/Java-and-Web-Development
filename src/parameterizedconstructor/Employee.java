package parameterizedconstructor;

public class Employee {
	
	public Employee(int id, int salary) {
		System.out.println("Employee id " + id + " has salary of " + salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(101, 20000);
	}

}
