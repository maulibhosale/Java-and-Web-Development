package ParametrizedMethod;

public class Student {
	
	public void details(int roll, String name, double m1, double m2) {
		
		double total = m1 + m2;
		System.out.println("Roll number is: " + roll);
		System.out.println("Name is: " + name);
		System.out.println("Total marks is: " + total);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.details(101, "Mauli", 45, 42);
		s.details(102, "Rahul", 43, 44);
		s.details(103, "Ayush", 44, 48);
		s.details(104, "Om", 46, 41);
	}

}
