package inheritdemo;

public class Teacher extends Person {

	int empId;
	String subject;
	
	public void gett(int empId, String subject) {
		this.empId = empId;
		this.subject = subject;
		
		System.out.println("Employee Id: " +empId);
		System.out.println("Subject: " +subject);
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.details("Mauli", 21);
		t.gett(101, "Mechanics");
		
		Student s = new Student();
		s.give(21, "It");
	}
	
}
