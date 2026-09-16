package thiskeyword;

public class Student {

	String name;
	int age;
	String address;
	
	public Student() {
		this.name="Unknown";
		this.age=0;
		this.address="not available";
		System.out.println(name + " " + age + " " + address);
	}
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
		this.address="not available";
		System.out.println(name + " " + age + " " + address);
	}
	
	public Student(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println(name + " " + age + " " + address);
	}
	
	
	public static void main(String[] args) {
		Student s = new Student("Mauli", 20);
	}
	
}
