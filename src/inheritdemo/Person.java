package inheritdemo;

// School Management

public class Person {

	String name;
	int age;
	
	public void details(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("School Management:- ");
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
	
}
