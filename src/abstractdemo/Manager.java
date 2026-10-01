package abstractdemo;

public class Manager  extends Member {

	String specialization, department;
	
	public Manager(String name, String address, int age, int phoneNo, int salary, String specialization,
			String department) {
		super(name, address, age, phoneNo, salary);
		this.specialization = specialization;
		this.department = department;
	}



	@Override
	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("Manager Details");
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Address: " +address);
		System.out.println("Specialization: " +specialization);
		System.out.println("Department: " +department);
		System.out.println("Phone Number: " +phoneNo);
		System.out.println(name+ "'s salary is " +salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Omkar", "PCMC", 21, 987654321, 30000, "Data Science", "Aids");
		e.printSalary();
		
		Manager m = new Manager("Mauli", "Pune", 20, 987654321, 80000, "Front End", "Management");
		m.printSalary();
		
	}
}