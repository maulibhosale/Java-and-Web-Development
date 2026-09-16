package parameterizedconstructor;

public class Student {
	
	public Student(String name, int age) {
		System.out.println(name + " " + age);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Mauli", 20);
	}

}
