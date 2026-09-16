package constructors;

public class Student {
	
	public void details(String name, String address) {
		System.out.println("Student name is " + name);
		System.out.println("Student address is " + address);
	}
	
	public Student(int m1, int m2, int m3) {
		int total_marks = m1+m2+m3;
		System.out.println("Total marks is " + total_marks);
	}
	
	public static void main(String[] args) {
		Student s = new Student(15, 20, 30);
		s.details("Ram", "Pune");
	}

}
