package Questions;

// Employee Management

public class Employee {

	String Name;
	int age, basicsalary;
	
	public void display(String Name, int age, int basicsalary) {
		this.age = age ;
		this.Name = Name ;
		this.basicsalary = basicsalary ;
		System.out.println("Name: " +Name+ " , Age: " +age+ " , Basic Salary: " +basicsalary);	
	}
	
}
