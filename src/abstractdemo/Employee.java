package abstractdemo;

public class Employee extends Member {

	String specialization, department;
	
	public Employee(String name, String address, int age, int phoneNo, int salary, String specialization,
			String department) {
		super(name, address, age, phoneNo, salary);
		this.specialization = specialization;
		this.department = department;
	}



	@Override
	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Details");
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Address: " +address);
		System.out.println("Specialization: " +specialization);
		System.out.println("Department: " +department);
		System.out.println("Phone Number: " +phoneNo);
		System.out.println(name+ "'s salary is " +salary);
		System.out.println();
		
	}


}
