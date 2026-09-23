package inheritdemo;

// Animal System

public class Animal {

	int age;
	String name;
	
	public void eat(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name+ " (Age : " +age+ " ) is eating food.");
	}

}
