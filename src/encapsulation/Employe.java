package encapsulation;

public class Employe {
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		else {
			System.out.println("Enter valid salary");
		}
	}
	
	public static void main(String[] args) {
		Employe e = new Employe();
		
		e.setSalary(50000);
		
		System.out.println("Employee Salary is " +e.getSalary());
	}

}
