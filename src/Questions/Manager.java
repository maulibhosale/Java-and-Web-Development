package Questions;

public class Manager extends Employee {
	
	String Department;
	int bonus;
	
	public void gett(String Department, int bonus) {
		this.Department = Department;
		this.bonus = bonus;
		
		int Salary = basicsalary + bonus;
		System.out.println("Department: " +Department+ " , Bonus: " +bonus+ " , Salary with bonus is: " +Salary);	
	}
	
	public static void main(String[] args) {
		Manager m = new Manager();
		m.display("Mauli", 20, 50000);
		m.gett("IT", 5000);
	}
	
}
