package multileveldemo;

public class Student extends Teacher {
	
	public void st_details(int roll, String name, double marks) {
		System.out.println("Student name is: " +name);
		System.out.println("Student roll no is: " +roll);
		System.out.println("Student marks is: " +marks);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.sch_details("Victory Kids");
		s.te_details("John", "Maths");
		s.st_details(22, "Mauli", 89.70);
	}

}
