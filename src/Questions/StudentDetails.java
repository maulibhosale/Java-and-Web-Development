package Questions;

public class StudentDetails {
	
	public void details(String name, int age, int roll_no, int percentage) {
		System.out.println("Student name: " +name);
		System.out.println("Student age: " +age);
		System.out.println("Student roll no: " +roll_no);
		System.out.println("Student percentage: " +percentage);
		System.out.println();
	}
	
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.details("Mauli", 22, 101, 99);
		sd.details("Omkar", 21, 102, 89);
	}

}
