package overridingdemo;

public class Manager extends Employee {

	@Override
	public int calculateSalary() {
		
		System.out.println("Manager salary is ");
		int bonus = 10000 ;
		return bonus+super.calculateSalary();
		
	}
	
}
