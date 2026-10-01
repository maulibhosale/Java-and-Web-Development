package abstractdemo;

public abstract class Member {
	
	String name, address;
	int age, phoneNo, salary;
	
	public Member(String name, String address, int age, int phoneNo, int salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}
	
	public abstract void printSalary();
	
	

}
