package abstractdemo;

public class FullTimeStaff extends Staff {

	String department;
	int salary;
	
	

	public FullTimeStaff(String name, String address, String department, int salary) {
		super(name, address);
		this.department = department;
		this.salary = salary;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Full Time Staff");
		System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
		
	}
	

}
