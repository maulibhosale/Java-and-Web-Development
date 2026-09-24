package overridingdemo;

public class Developer extends Employee {
	
	@Override
	public int calculateSalary() {
		
		System.out.println("Developer Salary is ");
		int bonus = 5000 ;
		return bonus+super.calculateSalary();
	}


	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.calculateSalary());
		
		System.out.println();
		
		Developer d = new Developer();
		System.out.println(d.calculateSalary());
	}
	
}
