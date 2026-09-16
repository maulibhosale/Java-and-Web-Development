package ParametrizedMethod;

public class Salary {
	
	public void details(String emp_name, int emp_id, int basic_salary) {
		double da = 0.1 * basic_salary;
		double hra = 0.15 * basic_salary;
		double gs = basic_salary + da + hra;
		System.out.println (emp_name + "(" + emp_id + ") has gross salary " + gs + "rupees.");
	}
	
	public static void main(String[] args) {
		Salary s = new Salary();
		s.details("Rahul", 101, 50000);
		s.details("Rohan", 102, 80000);
		s.details("Rohit", 103, 90000);
	}

}
