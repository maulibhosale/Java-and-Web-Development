package inheritdemo;

// Employee Management

public class Employee {

	String Name;
	int employeeId, Salary;
	
	public void display(String Name, int employeeId, int Salary) {
		this.employeeId = employeeId;
		this.Name = Name;
		this.Salary = Salary;
		
		System.out.println("Employee Details:- ");
		System.out.println("Employee Name: " +Name);
		System.out.println("Employee Id: " +employeeId);
		System.out.println("Employee Salary: " +Salary);
		
	}
	
}
